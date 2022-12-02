import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SmlMovingHoriLazer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SmlMovingHoriLazer extends HoriLazer
{
    /**
     * Act - do whatever the SmlMovingHoriLazer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public SmlMovingHoriLazer(int lazerSpeed)
    {
        setSpeed(lazerSpeed);
    }
    private int speed;
    private int burnTimer = 0;
    public void act() 
    {
        burnTimer++;
        ouchLazerHot();        
        setLocation(this.getX(), this.getY() + speed);
      if(this.getY() >= 300)
      {
        speed = -speed;     
      }
      if(this.getY() <= 100)
      {
        speed = speed;  
      }
    }  
    public void setSpeed(int movingSpeed)
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
