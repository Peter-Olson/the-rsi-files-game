import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Elevator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elevator extends BackgroundObject
{
    private int eleDoor = 0;
    private int closeDoor = 0;
    private boolean doorIsOpen = false;
    private int doOnce = 0;
    ElevatorSide1 eleside1 = new ElevatorSide1();
    ElevatorSide2 eleside2 = new ElevatorSide2();
    ElevatorSide3 eleside3 = new ElevatorSide3();
    /**
     * Act - do whatever the Elevator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        open();
        if (doOnce == 0)
        {
            getWorld().addObject(eleside1, getX() - 73, getY());
            getWorld().addObject(eleside2, getX(), getY() - 93);
            getWorld().addObject(eleside3, getX() + 73, getY());
            doOnce = 1;
        }
        if (doorIsOpen == true)
        {
            eleDoor++;
        }
        if (doorIsOpen == false)
        {
            closeDoor++;
        }
    }    
    public void open()
    {
        List<Character> character = getObjectsInRange(200, Character.class);
        if (character.size() > 0)
        {
            doorIsOpen = true;
            if (eleDoor == 1)
            {
                setImage("elevator2.png");
            }
            if (eleDoor == 10)
            {
                setImage("elevator3.png");
            }
            if (eleDoor == 20)
            {
                setImage("elevator4.png");
            }
            if (eleDoor == 30)
            {
                setImage("elevator5.png");
            }
            if (eleDoor == 40)
            {
                setImage("elevator6.png");
            }
            if (eleDoor == 50)
            {
                setImage("elevator7.png");
                Greenfoot.playSound("elevator_ding.wav");
                /*getWorld().addObject(eleside1, getX() - 73, getY());
                getWorld().addObject(eleside2, getX(), getY() - 93);
                getWorld().addObject(eleside3, getX() + 73, getY());*/
                
            }
            closeDoor = 0;
        }
        if (character.size() == 0)
        {
            eleDoor = 0;
            doorIsOpen = false;
            if (closeDoor == 1)
            {
                /*getWorld().addObject(this, 370, 119);
                getWorld().removeObject(eleside1);
                getWorld().removeObject(eleside2);
                getWorld().removeObject(eleside3);*/
                setImage("elevator6.png");
            }
            if (closeDoor == 10)
            {
                setImage("elevator5.png");
            }
            if (closeDoor == 20)
            {
                setImage("elevator4.png");
            }
            if (closeDoor == 30)
            {
                setImage("elevator3.png");
            }
            if (closeDoor == 40)
            {
                setImage("elevator2.png");
            }
            if (closeDoor == 50)
            {
                setImage("elevator.png");
            }
        }
    }  
}
