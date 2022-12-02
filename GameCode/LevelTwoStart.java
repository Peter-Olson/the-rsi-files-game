import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelTwoStart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelTwoStart extends World
{

    /**
     * Constructor for objects of class LevelTwoStart.
     * 
     */
    public LevelTwoStart(int x, int y)
    {    
        super(1000, 600, 1); 
        prepare2();
        Character character = new Character();
        addObject(character, x, y);
        State.worldNumber = 7;
    }
    
    public LevelTwoStart()
    {    
        super(1000, 600, 1); 
        prepare();
        State.worldNumber = 7;
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Door6 door6 = new Door6();
        addObject(door6, 960, 290);
        Npc5 npc5 = new Npc5();
        addObject(npc5, 288, 93);
        Door7 door7 = new Door7();
        addObject(door7, 64, 292);
        Desk desk = new Desk();
        addObject(desk, 283, 160);
        TrashCan trashCan = new TrashCan();
        addObject(trashCan, 411, 157);
        WaterCooler waterCooler = new WaterCooler();
        addObject(waterCooler, 784, 90);
        Character character = new Character();
        addObject(character, 880, 311);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
        WorldName worldname = new WorldName();
        worldname.setImage("NameReceptionist.png");
        addObject(worldname, 500, 300);
    }
    
    private void prepare2()
    {
        Door6 door6 = new Door6();
        addObject(door6, 960, 290);
        Npc5 npc5 = new Npc5();
        addObject(npc5, 288, 93);
        Door7 door7 = new Door7();
        addObject(door7, 64, 292);
        Desk desk = new Desk();
        addObject(desk, 283, 160);
        TrashCan trashCan = new TrashCan();
        addObject(trashCan, 411, 157);
        WaterCooler waterCooler = new WaterCooler();
        addObject(waterCooler, 784, 90);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
        WorldName worldname = new WorldName();
        worldname.setImage("NameReceptionist.png");
        addObject(worldname, 500, 300);
    }
}
