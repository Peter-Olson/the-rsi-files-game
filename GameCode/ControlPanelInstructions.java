import greenfoot.*; 
import java.awt.Color; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ControlPanelInstructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlPanelInstructions extends Dialogue
{
    /**
     * Act - do whatever the ControlPanelInstructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ControlPanelInstructions()
    {
        setImage(new GreenfootImage("To disable Safe Room lazer field, press [B].", 25, Color.BLACK, null));
    }
    public void act() 
    {
        if(Greenfoot.isKeyDown("b"))
        {
            setImage(new GreenfootImage("Safe Room lazers disabled.", 25, Color.BLACK, null));
            Lazers.areLazersOn = false;
        }
    }    
}
