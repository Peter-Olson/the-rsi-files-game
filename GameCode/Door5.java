import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door5 extends Door
{
    /**
     * Act - do whatever the Door5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if (getOneIntersectingObject(Character.class) != null)
        {
            LevelTwoStart levelTwoStart = new LevelTwoStart();
            Greenfoot.setWorld(levelTwoStart);
        }
    }    
}
