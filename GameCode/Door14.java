import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door14 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door14 extends Door
{
    /**
     * Act - do whatever the Door14 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {
           Hallway4 hallway4 = new Hallway4(500, 150);
           Greenfoot.setWorld(hallway4);
        }
    }    
}
