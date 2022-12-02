import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door13 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door13 extends Door
{
    /**
     * Act - do whatever the Door13 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {
           Hallway3 hallway3 = new Hallway3(64, 438);
           Greenfoot.setWorld(hallway3);
        }
    }    
}
