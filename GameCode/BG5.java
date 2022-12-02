import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BG5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BG5 extends World
{

    /**
     * Constructor for objects of class BG5.
     * 
     */
    public BG5()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            BG6 bg6 = new BG6();
            Greenfoot.setWorld(bg6);
        }
    }
}
