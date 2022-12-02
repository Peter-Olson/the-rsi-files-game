import greenfoot.*; 
import java.util.List;
import java.awt.Color; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Npc7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Npc7 extends Actor
{
    NPCChatBubbleL npcChatBubbleL = new NPCChatBubbleL();
    private int doOnce = 0;
    CopExplosion5 copExplosion5 = new CopExplosion5();
    NPC1Dead npc1Dead = new NPC1Dead();
    /**
     * Act - do whatever the Npc7 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Mission1 mission1 = new Mission1();
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
            getWorld().addObject(npcChatBubbleL, this.getX() + 60, this.getY() - 80);
            doOnce = 1;
        }
        List<Character> character = getObjectsInRange(100, Character.class);
        if ( character.size() > 0)
        {
            if (messageCount == 0)
            {
                getWorld().addObject(mission1,379,182);
                messageCount++;
                talk();
            }
        }
        if (character.size() == 0)
        {
            messageCount = 0;
            getWorld().removeObject(mission1);
        }
    } 
}
