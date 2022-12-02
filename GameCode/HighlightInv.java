import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HighlightInv here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HighlightInv extends BackgroundObject
{
    public static int equipNum;
    /**
     * Act - do whatever the HighlightInv wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        for(Object obj: getWorld().getObjects(Character.class)){
            Character character = (Character) obj;
            equipNum = character.getCurrentEquip();
        }
        if(equipNum == 1){
            this.setLocation(145, 550);
        }
        if(equipNum == 2){
            this.setLocation(220, 550);
        }
        if(equipNum == 3){
            this.setLocation(299, 550);
        }
        if(equipNum == 4){
            this.setLocation(375, 550);
        }
        if(equipNum == 5){
            this.setLocation(450, 550);
        }
        if(equipNum == 6){
            this.setLocation(525, 550);
        }
        if(equipNum == 7){
            this.setLocation(601, 550);
        }
        if(equipNum == 8){
            this.setLocation(677, 550);
        }
        if(equipNum == 9){
            this.setLocation(751, 550);
        }
    }    
}
