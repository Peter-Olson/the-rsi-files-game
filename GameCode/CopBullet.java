import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class CopBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CopBullet extends Bullet
{
    private Enemy gunCop;
    private int radius = 500;
    private int counter = 0;
    /**
     * Act - do whatever the CopBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public CopBullet(Enemy gunCop){
        this.gunCop = gunCop;
    }
    
    public void act() 
    {
        turn();
        move(13);      
        offScreen();    //found in bullet class
    }    
    
    public void turn(){
        List<Character> shootTowardsCharacter;
        shootTowardsCharacter = getObjectsInRange(radius, Character.class);  //getting char's x and y
        int rand1 = Greenfoot.getRandomNumber(45);    //used to make the cop's bullets not deadly accurate
        int rand2 = Greenfoot.getRandomNumber(10);    //used to randomly decide whether bullet will go
        int posOrNeg;                                 //off to the left or the right of the char
        if(rand2%2 == 0){
            posOrNeg = 1;
        }else{
            posOrNeg = -1;
        }
        if(counter == 0){     // only turns once
            this.turnTowards(shootTowardsCharacter.get(0).getX() + (posOrNeg*rand1), shootTowardsCharacter.get(0).getY() + (posOrNeg*rand1));
            counter++;          //shoots towards characters x and y with the randomly assigned numbers that will make his accuracy not perfect
        }else{
            counter = 1;
        }
    }
}
