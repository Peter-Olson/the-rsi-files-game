import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BG4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BG4 extends World
{

    /**
     * Constructor for objects of class BG4.
     * 
     */
    public BG4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
    }

    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            ParkingLotStart parkingLotStart = new ParkingLotStart();
            Greenfoot.setWorld(parkingLotStart);
        }
    }
}
