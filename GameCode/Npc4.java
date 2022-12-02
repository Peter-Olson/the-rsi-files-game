import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Npc4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Npc4 extends Actor
{
    NPCChatBubbleR npcChatBubbleR = new NPCChatBubbleR();
    private int doOnce = 0;
    CopExplosion5 copExplosion5 = new CopExplosion5();
    NPC2Dead npc2Dead = new NPC2Dead();
    /**
     * Act - do whatever the Npc4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    TestTalk4 testTalk4 = new TestTalk4();
    private int messageCount = 0;
    public void act() 
    {
        talk();
        amIShot();
    }    
    
    public void amIShot(){
        if(getOneIntersectingObject(CharBullet.class) != null){
            getWorld().addObject(copExplosion5, this.getX(), this.getY());
            getWorld().addObject(npc2Dead, this.getX(), this.getY()); 
            Greenfoot.playSound("knife_stab.mp3");
            getWorld().removeObject(this);
        }
    }
    
    public void talk()
    {
        if(doOnce == 0){
            getWorld().addObject(npcChatBubbleR, this.getX() - 60, this.getY() - 80);
            doOnce = 1;
        }
        List<Character> character = getObjectsInRange(100, Character.class);
        if ( character.size() > 0)
        {
            if (messageCount == 0)
            {
                getWorld().addObject(testTalk4,750,250);
                messageCount++;
                talk();
            }
        }
        if (character.size() == 0)
        {
            messageCount = 0;
            getWorld().removeObject(testTalk4);
        }
    }  
}
