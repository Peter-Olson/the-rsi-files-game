import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MovingVertLazer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovingVertLazer extends VerticalLazer
{
    /**
     * Act - do whatever the MovingVertLazer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public MovingVertLazer(int lazerSpeed)
   {
       setSpeed(lazerSpeed);
   }
   private int speed;
   private int burnTimer = 0;
   public void act() 
    {
        burnTimer++;
        ouchLazerHot();
        //lazerHum();
        move(speed);
          if(this.getX() <= 100)
          {
              speed = -speed;
          }
          if(this.getX() >= 760)
          {
              speed = -speed;
          }
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
    public void setSpeed(int movingSpeed)
    {
        speed = movingSpeed;
    }
    
}
