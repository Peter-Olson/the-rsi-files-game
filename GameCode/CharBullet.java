import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharBullet extends Bullet
{
    private Character gunMan;
    MouseInfo mouse = Greenfoot.getMouseInfo();
    private int counter = 0;
    private boolean youShallNotPass = false;
    private int speed = 13;
    public String deflected = "notDeflected";
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public CharBullet (Character gunMan)
    {
        this.gunMan = gunMan;
    }
    
    public void act() 
    {
        turn();
        move(speed);
        offScreen();
    }
    
    public void turn(){
        if(counter == 0){
            this.turnTowards(mouse.getX(), mouse.getY());
            counter++;
        }else{
            counter = 1;
        }
    }
    
    public void setDeflected(String deflect){
        deflected = deflect;
    }
    
    public String getDeflectedness(){
        return deflected;
    }
    
    public void setSpeed(int bulletSpeed){
        speed = bulletSpeed;
    }
}
