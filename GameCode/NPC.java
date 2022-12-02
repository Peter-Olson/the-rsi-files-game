import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.awt.Color;
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NPC extends Actor
{
    /**
     * Act - do whatever the Test wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    TestTalk testTalk = new TestTalk();
    NPCChatBubbleR npcChatBubbleR = new NPCChatBubbleR();
    private int doOnce = 0;
    private int messageCount = 0;
    CopExplosion5 copExplosion5 = new CopExplosion5();
    NPC1Dead npc1Dead = new NPC1Dead();
    //private String[] message = new String[5];
    //private GreenfootImage text;
    public void act() 
    {
        talk();
        amIShot();
    }    
    
    public void amIShot(){
        if(getOneIntersectingObject(CharBullet.class) != null){
            getWorld().addObject(copExplosion5, this.getX(), this.getY());
            getWorld().addObject(npc1Dead, this.getX(), this.getY());  
            Greenfoot.playSound("knife_stab.mp3");
            getWorld().removeObject(this);
        }
    }
    
    public void talk()
    {
        if(doOnce == 0){
            getWorld().addObject(npcChatBubbleR, this.getX() - 75, this.getY() - 50);
            doOnce = 1;
        }
        List<Character> character = getObjectsInRange(100, Character.class);
        if ( character.size() > 0)
        {
            if (messageCount == 0)
            {
                getWorld().addObject(testTalk,500,383);
                messageCount++;
                talk();
            }
        }
        if (character.size() == 0)
        {
            messageCount = 0;
            getWorld().removeObject(testTalk);
        }
    }
}
