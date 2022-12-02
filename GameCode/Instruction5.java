import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Instruction5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instruction5 extends Dialogue
{
    /**
     * Act - do whatever the Instruction5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Instruction5()
    {
        setImage(new GreenfootImage("Press the number above each item in your \n inventory to equip that item", 30, Color.BLACK, null));
    }
    public void act() 
    {
       if(Greenfoot.isKeyDown("1") || Greenfoot.isKeyDown("2") || Greenfoot.isKeyDown("3") || Greenfoot.isKeyDown("4"))
        {
            setImage(new GreenfootImage("Use your equipment wisely!", 27, Color.BLACK, null));
        }
    }   
}
