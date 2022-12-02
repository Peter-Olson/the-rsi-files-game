import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HoriChanger6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HoriChanger6 extends InvisibleChangerHorizontal
{
    /**
     * Act - do whatever the HoriChanger6 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {  
           BG5 bg5 = new BG5();
           Greenfoot.setWorld(bg5);
        }
    }    
}
