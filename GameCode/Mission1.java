import greenfoot.*; 
import java.awt.Color; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mission1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mission1 extends Dialogue
{
    String[] text = {"Ever since you were fired,\n the R.S.I. has been keeping tabs on you.",
            "It would probably be best if you get rid of them.",
            "They are locked up two rooms from here."};
    int i = 0;
    
    public Mission1()
    {
        setImage(new GreenfootImage("Hey, it's you! I never thought\n I would see you around here!", 25, Color.BLACK, null));
    }
    /**
     * Act - do whatever the Mission1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        greenfoot.MouseInfo mouse = Greenfoot.getMouseInfo();
        if (Greenfoot.mouseClicked(this) || Greenfoot.mouseClicked(null))
        {
            if (mouse.getButton() == 3 || mouse.getButton() == 2)
            {
                setImage(new GreenfootImage(text[i], 25, Color.BLACK, null));
                i++;
                if (i == text.length)
                {
                    i--;
                }
            }
        }
    }    
}
