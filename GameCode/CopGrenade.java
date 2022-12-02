import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CopGrenade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CopGrenade extends GrenadeTh
{
    private int grenadeSpeed = 8;
    /**
     * Act - do whatever the CopGrenade wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        fall();
        if(youShallNotPass == false){
            move(grenadeSpeed);
            offScreen();
        }
    }    
}
