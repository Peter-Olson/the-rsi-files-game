import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Winning here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Winning extends World
{

    /**
     * Constructor for objects of class Winning.
     * 
     */
    public Winning(int kills)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        kills = Character.killCount;
        ScoreBoard scoreBoard = new ScoreBoard();
        scoreBoard.addScore(Character.killCount);
        addObject(scoreBoard, 89, 558);
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            StartScreen startScreen = new StartScreen();
            Greenfoot.setWorld(startScreen);
        }
    }

}
