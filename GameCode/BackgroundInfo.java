import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackgroundInfo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackgroundInfo extends World
{

    /**
     * Constructor for objects of class BackgroundInfo.
     * 
     */
    public BackgroundInfo()
    {    
        super(1000, 600, 1); 
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            ParkingLotStart parkingLotStartScreen = new ParkingLotStart();
            Greenfoot.setWorld(parkingLotStartScreen);
        }
    }
}
