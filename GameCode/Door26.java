import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door26 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door26 extends Door
{
    /**
     * Act - do whatever the Door26 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {
           Lvl2Offices2 lvl2Offices2 = new Lvl2Offices2(648,77);
           Greenfoot.setWorld(lvl2Offices2);
        }
    }    
}
