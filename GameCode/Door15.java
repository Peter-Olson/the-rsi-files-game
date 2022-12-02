import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door15 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door15 extends Door
{
    /**
     * Act - do whatever the Door15 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {
           Hallway hallway = new Hallway(100, 100);
           Greenfoot.setWorld(hallway);
        }
    }    
}
