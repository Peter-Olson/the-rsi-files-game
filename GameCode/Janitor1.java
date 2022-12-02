import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl2Security here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Janitor1 extends World{
    public GreenfootSound lazerHum = new GreenfootSound("lazer_hum.mp3");
    /**
     * Constructor for objects of class Lvl2Security.
     * 
     */
    public Janitor1(int x, int y)
    {    
        super(1000, 600, 1); 
        lazerHum.playLoop();
        prepare2();
        Character character = new Character();
        addObject(character, x, y);
        State.worldNumber = 8;
    }
    
    public Janitor1()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        lazerHum.playLoop();
        prepare();
        State.worldNumber = 8;
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    public void prepare2()
    {
        if(State.janitor1[2] == true){
            PistolAmmo pistolammo = new PistolAmmo(2);
            addObject(pistolammo, 698, 584);
        }
        if(State.janitor1[3] == true){
            PistolAmmo pistolammo2 = new PistolAmmo(3);
            addObject(pistolammo2, 325, 64);
        }
        if(State.janitor1[4] == true){
            HealthPackBg healthpackBg = new HealthPackBg(4);
            addObject(healthpackBg, 69, 65);
        }
        if(State.janitor1[5] == true){
            Grenade grenade = new Grenade(5);
            addObject(grenade, 698, 64);
        }
        if(State.janitor1[6] == true){
            Grenade grenade2 = new Grenade(6);
            addObject(grenade2, 325, 584);
        }
        if(State.janitor1[32] == true){
            PistolAmmo pistolammo = new PistolAmmo(32);
            addObject(pistolammo, 700, 100);
        }
        if(State.janitor1[33] == true){
            PistolAmmo pistolammo2 = new PistolAmmo(33);
            addObject(pistolammo2, 800, 100);
        }
        if(State.janitor1[34] == true){
            PistolAmmo pistolammo3 = new PistolAmmo(34);
            addObject(pistolammo3, 700, 550);
        }
        if(State.janitor1[35] == true){
            PistolAmmo pistolammo4 = new PistolAmmo(35);
            addObject(pistolammo4, 800, 550);
        }
        CbcLrgSml cbclrgsml = new CbcLrgSml();
        addObject(cbclrgsml, 898, 176);
        CbcLrgSml cbclrgsml2 = new CbcLrgSml();
        addObject(cbclrgsml2, 681, 176);
        CbcLrgSml cbclrgsml3 = new CbcLrgSml();
        addObject(cbclrgsml3, 289, 176);
        CbcLrgSml cbclrgsml4 = new CbcLrgSml();
        addObject(cbclrgsml4, 77, 176);
        CbcLrgSml cbclrgsml5 = new CbcLrgSml();
        addObject(cbclrgsml5, 897, 475);
        CbcLrgSml cbclrgsml6 = new CbcLrgSml();
        addObject(cbclrgsml6, 690, 475);
        CbcLrgSml cbclrgsml7 = new CbcLrgSml();
        addObject(cbclrgsml7, 290, 475);
        CbcLrgSml cbclrgsml8 = new CbcLrgSml();
        addObject(cbclrgsml8, 79, 475);
        MovingVertLazer movingvertlazer = new MovingVertLazer(2);
        addObject(movingvertlazer, 148, 591);
        MovingVertLazer movingvertlazer2 = new MovingVertLazer(2);
        addObject(movingvertlazer2, 728, 7);
        Tree tree = new Tree();
        addObject(tree, 949, 61);
        TrashCan trashcan = new TrashCan();
        addObject(trashcan, 949, 563);
        WaterCooler watercooler = new WaterCooler();
        addObject(watercooler, 69, 563);
        Door30 door30 = new Door30();
        addObject(door30, 959, 353); 
        Door34 door34 = new Door34();
        addObject(door34, 41, 353);
        if(State.janitor1[0] == true){
            Enemy enemy = new Enemy(0);
            addObject(enemy, 101, 315);
        }
        if(State.janitor1[1] == true){
            Enemy enemy2 = new Enemy(1);
            addObject(enemy2, 185, 315);
        }
        if(State.janitor1[7] == true){
            Janitor janitor = new Janitor(7);
            addObject(janitor, 500, 300);
        }
        //Character character = new Character();
        //addObject(character, 857, 315);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
        //WorldName worldname = new WorldName(WorldName.worldNames[18]);
        //addObject(worldname, 500, 36);
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        if(State.janitor1[2] == true){
            PistolAmmo pistolammo = new PistolAmmo(2);
            addObject(pistolammo, 698, 584);
        }
        if(State.janitor1[3] == true){
            PistolAmmo pistolammo2 = new PistolAmmo(3);
            addObject(pistolammo2, 325, 64);
        }
        if(State.janitor1[4] == true){
            HealthPackBg healthpackBg = new HealthPackBg(4);
            addObject(healthpackBg, 69, 65);
        }
        if(State.janitor1[5] == true){
            Grenade grenade = new Grenade(5);
            addObject(grenade, 698, 64);
        }
        if(State.janitor1[6] == true){
            Grenade grenade2 = new Grenade(6);
            addObject(grenade2, 325, 584);
        }
        if(State.janitor1[32] == true){
            PistolAmmo pistolammo = new PistolAmmo(32);
            addObject(pistolammo, 700, 100);
        }
        if(State.janitor1[33] == true){
            PistolAmmo pistolammo2 = new PistolAmmo(33);
            addObject(pistolammo2, 800, 100);
        }
        if(State.janitor1[34] == true){
            PistolAmmo pistolammo3 = new PistolAmmo(34);
            addObject(pistolammo3, 700, 550);
        }
        if(State.janitor1[35] == true){
            PistolAmmo pistolammo4 = new PistolAmmo(35);
            addObject(pistolammo4, 800, 550);
        }
        CbcLrgSml cbclrgsml = new CbcLrgSml();
        addObject(cbclrgsml, 898, 176);
        CbcLrgSml cbclrgsml2 = new CbcLrgSml();
        addObject(cbclrgsml2, 681, 176);
        CbcLrgSml cbclrgsml3 = new CbcLrgSml();
        addObject(cbclrgsml3, 289, 176);
        CbcLrgSml cbclrgsml4 = new CbcLrgSml();
        addObject(cbclrgsml4, 77, 176);
        CbcLrgSml cbclrgsml5 = new CbcLrgSml();
        addObject(cbclrgsml5, 897, 475);
        CbcLrgSml cbclrgsml6 = new CbcLrgSml();
        addObject(cbclrgsml6, 690, 475);
        CbcLrgSml cbclrgsml7 = new CbcLrgSml();
        addObject(cbclrgsml7, 290, 475);
        CbcLrgSml cbclrgsml8 = new CbcLrgSml();
        addObject(cbclrgsml8, 79, 475);
        MovingVertLazer movingvertlazer = new MovingVertLazer(2);
        addObject(movingvertlazer, 148, 591);
        MovingVertLazer movingvertlazer2 = new MovingVertLazer(2);
        addObject(movingvertlazer2, 728, 7);
        Tree tree = new Tree();
        addObject(tree, 949, 61);
        TrashCan trashcan = new TrashCan();
        addObject(trashcan, 949, 563);
        WaterCooler watercooler = new WaterCooler();
        addObject(watercooler, 69, 563);
        Door30 door30 = new Door30();
        addObject(door30, 959, 353);
        Door34 door34 = new Door34();
        addObject(door34, 41, 353);
        if(State.janitor1[0] == true){
            Enemy enemy = new Enemy(0);
            addObject(enemy, 101, 315);
        }
        if(State.janitor1[1] == true){
            Enemy enemy2 = new Enemy(1);
            addObject(enemy2, 185, 315);
        }
        if(State.janitor1[7] == true){
            Janitor janitor = new Janitor(7);
            addObject(janitor, 500, 300);
        }
        Character character = new Character();
        addObject(character, 857, 315);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
        //WorldName worldname = new WorldName(WorldName.worldNames[18]);
        //addObject(worldname, 500, 36);
    }
}
