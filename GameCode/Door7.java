import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door7 extends Door
{
    /**
     * Act - do whatever the Door7 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {
           LevelTwo levelTwo = new LevelTwo();
            Greenfoot.setWorld(levelTwo);
        }
    }    
}
