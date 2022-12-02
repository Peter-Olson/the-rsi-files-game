import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crate extends StillObject
{
    private int index;
    private HealthPackBg healthPackBg = new HealthPackBg(this.getIndex());
    private PistolAmmo pistolAmmo = new PistolAmmo(this.getIndex());
    private Grenade grenade = new Grenade(this.getIndex());
    private Knife knife = new Knife(this.getIndex());
    /**
     * Act - do whatever the Crate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Crate(int i){
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
        if(itemNumber < 10)
        {
            getWorld().addObject(grenade, getX(), getY());
        }
        else if(10 <= itemNumber && itemNumber <= 20)
        {
            getWorld().addObject(knife, getX(), getY());
        }
        else if(21 <= itemNumber && itemNumber <= 30)
        {
            getWorld().addObject(healthPackBg, getX(), getY());
        }
        else if(31 <= itemNumber && itemNumber <= 70)
        {
            getWorld().addObject(pistolAmmo, getX(), getY());
        }else{
            
        }
        BrokenCrate brokenCrate = new BrokenCrate();
        getWorld().addObject(brokenCrate, getX(), getY());
        if(State.worldNumber == 1){
            State.parkingLotStart[this.getIndex()] = false;
        }
        if(State.worldNumber == 2){
            State.parkingLot2[this.getIndex()] = false;
        }
        if(State.worldNumber == 3){
            State.parkingLot3[this.getIndex()] = false;
        }
        if(State.worldNumber == 4){
            State.parkingLot[this.getIndex()] = false;
        }
        if(State.worldNumber == 9){
            State.level2Security2[this.getIndex()] = false;
        }
        if(State.worldNumber == 13){
            State.hallway1[this.getIndex()] = false;
        }
        if(State.worldNumber == 23){
            State.janitor2[this.getIndex()] = false;
        }
        getWorld().removeObject(this);
    }
    
    public int getIndex(){
        return index;
    }
}
