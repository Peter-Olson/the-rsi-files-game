import greenfoot.*;
import java.util.List;
import java.awt.Color;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ControlPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlPanel extends BackgroundObject
{
    /**
     * Act - do whatever the ControlPanel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    ControlPanelInstructions controlPanelInstructions = new ControlPanelInstructions();
    private int messageCount = 0;
    public void act() 
    {
        instruction();
    }    
    public void instruction()
    {
        List<Character> character = getObjectsInRange(100, Character.class);
        if ( character.size() > 0)
        {
            if (messageCount == 0)
            {
                getWorld().addObject(controlPanelInstructions,650,240);
                messageCount++;
                instruction();
            }
        }
        if (character.size() == 0)
        {
            messageCount = 0;
            getWorld().removeObject(controlPanelInstructions);
        }
    }
}
