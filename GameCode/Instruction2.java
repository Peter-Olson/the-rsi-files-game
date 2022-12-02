import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Instruction2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instruction2 extends Dialogue
{
    /**
     * Act - do whatever the Instruction2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Instruction2()
    {
        setImage(new GreenfootImage("Click to shoot. \n Crates break and drop items when you shoot them", 30, Color.BLACK, null));
    }

    public void act() 
    {
        if(Greenfoot.mouseClicked(null))
        {
            setImage(new GreenfootImage("Your ammo bar is in the bottom right corner. You have a limited amount", 27, Color.BLACK, null));
        }
    }    
}
