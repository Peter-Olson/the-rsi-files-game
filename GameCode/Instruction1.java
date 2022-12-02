import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Instruction1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instruction1 extends Dialogue
{
    /**
     * Act - do whatever the Instruction1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Instruction1()
    {
        setImage(new GreenfootImage("Use WASD to move", 30, Color.BLACK, null));
    }
    public void act() 
    {
       if(Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("d"))
        {
            setImage(new GreenfootImage("You can pick up items by walking into them. \n Your inventory is on the bottom of the screen", 27, Color.BLACK, null));
        }
    }    
}
