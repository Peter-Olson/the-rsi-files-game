import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hallway4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hallway4 extends World
{

    /**
     * Constructor for objects of class Hallway4.
     * 
     */
    public Hallway4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
        State.worldNumber = 17;
    }
    
    public Hallway4(int x, int y)
    {
        super(1000, 600, 1);
        prepare2();
        Character character = new Character();
        addObject(character, x, y);
        State.worldNumber = 17;
    }
    
    public void prepare()
    {
        /*
        WaterCooler watercooler = new WaterCooler();
        addObject(watercooler, 64, 564);
        WaterCooler watercooler2 = new WaterCooler();
        addObject(watercooler2, 68, 480);
        WaterCooler watercooler3 = new WaterCooler();
        addObject(watercooler3, 70, 395);
        WaterCooler watercooler4 = new WaterCooler();
        addObject(watercooler4, 64, 319);
        WaterCooler watercooler5 = new WaterCooler();
        addObject(watercooler5, 69, 228);
        WaterCooler watercooler6 = new WaterCooler();
        addObject(watercooler6, 166, 562);
        WaterCooler watercooler7 = new WaterCooler();
        addObject(watercooler7, 171, 467);
        WaterCooler watercooler8 = new WaterCooler();
        addObject(watercooler8, 170, 377);
        WaterCooler watercooler9 = new WaterCooler();
        addObject(watercooler9, 176, 283);
        WaterCooler watercooler10 = new WaterCooler();
        addObject(watercooler10, 282, 572);
        WaterCooler watercooler11 = new WaterCooler();
        addObject(watercooler11, 284, 476);
        WaterCooler watercooler12 = new WaterCooler();
        addObject(watercooler12, 282, 390);
        WaterCooler watercooler13 = new WaterCooler();
        addObject(watercooler13, 286, 290);
        WaterCooler watercooler14 = new WaterCooler();
        addObject(watercooler14, 945, 567);
        WaterCooler watercooler15 = new WaterCooler();
        addObject(watercooler15, 944, 471);
        WaterCooler watercooler16 = new WaterCooler();
        addObject(watercooler16, 944, 381);
        WaterCooler watercooler17 = new WaterCooler();
        addObject(watercooler17, 943, 288);
        WaterCooler watercooler18 = new WaterCooler();
        addObject(watercooler18, 865, 572);
        WaterCooler watercooler19 = new WaterCooler();
        addObject(watercooler19, 861, 477);
        WaterCooler watercooler20 = new WaterCooler();
        addObject(watercooler20, 856, 391);
        WaterCooler watercooler21 = new WaterCooler();
        addObject(watercooler21, 860, 303);
        WaterCooler watercooler22 = new WaterCooler();
        addObject(watercooler22, 776, 588);
        WaterCooler watercooler23 = new WaterCooler();
        addObject(watercooler23, 777, 497);
        WaterCooler watercooler24 = new WaterCooler();
        addObject(watercooler24, 775, 411);
        WaterCooler watercooler25 = new WaterCooler();
        addObject(watercooler25, 776, 326);
        WaterCooler watercooler26 = new WaterCooler();
        addObject(watercooler26, 778, 239);
        watercooler22.setLocation(748, 587);
        watercooler23.setLocation(750, 497);
        watercooler24.setLocation(750, 409);
        watercooler25.setLocation(750, 321);
        watercooler26.setLocation(752, 232);
        watercooler18.setLocation(849, 571);
        watercooler19.setLocation(849, 480);
        watercooler20.setLocation(847, 390);
        watercooler20.setLocation(849, 390);
        watercooler21.setLocation(850, 300);
        watercooler14.setLocation(942, 577);
        watercooler15.setLocation(942, 478);
        watercooler16.setLocation(943, 382);
        watercooler5.setLocation(72, 220);
        watercooler2.setLocation(65, 475);
        watercooler4.setLocation(66, 299);
        watercooler5.setLocation(66, 167);
        watercooler4.setLocation(65, 266);
        watercooler3.setLocation(65, 381);
        watercooler4.setLocation(65, 284);
        watercooler5.setLocation(66, 186);
        watercooler7.setLocation(167, 467);
        watercooler8.setLocation(166, 371);
        watercooler9.setLocation(167, 276);
        watercooler13.setLocation(278, 284);
        watercooler12.setLocation(277, 386);
        watercooler11.setLocation(278, 479);
        watercooler10.setLocation(278, 579);
        WaterCooler watercooler27 = new WaterCooler();
        addObject(watercooler27, 387, 566);
        WaterCooler watercooler28 = new WaterCooler();
        addObject(watercooler28, 390, 464);
        WaterCooler watercooler29 = new WaterCooler();
        addObject(watercooler29, 651, 567);
        WaterCooler watercooler30 = new WaterCooler();
        addObject(watercooler30, 650, 462);
        WaterCooler watercooler31 = new WaterCooler();
        addObject(watercooler31, 649, 366);
        WaterCooler watercooler32 = new WaterCooler();
        addObject(watercooler32, 652, 273);
        WaterCooler watercooler33 = new WaterCooler();
        addObject(watercooler33, 394, 370);
        WaterCooler watercooler34 = new WaterCooler();
        addObject(watercooler34, 394, 370);
        WaterCooler watercooler35 = new WaterCooler();
        addObject(watercooler35, 393, 267);
        watercooler27.setLocation(391, 567);
        watercooler34.setLocation(390, 369);
        watercooler34.setLocation(455, 366);
        watercooler33.setLocation(475, 437);
        removeObject(watercooler33);
        watercooler34.setLocation(390, 363);
        watercooler35.setLocation(390, 265);
        watercooler32.setLocation(649, 272);
        watercooler30.setLocation(650, 466);
        watercooler26.setLocation(750, 229);
        Enemy enemy = new Enemy();
        addObject(enemy, 927, 92);
        HealthPackBg healthpack = new HealthPackBg();
        addObject(healthpack, 109, 72);
        */
        Door18 door18 = new Door18();
        addObject(door18, 500, 0);
        /*
        Crate crate = new Crate();
        addObject(crate, 562, 491);*/
        Character character = new Character();
        addObject(character, 524, 431);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
    }
    
    public void prepare2()
    {
        /*
        WaterCooler watercooler = new WaterCooler();
        addObject(watercooler, 64, 564);
        WaterCooler watercooler2 = new WaterCooler();
        addObject(watercooler2, 68, 480);
        WaterCooler watercooler3 = new WaterCooler();
        addObject(watercooler3, 70, 395);
        WaterCooler watercooler4 = new WaterCooler();
        addObject(watercooler4, 64, 319);
        WaterCooler watercooler5 = new WaterCooler();
        addObject(watercooler5, 69, 228);
        WaterCooler watercooler6 = new WaterCooler();
        addObject(watercooler6, 166, 562);
        WaterCooler watercooler7 = new WaterCooler();
        addObject(watercooler7, 171, 467);
        WaterCooler watercooler8 = new WaterCooler();
        addObject(watercooler8, 170, 377);
        WaterCooler watercooler9 = new WaterCooler();
        addObject(watercooler9, 176, 283);
        WaterCooler watercooler10 = new WaterCooler();
        addObject(watercooler10, 282, 572);
        WaterCooler watercooler11 = new WaterCooler();
        addObject(watercooler11, 284, 476);
        WaterCooler watercooler12 = new WaterCooler();
        addObject(watercooler12, 282, 390);
        WaterCooler watercooler13 = new WaterCooler();
        addObject(watercooler13, 286, 290);
        WaterCooler watercooler14 = new WaterCooler();
        addObject(watercooler14, 945, 567);
        WaterCooler watercooler15 = new WaterCooler();
        addObject(watercooler15, 944, 471);
        WaterCooler watercooler16 = new WaterCooler();
        addObject(watercooler16, 944, 381);
        WaterCooler watercooler17 = new WaterCooler();
        addObject(watercooler17, 943, 288);
        WaterCooler watercooler18 = new WaterCooler();
        addObject(watercooler18, 865, 572);
        WaterCooler watercooler19 = new WaterCooler();
        addObject(watercooler19, 861, 477);
        WaterCooler watercooler20 = new WaterCooler();
        addObject(watercooler20, 856, 391);
        WaterCooler watercooler21 = new WaterCooler();
        addObject(watercooler21, 860, 303);
        WaterCooler watercooler22 = new WaterCooler();
        addObject(watercooler22, 776, 588);
        WaterCooler watercooler23 = new WaterCooler();
        addObject(watercooler23, 777, 497);
        WaterCooler watercooler24 = new WaterCooler();
        addObject(watercooler24, 775, 411);
        WaterCooler watercooler25 = new WaterCooler();
        addObject(watercooler25, 776, 326);
        WaterCooler watercooler26 = new WaterCooler();
        addObject(watercooler26, 778, 239);
        watercooler22.setLocation(748, 587);
        watercooler23.setLocation(750, 497);
        watercooler24.setLocation(750, 409);
        watercooler25.setLocation(750, 321);
        watercooler26.setLocation(752, 232);
        watercooler18.setLocation(849, 571);
        watercooler19.setLocation(849, 480);
        watercooler20.setLocation(847, 390);
        watercooler20.setLocation(849, 390);
        watercooler21.setLocation(850, 300);
        watercooler14.setLocation(942, 577);
        watercooler15.setLocation(942, 478);
        watercooler16.setLocation(943, 382);
        watercooler5.setLocation(72, 220);
        watercooler2.setLocation(65, 475);
        watercooler4.setLocation(66, 299);
        watercooler5.setLocation(66, 167);
        watercooler4.setLocation(65, 266);
        watercooler3.setLocation(65, 381);
        watercooler4.setLocation(65, 284);
        watercooler5.setLocation(66, 186);
        watercooler7.setLocation(167, 467);
        watercooler8.setLocation(166, 371);
        watercooler9.setLocation(167, 276);
        watercooler13.setLocation(278, 284);
        watercooler12.setLocation(277, 386);
        watercooler11.setLocation(278, 479);
        watercooler10.setLocation(278, 579);
        WaterCooler watercooler27 = new WaterCooler();
        addObject(watercooler27, 387, 566);
        WaterCooler watercooler28 = new WaterCooler();
        addObject(watercooler28, 390, 464);
        WaterCooler watercooler29 = new WaterCooler();
        addObject(watercooler29, 651, 567);
        WaterCooler watercooler30 = new WaterCooler();
        addObject(watercooler30, 650, 462);
        WaterCooler watercooler31 = new WaterCooler();
        addObject(watercooler31, 649, 366);
        WaterCooler watercooler32 = new WaterCooler();
        addObject(watercooler32, 652, 273);
        WaterCooler watercooler33 = new WaterCooler();
        addObject(watercooler33, 394, 370);
        WaterCooler watercooler34 = new WaterCooler();
        addObject(watercooler34, 394, 370);
        WaterCooler watercooler35 = new WaterCooler();
        addObject(watercooler35, 393, 267);
        watercooler27.setLocation(391, 567);
        watercooler34.setLocation(390, 369);
        watercooler34.setLocation(455, 366);
        watercooler33.setLocation(475, 437);
        removeObject(watercooler33);
        watercooler34.setLocation(390, 363);
        watercooler35.setLocation(390, 265);
        watercooler32.setLocation(649, 272);
        watercooler30.setLocation(650, 466);
        watercooler26.setLocation(750, 229);
        Enemy enemy = new Enemy();
        addObject(enemy, 927, 92);
        HealthPackBg healthpack = new HealthPackBg();
        addObject(healthpack, 109, 72);
        */
        Door18 door18 = new Door18();
        addObject(door18, 500, 0);
        /*
        Crate crate = new Crate();
        addObject(crate, 562, 491);
        */
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
    }
}
