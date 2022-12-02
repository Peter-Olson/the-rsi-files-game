import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class M16Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class M16Text extends Dialogue
{
    public static String[] chat = {"So, you're trying to get revenge\n on the RSI too huh?",
        "They loaded me up with a pile of\n unfair debt and fired me...", "You know what? I'm going to\n help you out!", 
        "The security guards keep their big\n guns in the back of their headquarters", "And, on the north end of this\n hallway, there's an alarm",
        "Maybe you could find\n a way to distract the guards\n and get yourself a nice\n new weapon?"};
    private int i = 0;
    /**
     * Act - do whatever the M16Text wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public M16Text()
    {
        setImage(new GreenfootImage("Hey, I remember You!\n Come over here!", 25, Color.BLACK, null));
    }
    public void act() 
    {
        greenfoot.MouseInfo mouse = Greenfoot.getMouseInfo();
        if (Greenfoot.mouseClicked(this) || Greenfoot.mouseClicked(null))
        {
            if (mouse.getButton() == 3 || mouse.getButton() == 2)
            {
                setImage(new GreenfootImage(chat[i], 25, Color.BLACK, null));
                i++;
                if (i == chat.length)
                {
                    i--;
                }
            }
        }
    }   
}
