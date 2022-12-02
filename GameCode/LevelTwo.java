import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelTwo extends World
{

    /**
     * Constructor for objects of class LevelTwo.
     * 
     */
    public LevelTwo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
        State.worldNumber = 11;
    }
    
    public LevelTwo(int x, int y)
    {
        super(1000, 600, 1);
        prepare2();
        Character character = new Character();
        addObject(character, x, y);
        State.worldNumber = 11;
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare2()
    {
        Door8 door8 = new Door8();
        addObject(door8, 957, 322);
        Desk desk = new Desk();
        addObject(desk, 251, 123);
        Desk desk2 = new Desk();
        addObject(desk2, 235, 300);
        Desk desk3 = new Desk();
        addObject(desk3, 240, 295);
        Desk desk4 = new Desk();
        addObject(desk4, 661, 295);
        Desk desk5 = new Desk();
        addObject(desk5, 227, 476);
        Desk desk6 = new Desk();
        addObject(desk6, 638, 476);
        desk.act();
        WaterCooler watercooler2 = new WaterCooler();
        addObject(watercooler2, 89, 61);
        Printer printer = new Printer();
        addObject(printer, 862, 77);
        Tree tree = new Tree();
        addObject(tree, 48, 457);
        Door19 door19 = new Door19();
        addObject(door19, 460, 74);
        if(State.levelTwo[0] == true){
            Enemy enemy = new Enemy(0);
            addObject(enemy, 463, 227);
        }
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
        WorldName worldname = new WorldName();
        worldname.setImage("NameOffice.png");
        addObject(worldname, 500, 300);
    }
    
    private void prepare()
    {
        Door8 door8 = new Door8();
        addObject(door8, 957, 322);
        Desk desk = new Desk();
        addObject(desk, 248, 210);
        Desk desk2 = new Desk();
        addObject(desk2, 654, 212);
        Desk desk5 = new Desk();
        addObject(desk5, 227, 476);
        Desk desk6 = new Desk();
        addObject(desk6, 638, 476);
        desk.act();
        WaterCooler watercooler = new WaterCooler();
        addObject(watercooler, 89, 61);
        WaterCooler watercooler2 = new WaterCooler();
        addObject(watercooler2, 94, 63);
        Printer printer = new Printer();
        addObject(printer, 862, 77);
        Tree tree = new Tree();
        addObject(tree, 48, 457);
        Door19 door19 = new Door19();
        addObject(door19, 460, 74);
        if(State.levelTwo[0] == true){
            Enemy enemy = new Enemy(0);
            addObject(enemy, 463, 227);
        }
        Character character = new Character();
        addObject(character, 877, 322);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
        WorldName worldname = new WorldName();
        worldname.setImage("NameOffice.png");
        addObject(worldname, 500, 300);
    }
}
