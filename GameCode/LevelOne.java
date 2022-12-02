import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelOne extends World
{

    /**
     * Constructor for objects of class LevelOne.
     * 
     */
    public LevelOne()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
        State.worldNumber = 6;
    }

    public LevelOne(int x, int y)
    {
        super(1000, 600, 1);
        prepare2();
        Character character = new Character();
        addObject(character, x, y);
        State.worldNumber = 6;
    }

    public void prepare()
    {
        Door2 door2 = new Door2();
        addObject(door2, 0, 309);
        Door9 door9 = new Door9();
        addObject(door9, 958, 312);
        GlassDoorBg glassDoorBg1 = new GlassDoorBg();
        addObject(glassDoorBg1, 30, 309);
        Npc2 npc2 = new Npc2();
        addObject(npc2, 800, 300);
        Character character = new Character();
        addObject(character, 80, 309);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
    }
    
    public void prepare2()
    {
        Door2 door2 = new Door2();
        addObject(door2, 0, 309);
        Door9 door9 = new Door9();
        addObject(door9, 958, 312);
        GlassDoorBg glassDoorBg1 = new GlassDoorBg();
        addObject(glassDoorBg1, 30, 309);
        Npc2 npc2 = new Npc2();
        addObject(npc2, 800, 300);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
    }
     
}
