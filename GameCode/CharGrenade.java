import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CharGrenade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharGrenade extends GrenadeTh
{
    private int counter = 0;
    private int grenadeSpeed = 8;
    private Character gunMan;
    MouseInfo mouse = Greenfoot.getMouseInfo();
    private boolean youShallNotPass = false;
    private int grenadeX;
    private int grenadeY;
    ExplosionRadius explosionRadius = new ExplosionRadius();
    Explosion1 explosion1 = new Explosion1();
    /**
     * Act - do whatever the CharGrenade wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public CharGrenade(Character gunMan){
        this.gunMan = gunMan;
    }
    
    public void act() 
    {
        turn();
        fall();
        explode();
        if(youShallNotPass == false){
            move(grenadeSpeed);
            offScreen();
        }
    }
    
    public void explode(){
        if(explode == "explode"){
            grenadeX = this.getX();
            grenadeY = this.getY();
            getWorld().addObject(explosionRadius, grenadeX, grenadeY);
            getWorld().addObject(explosion1, grenadeX, grenadeY);
            //getWorld().addObject(explosion2, grenadeX, grenadeY);
            //getWorld().addObject(explosion3, grenadeX, grenadeY);
            getWorld().removeObject(this);
            youShallNotPass = true;
        }
    }
    
    public void turn(){
        if(counter == 0){
            this.turnTowards(mouse.getX(), mouse.getY());
            counter++;
        }else{
            counter = 1;
        }
    }
}
