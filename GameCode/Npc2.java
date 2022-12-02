import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.awt.Color;
/**
 * Write a description of class Npc2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Npc2 extends Actor
{
    NPCChatBubbleL npcChatBubbleL = new NPCChatBubbleL();
    private int doOnce = 0;
    /**
     * Act - do whatever the Npc2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    TestTalk2 testTalk2 = new TestTalk2();
    private int messageCount = 0;
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
            if (messageCount == 0)
            {
                getWorld().addObject(testTalk2,650,240);
                messageCount++;
                talk();
            }
        }
        if (character.size() == 0)
        {
            messageCount = 0;
            getWorld().removeObject(testTalk2);
        }
    }
}
