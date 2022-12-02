import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl2Security here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl2Security extends World
{
    public GreenfootSound lazerHum = new GreenfootSound("lazer_hum.mp3");
    /**
     * Constructor for objects of class Lvl2Security.
     * 
     */
    public Lvl2Security()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        lazerHum.playLoop();
        prepare();
        State.worldNumber = 10;
    }
    
    public Lvl2Security(int x, int y)
    {
        super(1000, 600, 1);
        prepare2();
        Character character = new Character();
        addObject(character, x, y);
        State.worldNumber = 10;
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Door26 door26 = new Door26();
        addObject(door26, 992, 546);
        Door27 door27 = new Door27();
        addObject(door27, 29, 37);
        MovingVertLazer movingvertlazer2 = new MovingVertLazer(2);
        addObject(movingvertlazer2, 122, 234);
        MovingVertLazer movingvertlazer3 = new MovingVertLazer(2);
        addObject(movingvertlazer3, 379, 359);
        if(State.level2Security[0] == true){
            Enemy enemy = new Enemy(0);
            addObject(enemy, 43, 381);
        }
        if(State.level2Security[1] == true){
            Enemy enemy2 = new Enemy(1);
            addObject(enemy2, 41, 529);
        }
        Character character = new Character();
        addObject(character, 915, 541);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 889, 568);
        InventoryBar inventoryBar = new InventoryBar();
        addObject(inventoryBar, 451, 551);
        //WorldName worldname = new WorldName(WorldName.worldNames[16]);
        //addObject(worldname, 500, 17);
    }
    
    private void prepare2()
    {
        Door26 door26 = new Door26();
        addObject(door26, 992, 546);
        Door27 door27 = new Door27();
        addObject(door27, 29, 37);
        if(State.level2Security[0] == true){
            Enemy enemy = new Enemy(0);
            addObject(enemy, 43, 381);
        }
        if(State.level2Security[1] == true){
            Enemy enemy2 = new Enemy(1);
            addObject(enemy2, 41, 529);
        }
        InventoryBar inventoryBar = new InventoryBar();
        addObject(inventoryBar, 451, 551);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 889, 568);
        //WorldName worldname = new WorldName(WorldName.worldNames[16]);
        //addObject(worldname, 500, 17);
    }
}
