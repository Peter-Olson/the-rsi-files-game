import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class DeflectAnimation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeflectAnimation extends BackgroundObject
{
    private int switchCounter1 = 10;
    private int counter = 0;
    /**
     * Act - do whatever the DeflectAnimation wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        detectIfHit();
        changeImage();
    }    
    
    public void detectIfHit(){
        CharBullet charBullet = (CharBullet)getOneIntersectingObject(CharBullet.class);
        List<Character> characterList = getObjectsInRange(1300, Character.class);
        if(charBullet != null){
            if(characterList.size() > 0){
                int charX = characterList.get(0).getX();
                int charY = characterList.get(0).getY();
                charBullet.turnTowards(charX, charY);
                charBullet.setSpeed(17);
                charBullet.deflected = "deflected";
            }
        }
    }
    
    public void changeImage(){
        if(switchCounter1 > 0){
                switchCounter1--;
        }else{
            switchCounter1 = 10;
            if(counter == 0){
                this.setImage("JDeflectingBullets_2.png");
                counter++;
            }else if(counter == 1){
                this.setImage("JDeflectingBullets_3.png");
                counter++;
            }else if(counter == 2){
                this.setImage("JDeflectingBullets_4.png");
                counter++;
            }else if(counter == 3){
                this.setImage("JDeflectingBullets_5.png");
                counter++;
            }else if(counter == 4){
                this.setImage("JDeflectingBullets_6.png");
                counter++;
            }else if(counter == 5){
                this.setImage("JDeflectingBullets_7.png");
                counter++;
            }else if(counter == 6){
                this.setImage("JDeflectingBullets_8.png");
                counter++;
            }else if(counter == 7){
                this.setImage("JDeflectingBullets_1.png");
                counter++;
            }else if(counter == 8){
                this.setImage("JDeflectingBullets_2.png");
                counter++;
            }else if(counter == 9){
                this.setImage("JDeflectingBullets_3.png");
                counter++;
            }else if(counter == 10){
                this.setImage("JDeflectingBullets_4.png");
                counter++;
            }else if(counter == 11){
                this.setImage("JDeflectingBullets_5.png");
                counter++;
            }else if(counter == 12){
                this.setImage("JDeflectingBullets_6.png");
                counter++;
            }else if(counter == 13){
                this.setImage("JDeflectingBullets_7.png");
                counter++;
            }else if(counter == 14){
                this.setImage("JDeflectingBullets_8.png");
                counter++;
            }else{
                counter = 0;
                Janitor janitor = (Janitor)getOneIntersectingObject(Janitor.class);
                if(janitor != null){
                    janitor.getImage().setTransparency(100);
                }
                Janitor.stopMoving = "dontStop";
                getWorld().removeObject(this);    
            }
        }
    }
}
