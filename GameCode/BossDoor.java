import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.awt.Color;
/**
 * Write a description of class BossDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossDoor extends Door
{
    /**
     * Act - do whatever the BossDoor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int messageCount = 0;
    public void act() 
    {
       doorIsLocked();
       if(getOneIntersectingObject(Character.class) != null)
        {
            if(JanitorKey.isBossOpen == true)
            {
                ElevatorRoom elevatorRoom = new ElevatorRoom();
                Greenfoot.setWorld(elevatorRoom);
            }
        }
    } 
    public void doorIsLocked()
    {
        if(JanitorKey.isBossOpen == false)
        {
            talk();
        }
    }
               
    public void talk()
    {
        BossIsLocked bossIsLocked = new BossIsLocked();
        List<Character> character = getObjectsInRange(150, Character.class);
        if ( character.size() > 0)
        {            
            if (messageCount == 0)
            {                
                getWorld().addObject(bossIsLocked,272,340);
                messageCount++;
                talk();
            }
        }
        if (character.size() == 0)
        {
            messageCount = 0;
            getWorld().removeObject(bossIsLocked);
        }
    }  
}
        
    

