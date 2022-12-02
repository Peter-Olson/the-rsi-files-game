import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EscapeHole1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EscapeHole1 extends EscapeHoleAnimation
{
    private int switchCounter1 = 10;
    private int counter = 0;
    /**
     * Act - do whatever the EscapeHole1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(switchCounter1 > 0){
                switchCounter1--;
        }else{
            switchCounter1 = 10;
            if(counter == 0){
                this.setImage("Escape_Hole_2.png");
                counter++;
            }else if(counter == 1){
                this.setImage("Escape_Hole_3.png");
                counter++;
            }else if(counter == 2){
                this.setImage("Escape_Hole_4.png");
                counter++;
            }else if(counter == 3){
                this.setImage("Escape_Hole_5.png");
                counter++;
            }else if(counter == 4){
                this.setImage("Escape_Hole_6.png");
                counter++;
            }else if(counter == 5){
                this.setImage("Escape_Hole_7.png");
                counter++;
            }else if(counter == 6){
                this.setImage("Escape_Hole_8.png");
                counter++;
            }else if(counter == 7){
                this.setImage("Escape_Hole_9.png");
                counter++;
            }else if(counter == 8){
                this.setImage("Escape_Hole_10.png");
                counter++;
            }else if(counter == 9){
                this.setImage("Escape_Hole_11.png");
                counter++;
            }else if(counter == 10){
                this.setImage("Escape_Hole_12.png");
                counter++;
            }else if(counter == 11){
                this.setImage("Escape_Hole_13.png");
                counter++;
            }else if(counter == 12){
                getWorld().removeObject(this);    
            }else{
                
            }
        }
    }    
}
