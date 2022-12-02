import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door37 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door37 extends Door
{
    /**
     * Act - do whatever the Door37 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {
            Background background = new Background(850,289);
            Greenfoot.setWorld(background);
        }
    }    
}
