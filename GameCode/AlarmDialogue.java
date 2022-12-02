import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class AlarmDialogue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AlarmDialogue extends Dialogue
{
    public GreenfootImage alarm = new GreenfootImage("Set off the alarm? (Y/N)", 25, Color.BLACK, null);
    public static boolean alarmDoOnce = false;
    /**
     * Act - do whatever the AlarmDialogue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public AlarmDialogue()
    {
        setImage(alarm);
    }
    public void act() 
    {
        if (Greenfoot.isKeyDown("y"))
        {
            //isPressed = true;
            //siren.playLoop();
            setImage(new GreenfootImage("", 45, Color.RED, null));
            alarmDoOnce = true;   
        }
        if (Greenfoot.isKeyDown("n"))
        {
            setImage(new GreenfootImage("", 25, Color.BLACK, null));
        }
    }    
}
