import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door33 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door33 extends Door
{
    Alarm alarm = new Alarm();
    /**
     * Act - do whatever the Door33 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {
           SecretHallway secrethallway = new SecretHallway(500, 100);
           Greenfoot.setWorld(secrethallway);
           alarm.siren.stop();
        }
    }       
}
