import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class M16NPC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class M16NPC extends Actor
{
    M16Text m16text = new M16Text();
    private boolean doOnce = false;
    NPCChatBubbleR npcChatBubbleR = new NPCChatBubbleR();
    private int doOnce2 = 0;
    /**
     * Act - do whatever the M16NPC wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (doOnce == false)
        {
            getWorld().addObject(m16text, getX(), getY() - 103);
            doOnce = true;
        }
        if(doOnce2 == 0){
            getWorld().addObject(npcChatBubbleR, this.getX() - 75, this.getY() - 90);
            doOnce2 = 1;
        }
    }     
}
