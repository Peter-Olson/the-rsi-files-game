import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hallway1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hallway1 extends World
{

    /**
     * Constructor for objects of class Hallway1.
     * 
     */
    public Hallway1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
        State.worldNumber = 13;
    }
    
    public Hallway1(int x, int y)
    {
        super(1000, 600, 1);
        prepare2();
        TreeBg treebg = new TreeBg();
        addObject(treebg, 273, 119);
        Character character = new Character();
        addObject(character, x, y);
        State.worldNumber = 13;
    }

    public void prepare()
    {
        Printer printer = new Printer();
        addObject(printer, 920, 92);
        if(State.hallway1[0] == true){
            Crate crate = new Crate(0);
            addObject(crate, 934, 557);
        }
        if(State.hallway1[1] == true){
            Crate crate2 = new Crate(1);
            addObject(crate2, 763, 101);
        }
        if(State.hallway1[2] == true){
            Crate crate3 = new Crate(2);
            addObject(crate3, 769, 56);
        }
        if(State.hallway1[3] == true){
            Crate crate4 = new Crate(3);
            addObject(crate4, 929, 510);
        }   
        ChairBg chairbg = new ChairBg();
        addObject(chairbg, 197, 154);
        ChairBg chairbg2 = new ChairBg();
        addObject(chairbg2, 533, 174);
        ChairBg chairbg3 = new ChairBg();
        addObject(chairbg3, 179, 380);
        ChairBg chairbg4 = new ChairBg();
        addObject(chairbg4, 534, 384);
        Desk1 desk15 = new Desk1();
        addObject(desk15, 572, 219);
        Desk1 desk16 = new Desk1();
        addObject(desk16, 216, 195);
        Desk1 desk17 = new Desk1();
        addObject(desk17, 203, 423);
        Desk1 desk18 = new Desk1();
        addObject(desk18, 539, 424);
        TreeBg treebg = new TreeBg();
        addObject(treebg, 273, 119);
        Door15 door15 = new Door15();
        addObject(door15, 0, 600);
        Character character = new Character();
        addObject(character, 50, 454);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
    }

    public void prepare2()
    {
        Printer printer = new Printer();
        addObject(printer, 920, 92);
        if(State.hallway1[0] == true){
            Crate crate = new Crate(0);
            addObject(crate, 934, 557);
        }
        if(State.hallway1[1] == true){
            Crate crate2 = new Crate(1);
            addObject(crate2, 763, 101);
        }
        if(State.hallway1[2] == true){
            Crate crate3 = new Crate(2);
            addObject(crate3, 769, 56);
        }
        if(State.hallway1[3] == true){
            Crate crate4 = new Crate(3);
            addObject(crate4, 929, 510);
        }
        ChairBg chairbg = new ChairBg();
        addObject(chairbg, 197, 154);
        ChairBg chairbg2 = new ChairBg();
        addObject(chairbg2, 533, 174);
        ChairBg chairbg3 = new ChairBg();
        addObject(chairbg3, 179, 380);
        ChairBg chairbg4 = new ChairBg();
        addObject(chairbg4, 534, 384);
        Desk1 desk15 = new Desk1();
        addObject(desk15, 572, 219);
        Desk1 desk16 = new Desk1();
        addObject(desk16, 216, 195);
        Desk1 desk17 = new Desk1();
        addObject(desk17, 203, 423);
        Desk1 desk18 = new Desk1();
        addObject(desk18, 539, 424);
        Door15 door15 = new Door15();
        addObject(door15, 0, 600);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
    }
}
