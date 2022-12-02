import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class TestTalk4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestTalk4 extends Dialogue
{
    String[] text = {"Oh you can't get in?", "Maybe you can find the Security Code \n somewhere around here"};
    private int i;
    /**
     * Act - do whatever the TestTalk4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public TestTalk4()
    {
        setImage(new GreenfootImage("Hey! Be careful if you are going inside there \n Right click near NPCs to talk to them", 30, Color.BLACK, null));
    }
    
    public void act(){
        greenfoot.MouseInfo mouse = Greenfoot.getMouseInfo();
        if (Greenfoot.mouseClicked(this) || Greenfoot.mouseClicked(null))
        {
            if (mouse.getButton() == 3 || mouse.getButton() == 2)
            {
                setImage(new GreenfootImage(text[i], 25, Color.BLACK, null));
                i++;
                if (i == text.length)
                {
                    i = text.length - 1;
                }
            }
        }
        if(Greenfoot.isKeyDown("P")){
            setImage(new GreenfootImage("I want your dick", 25, Color.BLACK, null));
        }
    }
}
