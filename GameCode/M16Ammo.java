import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class M16_mag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class M16Ammo extends Actor
{
    private int index;
    /**
     * Act - do whatever the M16_mag wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public M16Ammo(int i){
        this.index = i;
    }
    
    public void act() 
    {
        
    }   
    
    public int getIndex(){
        return index;
    }
}
