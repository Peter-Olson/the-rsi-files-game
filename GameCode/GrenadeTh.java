import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GrenadeTh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GrenadeTh extends Actor
{
    public boolean youShallNotPass = false;
    private int switchTimer = 3;
    private int switchTimer2 = 5;
    private int switchTimer3 = 7;
    private int switchTimer4 = 7;
    private int switchTimer5 = 5;
    private int switchTimer6 = 3;
    public String explode = "doNotExplode";
    /**
     * Act - do whatever the GrenadeTh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GrenadeTh ()
    {

    }
    
    public void act() 
    {
        
    }
    
    public void fall(){
        if(switchTimer > 0){
            setLocation(this.getX(), this.getY()-5);
            switchTimer--;
        }else if(switchTimer2 > 0){
            setLocation(this.getX(), this.getY()-3);
            switchTimer2--;
        }else if(switchTimer3 > 0){
            setLocation(this.getX(), this.getY()-1);
            switchTimer3--;
        }else if(switchTimer4 > 0){
            setLocation(this.getX(), this.getY()+1);
            switchTimer4--;
        }else if(switchTimer5 > 0){
            setLocation(this.getX(), this.getY()+3);
            switchTimer5--;
        }else if(switchTimer6 > 0){
            setLocation(this.getX(), this.getY()+5);
            switchTimer6--;
        }else{
            switchTimer = 3;
            switchTimer2 = 5;
            switchTimer3 = 7;
            switchTimer4 = 7;
            switchTimer5 = 5;
            switchTimer6 = 3;
            explode = "explode";
        }
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
        if(getOneIntersectingObject(StillObject.class) != null){
            getWorld().removeObject(this);
        }else if(getOneIntersectingObject(Enemy.class) != null)
        {
            
        }else if(getOneIntersectingObject(Character.class) != null)
        {
            
        }else{
            
        }
    }   
}
