import greenfoot.*;
import java.awt.Color;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MissionChoice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MissionChoice extends Actor
{
    /**
     * Act - do whatever the missionChoice wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public MissionChoice()
    {
        setImage(new GreenfootImage("Click this if you accept this mission: Accept only right now", 18,
                                    Color.WHITE, Color.BLACK));
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
           setImage(new GreenfootImage("Ok crazy man", 18, Color.WHITE, Color.BLACK));
        }
    }
}