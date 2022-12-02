import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HoriChangerU2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HoriChangerU2 extends InvisibleChangerHorizontal
{
    /**
     * Act - do whatever the HoriChangerU2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {  
           ParkingLotStart parkingLotStart = new ParkingLotStart(500, 500);
            Greenfoot.setWorld(parkingLotStart);
        }
    }    
}
