import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl2OfficesLast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl2OfficesLast extends World
{
    public GreenfootSound lazerHum = new GreenfootSound("lazer_hum.mp3");
    /**
     * Constructor for objects of class Lvl2OfficesLast.
     * 
     */
     public Lvl2OfficesLast(int x, int y)
    {
        super (1000, 600, 1);
        prepare2();
        Character character = new Character();
        addObject(character, x, y);
        State.worldNumber = 12;
    }
    
    /*public Lvl2OfficesLast(boolean lazersOn)
    {
    super(1000, 600, 1);
    if(lazersOn == false)
    {
    prepare2();
    }
    }*/
    public Lvl2OfficesLast()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        if(Lazers.areLazersOn == true)
        {
            prepare();
            lazerHum.playLoop();
            State.worldNumber = 12;
        }
        if(Lazers.areLazersOn == false)
        {
            prepare2();
            Character character = new Character();
            addObject(character, 493, 447);
            State.worldNumber = 12;
        }
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare2()
    {
        if(State.level2OfficesLast[1] == true){
            PistolAmmo pAmmo1 = new PistolAmmo(1);
            addObject(pAmmo1, 100, 100);
        }
        if(State.level2OfficesLast[2] == true){
            PistolAmmo pAmmo2 = new PistolAmmo(2);
            addObject(pAmmo2, 900, 100);
        }
        if(State.level2OfficesLast[3] == true){
            PistolAmmo pAmmo3 = new PistolAmmo(3);
            addObject(pAmmo3, 350, 300);
        }
        if(State.level2OfficesLast[4] == true){
            PistolAmmo pAmmo4 = new PistolAmmo(4);
            addObject(pAmmo4, 700, 300);
        }
        if(State.level2OfficesLast[5] == true){
            HealthPackBg hp1 = new HealthPackBg(5);
            addObject(hp1, 200, 200);
        }
        if(State.level2OfficesLast[6] == true){
            HealthPackBg hp2 = new HealthPackBg(6);
            addObject(hp2, 800, 200);
        }
        if(State.level2OfficesLast[7] == true){
            HealthPackBg hp3 = new HealthPackBg(7);
            addObject(hp3, 500, 400);
        }
        Door24 door24 = new Door24();
        addObject(door24, 491, 582);
        Safe safe = new Safe();
        addObject(safe, 502, 61);
        Door29 door29 = new Door29();
        addObject(door29, 43, 301);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
        //WorldName worldname = new WorldName(WorldName.worldNames[15]);
        //addObject(worldname, 500, 17);
    }

    private void prepare()
    {
        if(State.level2OfficesLast[1] == true){
            PistolAmmo pAmmo1 = new PistolAmmo(1);
            addObject(pAmmo1, 100, 100);
        }
        if(State.level2OfficesLast[2] == true){
            PistolAmmo pAmmo2 = new PistolAmmo(2);
            addObject(pAmmo2, 900, 100);
        }
        if(State.level2OfficesLast[3] == true){
            PistolAmmo pAmmo3 = new PistolAmmo(3);
            addObject(pAmmo3, 350, 300);
        }
        if(State.level2OfficesLast[4] == true){
            PistolAmmo pAmmo4 = new PistolAmmo(4);
            addObject(pAmmo4, 700, 300);
        }
        if(State.level2OfficesLast[5] == true){
            HealthPackBg hp1 = new HealthPackBg(5);
            addObject(hp1, 200, 200);
        }
        if(State.level2OfficesLast[6] == true){
            HealthPackBg hp2 = new HealthPackBg(6);
            addObject(hp2, 800, 200);
        }
        if(State.level2OfficesLast[7] == true){
            HealthPackBg hp3 = new HealthPackBg(7);
            addObject(hp3, 500, 400);
        }
        Door24 door24 = new Door24();
        addObject(door24, 491, 582);
        Safe safe = new Safe();
        addObject(safe, 502, 61);
        VerticalLazer verticallazer = new VerticalLazer();
        addObject(verticallazer, 581, 297);
        VerticalLazer verticallazer2 = new VerticalLazer();
        addObject(verticallazer2, 408, 298);
        HoriLazer horilazer2 = new HoriLazer();
        addObject(horilazer2, 496, 321);
        HoriLazer horilazer3 = new HoriLazer();
        addObject(horilazer3, 496, 261);
        HoriLazer horilazer4 = new HoriLazer();
        addObject(horilazer4, 495, 200);
        HoriLazer horilazer5 = new HoriLazer();
        addObject(horilazer5, 495, 129);
        VerticalLazer verticallazer3 = new VerticalLazer();
        addObject(verticallazer3, 647, 297);
        VerticalLazer verticallazer4 = new VerticalLazer();
        addObject(verticallazer4, 717, 296);
        VerticalLazer verticallazer5 = new VerticalLazer();
        addObject(verticallazer5, 788, 296);
        VerticalLazer verticallazer6 = new VerticalLazer();
        addObject(verticallazer6, 859, 296);
        VerticalLazer verticallazer7 = new VerticalLazer();
        addObject(verticallazer7, 942, 294);
        VerticalLazer verticallazer8 = new VerticalLazer();
        addObject(verticallazer8, 343, 296);
        VerticalLazer verticallazer9 = new VerticalLazer();
        addObject(verticallazer9, 278, 295);
        VerticalLazer verticallazer10 = new VerticalLazer();
        addObject(verticallazer10, 214, 295);
        VerticalLazer verticallazer11 = new VerticalLazer();
        addObject(verticallazer11, 149, 294);
        VerticalLazer verticallazer12 = new VerticalLazer();
        addObject(verticallazer12, 74, 294);
        Door29 door29 = new Door29();
        addObject(door29, 43, 301);
        Character character = new Character();
        addObject(character, 493, 447);
        AmmoBar ammoBar = new AmmoBar();
        addObject(ammoBar, 895, 568);
        InventoryBar inventory = new InventoryBar();
        addObject(inventory, 450, 550);
        //WorldName worldname = new WorldName(WorldName.worldNames[15]);
        //addObject(worldname, 500, 17);
    }
}
