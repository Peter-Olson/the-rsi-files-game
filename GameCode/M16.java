import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class M16 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class M16 extends Weapon
{
    private int index;
    /**
     * Act - do whatever the M16 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public M16(int i){
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
