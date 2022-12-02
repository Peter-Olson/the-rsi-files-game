import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door19 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door19 extends Door
{
    /**
     * Act - do whatever the Door19 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {
           Lvl2Offices lvl2Offices = new Lvl2Offices();
           Greenfoot.setWorld(lvl2Offices);
        }
    }    
}
