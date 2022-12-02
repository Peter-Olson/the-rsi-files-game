import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ParkingLot2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ParkingLot2 extends World
{

    /**
     * Constructor for objects of class ParkingLot2.
     * 
     */
    public ParkingLot2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        prepare();
        State.worldNumber = 2;
    }

    public ParkingLot2(int x, int y)
    {
        super(1000, 600, 1);
        prepare2();
        Character character = new Character();
        addObject(character, x, y);
        State.worldNumber = 2;
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare2()
    {
        if(State.parkingLot2[0] == true){
            Crate crate1 = new Crate(0);
            addObject(crate1, 900, 400);
        }
        if(State.parkingLot2[1] == true){
            Crate crate2 = new Crate(1);
            addObject(crate2, 900, 465);
        }
        ParkingLine parkingLine = new ParkingLine();
        addObject(parkingLine, 504, 352);
        CarYellow caryellow = new CarYellow();
        addObject(caryellow, 119,235);
        CarGreen cargreen = new CarGreen();
        addObject(cargreen,489, 486);
        HoriChangerU2 horiChangerU2 = new HoriChangerU2();
        addObject(horiChangerU2, 500, 3);
        ArrowsUp arrowsUp = new ArrowsUp();
        addObject(arrowsUp, 500, 40);
        VertChangerR1 vertChangerR1 = new VertChangerR1();
        addObject(vertChangerR1, 997, 300);
        ArrowsRight arrowsRight = new ArrowsRight();
        addObject(arrowsRight, 960, 300);
        BuildingCorner buildingcorner = new BuildingCorner();
        addObject(buildingcorner, 949, 44);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
        ParkingLotText parkingLotText = new ParkingLotText();
        addObject(parkingLotText, 500, 300);
        //WorldName worldname = new WorldName(WorldName.worldNames[1]);
        //addObject(worldname, 500, 17);
    }
    

    private void prepare()
    {
        if(State.parkingLot2[0] == true){
            Crate crate1 = new Crate(0);
            addObject(crate1, 900, 400);
        }
        if(State.parkingLot2[1] == true){
            Crate crate2 = new Crate(1);
            addObject(crate2, 900, 465);
        }
        ParkingLine parkingLine = new ParkingLine();
        addObject(parkingLine, 504, 352);
        CarYellow caryellow = new CarYellow();
        addObject(caryellow, 119, 235);
        CarGreen cargreen = new CarGreen();
        addObject(cargreen,489, 486);
        HoriChangerU2 horiChangerU2 = new HoriChangerU2();
        addObject(horiChangerU2, 500, 3);
        ArrowsUp arrowsUp = new ArrowsUp();
        addObject(arrowsUp, 500, 40);
        VertChangerR1 vertChangerR1 = new VertChangerR1();
        addObject(vertChangerR1, 997, 300);
        ArrowsRight arrowsRight = new ArrowsRight();
        addObject(arrowsRight, 960, 300);
        BuildingCorner buildingcorner = new BuildingCorner();
        addObject(buildingcorner, 949, 44);
        Instruction2 instruction2 = new Instruction2();
        addObject(instruction2, 500, 150);
        Instruction5 instruction5 = new Instruction5();
        addObject(instruction5, 750, 350);
        Character character = new Character();
        addObject(character, 500, 70);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
        ParkingLotText parkingLotText = new ParkingLotText();
        addObject(parkingLotText, 500, 300);
        //WorldName worldname = new WorldName(WorldName.worldNames[1]);
        //addObject(worldname, 500, 17);
    }
}
