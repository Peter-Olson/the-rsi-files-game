import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JanitorBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JanitorBullet extends Bullet
{
    private Janitor janitor;
    private int speed = 13;
    private int counter = 0;
    private int bulletX;
    private int bulletY;
    /**
     * Act - do whatever the JanitorBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public JanitorBullet(Janitor janitor){
        this.janitor = janitor;
    }
    
    public void act() 
    {
        move(speed);
        offScreen();
    }    
    
    public void turn(int x, int y){
        if(counter == 0){
            bulletX = x;
            bulletY = y;
            this.turnTowards(bulletX, bulletY);
            counter++;
        }else{
            counter = 1;
        }
    }
}
