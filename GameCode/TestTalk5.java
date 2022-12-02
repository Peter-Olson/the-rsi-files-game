import greenfoot.*;
import java.awt.Color;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TestTalk5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestTalk5 extends Dialogue
{
    /**
     * Act - do whatever the TestTalk5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public TestTalk5()
    {
        setImage(new GreenfootImage("Welcome to the R.S.I Offices. Do you have an appointment? (Y/N)", 30, Color.BLACK, null));
    }
    public void act() 
    {
        if(Greenfoot.isKeyDown("y"))
        {
           setImage(new GreenfootImage("Then please go on in!", 30, Color.BLACK, null));
        }
        if(Greenfoot.isKeyDown("n"))
        {
           setImage(new GreenfootImage("Please come back with an appointment", 30, Color.BLACK, null));
        }
    }    
}
