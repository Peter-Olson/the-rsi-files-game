import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VertChangerL4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VertChangerL4 extends InvisibleChangerVert
{
    /**
     * Act - do whatever the VertChangerL4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {  
           ParkingLot3 parkingLot3 = new ParkingLot3(950, 300);
            Greenfoot.setWorld(parkingLot3);
        }
    }    
}
