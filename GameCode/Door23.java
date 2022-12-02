import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door23 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door23 extends Door
{
    /**
     * Act - do whatever the Door23 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {
           Lvl2OfficesLast lvl2OfficesLast = new Lvl2OfficesLast();
           Greenfoot.setWorld(lvl2OfficesLast);
        }
    }    
}
