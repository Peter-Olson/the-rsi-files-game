import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door28 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door28 extends Door
{
    /**
     * Act - do whatever the Door28 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {
           Lvl2Security lvl2Security = new Lvl2Security(114,60);
           Greenfoot.setWorld(lvl2Security);
        }
    }    
}
