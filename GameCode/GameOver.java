import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    AlarmDialogue alarmdialogue = new AlarmDialogue();
    Alarm alarm = new Alarm();
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver(int kills)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        kills = Character.killCount;
        ScoreBoard scoreBoard = new ScoreBoard();
        scoreBoard.addScore(Character.killCount);
        addObject(scoreBoard, 500, 500);
    }
    public void act()
    {
       if(Greenfoot.mouseClicked(this))
       {
        ParkingLotStart parkingLotStart = new ParkingLotStart();
        Greenfoot.setWorld(parkingLotStart);
       }
       if (alarmdialogue.alarmDoOnce == true)
       {
            alarm.siren.stop();
       }
   }
}
