import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpecialCrate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpecialCrate extends StillObject
{
    private int index;
    private SecurityCode securityCode = new SecurityCode(this.getIndex());
    /**
     * Act - do whatever the SpecialCrate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public SpecialCrate(int i){
        this.index = i;
    }
    
    public void act() 
    {
        // Add your action code here.
    }
    
    public void breakCrate()
    {
        int itemNumber = Greenfoot.getRandomNumber(100);
        Greenfoot.playSound("barrel_break.wav");
        if(itemNumber < 101)
        {
            if(State.worldNumber == 1){
                getWorld().addObject(securityCode, getX(), getY());
            }
        }
        BrokenCrate brokenCrate = new BrokenCrate();
        getWorld().addObject(brokenCrate, getX(), getY());
        if(State.worldNumber == 1){
            State.parkingLotStart[this.getIndex()] = false;
        }
        getWorld().removeObject(this);
    }
    
    public int getIndex(){
        return index;
    }  
}
