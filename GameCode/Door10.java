import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door10 extends Door
{
    /**
     * Act - do whatever the Door10 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {
           LevelOne levelOne = new LevelOne(840, 312);
           Greenfoot.setWorld(levelOne);
        }
    }    
}
