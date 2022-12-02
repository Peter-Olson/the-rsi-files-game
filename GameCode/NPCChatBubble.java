import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;


/**
 * Write a description of class NPCChatBubble here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NPCChatBubble extends BackgroundObject
{
    /**
     * Act - do whatever the NPCChatBubble wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        findCharacter();
    }    
    
    public void findCharacter(){
        List<Character> listOfCharacters = getObjectsInRange(150, Character.class);
        if(listOfCharacters.size() > 0){
            getWorld().removeObject(this);
        }
    }
}
