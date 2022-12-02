import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SafeCodes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SafeCodes extends BackgroundObject
{
    private int index;
    /**
     * Act - do whatever the SafeCodes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public SafeCodes(int i){
        this.index = i;
    }
    
    public void act() 
    {
        Safe.isSafeOpen = true;
        /*Character character = (Character)getOneIntersectingObject(Character.class);
        if(character != null)
        {
            for(int i = 0; i < character.inventory.length; i++){
                if(character.inventory[i] == this){
                    character.safeCodesInv = "in";
                }
            }
            if(character.safeCodesInv == "in"){
                character.inventoryCounter++;
                character.slot5Counter++;
                getWorld().removeObject(this);
                if(State.worldNumber == 9){
                    State.level2Security2[this.getIndex()] = false;
                }
                character.minus = 0;
            }  
            if(character.safeCodesInv == "out"){
                character.inventoryCounter++;
                character.slot5Counter++;
                getWorld().removeObject(this);
                if(State.worldNumber == 9){
                    State.level2Security2[this.getIndex()] = false;
                }
                character.minus = 0;
            }
            getWorld().removeObject(this);
            if(State.worldNumber == 9){
                State.level2Security2[this.getIndex()] = false;
            }
        }*/
    } 
    
    public int getIndex(){
        return index;
    }
}
