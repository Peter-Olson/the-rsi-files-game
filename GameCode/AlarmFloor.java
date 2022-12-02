import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AlarmFloor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AlarmFloor extends World
{
    AlarmDialogue alarmdialogue = new AlarmDialogue();
    public int alarmCopSpawn = 0;
    public int endSpawn = 0;
    public boolean doneSpawning = false;
    public GreenfootImage sirenDark = new GreenfootImage(1000, 600);
    public int copCounter = 0;
    //private Enemy enemy1;
    /**
     * Constructor for objects of class AlarmFloor.
     * 
     */
    public AlarmFloor()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
        State.worldNumber = 20;
    }

    public void act()
    {
        if (alarmdialogue.alarmDoOnce == true)
        {
            alarmCopSpawn++;
            endSpawn++;
        }
        if (endSpawn == 1050)
        {
            doneSpawning = true;
        }
        if (alarmCopSpawn == 50 && doneSpawning == false)
        {
            copCounter++;
            if(copCounter < 20){
                if(State.alarmFloor[copCounter - 1] == true){
                    Enemy enemy = new Enemy(copCounter - 1);
                    addObject(enemy, 618, 557);
                }
            }
            alarmCopSpawn = 0;
        }
    }

    public AlarmFloor(int x, int y)
    {
        super(1000, 600, 1);
        State.worldNumber = 20;
        prepare2();
        Character character = new Character();
        addObject(character, x, y);
        CubicleLrgSmlBG cubiclelrgsmlbg = new CubicleLrgSmlBG();
        addObject(cubiclelrgsmlbg, 568, 420);
        cubiclelrgsmlbg.setLocation(566, 420);
        CubicleMedSmlBG cubiclemedsmlbg = new CubicleMedSmlBG();
        addObject(cubiclemedsmlbg, 755, 425);
        cubiclemedsmlbg.setLocation(748, 419);
    }

    public void prepare()
    {
        if(State.alarmFloor[21] == true){
            M16 m161 = new M16(21);
            addObject(m161, 200, 200);
        }
        if(State.alarmFloor[22] == true){
            M16Ammo m16Ammo1 = new M16Ammo(22);
            addObject(m16Ammo1, 200, 200);
        }
        if(State.alarmFloor[23] == true){
            M16Ammo m16Ammo2 = new M16Ammo(23);
            addObject(m16Ammo2, 200, 200);
        }
        if(State.alarmFloor[24] == true){
            M16Ammo m16Ammo3 = new M16Ammo(24);
            addObject(m16Ammo3, 200, 200);
        }
        if(State.alarmFloor[25] == true){
            M16Ammo m16Ammo4 = new M16Ammo(25);
            addObject(m16Ammo4, 200, 200);
        }
        if(State.alarmFloor[26] == true){
            M16Ammo m16Ammo5 = new M16Ammo(26);
            addObject(m16Ammo5, 200, 200);
        }
        if(State.alarmFloor[27] == true){
            M16Ammo m16Ammo6 = new M16Ammo(27);
            addObject(m16Ammo6, 200, 200);
        }
        CbcLineMed cbclinemed = new CbcLineMed();
        addObject(cbclinemed, 463, 460);
        cbclinemed.setLocation(459, 459);
        removeObject(cbclinemed);
        CbcLineSml cbclinesml = new CbcLineSml();
        addObject(cbclinesml, 465, 498);
        cbclinesml.setLocation(459, 494);
        CbcLrgSml cbclrgsml = new CbcLrgSml();
        addObject(cbclrgsml, 568, 420);
        cbclrgsml.setLocation(566, 420);
        CbcMedSml cbcmedsml = new CbcMedSml();
        addObject(cbcmedsml, 755, 425);
        cbcmedsml.setLocation(748, 419);
        CbcLineMed cbclinemed2 = new CbcLineMed();
        addObject(cbclinemed2, 819, 316);
        cbclinemed2.setLocation(819, 311);
        CbcLrgSml cbclrgsml2 = new CbcLrgSml();
        addObject(cbclrgsml2, 887, 45);
        cbclrgsml2.setLocation(890, 40);
        CbcLrgSml cbclrgsml3 = new CbcLrgSml();
        addObject(cbclrgsml3, 611, 49);
        cbclrgsml3.setLocation(673, 40);
        CbcLrgSml cbclrgsml4 = new CbcLrgSml();
        addObject(cbclrgsml4, 468, 45);
        cbclrgsml4.setLocation(456, 40);
        CbcLrgSml cbclrgsml5 = new CbcLrgSml();
        addObject(cbclrgsml5, 231, 46);
        cbclrgsml5.setLocation(239, 40);
        cbclrgsml2.setLocation(891, 40);
        cbclrgsml3.setLocation(674, 40);
        cbclrgsml4.setLocation(457, 40);
        cbclrgsml5.setLocation(240, 40);
        CbcMedSml cbcmedsml2 = new CbcMedSml();
        addObject(cbcmedsml2, 56, 46);
        cbcmedsml2.setLocation(59, 40);
        Alarm alarm = new Alarm();
        addObject(alarm, 878, 38);
        alarm.setLocation(889, 40);
        Chair chair = new Chair();
        addObject(chair, 631, 258);
        Desk1 desk1 = new Desk1();
        addObject(desk1, 639, 303);
        Chair chair2 = new Chair();
        addObject(chair2, 124, 162);
        Desk1 desk12 = new Desk1();
        addObject(desk12, 125, 200);
        Printer printer = new Printer();
        addObject(printer, 86, 327);
        Tree tree = new Tree();
        addObject(tree, 78, 121);
        CbcLineMed cbclinemed3 = new CbcLineMed();
        addObject(cbclinemed3, 467, 537);
        cbclinemed3.setLocation(460, 530);
        Character character = new Character();
        addObject(character, 200, 200);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
        WorldName worldname = new WorldName();
        worldname.setImage("NameOffice.png");
        addObject(worldname, 500, 300);
    }

    public void prepare2()
    {
        Door32 door32 = new Door32();
        addObject(door32, 500, 600);
        Door33 door33 = new Door33();
        addObject(door33, 416, 600);
        CbcLineMed cbclinemed = new CbcLineMed();
        addObject(cbclinemed, 463, 460);
        cbclinemed.setLocation(459, 459);
        removeObject(cbclinemed);
        CbcLineSml cbclinesml = new CbcLineSml();
        addObject(cbclinesml, 465, 498);
        cbclinesml.setLocation(459, 494);
        CbcLineMed cbclinemed2 = new CbcLineMed();
        addObject(cbclinemed2, 819, 316);
        cbclinemed2.setLocation(819, 311);
        CbcLrgSml cbclrgsml = new CbcLrgSml();
        addObject(cbclrgsml, 887, 45);
        cbclrgsml.setLocation(890, 40);
        CbcLrgSml cbclrgsml3 = new CbcLrgSml();
        addObject(cbclrgsml3, 611, 49);
        cbclrgsml3.setLocation(673, 40);
        CbcLrgSml cbclrgsml4 = new CbcLrgSml();
        addObject(cbclrgsml4, 468, 45);
        cbclrgsml4.setLocation(456, 40);
        CbcLrgSml cbclrgsml5 = new CbcLrgSml();
        addObject(cbclrgsml5, 231, 46);
        cbclrgsml5.setLocation(239, 40);
        cbclrgsml3.setLocation(674, 40);
        cbclrgsml4.setLocation(457, 40);
        cbclrgsml5.setLocation(240, 40);
        CbcMedSml cbcmedsml2 = new CbcMedSml();
        addObject(cbcmedsml2, 56, 46);
        cbcmedsml2.setLocation(59, 40);
        Alarm alarm = new Alarm();
        addObject(alarm, 878, 38);
        alarm.setLocation(889, 40);
        Chair chair = new Chair();
        addObject(chair, 631, 258);
        Desk1 desk1 = new Desk1();
        addObject(desk1, 639, 303);
        Chair chair2 = new Chair();
        addObject(chair2, 124, 162);
        Desk1 desk12 = new Desk1();
        addObject(desk12, 125, 200);
        Printer printer = new Printer();
        addObject(printer, 86, 327);
        Tree tree = new Tree();
        addObject(tree, 78, 121);
        CbcLineMed cbclinemed3 = new CbcLineMed();
        addObject(cbclinemed3, 467, 537);
        cbclinemed3.setLocation(460, 530);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
        WorldName worldname = new WorldName();
        worldname.setImage("NameOffice.png");
        addObject(worldname, 500, 300);
    }
}
