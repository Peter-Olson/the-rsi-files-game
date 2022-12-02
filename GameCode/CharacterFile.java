import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CharacterFile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharacterFile extends BackgroundObject
{
    private int index;
    /**
     * Act - do whatever the CharacterFile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public CharacterFile(int i){
        this.index = i;
    }
    
    public void act() 
    {
        
    }
    
    public int getIndex(){
        return index;
    }
}
