import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ParkingLot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ParkingLot extends World
{

    /**
     * Constructor for objects of class ParkingLot.
     * 
     */
    public ParkingLot(int x, int y)
    {
        super (1000, 600, 1);
        prepare2();
        Character character = new Character();
        addObject(character, x, y);
        State.worldNumber = 4;
    }

    public ParkingLot()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
        State.worldNumber = 4;
    }

    public void prepare()
    {
        if(State.parkingLot[0] == true){
            Crate crate1 = new Crate(0);
            addObject(crate1, 600, 540);
        }
        if(State.parkingLot[1] == true){
            Crate crate2 = new Crate(1);
            addObject(crate2, 685, 540);
        }
        if(State.parkingLot[2] == true){
            Crate crate3 = new Crate(2);
            addObject(crate3, 925, 450);
        }
        Door4 door4 = new Door4();
        addObject(door4, 517, 40);
        Car car = new Car();
        addObject(car, 280, 262);
        Npc4 npc4 = new Npc4();
        addObject(npc4, 903, 350);
        VertChangerL4 vertChangerL4 = new VertChangerL4();
        addObject(vertChangerL4, 3, 300);
        ArrowsLeft arrowsLeft = new ArrowsLeft();
        addObject(arrowsLeft, 40, 300);
        Instruction4 instruction4 = new Instruction4();
        addObject(instruction4, 506, 444);
        BuildingFront buildingfront = new BuildingFront();
        addObject(buildingfront, 166, 47);
        BuildingFront buildingfront2 = new BuildingFront();
        addObject(buildingfront2, 868, 47);
        AlarmBG alarm = new AlarmBG();
        addObject(alarm, 430, 40);
        Character character = new Character();
        addObject(character, 45, 186);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
        ParkingLotText parkingLotText = new ParkingLotText();
        addObject(parkingLotText, 500, 300);
        //WorldName worldname = new WorldName(WorldName.worldNames[3]);
        //addObject(worldname, 500, 17);
    }
    
    public void prepare2()
    {
        if(State.parkingLot[0] == true){
            Crate crate1 = new Crate(0);
            addObject(crate1, 600, 540);
        }
        if(State.parkingLot[1] == true){
            Crate crate2 = new Crate(1);
            addObject(crate2, 685, 540);
        }
        if(State.parkingLot[2] == true){
            Crate crate3 = new Crate(2);
            addObject(crate3, 925, 450);
        }
        Door4 door4 = new Door4();
        addObject(door4, 517, 40);
        Car car = new Car();
        addObject(car, 280, 262);
        Npc4 npc4 = new Npc4();
        addObject(npc4, 903, 350);
        AlarmBG alarm = new AlarmBG();
        addObject(alarm, 430, 40);
        VertChangerL4 vertChangerL4 = new VertChangerL4();
        addObject(vertChangerL4, 3, 300);
        ArrowsLeft arrowsLeft = new ArrowsLeft();
        addObject(arrowsLeft, 40, 300);
        BuildingFront buildingfront = new BuildingFront();
        addObject(buildingfront, 166, 47);
        BuildingFront buildingfront2 = new BuildingFront();
        addObject(buildingfront2, 868, 47);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
        ParkingLotText parkingLotText = new ParkingLotText();
        addObject(parkingLotText, 500, 300);
        //WorldName worldname = new WorldName(WorldName.worldNames[3]);
        //addObject(worldname, 500, 17);
    }
    
    public void act()
    {
        
    }
}
