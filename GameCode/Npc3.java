import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.awt.Color;
/**
 * Write a description of class Npc3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Npc3 extends Actor
{
    NPCChatBubbleL npcChatBubbleL = new NPCChatBubbleL();
    private int doOnce = 0;
    /**
     * Act - do whatever the Npc3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    TestTalk3 testTalk3 = new TestTalk3();
    private int messageCount = 0;
    private int justOnce = 0;
    HealthPackBg healthPackBg1;
    //private String[] message = new String[5];
    //private GreenfootImage text;
    public void act() 
    {
        talk();
    }    
    
    public void talk()
    {
        if(doOnce == 0){
            getWorld().addObject(npcChatBubbleL, this.getX() - 100, this.getY() - 100);
            doOnce = 1;
        }
        List<Character> character = getObjectsInRange(100, Character.class);
        if ( character.size() > 0)
        {
            if(justOnce == 0){
                getWorld().addObject(healthPackBg1, 500, 340);
                justOnce++;
            }
            if (messageCount == 0)
            {
                getWorld().addObject(testTalk3,500,340);
                
                messageCount++;
                talk();
            }
        }
        if (character.size() == 0)
        {
            messageCount = 0;
            getWorld().removeObject(testTalk3);
        }
    }
}
