import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Reticle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reticle extends Actor
{
    /**
     * Act - do whatever the Reticle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        followMouse();
    }    

    private void followMouse()
    {
        MouseInfo mi = Greenfoot.getMouseInfo();
        //Check for null in case the mouse is off screen
        if(mi != null) setLocation(mi.getX(), mi.getY());
    }    
}
