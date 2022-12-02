import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ParkingLotText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ParkingLotText extends LevelTitle
{
    private int switchCounter = 150;
    /**
     * Act - do whatever the ParkingLotText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(switchCounter > 0){
            switchCounter--;
        }else{
            getWorld().removeObject(this);
        }
    }    
}
