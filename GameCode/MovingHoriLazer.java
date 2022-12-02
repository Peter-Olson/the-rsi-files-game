import greenfoot.*; 
import java.awt.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MovingHoriLazer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovingHoriLazer extends HoriLazer
{
    /**
     * Act - do whatever the MovingHoriLazer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed;
    private int burnTimer = 0;
    public MovingHoriLazer(int lazerSpeed)
    { 
        setSpeed(lazerSpeed);
    }
    public void act() 
    {
      burnTimer++;
      setLocation(this.getX(), this.getY() + speed);
      if(this.getY() >= 500)
      {
        speed = -speed;     
      }
      if(this.getY() <= 100)
      {
        speed = speed;  
      }
       ouchLazerHot();
    }   
    private void setSpeed(int movingSpeed)
    {
        speed = movingSpeed;
    }
    private void ouchLazerHot()
    {
        Actor lazer = getOneIntersectingObject(Character.class);
        if(lazer != null && burnTimer >= 10)
        {
            
                Character.totalHealth -= 1;
                if(Character.totalHealth == 0)
                {
                    GameOver gameOver = new GameOver(Character.killCount);
                    Greenfoot.setWorld(gameOver);
                }
                burnTimer = 0;
        }
    }
}
