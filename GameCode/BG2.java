import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BG2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BG2 extends World
{

    /**
     * Constructor for objects of class BG2.
     * 
     */
    public BG2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            BG3 bg3 = new BG3();
            Greenfoot.setWorld(bg3);
        }
    }
}

