import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl2Offices here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl2Offices extends World
{

    /**
     * Constructor for objects of class Lvl2Offices.
     * 
     */
    public Lvl2Offices(int x, int y)
    {
        super(1000, 600, 1);
        prepare2();
        Character character = new Character();
        addObject(character, x, y);
        State.worldNumber = 19;
    }
    
    public Lvl2Offices()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
        State.worldNumber = 19;
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare2()
    {
        Door20 door20 = new Door20();
        addObject(door20, 458, 528);
        Printer printer = new Printer();
        addObject(printer, 111, 128);
        Printer printer2 = new Printer();
        addObject(printer2, 114, 302);
        Printer printer3 = new Printer();
        addObject(printer3, 118, 494);
        Desk desk = new Desk();
        addObject(desk, 823, 131);
        Desk desk2 = new Desk();
        addObject(desk2, 819, 337);
        Desk desk3 = new Desk();
        addObject(desk3, 818, 544);
        if(State.level2Offices[0] == true){
            PistolAmmo pistolammo = new PistolAmmo(0);
            addObject(pistolammo, 818, 194);
        }
        if(State.level2Offices[1] == true){
            HealthPackBg healthpackbg2 = new HealthPackBg(1);
            addObject(healthpackbg2, 821, 460);
        }
        Npc7 npc7 = new Npc7();
        addObject(npc7, 223, 297);
        Door21 door21 = new Door21();
        addObject(door21, 462, 38);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 832, 560);
        InventoryBar inventoryBar = new InventoryBar();
        addObject(inventoryBar, 451, 551);
        //WorldName worldname = new WorldName(WorldName.worldNames[13]);
        //addObject(worldname, 500, 17);
    }
    
    private void prepare()
    {
        Door20 door20 = new Door20();
        addObject(door20, 458, 528);
        Printer printer = new Printer();
        addObject(printer, 111, 128);
        Printer printer2 = new Printer();
        addObject(printer2, 114, 302);
        Printer printer3 = new Printer();
        addObject(printer3, 118, 494);
        Desk desk = new Desk();
        addObject(desk, 823, 131);
        Desk desk2 = new Desk();
        addObject(desk2, 819, 337);
        Desk desk3 = new Desk();
        addObject(desk3, 818, 544);
        if(State.level2Offices[0] == true){
            PistolAmmo pistolammo = new PistolAmmo(0);
            addObject(pistolammo, 818, 194);
        }
        if(State.level2Offices[1] == true){
            HealthPackBg healthpackbg2 = new HealthPackBg(1);
            addObject(healthpackbg2, 821, 460);
        }
        Npc7 npc7 = new Npc7();
        addObject(npc7, 223, 297);
        Door21 door21 = new Door21();
        addObject(door21, 462, 38);
        Character character = new Character();
        addObject(character, 374, 536);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 832, 560);
        InventoryBar inventoryBar = new InventoryBar();
        addObject(inventoryBar, 451, 551);
        //WorldName worldname = new WorldName(WorldName.worldNames[13]);
        //addObject(worldname, 500, 17);
    }
}
