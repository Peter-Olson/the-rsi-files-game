import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door18 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door18 extends Door
{
    /**
     * Act - do whatever the Door18 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {
           Hallway hallway = new Hallway(100, 500);
           Greenfoot.setWorld(hallway);
        }
    }    
}
