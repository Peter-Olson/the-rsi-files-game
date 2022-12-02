import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CopExplosion1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CopExplosion1 extends CopExplosion
{
    private int switchCounter = 3;
    CopExplosion2 copExplosion2 = new CopExplosion2();
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
            getWorld().addObject(copExplosion2, this.getX(), this.getY());
            getWorld().removeObject(this);
        }
    }    
}
