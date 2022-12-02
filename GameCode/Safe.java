import greenfoot.*;
import java.util.List;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Safe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Safe extends BackgroundObject
{
    public static boolean isSafeOpen = false;
    private CharacterFile characterFile = new CharacterFile(0);
    /**
     * Act - do whatever the Safe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        List<Character> character = getObjectsInRange(100, Character.class);
        if(isSafeOpen == true)
        {
            if(character.size() > 0)
            {
                if(State.level2OfficesLast[0] == true){
                    getWorld().addObject(characterFile, 500, 300);
                }
            }
        }
        
    }    
}
