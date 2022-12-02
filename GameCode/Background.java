import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{
    /**
     * Constructor for objects of class Background.
     * 
     */
    public Background(int x, int y)
    {
        super (1000, 600, 1);
        prepare2();
        Character character = new Character();
        addObject(character, x, y);
        State.worldNumber = 5;
    }

    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        prepare();
        State.worldNumber = 5;
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    public void prepare2()
    {
        Door1 door1 = new Door1();             // double slashes (//) dictate permanently removed items.. /* dictates temporarily removed items for testing purposes */
        addObject(door1, 999, 309);
        Door36 door36 = new Door36();
        addObject(door36, 959, 309);
        WaterCooler waterCooler1 = new WaterCooler();
        addObject(waterCooler1, 950, 50);
        TrashCan trashCan1 = new TrashCan();
        addObject(trashCan1, 957, 561);
        TrashCanBg trashCanBg1 = new TrashCanBg();
        addObject(trashCanBg1, 616, 217);
        ChairBg chairBg1 = new ChairBg();
        addObject(chairBg1, 454, 161);
        NPC npc1 = new NPC();
        addObject(npc1, 504, 147);
        Desk desk = new Desk();
        addObject(desk, 493, 208);
        Tree tree = new Tree();
        addObject(tree, 370, 197);
        if(State.background[1] == true){
            HealthPackBg healthPackBg1 = new HealthPackBg(1);
            addObject(healthPackBg1, 50, 75);
        }
        if(State.background[2] == true){
            PistolAmmo pAmmo = new PistolAmmo(2);
            addObject(pAmmo, 400, 400);
        }
        Door5 door5 = new Door5();
        addObject(door5, 59, 321);
        if(State.background[0] == true){
            Enemy enemy = new Enemy(0);
            addObject(enemy, 700, 200);
        }
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
        //WorldName worldname = new WorldName(WorldName.worldNames[4]);
        //addObject(worldname, 500, 17);
        BossDoor bossdoor = new BossDoor();
        addObject(bossdoor, 173, 74);
        bossdoor.setLocation(196, 73);
        WorldName worldname = new WorldName();
        worldname.setImage("NameLobbyText.png");
        addObject(worldname, 500, 300);
    }

    private void prepare()
    {
        Door1 door1 = new Door1();
        addObject(door1, 999, 309);
        GlassDoorBg glassDoorBg1 = new GlassDoorBg();
        addObject(glassDoorBg1, 959, 309);
        WaterCooler waterCooler1 = new WaterCooler();
        addObject(waterCooler1, 950, 50);
        TrashCan trashCan1 = new TrashCan();
        addObject(trashCan1, 957, 561);
        TrashCanBg trashCanBg1 = new TrashCanBg();
        addObject(trashCanBg1, 616, 217);
        ChairBg chairBg1 = new ChairBg();
        addObject(chairBg1, 454, 161);
        NPC npc1 = new NPC();
        addObject(npc1, 504, 147);
        Desk desk = new Desk();
        addObject(desk, 493, 208);
        Tree tree = new Tree();
        addObject(tree, 370, 197);
        if(State.background[1] == true){
            HealthPackBg healthPackBg1 = new HealthPackBg(1);
            addObject(healthPackBg1, 50, 75);
        }
        if(State.background[2] == true){
            PistolAmmo pAmmo = new PistolAmmo(2);
            addObject(pAmmo, 400, 400);
        }
        Door5 door5 = new Door5();
        addObject(door5, 59, 321);
        if(State.background[0] == true){
            Enemy enemy = new Enemy(0);
            addObject(enemy, 700, 200);
        }
        Character character = new Character();
        addObject(character, 550, 550);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
        //WorldName worldname = new WorldName(WorldName.worldNames[4]);
        //addObject(worldname, 500, 17);
        BossDoor bossdoor = new BossDoor();
        addObject(bossdoor, 173, 74);
        bossdoor.setLocation(196, 73);
        WorldName worldname = new WorldName();
        worldname.setImage("NameLobbyText.png");
        addObject(worldname, 500, 300);
    }

    public void act()
    {

    }
}
