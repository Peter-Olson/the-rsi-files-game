import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

    /**
 * Write a description of class Hallway2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hallway2 extends World
{

    /**
     * Constructor for objects of class Hallway2.
     * 
     */
    public Hallway2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }
    public Hallway2(int x, int y)
    {
        super(1000, 600, 1);
        prepare2();
        Character character = new Character();
        addObject(character, x, y);
        CubicleMedSmlBG cubiclemedsmlbg = new CubicleMedSmlBG();
        addObject(cubiclemedsmlbg, 733, 434);
        cubiclemedsmlbg.setLocation(725, 434);
        CubicleMedSmlBG cubiclemedsmlbg2 = new CubicleMedSmlBG();
        addObject(cubiclemedsmlbg2, 737, 184);
        cubiclemedsmlbg2.setLocation(730, 170);
        CubicleMedSmlBG cubiclemedsmlbg3 = new CubicleMedSmlBG();
        addObject(cubiclemedsmlbg3, 259, 174);
        cubiclemedsmlbg3.setLocation(268, 169);
        CubicleMedSmlBG cubiclemedsmlbg4 = new CubicleMedSmlBG();
        addObject(cubiclemedsmlbg4, 270, 410);
        cubiclemedsmlbg4.setLocation(265, 422);
        CubicleSmlSmlBG cubiclesmlsmlbg = new CubicleSmlSmlBG();
        addObject(cubiclesmlsmlbg, 843, 441);
        cubiclesmlsmlbg.setLocation(837, 434);
        CubicleSmlSmlBG cubiclesmlsmlbg2 = new CubicleSmlSmlBG();
        addObject(cubiclesmlsmlbg2, 848, 177);
        cubiclesmlsmlbg2.setLocation(843, 171);
        CubicleSmlSmlBG cubiclesmlsmlbg3 = new CubicleSmlSmlBG();
        addObject(cubiclesmlsmlbg3, 105, 148);
        cubiclesmlsmlbg3.setLocation(155, 169);
        CubicleSmlSmlBG cubiclesmlsmlbg4 = new CubicleSmlSmlBG();
        addObject(cubiclesmlsmlbg4, 148, 412);
        cubiclesmlsmlbg4.setLocation(153, 423);
        TreeBg treebg = new TreeBg();
        addObject(treebg, 894, 483);
    }
    

    public void prepare()
    {

        Chair chair = new Chair();
        addObject(chair, 126, 85);
        Chair chair2 = new Chair();
        addObject(chair2, 131, 465);
        Chair chair3 = new Chair();
        addObject(chair3, 843, 87);
        Chair chair4 = new Chair();
        addObject(chair4, 844, 501);
        Desk1 desk1 = new Desk1();
        addObject(desk1, 845, 127);
        Desk1 desk12 = new Desk1();
        addObject(desk12, 839, 537);
        Desk1 desk13 = new Desk1();
        addObject(desk13, 120, 514);
        Desk1 desk14 = new Desk1();
        addObject(desk14, 137, 137);
        CbcLineMed cbclinemed = new CbcLineMed();
        addObject(cbclinemed, 340, 534);
        cbclinemed.setLocation(337, 533);
        CbcLineMed cbclinemed2 = new CbcLineMed();
        addObject(cbclinemed2, 657, 535);
        cbclinemed2.setLocation(653, 534);
        CbcLineMed cbclinemed3 = new CbcLineMed();
        addObject(cbclinemed3, 673, 77);
        CbcLineMed cbclinemed4 = new CbcLineMed();
        addObject(cbclinemed4, 339, 71);
        cbclinemed3.setLocation(659, 70);
        CbcLineSml cbclinesml = new CbcLineSml();
        addObject(cbclinesml, 663, 181);
        cbclinesml.setLocation(659, 173);
        CbcLineSml cbclinesml2 = new CbcLineSml();
        addObject(cbclinesml2, 343, 180);
        cbclinesml2.setLocation(339, 174);
        CbcLineSml cbclinesml3 = new CbcLineSml();
        addObject(cbclinesml3, 337, 433);
        cbclinesml3.setLocation(337, 428);
        CbcLineSml cbclinesml4 = new CbcLineSml();
        addObject(cbclinesml4, 638, 434);
        cbclinesml4.setLocation(653, 430);
        desk13.setLocation(193, 558);
        chair2.setLocation(198, 507);
        chair.setLocation(170, 48);
        desk14.setLocation(167, 79);
        chair.setLocation(169, 229);
        removeObject(chair);
        removeObject(chair3);
        desk1.setLocation(838, 38);
        desk14.setLocation(153, 39);
        desk12.setLocation(845, 557);
        chair4.setLocation(846, 516);
        CubicleMedSmlBG cubiclemedsmlbg = new CubicleMedSmlBG();
        addObject(cubiclemedsmlbg, 733, 434);
        cubiclemedsmlbg.setLocation(725, 434);
        CubicleMedSmlBG cubiclemedsmlbg2 = new CubicleMedSmlBG();
        addObject(cubiclemedsmlbg2, 737, 184);
        cubiclemedsmlbg2.setLocation(730, 170);
        CubicleMedSmlBG cubiclemedsmlbg3 = new CubicleMedSmlBG();
        addObject(cubiclemedsmlbg3, 259, 174);
        cubiclemedsmlbg3.setLocation(268, 169);
        CubicleMedSmlBG cubiclemedsmlbg4 = new CubicleMedSmlBG();
        addObject(cubiclemedsmlbg4, 270, 410);
        cubiclemedsmlbg4.setLocation(265, 422);
        
        
        /*HealthPackBg healthpackbg = new HealthPackBg();
        addObject(healthpackbg, 56, 504);*/
        Chair chair5 = new Chair();
        addObject(chair5, 826, 53);
        Chair chair6 = new Chair();
        addObject(chair6, 139, 51);
        chair5.setLocation(855, 50);
        Tree tree = new Tree();
        addObject(tree, 896, 486);
        tree.setLocation(894, 483);
        WorldName worldname = new WorldName();
        worldname.setImage("NameOffice.png");
        addObject(worldname, 500, 300);
    }


    public void prepare2()
    {
        Chair chair = new Chair();
        addObject(chair, 126, 85);
        Chair chair2 = new Chair();
        addObject(chair2, 131, 465);
        Chair chair3 = new Chair();
        addObject(chair3, 843, 87);
        Chair chair4 = new Chair();
        addObject(chair4, 844, 501);
        Desk1 desk1 = new Desk1();
        addObject(desk1, 845, 127);
        Desk1 desk12 = new Desk1();
        addObject(desk12, 839, 537);
        Desk1 desk13 = new Desk1();
        addObject(desk13, 120, 514);
        Desk1 desk14 = new Desk1();
        addObject(desk14, 137, 137);
        CbcLineMed cbclinemed = new CbcLineMed();
        addObject(cbclinemed, 340, 534);
        cbclinemed.setLocation(336, 532);
        CbcLineMed cbclinemed2 = new CbcLineMed();
        addObject(cbclinemed2, 657, 535);
        cbclinemed2.setLocation(653, 534);
        CbcLineMed cbclinemed3 = new CbcLineMed();
        addObject(cbclinemed3, 673, 77);
        CbcLineMed cbclinemed4 = new CbcLineMed();
        addObject(cbclinemed4, 339, 71);
        cbclinemed3.setLocation(659, 70);
        desk13.setLocation(193, 558);
        chair2.setLocation(198, 507);
        chair.setLocation(170, 48);
        desk14.setLocation(167, 79);
        chair.setLocation(169, 229);
        removeObject(chair);
        removeObject(chair3);
        desk1.setLocation(838, 38);
        desk14.setLocation(153, 39);
        desk12.setLocation(845, 557);
        chair4.setLocation(846, 516);
        /*HealthPackBg healthpackbg = new HealthPackBg();
        addObject(healthpackbg, 56, 504);*/
        Chair chair5 = new Chair();
        addObject(chair5, 826, 53);
        Chair chair6 = new Chair();
        addObject(chair6, 139, 51);
        chair5.setLocation(855, 50);
        TreeBg treebg = new TreeBg();
        addObject(treebg, 894, 483);
        Door16 door16 = new Door16();
        addObject(door16, 500, 600);
        Door31 door31 = new Door31();
        addObject(door31, 500, 0);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
        WorldName worldname = new WorldName();
        worldname.setImage("NameOffice.png");
        addObject(worldname, 500, 300);
    }
}
