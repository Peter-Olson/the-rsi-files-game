import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hallway here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hallway extends World
{

    /**
     * Constructor for objects of class Hallway.
     * 
     */
    public Hallway()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 

        prepare();
    }
    
    public Hallway(int x, int y)
    {
        super(1000, 600, 1);
        prepare();
        Character character = new Character();
        addObject(character, x, y);
        CubicleLrgSmlBG cubiclelrgsmlbg = new CubicleLrgSmlBG();
        addObject(cubiclelrgsmlbg, 150, 420);
        CubicleLrgSmlBG cubiclelrgsmlbg2 = new CubicleLrgSmlBG();
        addObject(cubiclelrgsmlbg2, 367, 420);
        CubicleLrgSmlBG cubiclelrgsmlbg3 = new CubicleLrgSmlBG();
        addObject(cubiclelrgsmlbg3, 584, 420);
        M16NPC m16npc = new M16NPC();
        addObject(m16npc, 819, 315);
        m16npc.setLocation(820, 318);
        m16npc.setLocation(839, 317);
        
        State.worldNumber = 14;
    }
    
    public void prepare()
    {
        Door37 door37 = new Door37();
        addObject(door37, 0, 309);
        Door12 door12 = new Door12();
        addObject(door12, 958, 71);
        Door13 door13 = new Door13();
        addObject(door13, 958, 530);
        if(State.hallway[0] == true){
            PistolAmmo pistolAmmo = new PistolAmmo(0);
            addObject(pistolAmmo, 500, 300);
        }
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
        
        
        CbcLrgSml cbclrgsml4 = new CbcLrgSml();
        addObject(cbclrgsml4, 157, 202);
        CbcLrgSml cbclrgsml5 = new CbcLrgSml();
        addObject(cbclrgsml5, 381, 202);
        CbcLrgSml cbclrgsml6 = new CbcLrgSml();
        addObject(cbclrgsml6, 612, 197);


        cbclrgsml4.setLocation(150, 200);
        cbclrgsml5.setLocation(367, 199);
        cbclrgsml6.setLocation(584, 199);
        cbclrgsml5.setLocation(367, 200);
        cbclrgsml6.setLocation(584, 200);
        CbcLineLrg cbclinelrg = new CbcLineLrg();
        addObject(cbclinelrg, 693, 23);
        cbclinelrg.setLocation(690, 19);
        CbcLineLrg cbclinelrg2 = new CbcLineLrg();
        addObject(cbclinelrg2, 681, 596);
        cbclinelrg2.setLocation(690, 599);
        Chair chair = new Chair();
        addObject(chair, 316, 57);
        Desk1 desk1 = new Desk1();
        addObject(desk1, 330, 96);
        Desk1 desk12 = new Desk1();
        addObject(desk12, 362, 539);
        Chair chair2 = new Chair();
        addObject(chair2, 345, 550);
        Tree tree = new Tree();
        addObject(tree, 377, 21);
        WorldName worldname = new WorldName();
        worldname.setImage("NameHallway.png");
        addObject(worldname, 500, 300);
    }
}
