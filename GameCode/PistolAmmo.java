import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PistolAmmo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PistolAmmo extends Actor
{
    private int index;
    /**
     * Act - do whatever the PistolAmmo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PistolAmmo(int i){
        this.index = i;
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
    
    public int getIndex(){
        return index;
    }
}
