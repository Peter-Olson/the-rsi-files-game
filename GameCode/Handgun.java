import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Handgun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Handgun extends Weapon
{
    private int index;
    /**
     * Act - do whatever the Handgun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Handgun(int i){
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
