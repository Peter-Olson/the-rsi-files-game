import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VertChangerR1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VertChangerR1 extends InvisibleChangerVert
{
    /**
     * Act - do whatever the VertChangerR1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {  
           ParkingLot3 parkingLot3 = new ParkingLot3();
            Greenfoot.setWorld(parkingLot3);
        }
    }    
}
