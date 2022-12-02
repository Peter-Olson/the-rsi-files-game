import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BG3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BG3 extends World
{

    /**
     * Constructor for objects of class BG3.
     * 
     */
    public BG3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
    }

    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            BG4 bg4 = new BG4();
            Greenfoot.setWorld(bg4);
        }
    }
}
