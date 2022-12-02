import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    private boolean youShallNotPass = false;
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bullet ()
    {

    }
    
    public void act() 
    {
        
    }
    
    public void offScreen(){
        int xPos = getX();
        int yPos = getY();
        if ( (xPos > 990) || (xPos < 10) || (yPos > 590) || (yPos < 10))
        {
            getWorld().removeObject(this);
            youShallNotPass = true;
        }
        if(youShallNotPass == false)
        {
            collision();
        }
    }
    
    public void collision(){
        Crate crate = (Crate)getOneIntersectingObject(Crate.class);
        SpecialCrate specialCrate = (SpecialCrate)getOneIntersectingObject(SpecialCrate.class);
        if(crate != null){
            crate.breakCrate();
            getWorld().removeObject(this);
        }else
        if(specialCrate != null){
            specialCrate.breakCrate();
            getWorld().removeObject(this);
        }else
        if(getOneIntersectingObject(StillObject.class) != null)
        {
            getWorld().removeObject(this);
        }else if(getOneIntersectingObject(Enemy.class) != null)
        {
            
        }else if(getOneIntersectingObject(Character.class) != null)
        {
            
        }else{
            
        }
    }
}
