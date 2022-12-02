import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VertChanger5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VertChanger5 extends InvisibleChangerVert
{
    /**
     * Act - do whatever the VertChanger5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {  
           Hallway hallway = new Hallway(150, 300);
           Greenfoot.setWorld(hallway);
        }
    }    
}
