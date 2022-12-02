import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door29 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door34 extends Door
{
    /**
     * Act - do whatever the Door29 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if (getOneIntersectingObject(Character.class) != null)
        {
           Janitor1 janitor1 = (Janitor1) getWorld();
           janitor1.lazerHum.stop();
           Janitor2 Janitor2 = new Janitor2();
           Greenfoot.setWorld(Janitor2);
        }
    }    
}
