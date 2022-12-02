import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.awt.Color;
/**
 * Write a description of class Npc2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Npc5 extends Actor
{
    NPCChatBubbleR npcChatBubbleR = new NPCChatBubbleR();
    private int doOnce = 0;
    CopExplosion5 copExplosion5 = new CopExplosion5();
    NPC1Dead npc1Dead = new NPC1Dead();
    /**
     * Act - do whatever the Npc2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    TestTalk5 testTalk5 = new TestTalk5();
    private int messageCount = 0;
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
            getWorld().addObject(npcChatBubbleR, this.getX() - 75, this.getY() - 80);
            doOnce = 1;
        }
        List<Character> character = getObjectsInRange(100, Character.class);
        if ( character.size() > 0)
        {
            if (messageCount == 0)
            {
                getWorld().addObject(testTalk5,650,240);
                messageCount++;
                talk();
            }
        }
        if (character.size() == 0)
        {
            messageCount = 0;
            getWorld().removeObject(testTalk5);
        }
    }
}
