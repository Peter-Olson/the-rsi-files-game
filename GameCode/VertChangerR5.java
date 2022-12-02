import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VertChangerR5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VertChangerR5 extends InvisibleChangerVert
{
    /**
     * Act - do whatever the VertChangerR5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {  
           Hallway hallway = new Hallway(107, 307);
           Greenfoot.setWorld(hallway);
        }
    }    
}
