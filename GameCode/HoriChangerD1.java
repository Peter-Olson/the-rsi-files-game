import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HoriChangerD1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HoriChangerD1 extends InvisibleChangerHorizontal
{
    /**
     * Act - do whatever the HoriChangerD1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {  
           ParkingLot2 parkingLot2 = new ParkingLot2();
            Greenfoot.setWorld(parkingLot2);
        }
    }    
}
