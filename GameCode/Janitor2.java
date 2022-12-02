import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl2Security here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Janitor2 extends World{
    public GreenfootSound lazerHum = new GreenfootSound("lazer_hum.mp3");
    /**
     * Constructor for objects of class Lvl2Security.
     * 
     */
    public Janitor2(int x, int y)
    {    
        super(1000, 600, 1); 
        prepare2();
        Character character = new Character();
        addObject(character, x, y);
        State.worldNumber = 23;
    }
    
    public Janitor2()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        prepare();
        State.worldNumber = 23;
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    public void prepare2()
    {
        if(State.janitor2[0] == true){
            Crate crate = new Crate(0);
            addObject(crate, 853, 48);
        }
         if(State.janitor2[1] == true){
            Crate crate1 = new Crate(1);
            addObject(crate1, 761, 48);
        }
         if(State.janitor2[2] == true){
            Crate crate2 = new Crate(2);
            addObject(crate2, 670, 48);
        }
         if(State.janitor2[3] == true){
            HealthPackBg healthpackbg = new HealthPackBg(3);
            addObject(healthpackbg, 98, 74);
        }
          if(State.janitor2[4] == true){
            Grenade grenade = new Grenade(4);
            addObject(grenade, 559, 207);
        }
           if(State.janitor2[5] == true){
            Grenade grenade = new Grenade(5);
            addObject(grenade, 559, 432);
        }
        Door35 door35 = new Door35();
        addObject(door35, 959, 353);
        TrashCan trashcan = new TrashCan();
        addObject(trashcan, 975, 34);
        Tree tree = new Tree();
        addObject(tree, 25, 55);
        Printer printer = new Printer();
        addObject(printer, 731, 332);
        WaterCooler watercooler = new WaterCooler();
        addObject(watercooler, 515, 197);
        WaterCooler watercooler2 = new WaterCooler();
        addObject(watercooler2, 515, 425);
        if(State.janitor2[6] == true){
            Janitor janitor = new Janitor(6);
            addObject(janitor, 250, 300);
        }
        Character character = new Character();
        addObject(character, 857, 315);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
        //WorldName worldname = new WorldName(WorldName.worldNames[19]);
        //addObject(worldname, 500, 36);
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        if(State.janitor2[0] == true){
            Crate crate = new Crate(0);
            addObject(crate, 853, 48);
        }
        if(State.janitor2[1] == true){
            Crate crate1 = new Crate(1);
            addObject(crate1, 761, 48);
        }
        if(State.janitor2[2] == true){
            Crate crate2 = new Crate(2);
            addObject(crate2, 670, 48);
        }
        if(State.janitor2[3] == true){
            HealthPackBg healthpackbg = new HealthPackBg(3);
            addObject(healthpackbg, 98, 74);
        }
        if(State.janitor2[4] == true){
            Grenade grenade = new Grenade(4);
            addObject(grenade, 559, 207);
        }
        if(State.janitor2[5] == true){
            Grenade grenade = new Grenade(5);
            addObject(grenade, 559, 432);
        }
        Door35 door35 = new Door35();
        addObject(door35, 959, 353);
        TrashCan trashcan = new TrashCan();
        addObject(trashcan, 975, 34);
        Tree tree = new Tree();
        addObject(tree, 25, 55);
        Printer printer = new Printer();
        addObject(printer, 731, 332);
        WaterCooler watercooler = new WaterCooler();
        addObject(watercooler, 515, 197);
        WaterCooler watercooler2 = new WaterCooler();
        addObject(watercooler2, 515, 425);
        if(State.janitor2[6] == true){
            Janitor janitor = new Janitor(6);
            addObject(janitor, 250, 300);
        }
        Character character = new Character();
        addObject(character, 857, 315);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
        //WorldName worldname = new WorldName(WorldName.worldNames[19]);
        //addObject(worldname, 500, 36);
        
    }
}
