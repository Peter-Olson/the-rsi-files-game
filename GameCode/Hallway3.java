import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hallway3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hallway3 extends World
{
    AlarmDialogue alarmdialogue = new AlarmDialogue();
    /**
     * Constructor for objects of class Hallway3.
     * 
     */
    public Hallway3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
        State.worldNumber = 15;
    }

    public Hallway3(int x, int y)
    {
        super(1000, 600, 1);
        State.worldNumber = 15;
        if (alarmdialogue.alarmDoOnce == true)
        {
            if(State.hallway3[16] == true){
                M16 m161 = new M16(16);
                addObject(m161, 300, 300);
            }
            if(State.hallway3[17] == true){
                M16Ammo m16Ammo1 = new M16Ammo(17);
                addObject(m16Ammo1, 300, 400);
            }
            if(State.hallway3[18] == true){
                M16Ammo m16Ammo2 = new M16Ammo(18);
                addObject(m16Ammo2, 350, 400);
            }
            if(State.hallway3[19] == true){
                M16Ammo m16Ammo3 = new M16Ammo(19);
                addObject(m16Ammo3, 400, 400);
            }
            if(State.hallway3[20] == true){
                M16Ammo m16Ammo4 = new M16Ammo(20);
                addObject(m16Ammo4, 450, 400);
            }
            if(State.hallway3[21] == true){
                M16Ammo m16Ammo5 = new M16Ammo(21);
                addObject(m16Ammo5, 500, 400);
            }
            if(State.hallway3[22] == true){
                M16Ammo m16Ammo6 = new M16Ammo(22);
                addObject(m16Ammo6, 550, 400);
            }
            Door17 door17 = new Door17();
            addObject(door17, 0, 600);
            Desk desk = new Desk();
            addObject(desk, 490, 112);
            desk.setLocation(488, 138);
            desk.setLocation(262, 140);
            Desk desk2 = new Desk();
            addObject(desk2, 622, 75);
            Desk desk3 = new Desk();
            addObject(desk3, 812, 80);
            desk3.setLocation(778, 75);
            desk3.setLocation(917, 40);
            desk2.setLocation(762, 40);
            desk2.setLocation(762, 49);
            desk3.setLocation(918, 49);
            removeObject(desk);
            Chair chair3 = new Chair();
            addObject(chair3, 279, 105);
            chair3.setLocation(277, 98);
            Desk1 desk14 = new Desk1();
            addObject(desk14, 282, 143);
            desk14.setLocation(280, 137);
            desk14.setLocation(282, 139);
            AmmoBar ammoBar = new AmmoBar();
            addObject(ammoBar, 895, 568);
            InventoryBar inventory = new InventoryBar();
            addObject(inventory, 450, 550);
        }
        else
        {
            prepare2();
        }
        Character character = new Character();
        addObject(character, x, y);
        WorldName worldname = new WorldName();
        worldname.setImage("NameSecurityHQ.png");
        addObject(worldname, 500, 300);
    }

    public void prepare()
    {
        if(State.hallway3[16] == true){
            M16 m161 = new M16(16);
            addObject(m161, 300, 300);
        }
        if(State.hallway3[17] == true){
            M16Ammo m16Ammo1 = new M16Ammo(17);
            addObject(m16Ammo1, 300, 400);
        }
        if(State.hallway3[18] == true){
            M16Ammo m16Ammo2 = new M16Ammo(18);
            addObject(m16Ammo2, 350, 400);
        }
        if(State.hallway3[19] == true){
            M16Ammo m16Ammo3 = new M16Ammo(19);
            addObject(m16Ammo3, 400, 400);
        }
        if(State.hallway3[20] == true){
            M16Ammo m16Ammo4 = new M16Ammo(20);
            addObject(m16Ammo4, 450, 400);
        }
        if(State.hallway3[21] == true){
            M16Ammo m16Ammo5 = new M16Ammo(21);
            addObject(m16Ammo5, 500, 400);
        }
        if(State.hallway3[22] == true){
            M16Ammo m16Ammo6 = new M16Ammo(22);
            addObject(m16Ammo6, 550, 400);
        }
        Door17 door17 = new Door17();
        addObject(door17, 0, 600);
        Chair chair = new Chair();
        addObject(chair, 498, 72);
        CopNPC copnpc = new CopNPC();
        addObject(copnpc, 512, 59);
        copnpc.setLocation(510, 52);
        Desk1 desk1 = new Desk1();
        addObject(desk1, 505, 95);
        Desk desk = new Desk();
        addObject(desk, 490, 112);
        desk.setLocation(488, 138);
        desk.setLocation(262, 140);
        Desk desk2 = new Desk();
        addObject(desk2, 622, 75);
        Desk desk3 = new Desk();
        addObject(desk3, 812, 80);
        desk3.setLocation(778, 75);
        desk3.setLocation(917, 40);
        desk2.setLocation(762, 40);
        desk2.setLocation(762, 49);
        desk3.setLocation(918, 49);
        removeObject(desk);
        Chair chair3 = new Chair();
        addObject(chair3, 279, 105);
        chair3.setLocation(277, 98);
        Desk1 desk13 = new Desk1();
        addObject(desk13, 269, 140);
        desk13.setLocation(273, 141);
        removeObject(desk13);
        CopNPC copnpc2 = new CopNPC();
        addObject(copnpc2, 278, 93);
        copnpc2.setLocation(283, 90);
        Desk1 desk14 = new Desk1();
        addObject(desk14, 282, 143);
        desk14.setLocation(280, 137);
        desk14.setLocation(282, 139);
        if(State.hallway3[0] == true){
            Enemy enemy = new Enemy(0);
            addObject(enemy, 193, 293);
        }
        if(State.hallway3[1] == true){
            Enemy enemy2 = new Enemy(1);
            addObject(enemy2, 312, 262);
        }
        if(State.hallway3[2] == true){
            Enemy enemy3 = new Enemy(2);
            addObject(enemy3, 396, 381);
        }
        if(State.hallway3[3] == true){
            Enemy enemy4 = new Enemy(3);
            addObject(enemy4, 521, 297);
        }
        if(State.hallway3[4] == true){
            Enemy enemy5 = new Enemy(4);
            addObject(enemy5, 416, 200);
        }
        if(State.hallway3[5] == true){
            Enemy enemy6 = new Enemy(5);
            addObject(enemy6, 516, 135);
        }
        if(State.hallway3[6] == true){
            Enemy enemy7 = new Enemy(6);
            addObject(enemy7, 680, 239);
        }
        if(State.hallway3[7] == true){
            Enemy enemy8 = new Enemy(7);
            addObject(enemy8, 701, 356);
        }
        if(State.hallway3[8] == true){
            Enemy enemy9 = new Enemy(8);
            addObject(enemy9, 866, 369);
        }
        if(State.hallway3[9] == true){
            Enemy enemy10 = new Enemy(9);
            addObject(enemy10, 826, 205);
        }
        if(State.hallway3[10] == true){
            Enemy enemy11 = new Enemy(10);
            addObject(enemy11, 800, 503);
        }
        if(State.hallway3[11] == true){
            Enemy enemy12 = new Enemy(11);
            addObject(enemy12, 603, 481);
        }
        if(State.hallway3[12] == true){
            Enemy enemy13 = new Enemy(12);
            addObject(enemy13, 477, 500);
        }
        if(State.hallway3[13] == true){
            Enemy enemy14 = new Enemy(13);
            addObject(enemy14, 297, 501);
        }
        if(State.hallway3[14] == true){
            Enemy enemy15 = new Enemy(14);
            addObject(enemy15, 223, 459);
        }
        if(State.hallway3[15] == true){
            Enemy enemy16 = new Enemy(15);
            addObject(enemy16, 90, 398);
        }
        removeObject(desk1);
        removeObject(copnpc);
        removeObject(chair);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
        WorldName worldname = new WorldName();
        worldname.setImage("NameSecurityHQ.png");
        addObject(worldname, 500, 300);
    }

    public void prepare2()
    {
        Door17 door17 = new Door17();
        addObject(door17, 0, 600);
        Desk desk = new Desk();
        addObject(desk, 490, 112);
        desk.setLocation(488, 138);
        desk.setLocation(262, 140);
        Desk desk2 = new Desk();
        addObject(desk2, 622, 75);
        Desk desk3 = new Desk();
        addObject(desk3, 812, 80);
        desk3.setLocation(778, 75);
        desk3.setLocation(917, 40);
        desk2.setLocation(762, 40);
        desk2.setLocation(762, 49);
        desk3.setLocation(918, 49);
        removeObject(desk);
        Chair chair3 = new Chair();
        addObject(chair3, 279, 105);
        chair3.setLocation(277, 98);
        Desk1 desk13 = new Desk1();
        addObject(desk13, 269, 140);
        desk13.setLocation(273, 141);
        removeObject(desk13);
        CopNPC copnpc2 = new CopNPC();
        addObject(copnpc2, 278, 93);
        copnpc2.setLocation(283, 90);
        Desk1 desk14 = new Desk1();
        addObject(desk14, 282, 143);
        desk14.setLocation(280, 137);
        desk14.setLocation(282, 139);
        if(State.hallway3[0] == true){
            Enemy enemy = new Enemy(0);
            addObject(enemy, 193, 293);
        }
        if(State.hallway3[1] == true){
            Enemy enemy2 = new Enemy(1);
            addObject(enemy2, 312, 262);
        }
        if(State.hallway3[2] == true){
            Enemy enemy3 = new Enemy(2);
            addObject(enemy3, 396, 381);
        }
        if(State.hallway3[3] == true){
            Enemy enemy4 = new Enemy(3);
            addObject(enemy4, 521, 297);
        }
        if(State.hallway3[4] == true){
            Enemy enemy5 = new Enemy(4);
            addObject(enemy5, 416, 200);
        }
        if(State.hallway3[5] == true){
            Enemy enemy6 = new Enemy(5);
            addObject(enemy6, 516, 135);
        }
        if(State.hallway3[6] == true){
            Enemy enemy7 = new Enemy(6);
            addObject(enemy7, 680, 239);
        }
        if(State.hallway3[7] == true){
            Enemy enemy8 = new Enemy(7);
            addObject(enemy8, 701, 356);
        }
        if(State.hallway3[8] == true){
            Enemy enemy9 = new Enemy(8);
            addObject(enemy9, 866, 369);
        }
        if(State.hallway3[9] == true){
            Enemy enemy10 = new Enemy(9);
            addObject(enemy10, 826, 205);
        }
        if(State.hallway3[10] == true){
            Enemy enemy11 = new Enemy(10);
            addObject(enemy11, 800, 503);
        }
        if(State.hallway3[11] == true){
            Enemy enemy12 = new Enemy(11);
            addObject(enemy12, 603, 481);
        }
        if(State.hallway3[12] == true){
            Enemy enemy13 = new Enemy(12);
            addObject(enemy13, 477, 500);
        }
        if(State.hallway3[13] == true){
            Enemy enemy14 = new Enemy(13);
            addObject(enemy14, 297, 501);
        }
        if(State.hallway3[14] == true){
            Enemy enemy15 = new Enemy(14);
            addObject(enemy15, 223, 459);
        }
        if(State.hallway3[15] == true){
            Enemy enemy16 = new Enemy(15);
            addObject(enemy16, 90, 398);
        }
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
        //WorldName worldname = new WorldName(WorldName.worldNames[6]);
        //addObject(worldname, 500, 17);
    }
}
