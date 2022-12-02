import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door30 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door35 extends Door
{
    /**
     * Act - do whatever the Door30 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {
            Janitor1 Janitor1 = new Janitor1(149,289);
            Greenfoot.setWorld(Janitor1);
        }
    }    
}
