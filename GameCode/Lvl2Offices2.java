import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl2Offices2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl2Offices2 extends World
{

    /**
     * Constructor for objects of class Lvl2Offices2.
     * 
     */
    public Lvl2Offices2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
        State.worldNumber = 18;
    }
    
    public Lvl2Offices2(int x, int y)
    {
        super(1000, 600, 1);
        prepare2();
        Character character = new Character();
        addObject(character, x, y);
        CubicleMedSmlBG cubiclemedsmlbg = new CubicleMedSmlBG();
        addObject(cubiclemedsmlbg, 405, 421);
        cubiclemedsmlbg.setLocation(402, 416);
        CubicleMedSmlBG cubiclemedsmlbg2 = new CubicleMedSmlBG();
        addObject(cubiclemedsmlbg2, 830, 422);
        CubicleMedSmlBG cubiclemedsmlbg3 = new CubicleMedSmlBG();
        addObject(cubiclemedsmlbg3, 620, 423);
        cubiclemedsmlbg2.setLocation(847, 416);
        cubiclemedsmlbg3.setLocation(700, 415);
        cubiclemedsmlbg3.setLocation(700, 416);
        CubicleMedSmlBG cubiclemedsmlbg4 = new CubicleMedSmlBG();
        addObject(cubiclemedsmlbg4, 560, 422);
        cubiclemedsmlbg4.setLocation(554, 416);
        cubiclemedsmlbg.setLocation(409, 415);
        cubiclemedsmlbg.setLocation(409, 416);
        CubicleSmlSmlBG cubiclesmlsmlbg = new CubicleSmlSmlBG();
        addObject(cubiclesmlsmlbg, 307, 275);
        CubicleSmlSmlBG cubiclesmlsmlbg2 = new CubicleSmlSmlBG();
        addObject(cubiclesmlsmlbg2, 219, 276);
        cubiclesmlsmlbg.setLocation(301, 272);
        cubiclesmlsmlbg2.setLocation(221, 272);
        cubiclesmlsmlbg.setLocation(299, 272);
        cubiclesmlsmlbg.setLocation(300, 272);
        cubiclesmlsmlbg2.setLocation(221, 272);
        CubicleSmlSmlBG cubiclesmlsmlbg3 = new CubicleSmlSmlBG();
        addObject(cubiclesmlsmlbg3, 965, 422);
        cubiclesmlsmlbg3.setLocation(960, 417);
        CubicleMedSmlBG cubiclemedsmlbg5 = new CubicleMedSmlBG();
        addObject(cubiclemedsmlbg5, 433, 56);
        CubicleMedSmlBG cubiclemedsmlbg6 = new CubicleMedSmlBG();
        addObject(cubiclemedsmlbg6, 273, 64);
        cubiclemedsmlbg5.setLocation(429, 53);
        cubiclemedsmlbg6.setLocation(283, 53);
        CubicleLrgSmlBG cubiclelrgsmlbg = new CubicleLrgSmlBG();
        addObject(cubiclelrgsmlbg, 618, 200);
        cubiclelrgsmlbg.setLocation(607, 189);
        WorldName worldname = new WorldName();
        worldname.setImage("NameHallway.png");
        addObject(worldname, 500, 300);
        
        State.worldNumber = 18;
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare2()
    {
        Door22 door22 = new Door22();
        addObject(door22, 955, 527);
        //CbcMedSml cbcmedsml2 = new CbcMedSml();
        //addObject(cbcmedsml2, 839, 417);
        CbcLineMed cbclinemed3 = new CbcLineMed();
        addObject(cbclinemed3, 499, 159);
        CbcSmlSml cbcsmlsml3 = new CbcSmlSml();
        addObject(cbcsmlsml3, 952, 417);
        CbcLineSml cbclinesml4 = new CbcLineSml();
        addObject(cbclinesml4, 337, 345);
        Door25 door25 = new Door25();
        addObject(door25, 553, 74);
        if(State.level2Offices2[0] == true){
            HealthPackBg healthpackbg = new HealthPackBg(0);
            addObject(healthpackbg, 291, 373);
        }
        if(State.level2Offices2[1] == true){
            Grenade grenade = new Grenade(1);
            addObject(grenade, 951, 329);
        }
        if(State.level2Offices2[2] == true){
            Knife knife = new Knife(2);
            addObject(knife, 243, 374);
        }
        if(State.level2Offices2[3] == true){
            Enemy enemy = new Enemy(3);
            addObject(enemy, 433, 157);
        }
        AmmoBar ammobar = new AmmoBar();
        addObject(ammobar, 805, 550);
        InventoryBar inventoryBar = new InventoryBar();
        addObject(inventoryBar, 450, 550);
        CubicleMedSmlBG cubiclemedsmlbg7 = new CubicleMedSmlBG();
        addObject(cubiclemedsmlbg7, 142, 58);
        cubiclemedsmlbg7.setLocation(137, 53);
        Door23 door23 = new Door23();
        addObject(door23, 44, 73);
        CbcLineMed cbclinemed1 = new CbcLineMed();
        addObject(cbclinemed1, 183, 380);
        
    }

    private void prepare()
    {
        Door22 door22 = new Door22();
        addObject(door22, 955, 527);
        CbcLineMed cbclinemed3 = new CbcLineMed();
        addObject(cbclinemed3, 499, 159);
        CbcSmlSml cbcsmlsml3 = new CbcSmlSml();
        addObject(cbcsmlsml3, 952, 417);
        CbcLineSml cbclinesml4 = new CbcLineSml();
        addObject(cbclinesml4, 337, 345);
        Door25 door25 = new Door25();
        addObject(door25, 553, 74);
        CbcLineMed cbclinemed1 = new CbcLineMed();
        addObject(cbclinemed1, 183, 380);
        if(State.level2Offices2[0] == true){
            HealthPackBg healthpackbg = new HealthPackBg(0);
            addObject(healthpackbg, 291, 373);
        }
        if(State.level2Offices2[1] == true){
            Grenade grenade = new Grenade(1);
            addObject(grenade, 951, 329);
        }
        if(State.level2Offices2[2] == true){
            Knife knife = new Knife(2);
            addObject(knife, 243, 374);
        }
        if(State.level2Offices2[3] == true){
            Enemy enemy = new Enemy(3);
            addObject(enemy, 433, 157);
        }
        AmmoBar ammobar = new AmmoBar();
        addObject(ammobar, 805, 550);
        InventoryBar inventoryBar = new InventoryBar();
        addObject(inventoryBar, 450, 550);
        CubicleMedSmlBG cubiclemedsmlbg = new CubicleMedSmlBG();
        addObject(cubiclemedsmlbg, 405, 421);
        cubiclemedsmlbg.setLocation(402, 416);
        CubicleMedSmlBG cubiclemedsmlbg2 = new CubicleMedSmlBG();
        addObject(cubiclemedsmlbg2, 830, 422);
        CubicleMedSmlBG cubiclemedsmlbg3 = new CubicleMedSmlBG();
        addObject(cubiclemedsmlbg3, 620, 423);
        cubiclemedsmlbg2.setLocation(847, 416);
        cubiclemedsmlbg3.setLocation(700, 415);
        cubiclemedsmlbg3.setLocation(700, 416);
        CubicleMedSmlBG cubiclemedsmlbg4 = new CubicleMedSmlBG();
        addObject(cubiclemedsmlbg4, 560, 422);
        cubiclemedsmlbg4.setLocation(554, 416);
        cubiclemedsmlbg.setLocation(409, 415);
        cubiclemedsmlbg.setLocation(409, 416);
        CubicleSmlSmlBG cubiclesmlsmlbg = new CubicleSmlSmlBG();
        addObject(cubiclesmlsmlbg, 307, 275);
        CubicleSmlSmlBG cubiclesmlsmlbg2 = new CubicleSmlSmlBG();
        addObject(cubiclesmlsmlbg2, 219, 276);
        cubiclesmlsmlbg.setLocation(301, 272);
        cubiclesmlsmlbg2.setLocation(221, 272);
        cubiclesmlsmlbg.setLocation(299, 272);
        cubiclesmlsmlbg.setLocation(300, 272);
        cubiclesmlsmlbg2.setLocation(221, 272);
        CubicleSmlSmlBG cubiclesmlsmlbg3 = new CubicleSmlSmlBG();
        addObject(cubiclesmlsmlbg3, 965, 422);
        cubiclesmlsmlbg3.setLocation(960, 417);
        CubicleMedSmlBG cubiclemedsmlbg5 = new CubicleMedSmlBG();
        addObject(cubiclemedsmlbg5, 433, 56);
        CubicleMedSmlBG cubiclemedsmlbg6 = new CubicleMedSmlBG();
        addObject(cubiclemedsmlbg6, 273, 64);
        cubiclemedsmlbg5.setLocation(429, 53);
        cubiclemedsmlbg6.setLocation(283, 53);
        CubicleLrgSmlBG cubiclelrgsmlbg = new CubicleLrgSmlBG();
        addObject(cubiclelrgsmlbg, 618, 200);
        cubiclelrgsmlbg.setLocation(607, 189);
        CubicleMedSmlBG cubiclemedsmlbg7 = new CubicleMedSmlBG();
        addObject(cubiclemedsmlbg7, 142, 58);
        cubiclemedsmlbg7.setLocation(137, 53);
        Door23 door23 = new Door23();
        addObject(door23, 44, 73);
        WorldName worldname = new WorldName();
        worldname.setImage("NameHallway.png");
        addObject(worldname, 500, 300);
    }
}
