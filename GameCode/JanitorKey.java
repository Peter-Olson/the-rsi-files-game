import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JanitorKey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JanitorKey extends BackgroundObject
{
    private int index;
    /**
     * Act - do whatever the JanitorKey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static boolean isBossOpen = false;
    public JanitorKey(int i){
        this.index = i;
    }
    
    public void act() 
    {
        getJanitorKey();
    }    
    
    public void getJanitorKey()
    {
        if(getOneIntersectingObject(Character.class) != null)
        {
            isBossOpen = true;
            //getWorld().removeObject(this);
        }
    }  
    
    public int getIndex(){
        return index;
    }
}
