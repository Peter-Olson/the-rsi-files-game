import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Janitor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Janitor extends Actor
{                                    //@@@ find this and fix @@@ ATTENTION GETTER <<
    public static String stage = "stage1";    //this variable determines what stage the janitor is
                                              //the stage variable corresponds with what room the
                                              //janitor is in, and his difficulty
    private String amIDead = "notDead";       //variable that determiens whether Janitor is dead or not
                                              //if he is dead, he won't call any other methods
    private String doOnce1 = "oneTime";       //used in talk class-- only want Janitor to talk once per screen
    private String doOnce2 = "oneTime";
    private String doOnce3 = "oneTime";       //used to make the janitor wait before he runs away from you
    private String doOnce4 = "oneTime";
    private int doOnce5 = 0;
    private String fight = "notOver";         //variable used to determine if janitor is beaten yet
    public static int totalHealthJ = 5;      //Janitor's health
    public static int speedJ = 5;             //Janitor's speed
    public static String hitBySomethingJ = "notHit";        //used to determine if Janitor is hit by a grenade or not
    SpeechBubble1 speechBubble1 = new SpeechBubble1();
    SpeechBubble2 speechBubble2 = new SpeechBubble2();
    EscapeHole1 escapeHole1 = new EscapeHole1();
    DeflectAnimation deflectAnimation = new DeflectAnimation();
    Enemy cop;
    CopExplosion5 copExplosion5 = new CopExplosion5();
    JanitorKey key = new JanitorKey(this.getIndex());
    
    JanitorBullet janitorBullet1 = new JanitorBullet(this);JanitorBullet janitorBullet2 = new JanitorBullet(this);JanitorBullet janitorBullet3 = new JanitorBullet(this);JanitorBullet janitorBullet4 = new JanitorBullet(this);JanitorBullet janitorBullet5 = new JanitorBullet(this);JanitorBullet janitorBullet6 = new JanitorBullet(this);JanitorBullet janitorBullet7 = new JanitorBullet(this);JanitorBullet janitorBullet8 = new JanitorBullet(this);JanitorBullet janitorBullet9 = new JanitorBullet(this);JanitorBullet janitorBullet10 = new JanitorBullet(this);JanitorBullet janitorBullet11 = new JanitorBullet(this);JanitorBullet janitorBullet12 = new JanitorBullet(this);JanitorBullet janitorBullet13 = new JanitorBullet(this);JanitorBullet janitorBullet14 = new JanitorBullet(this);JanitorBullet janitorBullet15 = new JanitorBullet(this);JanitorBullet janitorBullet16 = new JanitorBullet(this);JanitorBullet janitorBullet17 = new JanitorBullet(this);JanitorBullet janitorBullet18 = new JanitorBullet(this);JanitorBullet janitorBullet19 = new JanitorBullet(this);JanitorBullet janitorBullet20 = new JanitorBullet(this);JanitorBullet janitorBullet21 = new JanitorBullet(this);JanitorBullet janitorBullet22 = new JanitorBullet(this);JanitorBullet janitorBullet23 = new JanitorBullet(this);JanitorBullet janitorBullet24 = new JanitorBullet(this);JanitorBullet janitorBullet25 = new JanitorBullet(this);JanitorBullet janitorBullet26 = new JanitorBullet(this);JanitorBullet janitorBullet27 = new JanitorBullet(this);JanitorBullet janitorBullet28 = new JanitorBullet(this);JanitorBullet janitorBullet29 = new JanitorBullet(this);JanitorBullet janitorBullet30 = new JanitorBullet(this);JanitorBullet janitorBullet31 = new JanitorBullet(this);JanitorBullet janitorBullet32 = new JanitorBullet(this);JanitorBullet janitorBullet33 = new JanitorBullet(this);JanitorBullet janitorBullet34 = new JanitorBullet(this);JanitorBullet janitorBullet35 = new JanitorBullet(this);JanitorBullet janitorBullet36 = new JanitorBullet(this);JanitorBullet janitorBullet37 = new JanitorBullet(this);JanitorBullet janitorBullet38 = new JanitorBullet(this);JanitorBullet janitorBullet39 = new JanitorBullet(this);JanitorBullet janitorBullet40 = new JanitorBullet(this);JanitorBullet janitorBullet41 = new JanitorBullet(this);JanitorBullet janitorBullet42 = new JanitorBullet(this);
    
    JanitorBullet janitorBullet1a = new JanitorBullet(this);JanitorBullet janitorBullet2a = new JanitorBullet(this);JanitorBullet janitorBullet3a = new JanitorBullet(this);JanitorBullet janitorBullet4a = new JanitorBullet(this);JanitorBullet janitorBullet5a = new JanitorBullet(this);JanitorBullet janitorBullet6a = new JanitorBullet(this);JanitorBullet janitorBullet7a = new JanitorBullet(this);JanitorBullet janitorBullet8a = new JanitorBullet(this);JanitorBullet janitorBullet9a = new JanitorBullet(this);JanitorBullet janitorBullet10a = new JanitorBullet(this);JanitorBullet janitorBullet11a = new JanitorBullet(this);JanitorBullet janitorBullet12a = new JanitorBullet(this);JanitorBullet janitorBullet13a = new JanitorBullet(this);JanitorBullet janitorBullet14a = new JanitorBullet(this);JanitorBullet janitorBullet15a = new JanitorBullet(this);JanitorBullet janitorBullet16a = new JanitorBullet(this);JanitorBullet janitorBullet17a = new JanitorBullet(this);JanitorBullet janitorBullet18a = new JanitorBullet(this);JanitorBullet janitorBullet19a = new JanitorBullet(this);JanitorBullet janitorBullet20a = new JanitorBullet(this);JanitorBullet janitorBullet21a = new JanitorBullet(this);JanitorBullet janitorBullet22a = new JanitorBullet(this);JanitorBullet janitorBullet23a = new JanitorBullet(this);JanitorBullet janitorBullet24a = new JanitorBullet(this);JanitorBullet janitorBullet25a = new JanitorBullet(this);
    
    JanitorBullet janitorBullet1b = new JanitorBullet(this);JanitorBullet janitorBullet2b = new JanitorBullet(this);JanitorBullet janitorBullet3b = new JanitorBullet(this);JanitorBullet janitorBullet4b = new JanitorBullet(this);JanitorBullet janitorBullet5b = new JanitorBullet(this);JanitorBullet janitorBullet6b = new JanitorBullet(this);JanitorBullet janitorBullet7b = new JanitorBullet(this);JanitorBullet janitorBullet8b = new JanitorBullet(this);JanitorBullet janitorBullet9b = new JanitorBullet(this);JanitorBullet janitorBullet10b = new JanitorBullet(this);JanitorBullet janitorBullet11b = new JanitorBullet(this);JanitorBullet janitorBullet12b = new JanitorBullet(this);JanitorBullet janitorBullet13b = new JanitorBullet(this);JanitorBullet janitorBullet14b = new JanitorBullet(this);JanitorBullet janitorBullet15b = new JanitorBullet(this);JanitorBullet janitorBullet16b = new JanitorBullet(this);JanitorBullet janitorBullet17b = new JanitorBullet(this);JanitorBullet janitorBullet18b = new JanitorBullet(this);JanitorBullet janitorBullet19b = new JanitorBullet(this);JanitorBullet janitorBullet20b = new JanitorBullet(this);JanitorBullet janitorBullet21b = new JanitorBullet(this);JanitorBullet janitorBullet22b = new JanitorBullet(this);JanitorBullet janitorBullet23b = new JanitorBullet(this);JanitorBullet janitorBullet24b = new JanitorBullet(this);JanitorBullet janitorBullet25b = new JanitorBullet(this);
    
    JanitorBullet janitorBullet1c = new JanitorBullet(this);JanitorBullet janitorBullet2c = new JanitorBullet(this);JanitorBullet janitorBullet3c = new JanitorBullet(this);JanitorBullet janitorBullet4c = new JanitorBullet(this);JanitorBullet janitorBullet5c = new JanitorBullet(this);JanitorBullet janitorBullet6c = new JanitorBullet(this);JanitorBullet janitorBullet7c = new JanitorBullet(this);JanitorBullet janitorBullet8c = new JanitorBullet(this);JanitorBullet janitorBullet9c = new JanitorBullet(this);JanitorBullet janitorBullet10c = new JanitorBullet(this);JanitorBullet janitorBullet11c = new JanitorBullet(this);JanitorBullet janitorBullet12c = new JanitorBullet(this);JanitorBullet janitorBullet13c = new JanitorBullet(this);JanitorBullet janitorBullet14c = new JanitorBullet(this);JanitorBullet janitorBullet15c = new JanitorBullet(this);JanitorBullet janitorBullet16c = new JanitorBullet(this);JanitorBullet janitorBullet17c = new JanitorBullet(this);JanitorBullet janitorBullet18c = new JanitorBullet(this);JanitorBullet janitorBullet19c = new JanitorBullet(this);JanitorBullet janitorBullet20c = new JanitorBullet(this);JanitorBullet janitorBullet21c = new JanitorBullet(this);JanitorBullet janitorBullet22c = new JanitorBullet(this);JanitorBullet janitorBullet23c = new JanitorBullet(this);JanitorBullet janitorBullet24c = new JanitorBullet(this);JanitorBullet janitorBullet25c = new JanitorBullet(this);
    
    JanitorBullet janitorBullet1d = new JanitorBullet(this);JanitorBullet janitorBullet2d = new JanitorBullet(this);JanitorBullet janitorBullet3d = new JanitorBullet(this);JanitorBullet janitorBullet4d = new JanitorBullet(this);JanitorBullet janitorBullet5d = new JanitorBullet(this);JanitorBullet janitorBullet6d = new JanitorBullet(this);JanitorBullet janitorBullet7d = new JanitorBullet(this);JanitorBullet janitorBullet8d = new JanitorBullet(this);JanitorBullet janitorBullet9d = new JanitorBullet(this);JanitorBullet janitorBullet10d = new JanitorBullet(this);JanitorBullet janitorBullet11d = new JanitorBullet(this);JanitorBullet janitorBullet12d = new JanitorBullet(this);JanitorBullet janitorBullet13d = new JanitorBullet(this);JanitorBullet janitorBullet14d = new JanitorBullet(this);JanitorBullet janitorBullet15d = new JanitorBullet(this);JanitorBullet janitorBullet16d = new JanitorBullet(this);JanitorBullet janitorBullet17d = new JanitorBullet(this);JanitorBullet janitorBullet18d = new JanitorBullet(this);JanitorBullet janitorBullet19d = new JanitorBullet(this);JanitorBullet janitorBullet20d = new JanitorBullet(this);JanitorBullet janitorBullet21d = new JanitorBullet(this);
    
    //CopExplosion5 copExplosion5 = new CopExplosion5();
    private String direction = "s"; //the janitor starts moving downward
    private int switchTimer = 0;       //a timer variable for different methods
    private int counter = 0;              //a counter variable for different methods
    private int switchTimerVar = 6;          // similar to switchTimer variable
    private int charX;                                //variable used for characters x coordinate, and similarly below for his y coordinate
    private int charY;
    private int waitTimer = 45;                    //timer used to wait when cop runs into object when chasing the character
    private String[] originalDirectionList = new String[2000];             //both variables below are used in determining if the cop is running into an object when he is chasing the character
    private int originalDirectionListCounter = 0;     //^^it's out of 2000 spots because I have to allocate enough spots for the character's direction
    private String originalDirection = "s";        //this is the default direction for the original direction... originalDirection is used to see if the character changed
                                                    //directions during the runAwayFromCharacter() method so that he won't call another change of direction... its used so the cop
                                                    //doesn't repeatedly run into objects when running away from the chaaracter
    private int chooseDirection = 0;
    private int biggerThisIsLessTheLessTheJanitorWillDeflectBullets = 200;    //used in a random number generator
                                                                             //the higher the number, the less times the animation is called
                                                                             //therefore the less bullets are blocked and reflected
    private int biggerThisIsLessTheLessCopsWillSpawn = 2500;         //used in a random number generator
                                                                    //the higher the number, the less cops spawn
    public static String stopMoving = "dontStop";       //used to make the janitor stop moving when the deflect bullet animation runs
    private int switchCounter1 = 200;
    private int index;
    private int copCounter = 7; //this variable shud b the last number in the array of Janitor1 level or janitor2 etc
    private int copCounter2 = 6;
    private int shootCounter = 0;
    private int shootTimer = 0;
    private int bulletCounter = 0;
    private int turnCounter = 0;
    private int turnCounter2 = 0;
    public static String shootInCircle = "shoot";
    public static String shootWallOfBullets = "dontShoot";
    public static String shootSpray = "dontShoot";
    public static String delay = "dontDelay";
    private static int switchCounter2;
    private int turnX;
    private int turnY;
    private int negX;
    private int negY;
    private int sprayCounter = 0;
    /**
     * Act - do whatever the Janitor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Janitor(int i){
        this.index = i;
    }
    
    public void act() 
    {
        if(State.worldNumber == 23){
            stage = "stage3";
        }
        if(doOnce1 == "oneTime"){
            talk1();
            stall();
        }else if(fight == "over"){
            if(doOnce2 == "oneTime"){
                if(stage == "stage1"){
                    talk2();
                    stall();
                }
            }else{
                if(stage == "stage1"){
                    escape();
                }
            }
        }else if(stopMoving == "dontStop"){
            if(doOnce4 == "oneTime"){
                if(stage == "stage3"){
                    speedJ = 1;
                    totalHealthJ = 15;
                }
                doOnce4 = "noMore";
            }
            minusHealth();
            if(amIDead == "notDead"){
                detect();
                assessDirection();
                shoot();
                if(stage == "stage1"){
                    deflectBullets();
                }
                //System.out.println("a");
                spawnCops();
            }
        }
    } 
    
    public void stall(){
        if(switchCounter1 > 0){
            switchCounter1--;
        }else{
            if(doOnce1 == "noMore"){
                doOnce2 = "noMore";
            }
            doOnce1 = "noMore";
            switchCounter1 = 200;
        }
    }
    
    public void talk1(){
        List<Character> listOfChars = getObjectsInRange(600, Character.class);
        if(listOfChars.size() > 0){
            getWorld().addObject(speechBubble1, this.getX() - 100, this.getY() - 100);
        }
    }
    
    public void talk2(){
        if(this.getX() < 100){
            getWorld().addObject(speechBubble2, this.getX() + 100, this.getY() - 100);
        }else if(this.getX() > 900){
            getWorld().addObject(speechBubble2, this.getX() - 100, this.getY() - 100);
        }else if(this.getY() < 100){
            getWorld().addObject(speechBubble2, this.getX() - 100, this.getY() + 100);
        }else if(this.getY() > 500){
            getWorld().addObject(speechBubble2, this.getX() - 100, this.getY() - 100);
        }else{
            getWorld().addObject(speechBubble2, this.getX() - 100, this.getY() - 100);
        }
        this.setImage("J_Fwrd_Def.png");
    }
    
    public void escape(){
        getWorld().addObject(escapeHole1, this.getX() + 50, this.getY() + 20);  //escape animation
        getWorld().removeObject(this);
    }
    
    public void detect(){
        if(!isGoodDirection(direction)){ //only changes direction if the cop finds that an object is in front of it
            determineNewDirection();
        }
    }
    
    public void assessDirection(){
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
                this.setImage("J_Bckwrd_Def.png"); //switching from default frame to left to default to right to default... or something like that
                counter = 0;
                switchTimer = switchTimerVar;
            }else if(counter > 1){
                this.setImage("J_Bckwrd_Lft.png");
                counter++;
                switchTimer = switchTimerVar;
            }else if(counter > 0){
                this.setImage("J_Bckwrd_Def.png");
                counter++;
                switchTimer = switchTimerVar;
            }else{
                this.setImage("J_Bckwrd_Rgt.png");
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
                this.setImage("J_Fwrd_Def.png");
                counter = 0;
                switchTimer = switchTimerVar;
            }else if(counter > 1){
               this.setImage("J_Fwrd_Lft.png");
                counter++;
                switchTimer = switchTimerVar;
            }else if(counter > 0){
                this.setImage("J_Fwrd_Def.png");
                counter++;
                switchTimer = switchTimerVar;
            }else{
                this.setImage("J_Fwrd_Rgt.png");
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
                this.setImage("J_Lft_Def.png");
                counter = 0;
                switchTimer = switchTimerVar;
            }else if(counter > 1){
                this.setImage("J_Lft_Lft.png");
                counter++;
                switchTimer = switchTimerVar;
            }else if(counter > 0){
                this.setImage("J_Lft_Def.png");
                counter++;
                switchTimer = switchTimerVar;
            }else{
                this.setImage("J_Lft_Rgt.png");
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
                this.setImage("J_Rgt_Def.png");
                counter = 0;
                switchTimer = switchTimerVar;
            }else if(counter > 1){
                this.setImage("J_Rgt_Lft.png");
                counter++;
                switchTimer = switchTimerVar;
            }else if(counter > 0){
                this.setImage("J_Rgt_Def.png");
                counter++;
                switchTimer = switchTimerVar;
            }else{
                this.setImage("J_Rgt_Rgt.png");
                counter++;
                switchTimer = switchTimerVar;
            }
        }
    }
    
    public void changeImageUp(){
        if (((this.getImage()).toString() == "J_Bckwrd_Def.png") || ((this.getImage()).toString() == "J_Bckwrd_Lft.png") || ((this.getImage()).toString() == "J_Bckwrd_Def.png"))
            {
            } //if the picture is one of these^^, keep moving in the same direction
            else
            {
                if(stage == "stage1" || stage == "stage3"){
                    run();
                }
                //setLocation(this.getX(), getY()-speedJ);
            }
    }
    
    public void changeImageDown(){
        if (((this.getImage()).toString() == "J_Fwrd_Def.png") || ((this.getImage()).toString() == "J_Fwrd_Lft.png") || ((this.getImage()).toString() == "J_Fwrd_Rgt.png"))
            {
            }
            else
            {
                if(stage == "stage1" || stage == "stage3"){
                    run();
                }
                //setLocation(this.getX(), getY()+speedJ);
            }
    }
    
    public void changeImageLeft(){
        if (((this.getImage()).toString() == "J_Lft_Def.png") || ((this.getImage()).toString() == "J_Lft_Lft.png" ) || ((this.getImage()).toString() == "J_Lft_Def.png"))
            {
            }
            else
            {
                if(stage == "stage1" || stage == "stage3"){
                    run();
                }
                //move(-speedJ);
            }
    }
    
    public void changeImageRight(){
        if (((this.getImage()).toString() == "J_Rgt_Def.png") || ((this.getImage()).toString() == "J_Rgt_Lft.png" ) || ((this.getImage()).toString() == "J_Rgt_Def.png"))
            {
            }
            else
            {
                if(stage == "stage1" || stage == "stage3"){
                    run();
                }
                //move(speedJ);
            }
    }
    
    public void run(){
        if(stage == "stage1"){
            if(direction == "n"){
                setLocation(this.getX(), getY()-speedJ);
                runAwayFromCharacter();
            }
            if(direction == "w"){
                move(-speedJ);
                runAwayFromCharacter();
            }
            if(direction == "s"){
                setLocation(this.getX(), getY()+speedJ);
                runAwayFromCharacter();
            }
            if(direction == "e"){
                move(speedJ);
                runAwayFromCharacter();
            }
        }
        if(stage == "stage2"){
            
        }
        if(stage == "stage3"){
            if(direction == "n"){
                setLocation(this.getX(), getY()-speedJ);
                chaseCharacter();
            }
            if(direction == "w"){
                move(-speedJ);
                chaseCharacter();
            }
            if(direction == "s"){
                setLocation(this.getX(), getY()+speedJ);
                chaseCharacter();
            }
            if(direction == "e"){
                move(speedJ);
                chaseCharacter();
            }
        }
    }
    
    public void delay(){
        if(doOnce5 == 0){
            int rndm = Greenfoot.getRandomNumber(300)+200;
            switchCounter2 = rndm;
            doOnce5++;
        }
        if(switchCounter2 > 0){
            switchCounter2--;
        }else{
            delay = "dontDelay";
            doOnce5 = 0;
        }
    }
    
    public void shoot(){
        if(stage == "stage2"){
            
        }
        if(stage == "stage3"){
            if(shootTimer > 0){
                shootTimer--;
            }else{
                shootTimer = 1;
                if(shootWallOfBullets == "dontShoot" && shootSpray == "dontShoot" && shootInCircle == "shoot"  && delay == "dontDelay"){
                    shootInCircle();
                }
                if(delay == "delay"){
                    delay();
                }
                if(shootWallOfBullets == "shoot" && shootSpray == "dontShoot" && shootInCircle == "dontShoot" && delay == "dontDelay"){
                    shootWallOfBullets();
                }
                if(delay == "delay"){
                    delay();
                }
                if(shootWallOfBullets == "dontShoot" && shootSpray == "shoot" && shootInCircle == "dontShoot" && delay == "dontDelay"){
                    shootSpray();
                }
                if(delay == "delay"){
                    delay();
                }
            }
        }
    }
    
    public void shootInCircle(){
        if(bulletCounter > 0){
            bulletCounter--;   
        }else{
            bulletCounter = 1;
            if(turnCounter == 0){
                getWorld().addObject(janitorBullet1, this.getX(), this.getY());
                janitorBullet1.turn(this.getX(), this.getY() + 15);
                turnCounter++;
            }else if(turnCounter == 1){
                getWorld().addObject(janitorBullet2, this.getX(), this.getY());
                janitorBullet2.turn(this.getX() + 5, this.getY() + 10);
                turnCounter++;
            }else if(turnCounter == 2){
                getWorld().addObject(janitorBullet3, this.getX(), this.getY());
                janitorBullet3.turn(this.getX() + 7, this.getY() + 7);
                turnCounter++;
            }else if(turnCounter == 3){
                getWorld().addObject(janitorBullet4, this.getX(), this.getY());
                janitorBullet4.turn(this.getX() + 10, this.getY() + 5);
                turnCounter++;
            }else if(turnCounter == 4){
                getWorld().addObject(janitorBullet5, this.getX(), this.getY());
                janitorBullet5.turn(this.getX() + 15, this.getY());
                turnCounter++;
            }else if(turnCounter == 5){
                getWorld().addObject(janitorBullet6, this.getX(), this.getY());
                janitorBullet6.turn(this.getX() + 10, this.getY() - 5);
                turnCounter++;
            }else if(turnCounter == 6){
                getWorld().addObject(janitorBullet7, this.getX(), this.getY());
                janitorBullet7.turn(this.getX() + 7, this.getY() - 7);
                turnCounter++;
            }else if(turnCounter == 7){
                getWorld().addObject(janitorBullet8, this.getX(), this.getY());
                janitorBullet8.turn(this.getX() + 5, this.getY() - 10);
                turnCounter++;
            }else if(turnCounter == 8){
                getWorld().addObject(janitorBullet9, this.getX(), this.getY());
                janitorBullet9.turn(this.getX(), this.getY() - 15);
                turnCounter++;
            }else if(turnCounter == 9){
                getWorld().addObject(janitorBullet10, this.getX(), this.getY());
                janitorBullet10.turn(this.getX() - 5, this.getY() - 10);
                turnCounter++;
            }else if(turnCounter == 10){
                getWorld().addObject(janitorBullet11, this.getX(), this.getY());
                janitorBullet11.turn(this.getX() - 7, this.getY() - 7);
                turnCounter++;
            }else if(turnCounter == 11){
                getWorld().addObject(janitorBullet12, this.getX(), this.getY());
                janitorBullet12.turn(this.getX() - 10, this.getY() - 5);
                turnCounter++;
            }else if(turnCounter == 12){
                getWorld().addObject(janitorBullet13, this.getX(), this.getY());
                janitorBullet13.turn(this.getX() - 15, this.getY());
                turnCounter++;
            }else if(turnCounter == 13){
                getWorld().addObject(janitorBullet14, this.getX(), this.getY());
                janitorBullet14.turn(this.getX() - 10, this.getY() + 5);
                turnCounter++;
            }else if(turnCounter == 14){
                getWorld().addObject(janitorBullet15, this.getX(), this.getY());
                janitorBullet15.turn(this.getX() - 7, this.getY() + 7);
                turnCounter++;
            }else if(turnCounter == 15){
                getWorld().addObject(janitorBullet16, this.getX(), this.getY());
                janitorBullet16.turn(this.getX() - 5, this.getY() + 10);
                turnCounter++;
            }else if(turnCounter == 16){
                getWorld().addObject(janitorBullet17, this.getX(), this.getY());
                janitorBullet17.turn(this.getX(), this.getY() + 15);
                turnCounter = 0;
                shootWallOfBullets = "shoot";
                shootInCircle = "dontShoot";
                shootSpray = "dontShoot";
                delay = "delay";
            }else{
                
            }
        }
    }
    
    public void shootWallOfBullets(){
        if(bulletCounter > 0){
            bulletCounter--;   
        }else{
            bulletCounter = 1;
            if(direction == "n"){
                getWorld().addObject(janitorBullet18, this.getX()-300, this.getY());
                janitorBullet18.turn(this.getX()-300, this.getY() - 15);
                getWorld().addObject(janitorBullet19, this.getX()-275, this.getY());
                janitorBullet19.turn(this.getX()-275, this.getY() - 15);
                getWorld().addObject(janitorBullet20, this.getX()-250, this.getY());
                janitorBullet20.turn(this.getX()-250, this.getY() - 15);
                getWorld().addObject(janitorBullet21, this.getX()-225, this.getY());
                janitorBullet21.turn(this.getX()-225, this.getY() - 15);
                getWorld().addObject(janitorBullet22, this.getX()-200, this.getY());
                janitorBullet22.turn(this.getX()-200, this.getY() - 15);
                getWorld().addObject(janitorBullet23, this.getX()-175, this.getY());
                janitorBullet23.turn(this.getX()-175, this.getY() - 15);
                getWorld().addObject(janitorBullet24, this.getX()-150, this.getY());
                janitorBullet24.turn(this.getX()-150, this.getY() - 15);
                getWorld().addObject(janitorBullet25, this.getX()-125, this.getY());
                janitorBullet25.turn(this.getX()-125, this.getY() - 15);
                getWorld().addObject(janitorBullet26, this.getX()-100, this.getY());
                janitorBullet26.turn(this.getX()-100, this.getY() - 15);
                getWorld().addObject(janitorBullet27, this.getX()-75, this.getY());
                janitorBullet27.turn(this.getX()-75, this.getY() - 15);
                getWorld().addObject(janitorBullet28, this.getX()-50, this.getY());
                janitorBullet28.turn(this.getX()-50, this.getY() - 15);
                getWorld().addObject(janitorBullet29, this.getX()-25, this.getY());
                janitorBullet29.turn(this.getX()-25, this.getY() - 15);
                getWorld().addObject(janitorBullet30, this.getX(), this.getY());
                janitorBullet30.turn(this.getX(), this.getY() - 15);
                getWorld().addObject(janitorBullet31, this.getX()+25, this.getY());
                janitorBullet31.turn(this.getX()+25, this.getY() - 15);
                getWorld().addObject(janitorBullet32, this.getX()+50, this.getY());
                janitorBullet32.turn(this.getX()+50, this.getY() - 15);
                getWorld().addObject(janitorBullet33, this.getX()+75, this.getY());
                janitorBullet33.turn(this.getX()+75, this.getY() - 15);
                getWorld().addObject(janitorBullet34, this.getX()+100, this.getY());
                janitorBullet34.turn(this.getX()+100, this.getY() - 15);
                getWorld().addObject(janitorBullet35, this.getX()+125, this.getY());
                janitorBullet35.turn(this.getX()+125, this.getY() - 15);
                getWorld().addObject(janitorBullet36, this.getX()+150, this.getY());
                janitorBullet36.turn(this.getX()+150, this.getY() - 15);
                getWorld().addObject(janitorBullet37, this.getX()+175, this.getY());
                janitorBullet37.turn(this.getX()+175, this.getY() - 15);
                getWorld().addObject(janitorBullet38, this.getX()+200, this.getY());
                janitorBullet38.turn(this.getX()+200, this.getY() - 15);
                getWorld().addObject(janitorBullet39, this.getX()+225, this.getY());
                janitorBullet39.turn(this.getX()+225, this.getY() - 15);
                getWorld().addObject(janitorBullet40, this.getX()+250, this.getY());
                janitorBullet40.turn(this.getX()+250, this.getY() - 15);
                getWorld().addObject(janitorBullet41, this.getX()+275, this.getY());
                janitorBullet41.turn(this.getX()+275, this.getY() - 15);
                getWorld().addObject(janitorBullet42, this.getX()+300, this.getY());
                janitorBullet42.turn(this.getX()+300, this.getY() - 15);
                shootSpray = "shoot";
                shootWallOfBullets = "dontShoot";
                shootInCircle = "dontShoot";
                delay = "delay";
            }else if(direction == "w"){
                getWorld().addObject(janitorBullet1a, this.getX(), this.getY()-300);
                janitorBullet1a.turn(this.getX()-15, this.getY()-300);
                getWorld().addObject(janitorBullet2a, this.getX(), this.getY()-275);
                janitorBullet2a.turn(this.getX()-15, this.getY()-275);
                getWorld().addObject(janitorBullet3a, this.getX(), this.getY()-250);
                janitorBullet3a.turn(this.getX()-15, this.getY()-250);
                getWorld().addObject(janitorBullet4a, this.getX(), this.getY()-225);
                janitorBullet4a.turn(this.getX()-15, this.getY()-225);
                getWorld().addObject(janitorBullet5a, this.getX(), this.getY()-200);
                janitorBullet5a.turn(this.getX()-15, this.getY()-200);
                getWorld().addObject(janitorBullet6a, this.getX(), this.getY()-175);
                janitorBullet6a.turn(this.getX()-15, this.getY()-175);
                getWorld().addObject(janitorBullet7a, this.getX(), this.getY()-150);
                janitorBullet7a.turn(this.getX()-15, this.getY()-150);
                getWorld().addObject(janitorBullet8a, this.getX(), this.getY()-125);
                janitorBullet8a.turn(this.getX()-15, this.getY()-125);
                getWorld().addObject(janitorBullet9a, this.getX(), this.getY()-100);
                janitorBullet9a.turn(this.getX()-15, this.getY()-100);
                getWorld().addObject(janitorBullet10a, this.getX(), this.getY()-75);
                janitorBullet10a.turn(this.getX()-15, this.getY()-75);
                getWorld().addObject(janitorBullet11a, this.getX(), this.getY()-50);
                janitorBullet11a.turn(this.getX()-15, this.getY()-50);
                getWorld().addObject(janitorBullet12a, this.getX(), this.getY()-25);
                janitorBullet12a.turn(this.getX()-15, this.getY()-25);
                getWorld().addObject(janitorBullet13a, this.getX(), this.getY());
                janitorBullet13a.turn(this.getX()-15, this.getY());
                getWorld().addObject(janitorBullet14a, this.getX(), this.getY()+25);
                janitorBullet14a.turn(this.getX()-15, this.getY()+25);
                getWorld().addObject(janitorBullet15a, this.getX(), this.getY()+50);
                janitorBullet15a.turn(this.getX()-15, this.getY()+50);
                getWorld().addObject(janitorBullet16a, this.getX(), this.getY()+75);
                janitorBullet16a.turn(this.getX()-15, this.getY()+75);
                getWorld().addObject(janitorBullet17a, this.getX(), this.getY()+100);
                janitorBullet17a.turn(this.getX()-15, this.getY()+100);
                getWorld().addObject(janitorBullet18a, this.getX(), this.getY()+125);
                janitorBullet18a.turn(this.getX()-15, this.getY()+125);
                getWorld().addObject(janitorBullet19a, this.getX(), this.getY()+150);
                janitorBullet19a.turn(this.getX()-15, this.getY()+150);
                getWorld().addObject(janitorBullet20a, this.getX(), this.getY()+175);
                janitorBullet20a.turn(this.getX()-15, this.getY()+175);
                getWorld().addObject(janitorBullet21a, this.getX(), this.getY()+200);
                janitorBullet21a.turn(this.getX()-15, this.getY()+200);
                getWorld().addObject(janitorBullet22a, this.getX(), this.getY()+225);
                janitorBullet22a.turn(this.getX()-15, this.getY()+225);
                getWorld().addObject(janitorBullet23a, this.getX(), this.getY()+250);
                janitorBullet23a.turn(this.getX()-15, this.getY()+250);
                getWorld().addObject(janitorBullet24a, this.getX(), this.getY()+275);
                janitorBullet24a.turn(this.getX()-15, this.getY()+275);
                getWorld().addObject(janitorBullet25a, this.getX(), this.getY()+300);
                janitorBullet25a.turn(this.getX()-15, this.getY()+300);
                shootSpray = "shoot";
                shootWallOfBullets = "dontShoot";
                shootInCircle = "dontShoot";
                delay = "delay";
            }else if(direction == "e"){
                getWorld().addObject(janitorBullet1b, this.getX(), this.getY()-300);
                janitorBullet1b.turn(this.getX()+15, this.getY()-300);
                getWorld().addObject(janitorBullet2b, this.getX(), this.getY()-275);
                janitorBullet2b.turn(this.getX()+15, this.getY()-275);
                getWorld().addObject(janitorBullet3b, this.getX(), this.getY()-250);
                janitorBullet3b.turn(this.getX()+15, this.getY()-250);
                getWorld().addObject(janitorBullet4b, this.getX(), this.getY()-225);
                janitorBullet4b.turn(this.getX()+15, this.getY()-225);
                getWorld().addObject(janitorBullet5b, this.getX(), this.getY()-200);
                janitorBullet5b.turn(this.getX()+15, this.getY()-200);
                getWorld().addObject(janitorBullet6b, this.getX(), this.getY()-175);
                janitorBullet6b.turn(this.getX()+15, this.getY()-175);
                getWorld().addObject(janitorBullet7b, this.getX(), this.getY()-150);
                janitorBullet7b.turn(this.getX()+15, this.getY()-150);
                getWorld().addObject(janitorBullet8b, this.getX(), this.getY()-125);
                janitorBullet8b.turn(this.getX()+15, this.getY()-125);
                getWorld().addObject(janitorBullet9b, this.getX(), this.getY()-100);
                janitorBullet9b.turn(this.getX()+15, this.getY()-100);
                getWorld().addObject(janitorBullet10b, this.getX(), this.getY()-75);
                janitorBullet10b.turn(this.getX()+15, this.getY()-75);
                getWorld().addObject(janitorBullet11b, this.getX(), this.getY()-50);
                janitorBullet11b.turn(this.getX()+15, this.getY()-50);
                getWorld().addObject(janitorBullet12b, this.getX(), this.getY()-25);
                janitorBullet12b.turn(this.getX()+15, this.getY()-25);
                getWorld().addObject(janitorBullet13b, this.getX(), this.getY());
                janitorBullet13b.turn(this.getX()+15, this.getY());
                getWorld().addObject(janitorBullet14b, this.getX(), this.getY()+25);
                janitorBullet14b.turn(this.getX()+15, this.getY()+25);
                getWorld().addObject(janitorBullet15b, this.getX(), this.getY()+50);
                janitorBullet15b.turn(this.getX()+15, this.getY()+50);
                getWorld().addObject(janitorBullet16b, this.getX(), this.getY()+75);
                janitorBullet16b.turn(this.getX()+15, this.getY()+75);
                getWorld().addObject(janitorBullet17b, this.getX(), this.getY()+100);
                janitorBullet17b.turn(this.getX()+15, this.getY()+100);
                getWorld().addObject(janitorBullet18b, this.getX()+125, this.getY());
                janitorBullet18b.turn(this.getX()+15, this.getY());
                getWorld().addObject(janitorBullet19b, this.getX(), this.getY()+150);
                janitorBullet19b.turn(this.getX()+15, this.getY()+150);
                getWorld().addObject(janitorBullet20b, this.getX(), this.getY()+175);
                janitorBullet20b.turn(this.getX()+15, this.getY()+175);
                getWorld().addObject(janitorBullet21b, this.getX(), this.getY()+200);
                janitorBullet21b.turn(this.getX()+15, this.getY()+200);
                getWorld().addObject(janitorBullet22b, this.getX(), this.getY()+225);
                janitorBullet22b.turn(this.getX()+15, this.getY()+225);
                getWorld().addObject(janitorBullet23b, this.getX(), this.getY()+250);
                janitorBullet23b.turn(this.getX()+15, this.getY()+250);
                getWorld().addObject(janitorBullet24b, this.getX(), this.getY()+275);
                janitorBullet24b.turn(this.getX()+15, this.getY()+275);
                getWorld().addObject(janitorBullet25b, this.getX(), this.getY()+300);
                janitorBullet25b.turn(this.getX()+15, this.getY()+300);
                shootSpray = "shoot";
                shootWallOfBullets = "dontShoot";
                shootInCircle = "dontShoot";
                delay = "delay";
            }else if(direction == "s"){
                getWorld().addObject(janitorBullet1c, this.getX()-300, this.getY());
                janitorBullet1c.turn(this.getX()-300, this.getY() + 15);
                getWorld().addObject(janitorBullet2c, this.getX()-275, this.getY());
                janitorBullet2c.turn(this.getX()-275, this.getY() + 15);
                getWorld().addObject(janitorBullet3c, this.getX()-250, this.getY());
                janitorBullet3c.turn(this.getX()-250, this.getY() + 15);
                getWorld().addObject(janitorBullet4c, this.getX()-225, this.getY());
                janitorBullet4c.turn(this.getX()-225, this.getY() + 15);
                getWorld().addObject(janitorBullet5c, this.getX()-200, this.getY());
                janitorBullet5c.turn(this.getX()-200, this.getY() + 15);
                getWorld().addObject(janitorBullet6c, this.getX()-175, this.getY());
                janitorBullet6c.turn(this.getX()-175, this.getY() + 15);
                getWorld().addObject(janitorBullet7c, this.getX()-150, this.getY());
                janitorBullet7c.turn(this.getX()-150, this.getY() + 15);
                getWorld().addObject(janitorBullet8c, this.getX()-125, this.getY());
                janitorBullet8c.turn(this.getX()-125, this.getY() + 15);
                getWorld().addObject(janitorBullet9c, this.getX()-100, this.getY());
                janitorBullet9c.turn(this.getX()-100, this.getY() + 15);
                getWorld().addObject(janitorBullet10c, this.getX()-75, this.getY());
                janitorBullet10c.turn(this.getX()-75, this.getY() + 15);
                getWorld().addObject(janitorBullet11c, this.getX()-50, this.getY());
                janitorBullet11c.turn(this.getX()-50, this.getY() + 15);
                getWorld().addObject(janitorBullet12c, this.getX()-25, this.getY());
                janitorBullet12c.turn(this.getX()-25, this.getY() + 15);
                getWorld().addObject(janitorBullet13c, this.getX(), this.getY());
                janitorBullet13c.turn(this.getX(), this.getY() + 15);
                getWorld().addObject(janitorBullet14c, this.getX()+25, this.getY());
                janitorBullet14c.turn(this.getX()+25, this.getY() + 15);
                getWorld().addObject(janitorBullet15c, this.getX()+50, this.getY());
                janitorBullet15c.turn(this.getX()+50, this.getY() + 15);
                getWorld().addObject(janitorBullet16c, this.getX()+75, this.getY());
                janitorBullet16c.turn(this.getX()+75, this.getY() + 15);
                getWorld().addObject(janitorBullet17c, this.getX()+100, this.getY());
                janitorBullet17c.turn(this.getX()+100, this.getY() + 15);
                getWorld().addObject(janitorBullet18c, this.getX()+125, this.getY());
                janitorBullet18c.turn(this.getX()+125, this.getY() + 15);
                getWorld().addObject(janitorBullet19c, this.getX()+150, this.getY());
                janitorBullet19c.turn(this.getX()+150, this.getY() + 15);
                getWorld().addObject(janitorBullet20c, this.getX()+175, this.getY());
                janitorBullet20c.turn(this.getX()+175, this.getY() + 15);
                getWorld().addObject(janitorBullet21c, this.getX()+200, this.getY());
                janitorBullet21c.turn(this.getX()+200, this.getY() + 15);
                getWorld().addObject(janitorBullet22c, this.getX()+225, this.getY());
                janitorBullet22c.turn(this.getX()+225, this.getY() + 15);
                getWorld().addObject(janitorBullet23c, this.getX()+250, this.getY());
                janitorBullet23c.turn(this.getX()+250, this.getY() + 15);
                getWorld().addObject(janitorBullet24c, this.getX()+275, this.getY());
                janitorBullet24c.turn(this.getX()+275, this.getY() + 15);
                getWorld().addObject(janitorBullet25c, this.getX()+300, this.getY());
                janitorBullet25c.turn(this.getX()+300, this.getY() + 15);
                shootSpray = "shoot";
                shootWallOfBullets = "dontShoot";
                shootInCircle = "dontShoot";
                delay = "delay";
            }
        }
    }
    
    public void shootSpray(){
        if(sprayCounter > 0){
            sprayCounter--;
        }else{
            sprayCounter = 1;
            int rndmX = Greenfoot.getRandomNumber(100)+1;
            int rndmY = Greenfoot.getRandomNumber(100)+1;
            int rndmNegX = Greenfoot.getRandomNumber(2);
            int rndmNegY = Greenfoot.getRandomNumber(2);
            turnX = rndmX;
            turnY = rndmY;
            if(rndmNegX == 0){
                negX = -1;
            }else{
                negX = 1;
            }
            if(rndmNegY == 0){
                negY = -1;
            }else{
                negY = 1;
            }
            turnX = turnX * negX;
            turnY = turnY * negY;
            if(turnCounter2 == 0){
                getWorld().addObject(janitorBullet1d, this.getX(), this.getY());
                janitorBullet1d.turn(this.getX() + turnX, this.getY() + turnY);
                turnCounter2++;
            }else if(turnCounter2 == 1){
                getWorld().addObject(janitorBullet2d, this.getX(), this.getY());
                janitorBullet2d.turn(this.getX() + turnX, this.getY() + turnY);
                turnCounter2++;
            }else if(turnCounter2 == 2){
                getWorld().addObject(janitorBullet3d, this.getX(), this.getY());
                janitorBullet3d.turn(this.getX() + turnX, this.getY() + turnY);
                turnCounter2++;
            }else if(turnCounter2 == 3){
                getWorld().addObject(janitorBullet4d, this.getX(), this.getY());
                janitorBullet4d.turn(this.getX() + turnX, this.getY() + turnY);
                turnCounter2++;
            }else if(turnCounter2 == 4){
                getWorld().addObject(janitorBullet5d, this.getX(), this.getY());
                janitorBullet5d.turn(this.getX() + turnX, this.getY() + turnY);
                turnCounter2++;
            }else if(turnCounter2 == 5){
                getWorld().addObject(janitorBullet6d, this.getX(), this.getY());
                janitorBullet6d.turn(this.getX() + turnX, this.getY() + turnY);
                turnCounter2++;
            }else if(turnCounter2 == 6){
                getWorld().addObject(janitorBullet7d, this.getX(), this.getY());
                janitorBullet7d.turn(this.getX() + turnX, this.getY() + turnY);
                turnCounter2++;
            }else if(turnCounter2 == 7){
                getWorld().addObject(janitorBullet8d, this.getX(), this.getY());
                janitorBullet8d.turn(this.getX() + turnX, this.getY() + turnY);
                turnCounter2++;
            }else if(turnCounter2 == 8){
                getWorld().addObject(janitorBullet9d, this.getX(), this.getY());
                janitorBullet9d.turn(this.getX() + turnX, this.getY() + turnY);
                turnCounter2++;
            }else if(turnCounter2 == 9){
                getWorld().addObject(janitorBullet10d, this.getX(), this.getY());
                janitorBullet10d.turn(this.getX() + turnX, this.getY() + turnY);
                turnCounter2++;
            }else if(turnCounter2 == 10){
                getWorld().addObject(janitorBullet11d, this.getX(), this.getY());
                janitorBullet11d.turn(this.getX() + turnX, this.getY() + turnY);
                turnCounter2++;
            }else if(turnCounter2 == 11){
                getWorld().addObject(janitorBullet12d, this.getX(), this.getY());
                janitorBullet12d.turn(this.getX() + turnX, this.getY() + turnY);
                turnCounter2++;
            }else if(turnCounter2 == 12){
                getWorld().addObject(janitorBullet13d, this.getX(), this.getY());
                janitorBullet13d.turn(this.getX() + turnX, this.getY() + turnY);
                turnCounter2++;
            }else if(turnCounter2 == 13){
                getWorld().addObject(janitorBullet14d, this.getX(), this.getY());
                janitorBullet14d.turn(this.getX() + turnX, this.getY() + turnY);
                turnCounter2++;
            }else if(turnCounter2 == 14){
                getWorld().addObject(janitorBullet15d, this.getX(), this.getY());
                janitorBullet15d.turn(this.getX() + turnX, this.getY() + turnY);
                turnCounter2++;
            }else if(turnCounter2 == 15){
                getWorld().addObject(janitorBullet16d, this.getX(), this.getY());
                janitorBullet16d.turn(this.getX() + turnX, this.getY() + turnY);
                turnCounter2++;
            }else if(turnCounter2 == 16){
                getWorld().addObject(janitorBullet17d, this.getX(), this.getY());
                janitorBullet17d.turn(this.getX() + turnX, this.getY() + turnY);
                turnCounter2++;
            }else if(turnCounter2 == 17){
                getWorld().addObject(janitorBullet18d, this.getX(), this.getY());
                janitorBullet18d.turn(this.getX() + turnX, this.getY() + turnY);
                turnCounter2++;
            }else if(turnCounter2 == 18){
                getWorld().addObject(janitorBullet19d, this.getX(), this.getY());
                janitorBullet19d.turn(this.getX() + turnX, this.getY() + turnY);
                turnCounter2++;
            }else if(turnCounter2 == 19){
                getWorld().addObject(janitorBullet20d, this.getX(), this.getY());
                janitorBullet20d.turn(this.getX() + turnX, this.getY() + turnY);
                turnCounter2++;
            }else if(turnCounter2 == 20){
                getWorld().addObject(janitorBullet21d, this.getX(), this.getY());
                janitorBullet21d.turn(this.getX() + turnX, this.getY() + turnY);
                turnCounter2 = 0;
                shootInCircle = "shoot";
                shootWallOfBullets = "dontShoot";
                shootSpray = "dontShoot";
                delay = "delay";
            }else{
                
            }
        }
    }
    
    public void deflectBullets(){
        int randomNum = Greenfoot.getRandomNumber(biggerThisIsLessTheLessTheJanitorWillDeflectBullets);
        if(randomNum == 3){
            stopMoving = "stop";
            this.getImage().setTransparency(1);
            getWorld().addObject(deflectAnimation, this.getX(), this.getY());
        }
    }
    
    public void spawnCops(){
        if(stage == "stage1"){
            int randomNum = Greenfoot.getRandomNumber(biggerThisIsLessTheLessCopsWillSpawn);
            if(randomNum < 4){
                copCounter++;
                cop = new Enemy(copCounter);
                getWorld().addObject(cop, this.getX(), this.getY());
            }
        }
        if(stage == "stage3"){
            int randomNum = Greenfoot.getRandomNumber(biggerThisIsLessTheLessCopsWillSpawn);
            if(randomNum < 4){
                copCounter2++;
                cop = new Enemy(copCounter2);
                getWorld().addObject(cop, this.getX(), this.getY());
            }
        }
    }
    
    public void minusHealth(){
        if(stage == "stage1"){
            if((getOneIntersectingObject(CharBullet.class) != null) || hitBySomethingJ == "hit" || (getOneIntersectingObject(ExplosionRadius.class) != null)){   //this method here detects if cop has been hit by a character's bullet and removes health accordingly
                if((getOneIntersectingObject(CharBullet.class) != null)){
                    totalHealthJ -= 1;
                    Actor bullet = getOneIntersectingObject(CharBullet.class);
                    getWorld().removeObject(bullet);
                }
                hitBySomethingJ = "notHit";
                if(totalHealthJ <= 0)
                {
                    fight = "over";
                    amIDead = "dead";
                    if(State.worldNumber == 8){
                        State.janitor1[this.getIndex()] = false;
                    }
                    //getWorld().addObject(copExplosion5, this.getX(), this.getY());
                }
            }
        }
        if(stage == "stage3"){
            if((getOneIntersectingObject(CharBullet.class) != null) || hitBySomethingJ == "hit" || (getOneIntersectingObject(ExplosionRadius.class) != null)){   //this method here detects if cop has been hit by a character's bullet and removes health accordingly
                if((getOneIntersectingObject(CharBullet.class) != null)){
                    totalHealthJ -= 1;
                    Actor bullet = getOneIntersectingObject(CharBullet.class);
                    getWorld().removeObject(bullet);
                }
                hitBySomethingJ = "notHit";
                if(totalHealthJ <= 0)
                {
                    fight = "over";
                    amIDead = "dead";
                    if(State.worldNumber == 23){
                        State.janitor2[this.getIndex()] = false;
                    }
                    getWorld().addObject(copExplosion5, this.getX(), this.getY());
                    getWorld().addObject(key, this.getX(), this.getY());
                    getWorld().removeObject(this);
                    //getWorld().addObject(copExplosion5, this.getX(), this.getY());
                }
            }
        }
    }
    
    public void assessOldDirection(){
        originalDirectionList[originalDirectionListCounter] = direction;         //to fit in the whole game... I should probably use an arrayList @@change
        if(originalDirectionListCounter == 0){             //creating an array of the directions... picking the previous direction to see if its different from 
            originalDirection = originalDirectionList[0];   //the one before it to see if part of the runAwayFromCharacter method should not be called
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
        findCharacterOnScreen = getObjectsInRange(1300, Character.class);
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
                        //speed = fastSpeed;
                        //System.out.println("chase " + direction);
                    }else{
                        direction = "s";
                        //speed = fastSpeed;
                        //System.out.println("chase " + direction);
                    }
                }
                if(charX > this.getX() && charY < this.getY()){
                    if(charX - this.getX() > this.getY() - charY){
                        direction = "e";
                        //speed = fastSpeed;
                        //System.out.println("chase " + direction);
                    }else{
                        direction = "n";
                        //speed = fastSpeed;
                        //System.out.println("chase " + direction);
                    }
                }
                if(charX < this.getX() && charY > this.getY()){
                    if(this.getX() - charX > charY - this.getY()){
                        direction = "w";
                        //speed = fastSpeed;
                        //System.out.println("chase " + direction);
                    }else{
                        direction = "s";
                        //speed = fastSpeed;
                        //System.out.println("chase " + direction);
                    }
                }
                if(charX < this.getX() && charY < this.getY()){
                    if(this.getX() - charX > this.getY() - charY){
                        direction = "w";
                        //speed = fastSpeed;
                        //System.out.println("chase " + direction);
                    }else{
                        direction = "n";
                        //speed = fastSpeed;
                        //System.out.println("chase " + direction);
                    }
                }
                //itsChasingTime = "chaseIsOn";        //continue to chase character... makes the cop not call the detectCharacter method (called under the act method)
                assessOldDirection();
            }else{
                if(waitTimer > 0){
                    waitTimer--;
                }else{
                    if(charX > this.getX() && charY > this.getY()){        //the following set of if statements determine which direction to move in depending on the x and y
                        if(charX - this.getX() > charY - this.getY()){     //coordinates of both the cop and the character... and then finds the shortest route to go
                            direction = "e";
                            //speed = fastSpeed;
                            //System.out.println("chase " + direction);
                        }else{
                            direction = "s";
                            //speed = fastSpeed;
                            //System.out.println("chase " + direction);
                        }
                    }
                    if(charX > this.getX() && charY < this.getY()){
                        if(charX - this.getX() > this.getY() - charY){
                            direction = "e";
                            //speed = fastSpeed;
                            //System.out.println("chase " + direction);
                        }else{
                            direction = "n";
                            //speed = fastSpeed;
                            //System.out.println("chase " + direction);
                        }
                    }
                    if(charX < this.getX() && charY > this.getY()){
                        if(this.getX() - charX > charY - this.getY()){
                            direction = "w";
                            //speed = fastSpeed;
                            //System.out.println("chase " + direction);
                        }else{
                            direction = "s";
                            //speed = fastSpeed;
                            //System.out.println("chase " + direction);
                        }
                    }
                    if(charX < this.getX() && charY < this.getY()){
                        if(this.getX() - charX > this.getY() - charY){
                            direction = "w";
                            //speed = fastSpeed;
                            //System.out.println("chase " + direction);
                        }else{
                            direction = "n";
                            //speed = fastSpeed;
                            //System.out.println("chase " + direction);
                        }
                    }
                    //itsChasingTime = "chaseIsOn";        //continue to chase character... makes the cop not call the detectCharacter method (called under the act method)
                    assessOldDirection();
                    waitTimer = 45;
                }
            }
        }else{     //if the character isn't with the radius around the cop, reset speed and allow cop to detectCharacter again
            //speed = 2;
            //itsChasingTime = "chaseIsOff";           //cop can now call the detectCharacter() method again
            //System.out.println("not chasing");
        }
    }
    
    public void runAwayFromCharacter(){
        //String desiredDirection = "";
        //System.out.println("chaseChar");
        List<Character> findCharacterOnScreen;
        findCharacterOnScreen = getObjectsInRange(1500, Character.class);
        if(findCharacterOnScreen.size() > 0){
            detect();                                     //detecting if cop is running into anything
            charX = findCharacterOnScreen.get(0).getX();    //finding character's x and y coordinatesvv
            charY = findCharacterOnScreen.get(0).getY();
            //System.out.println("found him");
            if(originalDirection == direction){                //if the cop ran into an object, he won't change direction again
                           // System.out.println("foundChar");
                if(charX > this.getX() && charY > this.getY()){        //the following set of if statements determine which direction to move in depending on the x and y
                    if(charX - this.getX() > charY - this.getY()){     //coordinates of both the cop and the character... and then finds the shortest route to go
                        direction = "w";
                        //System.out.println("chase " + direction);
                    }else{
                        direction = "n";
                        //System.out.println("chase " + direction);
                    }
                }
                if(charX > this.getX() && charY < this.getY()){
                    if(charX - this.getX() > this.getY() - charY){
                        direction = "w";
                        //System.out.println("chase " + direction);
                    }else{
                        direction = "s";
                        //System.out.println("chase " + direction);
                    }
                }
                if(charX < this.getX() && charY > this.getY()){
                    if(this.getX() - charX > charY - this.getY()){
                        direction = "e";
                        //System.out.println("chase " + direction);
                    }else{
                        direction = "n";
                        //System.out.println("chase " + direction);
                    }
                }
                if(charX < this.getX() && charY < this.getY()){
                    if(this.getX() - charX > this.getY() - charY){
                        direction = "e";
                        //System.out.println("chase " + direction);
                    }else{
                        direction = "s";
                        //System.out.println("chase " + direction);
                    }
                }
                assessOldDirection();
            }else{
                if(waitTimer > 0){
                    waitTimer--;
                }else{
                    if(charX > this.getX() && charY > this.getY()){        //the following set of if statements determine which direction to move in depending on the x and y
                        if(charX - this.getX() > charY - this.getY()){     //coordinates of both the cop and the character... and then finds the shortest route to go
                            direction = "w";
                            //System.out.println("chase " + direction);
                        }else{
                            direction = "n";
                            //System.out.println("chase " + direction);
                        }
                    }
                    if(charX > this.getX() && charY < this.getY()){
                        if(charX - this.getX() > this.getY() - charY){
                            direction = "w";
                            //System.out.println("chase " + direction);
                        }else{
                            direction = "s";
                            //System.out.println("chase " + direction);
                        }
                    }
                    if(charX < this.getX() && charY > this.getY()){
                        if(this.getX() - charX > charY - this.getY()){
                            direction = "e";
                            //System.out.println("chase " + direction);
                        }else{
                            direction = "n";
                            //System.out.println("chase " + direction);
                        }
                    }
                    if(charX < this.getX() && charY < this.getY()){
                        if(this.getX() - charX > this.getY() - charY){
                            direction = "e";
                            //System.out.println("chase " + direction);
                        }else{
                            direction = "s";
                            //System.out.println("chase " + direction);
                        }
                    }
                    assessOldDirection();
                    waitTimer = 45;
                }
            }
        }else{     //if the character isn't with the radius around the cop, reset speedJ and allow cop to detectCharacter again

        }
    }
    
    public String getStopMoving(){
        return stopMoving;
    }
    
    public void setStopMoving(String moving){
        stopMoving = moving;
    }
    
    public void setHealth(int health){
        totalHealthJ += health;
        hitBySomethingJ = "hit";
        //System.out.println(totalHealth);
    }
    
    public int getTotalHealth(){
        return totalHealthJ;
    }
    
    public int getIndex(){
        return index;
    }
}
