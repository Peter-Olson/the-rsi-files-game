import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion3 extends Explosion
{
    private int switchCounter = 3;
    /**
     * Act - do whatever the Explosion3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(switchCounter > 0){
                switchCounter--;
        }else{
            switchCounter = 3;
            getWorld().removeObject(this);
        }
    }    
}
