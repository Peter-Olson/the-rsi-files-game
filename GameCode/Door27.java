import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door27 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door27 extends Door
{
    /**
     * Act - do whatever the Door27 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {
           Lvl2Security lvl2Security = (Lvl2Security) getWorld();
           lvl2Security.lazerHum.stop();
           Lvl2Security2 lvl2Security2 = new Lvl2Security2();
           Greenfoot.setWorld(lvl2Security2);
        }
    }    
}
