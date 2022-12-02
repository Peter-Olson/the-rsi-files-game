import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SmlMovingVertLazer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SmlMovingVertLazer extends VerticalLazer
{
    /**
     * Act - do whatever the SmlMovingVertLazer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public SmlMovingVertLazer(int lazerSpeed)
    {
        setSpeed(lazerSpeed);
    }
    private int speed;
    private int burnTimer = 0;
    public void act() 
    {
        burnTimer++;
        ouchLazerHot();
        move(speed);
          if(this.getX() <= 100)
          {
              speed = -speed;
          }
          if(this.getX() >= 400)
          {
              speed = -speed;
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
