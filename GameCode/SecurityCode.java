import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SecurityCode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SecurityCode extends BackgroundObject
{
    private int index;
    /**
     * Act - do whatever the SecurityCode wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public SecurityCode(int i){
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
