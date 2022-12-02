import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class HiddenWall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HiddenWall extends BackgroundObject
{
    private boolean isWallOpening = false;
    private int wallCounter = 0;
    private int wallCloser = 0;
    /**
     * Act - do whatever the HiddenWall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        revealTheEntrance();
        if (isWallOpening == true)
        {
            wallCounter++;
        }
        if (isWallOpening == false)
        {
            wallCloser++;
        }
    }    
    public void revealTheEntrance()
    {
        List<Character> character = getObjectsInRange(200, Character.class);
        if (character.size() > 0)
        {
            isWallOpening = true;
            if (wallCounter == 1)
            {
                this.setImage("hiddenwall1.png");
            }
            if (wallCounter == 10)
            {
                this.setImage("hiddenwall2.png");
            }
            if (wallCounter == 20)
            {
                this.setImage("hiddenwall3.png");
            }
            if (wallCounter == 30)
            {
                this.setImage("hiddenwall4.png");
            }
            if (wallCounter == 40)
            {
                this.setImage("hiddenwall5.png");
            }
            if (wallCounter == 50)
            {
                this.setImage("hiddenwall6.png");
            }
            if (wallCounter == 60)
            {
                this.setImage("hiddenwall7.png");
            }
            wallCloser = 0;
        }
        if (character.size() == 0)
        {
            wallCounter = 0;
            isWallOpening = false;
            if (wallCloser == 1)
            {
                this.setImage("hiddenwall6.png");
            }
            if (wallCloser == 10)
            {
                this.setImage("hiddenwall5.png");
            }
            if (wallCloser == 20)
            {
                this.setImage("hiddenwall4.png");
            }
            if (wallCloser == 30)
            {
                this.setImage("hiddenwall3.png");
            }
            if (wallCloser == 40)
            {
                this.setImage("hiddenwall2.png");
            }
            if (wallCloser == 50)
            {
                this.setImage("hiddenwall1.png");
            }
            if (wallCloser == 60)
            {
                this.setImage("hiddenwall.png");
            }
        }
    }
}
