import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SecretHallway2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SecretHallway2 extends World
{

    /**
     * Constructor for objects of class SecretHallway2.
     * 
     */
    public SecretHallway2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        State.worldNumber = 22;
    }
    
    public SecretHallway2(int x, int y)
    {
        super(1000, 600, 1);
        State.worldNumber = 22;
        BlackSide blackside = new BlackSide();
        addObject(blackside, 200, 300);
        BlackSide blackside1 = new BlackSide();
        blackside1.setImage("blackside1.png");
        addObject(blackside1, 700, 500);
        BlackSide blackside2 = new BlackSide();
        blackside2.setImage("blackside2.png");
        addObject(blackside2, 775, 125);
        HoriChangerU5 horichangerU5 = new HoriChangerU5();
        addObject(horichangerU5, 500, 0);
        VertChangerR5 vertchangerR5 = new VertChangerR5();
        addObject(vertchangerR5, 1000, 300);
        HiddenWall hiddenwall = new HiddenWall();
        addObject(hiddenwall, 990, 337);
        if(State.secretHallway2[0] == true){
            HealthPackBg healthpackbg = new HealthPackBg(0);
            addObject(healthpackbg, 927, 339);
        }
        Character character = new Character();
        addObject(character, 500, 100);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
        //WorldName worldname = new WorldName(WorldName.worldNames[10]);
        //addObject(worldname, 500, 17);
    }
}
