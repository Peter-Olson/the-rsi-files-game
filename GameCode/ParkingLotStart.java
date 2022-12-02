import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ParkingLotStart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ParkingLotStart extends World
{
    private Janitor janitor;
    private Enemy enemy;
    /**
     * Constructor for objects of class parkingLotStart.
     * 
     */
    public ParkingLotStart()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        reset();
        prepare();
        State.worldNumber = 1;
    }

    public ParkingLotStart(int x, int y)
    {
        super(1000, 600, 1);
        prepare2();
        Character character = new Character();
        addObject(character, x, y);
        State.worldNumber = 1;
    }

    /*
    private int decay = 50;
    
    public Match(int decay){
        this.decay = decay;
    }
    
    public void act(){
        burn();
    }
    
    public void burn(){
        if(Greenfoot.mouseClicked(null)){
            add(flame);
            remove(this);
        }
    }
    
    public void burn()
    {
        if(decay == 0)
                remove();
            decay--;
    }
    
    */
   
    public void reset(){
        Character character = new Character();
        character.killCount = 0;
        character.totalHealth = 10;
        character.ammo = 12;
        character.inventoryCounter = 0;
        character.grenadeCounter = 0;
        character.m16AmmoCounter = 0;
        character.knifeCounter = 0;
        character.handgunCounter = 1;
        character.slot5Counter = 0;
        character.slot6Counter = 0;
        character.slot7Counter = 0;
        character.slot8Counter = 0;
        character.slot9Counter = 0;
        character.equipCounter = 1;
        character.currentEquip = 1;
        JanitorKey.isBossOpen = false;
        janitor.totalHealthJ = 5;     
        janitor.speedJ = 4;             
        janitor.hitBySomethingJ = "notHit";
        janitor.stopMoving = "dontStop";
        janitor.shootWallOfBullets = "dontShoot";
        janitor.shootInCircle = "shoot";
        janitor.shootSpray = "dontShoot";
        janitor.delay = "dontDelay";
        enemy.doOnce = 0;
        enemy.counter2 = 0;
        enemy.previousCounter = 0;
        State.worldNumber = 1;
        for(int i = 0; i < State.parkingLotStart.length;i++){
            State.parkingLotStart[i] = true;
        }
        for(int i = 0; i < State.parkingLot2.length;i++){
            State.parkingLot2[i] = true;
        }
        for(int i = 0; i < State.parkingLot3.length;i++){
            State.parkingLot3[i] = true;
        }
        for(int i = 0; i < State.parkingLot.length;i++){
            State.parkingLot[i] = true;
        }
        for(int i = 0; i < State.background.length;i++){
            State.background[i] = true;
        }
        for(int i = 0; i < State.janitor1.length;i++){
            State.janitor1[i] = true;
        }
        for(int i = 0; i < State.level2Security2.length;i++){
            State.level2Security2[i] = true;
        }
        for(int i = 0; i < State.level2Security.length;i++){
            State.level2Security[i] = true;
        }
        for(int i = 0; i < State.levelTwo.length;i++){
            State.levelTwo[i] = true;
        }
        for(int i = 0; i < State.level2OfficesLast.length;i++){
            State.level2OfficesLast[i] = true;
        }
        for(int i = 0; i < State.hallway1.length;i++){
            State.hallway1[i] = true;
        }
        for(int i = 0; i < State.hallway.length;i++){
            State.hallway[i] = true;
        }
        for(int i = 0; i < State.level2Offices2.length;i++){
            State.level2Offices2[i] = true;
        }
        for(int i = 0; i < State.level2Offices.length;i++){
            State.level2Offices[i] = true;
        }
        for(int i = 0; i < State.secretHallway2.length;i++){
            State.secretHallway2[i] = true;
        }
        for(int i = 0; i < State.alarmFloor.length;i++){
            State.alarmFloor[i] = true;
        }
        for(int i = 0; i < State.janitor2.length;i++){
            State.janitor2[i] = true;
        }
    }

    /**
     * Prepare the world for the State of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare2()
    {
        //System.out.println(State.parkingLotStart[0]);
        ParkingLine parkingLine = new ParkingLine();
        addObject(parkingLine, 516,315);
        Car car2 = new Car();
        addObject(car2, 686, 200);
        CarPurple carpurple = new CarPurple();
        addObject(carpurple, 132, 447);
        BuildingSide buildingside = new BuildingSide();
        addObject(buildingside, 967, 306);
        buildingside.setLocation(955, 299);
        if(State.parkingLotStart[0] == true){
            Handgun handgun2 = new Handgun(0);
            addObject(handgun2, 450, 450);
        }
        if(State.parkingLotStart[1] == true){
            Grenade grenade1 = new Grenade(1);
            addObject(grenade1, 400, 400);
        }
        if(State.parkingLotStart[2] == true){
            Grenade grenade2 = new Grenade(2);
            addObject(grenade2, 300, 400);
        }
        if(State.parkingLotStart[3] == true){
            Crate crate1 = new Crate(3);
            addObject(crate1, 840, 200);
        }
        if(State.parkingLotStart[4] == true){
            Crate crate2 = new Crate(4);
            addObject(crate2, 840, 275);
        }
        if(State.parkingLotStart[5] == true){
            SpecialCrate specialCrate1 = new SpecialCrate(5);
            addObject(specialCrate1, 840, 350);
        }
        HoriChangerD1 horiChangerD1 = new HoriChangerD1();
        addObject(horiChangerD1, 500, 598);
        ArrowsDown arrowsDown = new ArrowsDown();
        addObject(arrowsDown, 500, 560);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
        ParkingLotText parkingLotText = new ParkingLotText();
        addObject(parkingLotText, 500, 300);
    }

    private void prepare()
    {
        ParkingLine parkingLine = new ParkingLine();
        addObject(parkingLine, 516,315);
        Car car2 = new Car();
        addObject(car2, 686, 200);
        CarPurple carpurple = new CarPurple();
        addObject(carpurple, 132, 447);
        if(State.parkingLotStart[0] == true){
            Handgun handgun2 = new Handgun(0);
            addObject(handgun2, 450, 450);
        }
        if(State.parkingLotStart[1] == true){
            Grenade grenade1 = new Grenade(1);
            addObject(grenade1, 400, 400);
        }
        if(State.parkingLotStart[2] == true){
            Grenade grenade2 = new Grenade(2);
            addObject(grenade2, 300, 400);
        }   
        if(State.parkingLotStart[3] == true){
            Crate crate1 = new Crate(3);
            addObject(crate1, 840, 200);
        }
        if(State.parkingLotStart[4] == true){
            Crate crate2 = new Crate(4);
            addObject(crate2, 840, 275);
        }
        if(State.parkingLotStart[5] == true){
            SpecialCrate specialCrate1 = new SpecialCrate(5);
            addObject(specialCrate1, 840, 350);
        }
        HoriChangerD1 horiChangerD1 = new HoriChangerD1();
        addObject(horiChangerD1, 500, 598);
        ArrowsDown arrowsDown = new ArrowsDown();
        addObject(arrowsDown, 500, 560);
        Instruction1 instruction1 = new Instruction1();
        addObject(instruction1, 500, 50);
        BuildingSide buildingside = new BuildingSide();
        addObject(buildingside, 967, 306);
        buildingside.setLocation(955, 299);
        Character character = new Character();
        addObject(character, 168, 91);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
        ParkingLotText parkingLotText = new ParkingLotText();
        addObject(parkingLotText, 500, 300);
    }
}
