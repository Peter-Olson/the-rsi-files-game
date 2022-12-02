import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class BossIsLocked here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossIsLocked extends Dialogue
{
    /**
     * Act - do whatever the BossIsLocked wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("This door is locked. \n Find the Janitor's keys.", 25, Color.BLACK, null));
    }
}
