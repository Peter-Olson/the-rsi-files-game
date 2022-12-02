import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpeechBubble2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpeechBubble2 extends SpeechBubbles
{
    private int switchCounter = 200;
    /**
     * Act - do whatever the SpeechBubble2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(switchCounter > 0){
                switchCounter--;
        }else{
            switchCounter = 200;
            getWorld().removeObject(this);
        }
    }    
}
