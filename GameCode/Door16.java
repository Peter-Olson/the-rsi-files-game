import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door16 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door16 extends Door
{
    /**
     * Act - do whatever the Door16 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {
           Hallway hallway = new Hallway(850, 100);
           Greenfoot.setWorld(hallway);
        }
    }    
}
