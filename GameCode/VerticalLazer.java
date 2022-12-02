import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VerticalLazer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VerticalLazer extends Lazers
{
    /**
     * Act - do whatever the VerticalLazer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int burnTimer = 0;
    public void act() 
    {
        burnTimer++;
        ouchLazerHot();
       
    }    
    private void ouchLazerHot()
    {
         Actor lazer = getOneIntersectingObject(Character.class);
        if(lazer != null && burnTimer >= 35)
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
