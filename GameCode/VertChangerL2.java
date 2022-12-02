import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VertChangerL2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VertChangerL2 extends InvisibleChangerVert
{
    /**
     * Act - do whatever the VertChangerL2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if (getOneIntersectingObject(Character.class) != null)
        {  
           ParkingLot2 parkingLot2 = new ParkingLot2(900, 300);
            Greenfoot.setWorld(parkingLot2);
        }
    }    
}
