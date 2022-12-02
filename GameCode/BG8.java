import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BG8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BG8 extends World
{
    public static int killCount;
    /**
     * Constructor for objects of class BG8.
     * 
     */
    public BG8()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Winning winning = new Winning(killCount);
            Greenfoot.setWorld(winning);
        }
    }
}
