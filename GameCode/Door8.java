import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door8 extends Door
{
    /**
     * Act - do whatever the Door8 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if (getOneIntersectingObject(Character.class) != null)
        {
           LevelTwoStart levelTwoStart = new LevelTwoStart(150,292);
            Greenfoot.setWorld(levelTwoStart);
        }
    }    
}
