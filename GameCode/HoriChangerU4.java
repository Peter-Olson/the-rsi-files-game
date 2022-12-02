import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HoriChangerU4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HoriChangerU4 extends InvisibleChangerHorizontal
{
    /**
     * Act - do whatever the HoriChangerU4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {  
           AlarmFloor alarmfloor = new AlarmFloor(400, 450);
           Greenfoot.setWorld(alarmfloor);
        }
    }    
}
