import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class State here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class State
{
    /*
     * READ READ READ READ READ READ READ READ READ READ READ READ READ READ READ READ READ READ READ READ READ READ READ
     * ------------------------------------------------------------------------------------------------------------------
     * You should have one boolean array for each world. Each true corresponds to an item in the
     * world. ADJUST these arrays depending on objects deleted or added, by adding or taking away
     * the number of 'true's in each array. Also, when adding new items to the world, you must pass
     * in the number of where they are in each of these arrays. For instance the gun in the
     * parkingLotStart is items number 0. I REPEAT THE FIRST IN THE LIST IS NUMBER 0!!!!
     * The only items that need to be put in these lists are items that are deleted/added in the
     * world, or items that are picked up.
     * 
     * Arrays that are commented out mean they have no items in them right now
     * */

     /*
      * The worldNumber variable below tracks what world the character is in by assigning each level
      * a number. Below shows what level corresponds with what number.
      * 
      * ParkingLotStart         1
      * ParkingLot2             2
      * ParkingLot3             3
      * ParkingLot              4
      * Background              5
      * LevelOne                6
      * LevelTwoStart           7
      * Janitor1                8
      * Level2Security2         9
      * Level2Security          10
      * LevelTwo                11
      * Level2OfficesLast       12
      * Hallway1                13
      * Hallway                 14
      * Hallway3                15
      * Hallway2                16
      * Hallway4                17
      * Level2Offices2          18
      * Level2Offices           19
      * AlarmFloor              20
      * SecretHallway           21
      * SecretHallway2          22
      * Janitor2                23
      */
     
    public static int worldNumber = 1;
     
    //                                         gun    gr    gr   crt   crt   spcrt
    public static boolean[] parkingLotStart = {true, true, true, true, true, true};
    //                                     crt   crt 
    public static boolean[] parkingLot2 = {true, true};
    //                                     cop   crt   crt
    public static boolean[] parkingLot3 = {true, true, true};
    //                                    crt   crt   crt
    public static boolean[] parkingLot = {true, true, true};
    //                                    cop   hp    ammo
    public static boolean[] background = {true, true, true};
    //
    //public static boolean[] levelOne = {};
    //
    //public static boolean[] levelTwoStart = {}; //                              7     8     9     10    11    12                                              20                            25                            30          
    //                                  cop    cop  ammo  ammo   hp    gr    gr   jntr  cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   ammo  ammo  ammo  ammo  
    public static boolean[] janitor1 = {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true};
    //                                          cop  cop   hp    hp    hp     hp   ammo  ammo  ammo  sfcd  crt   crt   crt   crt   crt   crt   crt   crt
    public static boolean[] level2Security2 = {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true};
    //                                         cop   cop
    public static boolean[] level2Security = {true, true};
    //                                  cop
    public static boolean[] levelTwo = {true};
    //                                           chfl  ammo  ammo  ammo  ammo  hp    hp    hp
    public static boolean[] level2OfficesLast = {true, true, true, true, true, true, true, true};
    //                                  crt   crt   crt   crt
    public static boolean[] hallway1 = {true, true, true, true};
    //                                 ammo
    public static boolean[] hallway = {true};
    //                                                                                              10                            15                             20
    //                                  cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   m16  mAmmo mAmmo mAmmo mAmmo mAmmo mAmmo
    public static boolean[] hallway3 = {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true};
    //
    //public static boolean[] hallway2 = {};
    //
    //public static boolean[] hallway4 = {};
    //                                          hp    gr    knf   cop
    public static boolean[] level2Offices2 = {true, true, true, true};
    //                                       ammo  hp
    public static boolean[] level2Offices = {true, true};
    //                                                                                          10                            15                            20
    //                                    cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop
    public static boolean[] alarmFloor = {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true};
    //
    //public static boolean[] secretHallway = {};
    //                                        hp
    public static boolean[] secretHallway2 = {true};
    //                                   crt   crt   crt   gr    gr    hp   jntr  cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop   cop
    public static boolean[] janitor2 = {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, };
    /**
     * Act - do whatever the State wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public State(){
        
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
