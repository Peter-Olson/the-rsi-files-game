import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VertChangerR3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VertChangerR3 extends InvisibleChangerVert
{
    /**
     * Act - do whatever the VertChangerR3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {  
           ParkingLot parkingLot = new ParkingLot();
            Greenfoot.setWorld(parkingLot);
        }
    }    
}
