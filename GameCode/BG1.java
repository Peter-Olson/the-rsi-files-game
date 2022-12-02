import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BG1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BG1 extends World
{

    /**
     * Constructor for objects of class BG1.
     * 
     */
    public BG1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
    }

    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            BG2 bg2 = new BG2();
            Greenfoot.setWorld(bg2);
        }
    }
}
