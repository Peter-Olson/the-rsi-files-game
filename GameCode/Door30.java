import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door30 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door30 extends Door
{
    /**
     * Act - do whatever the Door30 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {
            Janitor1 janitor1 = (Janitor1) getWorld();
            janitor1.lazerHum.stop();
            Lvl2OfficesLast lvl2officeslast = new Lvl2OfficesLast(149,289);
            Greenfoot.setWorld(lvl2officeslast);
        }
    }    
}
