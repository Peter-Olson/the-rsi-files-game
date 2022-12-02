import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door25 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door25 extends Door
{
    /**
     * Act - do whatever the Door25 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {
           Lvl2Security lvl2Security = new Lvl2Security();
           Greenfoot.setWorld(lvl2Security);
        }
    }    
}
