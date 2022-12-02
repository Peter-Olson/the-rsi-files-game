import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CopExplosion4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CopExplosion4 extends CopExplosion
{
    private int switchCounter = 3;
    CopExplosion5 copExplosion5 = new CopExplosion5();
    /**
     * Act - do whatever the CopExplosion1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(switchCounter > 0){
                switchCounter--;
        }else{
            switchCounter = 3;
            getWorld().addObject(copExplosion5, this.getX(), this.getY());
            getWorld().removeObject(this);
        }
    }    
}
