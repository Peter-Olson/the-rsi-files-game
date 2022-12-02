import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door32 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door32 extends Door
{
    /**
     * Act - do whatever the Door32 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {
           Hallway2 hallway2 = new Hallway2(500, 150);
           Greenfoot.setWorld(hallway2);
        }
    }    
}
