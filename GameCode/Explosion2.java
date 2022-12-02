import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion2 extends Explosion
{
    private int switchCounter = 3;
    Explosion3 explosion3 = new Explosion3();
    /**
     * Act - do whatever the Explosion2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(switchCounter > 0){
                switchCounter--;
        }else{
            switchCounter = 3;
            getWorld().addObject(explosion3, this.getX(), this.getY());
            getWorld().removeObject(this);
        }
    }    
}
