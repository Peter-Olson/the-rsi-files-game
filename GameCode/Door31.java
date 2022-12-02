import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door31 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door31 extends Door
{
    /**
     * Act - do whatever the Door31 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {
           AlarmFloor alarmfloor = new AlarmFloor(600, 550);
           Greenfoot.setWorld(alarmfloor);
        }
    }    
}
