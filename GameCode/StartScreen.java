import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{
    public GreenfootSound batmanMusic;
    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        batmanMusic = new GreenfootSound("batman.mp3");
        batmanMusic.playLoop();
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            BG1 bg1 = new BG1();
            Greenfoot.setWorld(bg1);
        }
        Character.ammo = 12;
        Lazers.areLazersOn = true;
    }
}
