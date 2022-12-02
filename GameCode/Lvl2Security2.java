import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl2Security2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl2Security2 extends World
{

    /**
     * Constructor for objects of class Lvl2Security2.
     * 
     */
    public Lvl2Security2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        Lazers.areLazersOn = false;
        prepare();
        State.worldNumber = 9;
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        if(State.level2Security2[2] == true){
            HealthPackBg healthpackbg = new HealthPackBg(2);
            addObject(healthpackbg, 771, 509);
        }
        if(State.level2Security2[3] == true){
            HealthPackBg healthpackbg1 = new HealthPackBg(3);
            addObject(healthpackbg1, 775, 510);
        }
        if(State.level2Security2[4] == true){
            HealthPackBg healthpackbg2 = new HealthPackBg(4);
            addObject(healthpackbg2, 149, 28);
        }
        if(State.level2Security2[5] == true){
            HealthPackBg healthpackbg4 = new HealthPackBg(5);
            addObject(healthpackbg4, 769, 458);
        }
        if(State.level2Security2[6] == true){
            PistolAmmo pistolammo = new PistolAmmo(6);
            addObject(pistolammo, 692, 554);
        }
        if(State.level2Security2[7] == true){
            PistolAmmo pistolammo1 = new PistolAmmo(7);
            addObject(pistolammo1, 697, 504);
        }
        if(State.level2Security2[8] == true){
            PistolAmmo pistolammo3 = new PistolAmmo(8);
            addObject(pistolammo3, 700, 458);
        }
        if(State.level2Security2[9] == true){
            SafeCodes safecodes = new SafeCodes(9);
            addObject(safecodes, 749, 408);
        }
        if(State.level2Security2[10] == true){
            Crate crate = new Crate(10);
            addObject(crate, 925, 516);
        }
        if(State.level2Security2[11] == true){
            Crate crate2 = new Crate(11);
            addObject(crate2, 923, 472);
        }
        if(State.level2Security2[12] == true){
            Crate crate3 = new Crate(12);
            addObject(crate3, 877, 539);
        }
        if(State.level2Security2[13] == true){
            Crate crate4 = new Crate(13);
            addObject(crate4, 876, 494);
        }
        if(State.level2Security2[14] == true){
            Crate crate5 = new Crate(14);
            addObject(crate5, 353, 386);
        }
        if(State.level2Security2[15] == true){
            Crate crate6 = new Crate(15);
            addObject(crate6, 435, 388);
        }
        if(State.level2Security2[16] == true){
            Crate crate7 = new Crate(16);
            addObject(crate7, 519, 389);
        }
        if(State.level2Security2[17] == true){
            Crate crate8 = new Crate(17);
            addObject(crate8, 354, 344);
        }
        Door28 door28 = new Door28();
        addObject(door28, 571, 524);
        ControlPanel controlpanel = new ControlPanel();
        addObject(controlpanel, 489, 71);
        TrashCanBg trashcanbg = new TrashCanBg();
        addObject(trashcanbg, 687, 62);
        ChairBg chairbg = new ChairBg();
        addObject(chairbg, 428, 125);
        ChairBg chairbg2 = new ChairBg();
        addObject(chairbg2, 554, 126);
        WaterCooler watercooler = new WaterCooler();
        addObject(watercooler, 36, 59);
        WaterCooler watercooler2 = new WaterCooler();
        addObject(watercooler2, 82, 60);
        Printer printer = new Printer();
        addObject(printer, 835, 167);
        if(State.level2Security2[0] == true){
            Enemy enemy = new Enemy(0);
            addObject(enemy, 352, 90);
        }
        if(State.level2Security2[1] == true){
            Enemy enemy2 = new Enemy(1);
            addObject(enemy2, 628, 107);
        }
        Character character = new Character();
        addObject(character, 487, 540);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventoryBar = new InventoryBar();
        addObject(inventoryBar, 451, 551);
        //WorldName worldname = new WorldName(WorldName.worldNames[17]);
        //addObject(worldname, 500, 17);
    }
}
