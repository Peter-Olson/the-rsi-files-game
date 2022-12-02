import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HoriChangerD3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HoriChangerD3 extends InvisibleChangerHorizontal
{
    /**
     * Act - do whatever the HoriChangerD3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {  
           SecretHallway2 secrethallway2 = new SecretHallway2(500, 100);
           Greenfoot.setWorld(secrethallway2);
        }
    }    
}
