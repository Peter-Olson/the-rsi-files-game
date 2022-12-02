import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class WorldName here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldName extends Dialogue
{
    /*public static String[] worldNames = {"Outer Parking Lot", "Parking Lot", "Inner Parking Lot", "RSI Entrance", "RSI Lobby", "Hallway", "RSI Security Headquarters", "The Path To The Alarm", "Alarm Room",
    "Secret Hallway", "Secret Exit", "RSI Appointment Office", "Work Place", "Printing Office", "The Back Room", "Safe Room", "Control Room Entrance", "Control Room", "BOSS BATTLE: Janitor\n Stage 1",
    "BOSS BATTLE: Janitor\n Stage 2"};*/
    private int timer = 0;
    /**
     * Act - do whatever the WorldNames wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        timer++;
        if (timer > 100)
        {
            getWorld().removeObject(this);
        }
    }      
}
