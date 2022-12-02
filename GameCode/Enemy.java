import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.awt.*;

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    public int totalHealth = 3;  //health of cop
    private int switchTimer = 0;       //a timer variable for different methods
    private int counter = 0;              //a counter variable for different methods
    private int switchTimerVar = 6;          // similar to switchTimer variable
    private int chooseDirection = 0;           
    private String direction = "s"; //the cop starts moving downward
    private String originalDirection = "s";        //this is the default direction for the original direction... originalDirection is used to see if the character changed
                                                    //directions during the chaseCharacter() method so that he won't call another change of direction... its used so the cop
                                                    //doesn't repeatedly run into objects when chasing the chaaracter
    private boolean youAlsoShallNotPass = false;    //used so that this class isn't called when the cop has alrady been removed from the world
    private int speed = 2;                                //default speed of cop
    private String detectionStatus = "notDetected";          
    private int radius = 400;                              //this is the radius used to detect the character... however, the cop only detects 400 px in front, 150 on each side
    private int seeLeftOrRight = 200;
    private int shotRadius = 200;                          //the radius around the cop that he is able to shoot the character
    private int shotTimer = 0;                       
    public double distance = 0;                       //used in the getDistanceBetweenObjects() method
    private int charX;                                //variable used for characters x coordinate, and similarly below for his y coordinate
    private int charY;
    private String itsChasingTime = "chaseIsOff";      //stops the cop from chasing the character, also resets speed
    private int fastSpeed = 3;                         //how fast the cop moves when he detects the character... NOTE: character's speed is 4
    private String[] originalDirectionList = new String[2000];             //both variables below are used in determining if the cop is running into an object when he is chasing the character
    private int originalDirectionListCounter = 0;     //^^it's out of 2000 spots because I have to allocate enough spots for the character's direction
    private int chaseCharacterRadius = 500;             //the radius that determines whether the cop is chasing the character or not
    private int waitTimer = 45;                    //timer used to wait when cop runs into object when chasing the character
    private int rateOfFire = 30;     //the lower number this is the faster it shoots
    private String chaseChar1 = "chase";      //chase character if he is shot for the first time
    private String chaseChar2 = "chase";      //chase character if he is shot for the second time
    private String hitBySomething = "notHit";
    private int index;
    public static int counter2 = 0;
    public static int previousCounter = 0;
    public static int doOnce = 0;
    CopExplosion5 copExplosion5 = new CopExplosion5();
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy(int i){
        this.index = i;
        totalHealth = 3;
        //System.out.println(totalHealth);
    }
    
    public void act() 
    {
        if(youAlsoShallNotPass == false){
            if(doOnce == 0){
                previousCounter = counter2;
                counter2++;
            }
        }
        minusHealth();
        if(youAlsoShallNotPass == false){
            if(doOnce == 0){
                previousCounter = counter2;
                doOnce++;
            }
            if(chaseChar1 == "callChaseMethod"){    
                chaseCharacter();             
            }
            patrol();
            if(itsChasingTime == "chaseIsOff"){
                detectCharacter();
            }else{
                shootChar();
            }
        }
        youAlsoShallNotPass = false;
    }    
    
    public void patrol(){
        detect();
        walk();
    }
    
    public void walk(){
        if(direction == "n"){
            changeImageUp();
            swapImageUp();
        }else if(direction == "w"){
            changeImageLeft();
            swapImageLeft();
        }else if(direction == "s"){
            changeImageDown();
            swapImageDown();
        }else if(direction == "e"){
            changeImageRight();
            swapImageRight();
        }
    }
    
    public void detect(){
        if(!isGoodDirection(direction)){ //only changes direction if the cop finds that an object is in front of it
            determineNewDirection();
        }
    }
    
    public void detectCharacter(){ //detecting the character using the same getObjectsInRange method
        List<Character> isCharacterDetectedList;
        isCharacterDetectedList = getObjectsInRange(radius, Character.class);
        if(direction == "n" && isCharacterDetectedList.size() > 0){                  //This here vv detects if the character is within 'eyesight' of the cop. 100px to left and right, and the 'radius' up
            if((isCharacterDetectedList.get(0).getY() < this.getY()) && (isCharacterDetectedList.get(0).getX() > this.getX() - seeLeftOrRight) && (isCharacterDetectedList.get(0).getX() < this.getX() + seeLeftOrRight)){
                detectionStatus = "detected";
                //System.out.println("detectedN");
                shootChar();
            }else{
                detectionStatus = "notDetected";
            }
        }
        if(direction == "s" && isCharacterDetectedList.size() > 0){
            if((isCharacterDetectedList.get(0).getY() > this.getY()) && (isCharacterDetectedList.get(0).getX() > this.getX() - seeLeftOrRight) && (isCharacterDetectedList.get(0).getX() < this.getX() + seeLeftOrRight)){
                detectionStatus = "detected";
                //System.out.println("detectedS");
                shootChar();
            }else{
                detectionStatus = "notDetected";
            }
        }
        if(direction == "w" && isCharacterDetectedList.size() > 0){
            if((isCharacterDetectedList.get(0).getX() < this.getX()) && (isCharacterDetectedList.get(0).getY() > this.getY() - seeLeftOrRight) && (isCharacterDetectedList.get(0).getY() < this.getY() + seeLeftOrRight)){
                detectionStatus = "detected";
                //System.out.println("detectedW");
                shootChar();
            }else{
                detectionStatus = "notDetected";
            }
        }
        if(direction == "e" && isCharacterDetectedList.size() > 0){
            if((isCharacterDetectedList.get(0).getX() > this.getX()) && (isCharacterDetectedList.get(0).getY() > this.getY() - seeLeftOrRight) && (isCharacterDetectedList.get(0).getY() < this.getY() + seeLeftOrRight)){
                detectionStatus = "detected";
                //System.out.println("detectedE");
                shootChar();
            }else{
                detectionStatus = "notDetected";
            }
        }
    }
    
    public void shootChar(){
        List<Character> isCharacterStillDetected;
        isCharacterStillDetected = getObjectsInRange(shotRadius, Character.class); //if he is still in range...
        if(isCharacterStillDetected.size() > 0){
            if(shotTimer > 0 ){
                shotTimer -= 1;  //makes it so there isn't a constant shot of bullets
            }else{
                int rand1 = Greenfoot.getRandomNumber(50);
                if(rand1 > rateOfFire){                   //determines the sound rate of fire
                    getWorld().addObject(new CopBullet(this), getX()+30, getY());
                    Greenfoot.playSound("cop_pshot.wav");
                }
                shotTimer = 10;
                chaseCharacterRadius = 500;
                chaseCharacter();
                //Greenfoot.playSound("pew1.wav"); //maybe a new sound for copbullets? ^^check!
            }
        }else{
            //System.out.println("it gets to chaseChar()");
            chaseCharacter();
        }
    }
    
    public double getDistanceBetweenObjects(int obj1X, int obj1Y, int obj2X, int obj2Y){
        distance = Math.sqrt(Math.pow((double)obj2X - obj1X, 2) - Math.pow((double)obj2Y - obj1Y, 2));   //can be used to find the distance between two objects... currently not used
        return distance;
    }
    
    public void assessOldDirection(){
        originalDirectionList[originalDirectionListCounter] = direction;         //to fit in the whole game... I should probably use an arrayList @@change
        if(originalDirectionListCounter == 0){             //creating an array of the directions... picking the previous direction to see if its different from 
            originalDirection = originalDirectionList[0];   //the one before it to see if part of the chaseCharacter method should not be called
        }else{      //^^this if statement is needed because you can't call the direction previous to the first direction already in the list
            originalDirection = originalDirectionList[originalDirectionListCounter - 1]; //gets previous direction
        }
        originalDirectionListCounter++;  //upping the counter for the array so the previous direction called remains accurate
        //System.out.println(direction + originalDirection);
    }
    
    public void chaseCharacter(){
        //String desiredDirection = "";
        //System.out.println("chaseChar");
        List<Character> findCharacterOnScreen;
        findCharacterOnScreen = getObjectsInRange(chaseCharacterRadius, Character.class);
        if(findCharacterOnScreen.size() > 0){
            detect();                                     //detecting if cop is running into anything
            charX = findCharacterOnScreen.get(0).getX();    //finding character's x and y coordinatesvv
            charY = findCharacterOnScreen.get(0).getY();
            //System.out.println("found him");
            if(originalDirection == direction){                //if the cop ran into an object, he won't change direction again
                           // System.out.println("foundChar");
                if(charX > this.getX() && charY > this.getY()){        //the following set of if statements determine which direction to move in depending on the x and y
                    if(charX - this.getX() > charY - this.getY()){     //coordinates of both the cop and the character... and then finds the shortest route to go
                        direction = "e";
                        speed = fastSpeed;
                        //System.out.println("chase " + direction);
                    }else{
                        direction = "s";
                        speed = fastSpeed;
                        //System.out.println("chase " + direction);
                    }
                }
                if(charX > this.getX() && charY < this.getY()){
                    if(charX - this.getX() > this.getY() - charY){
                        direction = "e";
                        speed = fastSpeed;
                        //System.out.println("chase " + direction);
                    }else{
                        direction = "n";
                        speed = fastSpeed;
                        //System.out.println("chase " + direction);
                    }
                }
                if(charX < this.getX() && charY > this.getY()){
                    if(this.getX() - charX > charY - this.getY()){
                        direction = "w";
                        speed = fastSpeed;
                        //System.out.println("chase " + direction);
                    }else{
                        direction = "s";
                        speed = fastSpeed;
                        //System.out.println("chase " + direction);
                    }
                }
                if(charX < this.getX() && charY < this.getY()){
                    if(this.getX() - charX > this.getY() - charY){
                        direction = "w";
                        speed = fastSpeed;
                        //System.out.println("chase " + direction);
                    }else{
                        direction = "n";
                        speed = fastSpeed;
                        //System.out.println("chase " + direction);
                    }
                }
                itsChasingTime = "chaseIsOn";        //continue to chase character... makes the cop not call the detectCharacter method (called under the act method)
                assessOldDirection();
            }else{
                if(waitTimer > 0){
                    waitTimer--;
                }else{
                    if(charX > this.getX() && charY > this.getY()){        //the following set of if statements determine which direction to move in depending on the x and y
                        if(charX - this.getX() > charY - this.getY()){     //coordinates of both the cop and the character... and then finds the shortest route to go
                            direction = "e";
                            speed = fastSpeed;
                            //System.out.println("chase " + direction);
                        }else{
                            direction = "s";
                            speed = fastSpeed;
                            //System.out.println("chase " + direction);
                        }
                    }
                    if(charX > this.getX() && charY < this.getY()){
                        if(charX - this.getX() > this.getY() - charY){
                            direction = "e";
                            speed = fastSpeed;
                            //System.out.println("chase " + direction);
                        }else{
                            direction = "n";
                            speed = fastSpeed;
                            //System.out.println("chase " + direction);
                        }
                    }
                    if(charX < this.getX() && charY > this.getY()){
                        if(this.getX() - charX > charY - this.getY()){
                            direction = "w";
                            speed = fastSpeed;
                            //System.out.println("chase " + direction);
                        }else{
                            direction = "s";
                            speed = fastSpeed;
                            //System.out.println("chase " + direction);
                        }
                    }
                    if(charX < this.getX() && charY < this.getY()){
                        if(this.getX() - charX > this.getY() - charY){
                            direction = "w";
                            speed = fastSpeed;
                            //System.out.println("chase " + direction);
                        }else{
                            direction = "n";
                            speed = fastSpeed;
                            //System.out.println("chase " + direction);
                        }
                    }
                    itsChasingTime = "chaseIsOn";        //continue to chase character... makes the cop not call the detectCharacter method (called under the act method)
                    assessOldDirection();
                    waitTimer = 45;
                }
            }
        }else{     //if the character isn't with the radius around the cop, reset speed and allow cop to detectCharacter again
            speed = 2;
            itsChasingTime = "chaseIsOff";           //cop can now call the detectCharacter() method again
            //System.out.println("not chasing");
        }
    }
    
    public boolean isGoodDirection(String dir){ //this method returns true for each direction that is available to move towards, and false if an object is in the way
        int yOffset;
        int xOffset;
        List<StillObject> objs;
        switch(dir.charAt(0)){ //using a switch statement with case options... like an if statements, but instead used for assessing the value of a variable and 
            case 'n':          //determining the output in each variable case
                yOffset = (int)(0 - (.5) * this.getImage().getHeight() - 2); //detecting object at origin point in the center near the edge of the object
                if(this.getY() + yOffset < 1){
                    return false;
                }
                objs = getObjectsAtOffset(0, yOffset, StillObject.class);
                if(objs.size() > 0){
                    return false;
                }
                yOffset = (int)(0 - (.5) * this.getImage().getHeight() - 2); //detecting object at origin point on the left near the edge of the object
                objs = getObjectsAtOffset((int).5 * this.getImage().getWidth(), yOffset, StillObject.class);
                if(objs.size() > 0){
                    return false;
                }
                yOffset = (int)(0 - (.5) * this.getImage().getHeight() - 2); 
                objs = getObjectsAtOffset((int)-.5 * this.getImage().getWidth(), yOffset, StillObject.class); // detecting object at origin point on the right near the... etc
                if(objs.size() > 0){
                    return false;
                }
                return true;
            case 'w':
                xOffset = (int)(0 - (.5) * this.getImage().getWidth() - 2);
                if(this.getX() + xOffset < 1){
                    return false;
                }
                objs = getObjectsAtOffset(xOffset, 0, StillObject.class);
                if(objs.size() > 0){
                    return false;
                }
                xOffset = (int)(0 - (.5) * this.getImage().getWidth() - 2);
                objs = getObjectsAtOffset(xOffset, (int).5 * this.getImage().getHeight(), StillObject.class);
                if(objs.size() > 0){
                    return false;
                }
                xOffset = (int)(0 - (.5) * this.getImage().getWidth() - 2);
                objs = getObjectsAtOffset(xOffset, (int)-.5 * this.getImage().getHeight(), StillObject.class);
                if(objs.size() > 0){
                    return false;
                }
                return true;
            case 's':
                yOffset = (int)((.5) * this.getImage().getHeight() + 2);
                if(this.getY() + yOffset > getWorld().getHeight() - 1){
                    return false;
                }
                objs = getObjectsAtOffset(0, yOffset, StillObject.class);
                if(objs.size() > 0){
                    return false;
                }
                yOffset = (int)((.5) * this.getImage().getHeight() + 2);
                objs = getObjectsAtOffset((int).5 * this.getImage().getWidth(), yOffset, StillObject.class);
                if(objs.size() > 0){
                    return false;
                }
                yOffset = (int)((.5) * this.getImage().getHeight() + 2);
                objs = getObjectsAtOffset((int)-.5 * this.getImage().getWidth(), yOffset, StillObject.class);
                if(objs.size() > 0){
                    return false;
                }
                return true;
            case 'e':
                xOffset = (int)((.5) * this.getImage().getWidth() + 2);
                if(this.getX() + xOffset > getWorld().getWidth() - 1){
                    return false;
                }
                objs = getObjectsAtOffset(xOffset, 0, StillObject.class);
                if(objs.size() > 0){
                    return false;
                }
                xOffset = (int)((.5) * this.getImage().getWidth() + 2);
                objs = getObjectsAtOffset(xOffset, (int).5 * this.getImage().getHeight(), StillObject.class);
                if(objs.size() > 0){
                    return false;
                }
                xOffset = (int)((.5) * this.getImage().getWidth() + 2);
                objs = getObjectsAtOffset(xOffset, (int)-.5 * this.getImage().getHeight(), StillObject.class);
                if(objs.size() > 0){
                    return false;
                }
                return true;
        }
        return true;
    }
    
    /*
     * This method determines the available paths with no objects in the way and randomly chooses one of them. However
     * this method also takes in consideration what direction you were coming from, so you won't double back the same 
     * way you came, unless you run into a dead end
     */
    public void determineNewDirection(){
        int count = 0;
        String[] goodDirections = new String[4]; //adding the available directions to an array, and then randomly choosing one
        if(isGoodDirection("n")){
            goodDirections[count] = "n";
            count++;
        }
        if(isGoodDirection("w")){
            goodDirections[count] = "w";
            count++;
        }
        if(isGoodDirection("s")){
            goodDirections[count] = "s";
            count++;
        }
        if(isGoodDirection("e")){
            goodDirections[count] = "e";
            count++;
        }
        chooseDirection = Greenfoot.getRandomNumber(count);        //chooses a random direction for the character to go in out of the available directions
        direction = goodDirections[chooseDirection];            
        assessOldDirection();
    }
    
    public void swapImageUp(){
        if(switchTimer > 0){ //using a timer to span the time between each frame switch
            switchTimer -= 1;
        }else{
            if(counter > 2){
                this.setImage("Cp_Bckwrd_Def.png"); //switching from default frame to left to default to right to default... or something like that
                counter = 0;
                switchTimer = switchTimerVar;
            }else if(counter > 1){
                this.setImage("Cp_Bckwrd_Lft.png");
                counter++;
                switchTimer = switchTimerVar;
            }else if(counter > 0){
                this.setImage("Cp_Bckwrd_Def.png");
                counter++;
                switchTimer = switchTimerVar;
            }else{
                this.setImage("Cp_Bckwrd_Rgt.png");
                counter++;
                switchTimer = switchTimerVar;
            }
        }
    }
    
    public void swapImageDown(){
        if(switchTimer > 0){
            switchTimer -= 1;
        }else{
            if(counter > 2){
                this.setImage("Cp_Fwrd_Def.png");
                counter = 0;
                switchTimer = switchTimerVar;
            }else if(counter > 1){
               this.setImage("Cp_Fwrd_Lft.png");
                counter++;
                switchTimer = switchTimerVar;
            }else if(counter > 0){
                this.setImage("Cp_Fwrd_Def.png");
                counter++;
                switchTimer = switchTimerVar;
            }else{
                this.setImage("Cp_Fwrd_Rgt.png");
                counter++;
                switchTimer = switchTimerVar;
            }
        }
    }
    
    public void swapImageLeft(){
        if(switchTimer > 0){
            switchTimer -= 1;
        }else{
            if(counter > 2){
                this.setImage("Cp_Lft_Def.png");
                counter = 0;
                switchTimer = switchTimerVar;
            }else if(counter > 1){
                this.setImage("Cp_Lft_Lft.png");
                counter++;
                switchTimer = switchTimerVar;
            }else if(counter > 0){
                this.setImage("Cp_Lft_Def.png");
                counter++;
                switchTimer = switchTimerVar;
            }else{
                this.setImage("Cp_Lft_Rgt.png");
                counter++;
                switchTimer = switchTimerVar;
            }
        }
    }
    
    public void swapImageRight(){
        if(switchTimer > 0){
            switchTimer -= 1;
        }else{
            if(counter > 2){
                this.setImage("Cp_Rgt_Def.png");
                counter = 0;
                switchTimer = switchTimerVar;
            }else if(counter > 1){
                this.setImage("Cp_Rgt_Lft.png");
                counter++;
                switchTimer = switchTimerVar;
            }else if(counter > 0){
                this.setImage("Cp_Rgt_Def.png");
                counter++;
                switchTimer = switchTimerVar;
            }else{
                this.setImage("Cp_Rgt_Rgt.png");
                counter++;
                switchTimer = switchTimerVar;
            }
        }
    }
    
    public void changeImageUp(){
        if (((this.getImage()).toString() == "Cp_Bckwrd_Def.png") || ((this.getImage()).toString() == "Cp_Bckwrd_Lft.png") || ((this.getImage()).toString() == "Cp_Bckwrd_Def.png"))
            {
            } //if the picture is one of these^^, keep moving in the same direction
            else
            {
                setLocation(this.getX(), getY()-speed);
            }
    }
    
    public void changeImageDown(){
        if (((this.getImage()).toString() == "Cp_Fwrd_Def.png") || ((this.getImage()).toString() == "Cp_Fwrd_Lft.png") || ((this.getImage()).toString() == "Cp_Fwrd_Rgt.png"))
            {
            }
            else
            {
                setLocation(this.getX(), getY()+speed);
            }
    }
    
    public void changeImageLeft(){
        if (((this.getImage()).toString() == "Cp_Lft_Def.png") || ((this.getImage()).toString() == "Cp_Lft_Lft.png" ) || ((this.getImage()).toString() == "Cp_Lft_Def.png"))
            {
            }
            else
            {
                move(-speed);
            }
    }
    
    public void changeImageRight(){
        if (((this.getImage()).toString() == "Cp_Rgt_Def.png") || ((this.getImage()).toString() == "Cp_Rgt_Lft.png" ) || ((this.getImage()).toString() == "Cp_Rgt_Def.png"))
            {
            }
            else
            {
                move(speed);
            }
    }
    
    public void minusHealth(){
        if((getOneIntersectingObject(CharBullet.class) != null) || hitBySomething == "hit" || (getOneIntersectingObject(ExplosionRadius.class) != null)){   //this method here detects if cop has been hit by a character's bullet and removes health accordingly
            if((getOneIntersectingObject(CharBullet.class) != null)){
                totalHealth -= 1;
                Actor bullet = getOneIntersectingObject(CharBullet.class);
                getWorld().removeObject(bullet);
            }
            hitBySomething = "notHit";
            if(totalHealth == 2){        //if the cop's health is 2, call the chaseCharacter method (the string variables keep the cop from constantly chasing the character
                if(chaseChar1 == "chase"){    //when the minusHealth method is called
                    chaseChar1 = "callChaseMethod";
                    chaseCharacterRadius = 1000;
                }
            }
            if(totalHealth == 1){        //same as above comment
                if(chaseChar2 == "chase"){
                    chaseChar2 = "callChaseMethod";
                    chaseCharacterRadius = 1000;
                }
            }
            if(totalHealth <= 0)
            {
                counter2++;
                doOnce = 0;
                for(Object obj: getWorld().getObjects(Character.class)) //also updates character's kill count
                {
                    Character character = (Character) obj;
                    character.addKill();
                }
                getWorld().addObject(copExplosion5, this.getX(), this.getY());
                getWorld().removeObject(this); //also removes cop if his health is 0
                if(State.worldNumber == 3){
                    State.parkingLot3[this.getIndex()] = false;
                }
                if(State.worldNumber == 5){
                    State.background[this.getIndex()] = false;
                }
                if(State.worldNumber == 8){
                    State.janitor1[this.getIndex()] = false;
                }
                if(State.worldNumber == 9){
                    State.level2Security2[this.getIndex()] = false;
                }
                if(State.worldNumber == 10){
                    State.level2Security[this.getIndex()] = false;
                }
                if(State.worldNumber == 11){
                    State.levelTwo[this.getIndex()] = false;
                }
                if(State.worldNumber == 15){
                    State.hallway3[this.getIndex()] = false;
                }
                if(State.worldNumber == 18){
                    State.level2Offices2[this.getIndex()] = false;
                }
                if(State.worldNumber == 20){
                    State.alarmFloor[this.getIndex()] = false;
                }
                if(State.worldNumber == 23){
                    State.janitor2[this.getIndex()] = false;
                }
                youAlsoShallNotPass = true;  //doesn't allow this class to call methods since cop is already out of the world
            }
        }
    }
    
    public void setHealth(int health){
        totalHealth += health;
        hitBySomething = "hit";
        //System.out.println(totalHealth);
    }
    
    public int getTotalHealth(){
        return totalHealth;
    }
    
    public int getIndex(){
        return index;
    }
}
