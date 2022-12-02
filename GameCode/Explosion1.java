import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion1 extends Explosion
{
    private int switchCounter = 3;
    Explosion2 explosion2 = new Explosion2();
    private int doOnce = 0;
    /**
     * Act - do whatever the Explosion1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(switchCounter > 0){
                switchCounter--;
        }else{
            switchCounter = 3;
            if (doOnce == 0){
                Greenfoot.playSound("grenade.wav");
                doOnce++;
            }
            getWorld().addObject(explosion2, this.getX(), this.getY());
            getWorld().removeObject(this);
        }
    }    
}
