import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ElevatorRoom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ElevatorRoom extends World
{

    /**
     * Constructor for objects of class ElevatorRoom.
     * 
     */
    public ElevatorRoom()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Elevator elevator = new Elevator();
        addObject(elevator, 461, 122);
        Character character = new Character();
        addObject(character, 435, 531);
        character.setLocation(470, 534);
        Tree tree = new Tree();
        addObject(tree, 635, 543);
        Tree tree2 = new Tree();
        addObject(tree2, 633, 428);
        Tree tree3 = new Tree();
        addObject(tree3, 620, 315);
        tree3.setLocation(632, 305);
        Tree tree4 = new Tree();
        addObject(tree4, 597, 180);
        tree4.setLocation(594, 180);
        Tree tree5 = new Tree();
        addObject(tree5, 285, 551);
        tree5.setLocation(281, 550);
        Tree tree6 = new Tree();
        addObject(tree6, 271, 432);
        Tree tree7 = new Tree();
        addObject(tree7, 275, 308);
        Tree tree8 = new Tree();
        addObject(tree8, 318, 183);
        tree8.setLocation(318, 180);
        tree7.setLocation(273, 301);
        tree6.setLocation(281, 428);
        tree7.setLocation(282, 303);
        tree8.setLocation(325, 173);
        HoriChanger6 horiChanger6 = new HoriChanger6();
        addObject(horiChanger6, 472, 94);
    }
}
