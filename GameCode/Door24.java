import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door24 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door24 extends Door
{
    /**
     * Act - do whatever the Door24 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {
            Lvl2OfficesLast lvl2OfficesLast = (Lvl2OfficesLast) getWorld();
           lvl2OfficesLast.lazerHum.stop();
           Lvl2Offices2 lvl2Offices2 = new Lvl2Offices2(50, 220);
           Greenfoot.setWorld(lvl2Offices2);
        }
    }    
}
