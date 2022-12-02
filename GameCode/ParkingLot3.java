import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ParkingLot3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ParkingLot3 extends World
{

    /**
     * Constructor for objects of class ParkingLot3.
     * 
     */
    public ParkingLot3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
        State.worldNumber = 3;
    }

    public ParkingLot3(int x, int y)
    {
        super(1000, 600, 1);
        prepare2();
        Character character = new Character();
        addObject(character, x, y);
        State.worldNumber = 3;
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        if(State.parkingLot3[1] == true){
            Crate crate1 = new Crate(1);
            addObject(crate1, 300, 540);
        }
        if(State.parkingLot3[2] == true){
            Crate crate2 = new Crate(2);
            addObject(crate2, 385, 540);
        }
        ParkingLine parkingLine = new ParkingLine();
        addObject(parkingLine, 515, 374);
        VertChangerL2 vertChangerL2 = new VertChangerL2();
        addObject(vertChangerL2, 3, 300);
        ArrowsLeft arrowsLeft = new ArrowsLeft();
        addObject(arrowsLeft, 40, 300);
        ArrowsRight arrowsRight = new ArrowsRight();
        addObject(arrowsRight, 940, 300);
        Instruction3 instruction3 = new Instruction3();
        addObject(instruction3, 517, 384);
        VertChangerR3 vertChangerR3 = new VertChangerR3();
        addObject(vertChangerR3, 997, 300);
        CarGrey cargrey = new CarGrey();
        addObject(cargrey, 314, 259);
        CarBlue carblue = new CarBlue();
        addObject(carblue, 686, 509);
        BuildingFront buildingfront3 = new BuildingFront();
        addObject(buildingfront3, 242, 47);
        BuildingFront buildingfront4 = new BuildingFront();
        addObject(buildingfront4, 859, 47);
        if(State.parkingLot3[0] == true){
            Enemy enemy = new Enemy(0);
            addObject(enemy, 866, 232);
        }
        Character character2 = new Character();
        addObject(character2, 47, 289);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
        ParkingLotText parkingLotText = new ParkingLotText();
        addObject(parkingLotText, 500, 300);
        //WorldName worldname = new WorldName(WorldName.worldNames[2]);
        //addObject(worldname, 500, 17);
    }

    private void prepare2()
    {
        if(State.parkingLot3[1] == true){
            Crate crate1 = new Crate(1);
            addObject(crate1, 300, 540);
        }
        if(State.parkingLot3[2] == true){
            Crate crate2 = new Crate(2);
            addObject(crate2, 385, 540);
        }
        ParkingLine parkingLine = new ParkingLine();
        addObject(parkingLine, 515, 374);
        VertChangerL2 vertChangerL2 = new VertChangerL2();
        addObject(vertChangerL2, 3, 300);
        ArrowsLeft arrowsLeft = new ArrowsLeft();
        addObject(arrowsLeft, 40, 300);
        ArrowsRight arrowsRight = new ArrowsRight();
        addObject(arrowsRight, 940, 300);
        VertChangerR3 vertChangerR3 = new VertChangerR3();
        addObject(vertChangerR3, 997, 300);
        CarGrey cargrey = new CarGrey();
        addObject(cargrey, 314, 259);
        CarBlue carblue = new CarBlue();
        addObject(carblue, 686, 509);
        BuildingFront buildingfront3 = new BuildingFront();
        addObject(buildingfront3, 242, 47);
        BuildingFront buildingfront4 = new BuildingFront();
        addObject(buildingfront4, 859, 47);
        if(State.parkingLot3[0] == true){
            Enemy enemy = new Enemy(0);
            addObject(enemy, 866, 232);
        }
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
        ParkingLotText parkingLotText = new ParkingLotText();
        addObject(parkingLotText, 500, 300);
        //WorldName worldname = new WorldName(WorldName.worldNames[2]);
        //addObject(worldname, 500, 17);
    }
}
