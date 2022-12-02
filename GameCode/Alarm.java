import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Alarm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alarm extends BackgroundObject
{
    AlarmDialogue alarmdialogue = new AlarmDialogue();
    private int mCount = 0;
    public static GreenfootSound siren = new GreenfootSound("Siren.wav");
    private int switchTimer = 0;
    private int counter = 1;
    FlashyAlarm flashyalarm = new FlashyAlarm();
    /**
     * Act - do whatever the Alarm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        alarmOption();
        if (alarmdialogue.alarmDoOnce == true)
        {
            alarmRed();
            siren.playLoop();
        }
    }  

    public void alarmOption()
    {
        List<Character> character = getObjectsInRange(150, Character.class);
        if (character.size() > 0)
        {
            if (mCount == 0)
            {
                if (alarmdialogue.alarmDoOnce == true)
                {}
                else
                {
                    getWorld().addObject(alarmdialogue, 500, 50);
                    alarmdialogue.setImage(alarmdialogue.alarm);
                    mCount++;
                    alarmOption();
                }
            }
        }
        if (character.size() == 0)
        {
            mCount = 0;
            alarmdialogue.setImage(new GreenfootImage("", 25, null, null));
        }
    }   
    public void alarmRed()
    {
        if (switchTimer > 0)
        {
            switchTimer--;
        }
        else if (counter == 1)
        {
            getWorld().addObject(flashyalarm, 500, 300);
            flashyalarm.setImage("alarm1.png");
            counter++;
            switchTimer = 3;
        }
        else if (counter == 2)
        {
            flashyalarm.setImage("alarm2.png");
            counter++;
            switchTimer = 3;
        }
        else if (counter == 3)
        {
            flashyalarm.setImage("alarm3.png");
            counter = 1;
            switchTimer = 3;
        }
        else{}
    } 
}
