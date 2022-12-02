import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SecretHallway here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SecretHallway extends World
{

    /**
     * Constructor for objects of class SecretHallway.
     * 
     */
    public SecretHallway()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        State.worldNumber = 21;
    }
    public SecretHallway(int x, int y)
    {
        super(1000, 600, 1);
        State.worldNumber = 21;
        prepare2();
        Character character = new Character();
        addObject(character, x, y);
    }
    public void prepare2()
    {
        BlackSide blackside = new BlackSide();
        addObject(blackside, 200, 300);
        BlackSide blackside2 = new BlackSide();
        addObject(blackside2, 800, 300);
        HoriChangerD3 horichangerD3 = new HoriChangerD3();
        addObject(horichangerD3, 500, 600);
        HoriChangerU4 horichangerU4 = new HoriChangerU4();
        addObject(horichangerU4, 500, 0);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
        //WorldName worldname = new WorldName(WorldName.worldNames[9]);
        //addObject(worldname, 500, 17);
    }
}
