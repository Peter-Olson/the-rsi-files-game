import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BG7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BG7 extends World
{

    /**
     * Constructor for objects of class BG7.
     * 
     */
    public BG7()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            BG8 bg8 = new BG8();
            Greenfoot.setWorld(bg8);
        }
    }
}
