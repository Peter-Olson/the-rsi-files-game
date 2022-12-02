import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Grenade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grenade extends Weapon
{
    private int index;
    /**
     * Act - do whatever the Grenade wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Grenade(int i){
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
