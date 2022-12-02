import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import greenfoot.core.*;  
import javax.swing.*;  
import java.awt.*;

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor
{
    private int shotTimer = 0;                         //more timers and counters vv
    private int shotTimer2 = 0;
    private int numOfFrames = 0;
    private int numOfFrames2 = 0;
    private int numOfFrames3 = 0;
    private int numOfFrames4 = 0;
    private int grenadeTimer = 0;
    private int knifeTimer = 0;
    private int switchTimer = 0;
    private int counter = 0;                   
    private int moveX = 0;                            //the x and y direction that the char would have gone in (used for boudnary detection 
    private int moveY = 0;                        
    private int switchTimerVar = 6;                   //timer used for something...
    private String amIDead = "notDead";                //variable used to determine if the char is dead or not
    private boolean youShallNotPass = false;            //variable used to make sure that the character doesn't call a method when he has already been killed
    public static int killCount;                      //kill count of char
    public static int totalHealth = 10;               //health of char
    public static int ammo = 12;                     //ammo of char
    public static int m16AmmoCounter = 25;
    public static int appointmentNumber = 0;         //wth is this? --Peter
    private String isCharShooting = "notShooting";
    private String isCharThrowing = "notThrowing";
    private String isCharShanking = "notShanking";
    private String isCharM16ing = "notM16ing";
    HealthBar10 healthBar10 = new HealthBar10();
    HealthBar9 healthBar9 = new HealthBar9();
    HealthBar8 healthBar8 = new HealthBar8();
    HealthBar7 healthBar7 = new HealthBar7();
    HealthBar6 healthBar6 = new HealthBar6();
    HealthBar5 healthBar5 = new HealthBar5();
    HealthBar4 healthBar4 = new HealthBar4();
    HealthBar3 healthBar3 = new HealthBar3();
    HealthBar2 healthBar2 = new HealthBar2();
    HealthBar1 healthBar1 = new HealthBar1();
    
    HealthPackBg healthPackBg;
    KnifeKillObject knifeKillObject = new KnifeKillObject();
    CopExplosion1 copExplosion1 = new CopExplosion1();
    CharBullet charBullet = new CharBullet(this);
    private int copX = 0;
    private int copY = 0;
    private int janitorX = 0;
    private int janitorY = 0;
    
    public Actor[] inventory = new Actor[9];
    public static int inventoryCounter = 0;         //counters for inventory quantities
    public static int grenadeCounter = 0;
    //public static int m16Ammo = 0;
    public static int knifeCounter = 0;
    public static int handgunCounter = 1;
    
    public static int slot5Counter = 0;
    public static int slot6Counter = 0;
    public static int slot7Counter = 0;
    public static int slot8Counter = 0;
    public static int slot9Counter = 0;
    
    private String grenadeInv = "out";      //no longer used
    private String handgunInv = "in";
    private String knifeInv = "out";
    private String m16Inv = "out";
    private String pistonAmmoInv = "in";
    public String safeCodesInv = "out";
    public String characterFileInv = "out";
    public String securityCodeInv = "out";
    public String janitorKeyInv = "out";
    
    public static int equipCounter = 1;       //inventory equip counter
    public int doOnly1Time = 0;
    public HighlightInv highlightInv = new HighlightInv();
    public static int currentEquip = 1;       //equip number
    
    public static int minus = 0;              //used to determine whether the character is gainging an item or losing one
    public static String shankingTime = "itsNotShankingTime";
    Reticle reticle = new Reticle();
    private String doOnce5 = "once";
    private String clicked = "notClicked";
    private int anotherCounter = 0;
    private int switchTimer2 = 1;
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        if(doOnce5 == "once"){
             getWorld().addObject(reticle, 277, 358);
             doOnce5 = "noMore";
        }
        minusHealth();
        updateHealth();
        hideCursor();
         if(youShallNotPass == false){
             encounterItem();
             detectEquip();
             move();
             if(currentEquip == 1 || currentEquip == 4){
                shoot();
             }
             if(currentEquip == 2){
                 throwGrenade();
             }
             if(currentEquip == 3){
                shank();    
             }
             changeWorld();
        }
    }  
    
    public void hideCursor()
    {
         JPanel panel = WorldHandler.getInstance().getWorldCanvas();  
         GreenfootImage image = new GreenfootImage(1, 1);  
         Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(image.getAwtImage(), new Point(0, 0), "");  
         panel.setCursor(cursor);
    }
    
    public void addKill()
    {
        killCount += 1;
        //System.out.println("kill count: " + killCount);
    }
    
    public void move()
    {
        if(numOfFrames == 10){       //time character holds out his gun
            isCharShooting = "notShooting";
            numOfFrames = 0;
        }
        if(numOfFrames2 == 10){
            isCharThrowing = "notThrowing";
            numOfFrames2 = 0;
        }
        if(numOfFrames3 == 10){
            isCharShanking = "notShanking";
            numOfFrames3 = 0;
        }
        if(numOfFrames4 == 10){
            isCharM16ing = "notM16ing";
            numOfFrames4 = 0;
        }
        if (Greenfoot.isKeyDown("W"))
        {
            //Putting this in the if loop below disallows moving diagonally
            if((Greenfoot.isKeyDown("W") && Greenfoot.isKeyDown("S")) ||
               (Greenfoot.isKeyDown("W") && Greenfoot.isKeyDown("A")) ||
               (Greenfoot.isKeyDown("W") && Greenfoot.isKeyDown("D")))
               {
               }else{
                   changeImageUp();
                   swapImageUp();
               }
        }
        if (Greenfoot.isKeyDown("S"))
        {
            //Putting this in the if loop below disallows moving diagonally
            if((Greenfoot.isKeyDown("S") && Greenfoot.isKeyDown("W")) ||
               (Greenfoot.isKeyDown("S") && Greenfoot.isKeyDown("A")) ||
               (Greenfoot.isKeyDown("S") && Greenfoot.isKeyDown("D")))
               {
               }else{
                   changeImageDown();
                   swapImageDown();
               }
        }
        if (Greenfoot.isKeyDown("A"))
        {
            //Putting this in the if loop below disallows moving diagonally
            if((Greenfoot.isKeyDown("A") && Greenfoot.isKeyDown("W")) ||
               (Greenfoot.isKeyDown("A") && Greenfoot.isKeyDown("S")) ||
               (Greenfoot.isKeyDown("A") && Greenfoot.isKeyDown("D")))
               {
               }else{
                   changeImageLeft();
                   swapImageLeft();
               }
        }
        if (Greenfoot.isKeyDown("D"))
        {  
            // Putting this in the if loop below disallows moving diagonally
            if((Greenfoot.isKeyDown("D") && Greenfoot.isKeyDown("W")) ||
               (Greenfoot.isKeyDown("D") && Greenfoot.isKeyDown("S")) ||
               (Greenfoot.isKeyDown("D") && Greenfoot.isKeyDown("A")))
               {
               }else{
                   changeImageRight();
                   swapImageRight();
               }
        }
    }   
    
    public void swapImageUp(){
        if(switchTimer > 0){
            switchTimer -= 1;
        }else{
            if(counter > 2){
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "shooting"){
                    this.setImage("Ch_Wgun_Shtng_Bckwrd_Def.png");
                    numOfFrames++;
                }
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "notShooting"){
                    this.setImage("Ch_Wgun_Bckwrd_Def.png");
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "throwing"){
                    this.setImage("Ch_Wg_Shtng_Bckwrd_Def.png");
                    numOfFrames2++;
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "notThrowing"){
                    this.setImage("Ch_Wg_Bckwrd_Def.png");
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "shanking"){
                    this.setImage("Ch_Wk_Shtng_Bckwrd_Def.png");
                    numOfFrames3++;
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "notShanking"){
                    this.setImage("Ch_Wk_Bckwrd_Def.png");
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "m16ing"){
                    this.setImage("Ch_Wmg_Shtng_Bckwrd_Def.png");
                    numOfFrames4++;
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "notM16ing"){
                    this.setImage("Ch_Wmg_Bckwrd_Def.png");
                }
                if((currentEquip == 2 && grenadeCounter == 0) || (currentEquip == 3 && knifeCounter == 0) || (currentEquip == 4 && m16AmmoCounter == 0)
                  || (currentEquip == 5 && slot5Counter == 0) || (currentEquip == 6 && slot6Counter == 0) || (currentEquip == 7 && slot7Counter == 0)
                  || (currentEquip == 8 && slot8Counter == 0) || (currentEquip == 9 && slot9Counter == 0) || (currentEquip == 1 && handgunCounter == 0)){
                    this.setImage("Ch_Bckwrd_Def.png");
                }
                counter = 0;
                switchTimer = switchTimerVar;
            }else if(counter > 1){
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "shooting"){
                    this.setImage("Ch_Wgun_Shtng_Bckwrd_Lft.png");
                    numOfFrames++;
                }
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "notShooting"){
                    this.setImage("Ch_Wgun_Bckwrd_Lft.png");
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "throwing"){
                    this.setImage("Ch_Wg_Shtng_Bckwrd_Lft.png");
                    numOfFrames2++;
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "notThrowing"){
                    this.setImage("Ch_Wg_Bckwrd_Lft.png");
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "shanking"){
                    this.setImage("Ch_Wk_Shtng_Bckwrd_Lft.png");
                    numOfFrames3++;
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "notShanking"){
                    this.setImage("Ch_Wk_Bckwrd_Lft.png");
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "m16ing"){
                    this.setImage("Ch_Wmg_Shtng_Bckwrd_Lft.png");
                    numOfFrames4++;
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "notM16ing"){
                    this.setImage("Ch_Wmg_Bckwrd_Lft.png");
                }
                if((currentEquip == 2 && grenadeCounter == 0) || (currentEquip == 3 && knifeCounter == 0) || (currentEquip == 4 && m16AmmoCounter == 0)
                  || (currentEquip == 5 && slot5Counter == 0) || (currentEquip == 6 && slot6Counter == 0) || (currentEquip == 7 && slot7Counter == 0)
                  || (currentEquip == 8 && slot8Counter == 0) || (currentEquip == 9 && slot9Counter == 0) || (currentEquip == 1 && handgunCounter == 0)){
                    this.setImage("Ch_Bckwrd_Lft.png");
                }
                counter++;
                switchTimer = switchTimerVar;
            }else if(counter > 0){
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "shooting"){
                    this.setImage("Ch_Wgun_Shtng_Bckwrd_Def.png");
                    numOfFrames++;
                }
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "notShooting"){
                    this.setImage("Ch_Wgun_Bckwrd_Def.png");
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "throwing"){
                    this.setImage("Ch_Wg_Shtng_Bckwrd_Def.png");
                    numOfFrames2++;
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "notThrowing"){
                    this.setImage("Ch_Wg_Bckwrd_Def.png");
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "shanking"){
                    this.setImage("Ch_Wk_Shtng_Bckwrd_Def.png");
                    numOfFrames3++;
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "notShanking"){
                    this.setImage("Ch_Wk_Bckwrd_Def.png");
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "m16ing"){
                    this.setImage("Ch_Wmg_Shtng_Bckwrd_Def.png");
                    numOfFrames4++;
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "notM16ing"){
                    this.setImage("Ch_Wmg_Bckwrd_Def.png");
                }
                if((currentEquip == 2 && grenadeCounter == 0) || (currentEquip == 3 && knifeCounter == 0) || (currentEquip == 4 && m16AmmoCounter == 0)
                  || (currentEquip == 5 && slot5Counter == 0) || (currentEquip == 6 && slot6Counter == 0) || (currentEquip == 7 && slot7Counter == 0)
                  || (currentEquip == 8 && slot8Counter == 0) || (currentEquip == 9 && slot9Counter == 0) || (currentEquip == 1 && handgunCounter == 0)){
                    this.setImage("Ch_Bckwrd_Def.png");
                }
                counter++;
                switchTimer = switchTimerVar;
            }else{
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "shooting"){
                    this.setImage("Ch_Wgun_Shtng_Bckwrd_Rgt.png");
                    numOfFrames++;
                }
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "notShooting"){
                    this.setImage("Ch_Wgun_Bckwrd_Rgt.png");
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "throwing"){
                    this.setImage("Ch_Wg_Shtng_Bckwrd_Rgt.png");
                    numOfFrames2++;
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "notThrowing"){
                    this.setImage("Ch_Wg_Bckwrd_Rgt.png");
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "shanking"){
                    this.setImage("Ch_Wk_Shtng_Bckwrd_Rgt.png");
                    numOfFrames3++;
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "notShanking"){
                    this.setImage("Ch_Wk_Bckwrd_Rgt.png");
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "m16ing"){
                    this.setImage("Ch_Wmg_Shtng_Bckwrd_Rgt.png");
                    numOfFrames4++;
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "notM16ing"){
                    this.setImage("Ch_Wmg_Bckwrd_Rgt.png");
                }
                if((currentEquip == 2 && grenadeCounter == 0) || (currentEquip == 3 && knifeCounter == 0) || (currentEquip == 4 && m16AmmoCounter == 0)
                  || (currentEquip == 5 && slot5Counter == 0) || (currentEquip == 6 && slot6Counter == 0) || (currentEquip == 7 && slot7Counter == 0)
                  || (currentEquip == 8 && slot8Counter == 0) || (currentEquip == 9 && slot9Counter == 0) || (currentEquip == 1 && handgunCounter == 0)){
                    this.setImage("Ch_Bckwrd_Rgt.png");
                }
                counter++;
                switchTimer = switchTimerVar;
            }
        }
    }
    
    public void swapImageDown(){
        if(switchTimer > 0){
            switchTimer -= 1;
        }else{
            if(counter > 2){
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "shooting"){
                    this.setImage("Ch_Wgun_Shtng_Fwrd_Def.png");
                    numOfFrames++;
                }
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "notShooting"){
                    this.setImage("Ch_Wgun_Fwrd_Def.png");
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "throwing"){
                    this.setImage("Ch_Wg_Shtng_Fwrd_Def.png");
                    numOfFrames2++;
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "notThrowing"){
                    this.setImage("Ch_Wg_Fwrd_Def.png");
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "shanking"){
                    this.setImage("Ch_Wk_Shtng_Fwrd_Def.png");
                    numOfFrames3++;
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "notShanking"){
                    this.setImage("Ch_Wk_Fwrd_Def.png");
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "m16ing"){
                    this.setImage("Ch_Wmg_Shtng_Fwrd_Def.png");
                    numOfFrames4++;
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "notM16ing"){
                    this.setImage("Ch_Wmg_Fwrd_Def.png");
                }
                if((currentEquip == 2 && grenadeCounter == 0) || (currentEquip == 3 && knifeCounter == 0) || (currentEquip == 4 && m16AmmoCounter == 0)
                  || (currentEquip == 5 && slot5Counter == 0) || (currentEquip == 6 && slot6Counter == 0) || (currentEquip == 7 && slot7Counter == 0)
                  || (currentEquip == 8 && slot8Counter == 0) || (currentEquip == 9 && slot9Counter == 0) || (currentEquip == 1 && handgunCounter == 0)){
                    this.setImage("Ch_Def_Fwrd.png");
                }
                counter = 0;
                switchTimer = switchTimerVar;
            }else if(counter > 1){
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "shooting"){
                    this.setImage("Ch_Wgun_Shtng_Fwrd_Lft.png");
                    numOfFrames++;
                }
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "notShooting"){
                    this.setImage("Ch_Wgun_Fwrd_Lft.png");
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "throwing"){
                    this.setImage("Ch_Wg_Shtng_Fwrd_Lft.png");
                    numOfFrames2++;
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "notThrowing"){
                    this.setImage("Ch_Wg_Fwrd_Lft.png");
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "shanking"){
                    this.setImage("Ch_Wk_Shtng_Fwrd_Lft.png");
                    numOfFrames3++;
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "notShanking"){
                    this.setImage("Ch_Wk_Fwrd_Lft.png");
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "m16ing"){
                    this.setImage("Ch_Wmg_Shtng_Fwrd_Lft.png");
                    numOfFrames4++;
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "notM16ing"){
                    this.setImage("Ch_Wmg_Fwrd_Lft.png");
                }
                if((currentEquip == 2 && grenadeCounter == 0) || (currentEquip == 3 && knifeCounter == 0) || (currentEquip == 4 && m16AmmoCounter == 0)
                  || (currentEquip == 5 && slot5Counter == 0) || (currentEquip == 6 && slot6Counter == 0) || (currentEquip == 7 && slot7Counter == 0)
                  || (currentEquip == 8 && slot8Counter == 0) || (currentEquip == 9 && slot9Counter == 0) || (currentEquip == 1 && handgunCounter == 0)){
                    this.setImage("Ch_Def_Lft.png");
                }
                counter++;
                switchTimer = switchTimerVar;
            }else if(counter > 0){
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "shooting"){
                    this.setImage("Ch_Wgun_Shtng_Fwrd_Def.png");
                    numOfFrames++;
                }
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "notShooting"){
                    this.setImage("Ch_Wgun_Fwrd_Def.png");
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "throwing"){
                    this.setImage("Ch_Wg_Shtng_Fwrd_Def.png");
                    numOfFrames2++;
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "notThrowing"){
                    this.setImage("Ch_Wg_Fwrd_Def.png");
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "shanking"){
                    this.setImage("Ch_Wk_Shtng_Fwrd_Def.png");
                    numOfFrames3++;
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "notShanking"){
                    this.setImage("Ch_Wk_Fwrd_Def.png");
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "m16ing"){
                    this.setImage("Ch_Wmg_Shtng_Fwrd_Def.png");
                    numOfFrames4++;
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "notM16ing"){
                    this.setImage("Ch_Wmg_Fwrd_Def.png");
                }
                if((currentEquip == 2 && grenadeCounter == 0) || (currentEquip == 3 && knifeCounter == 0) || (currentEquip == 4 && m16AmmoCounter == 0)
                  || (currentEquip == 5 && slot5Counter == 0) || (currentEquip == 6 && slot6Counter == 0) || (currentEquip == 7 && slot7Counter == 0)
                  || (currentEquip == 8 && slot8Counter == 0) || (currentEquip == 9 && slot9Counter == 0) || (currentEquip == 1 && handgunCounter == 0)){
                    this.setImage("Ch_Def_Fwrd.png");
                }
                counter++;
                switchTimer = switchTimerVar;
            }else{
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "shooting"){
                    this.setImage("Ch_Wgun_Shtng_Fwrd_Rgt.png");
                    numOfFrames++;
                }
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "notShooting"){
                    this.setImage("Ch_Wgun_Fwrd_Rgt.png");
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "throwing"){
                    this.setImage("Ch_Wg_Shtng_Fwrd_Rgt.png");
                    numOfFrames2++;
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "notThrowing"){
                    this.setImage("Ch_Wg_Fwrd_Rgt.png");
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "shanking"){
                    this.setImage("Ch_Wk_Shtng_Fwrd_Rgt.png");
                    numOfFrames3++;
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "notShanking"){
                    this.setImage("Ch_Wk_Fwrd_Rgt.png");
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "m16ing"){
                    this.setImage("Ch_Wmg_Shtng_Fwrd_Rgt.png");
                    numOfFrames4++;
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "notM16ing"){
                    this.setImage("Ch_Wmg_Fwrd_Rgt.png");
                }
                if((currentEquip == 2 && grenadeCounter == 0) || (currentEquip == 3 && knifeCounter == 0) || (currentEquip == 4 && m16AmmoCounter == 0)
                  || (currentEquip == 5 && slot5Counter == 0) || (currentEquip == 6 && slot6Counter == 0) || (currentEquip == 7 && slot7Counter == 0)
                  || (currentEquip == 8 && slot8Counter == 0) || (currentEquip == 9 && slot9Counter == 0) || (currentEquip == 1 && handgunCounter == 0)){
                    this.setImage("Ch_Def_Rgt.png");
                }
                counter++;
                switchTimer = switchTimerVar;
            }
        }
    }
    
    public void swapImageLeft(){
        if(switchTimer > 0){
            switchTimer -= 1;
        }else{
            if(counter > 2){
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "shooting"){
                    this.setImage("Ch_Wgun_Shtng_Lft_Def.png");
                    numOfFrames++;
                }
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "notShooting"){
                    this.setImage("Ch_Wgun_Lft_Def.png");
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "throwing"){
                    this.setImage("Ch_Wg_Shtng_Lft_Def.png");
                    numOfFrames2++;
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "notThrowing"){
                    this.setImage("Ch_Wg_Lft_Def.png");
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "shanking"){
                    this.setImage("Ch_Wk_Shtng_Lft_Def.png");
                    numOfFrames3++;
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "notShanking"){
                    this.setImage("Ch_Wk_Lft_Def.png");
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "m16ing"){
                    this.setImage("Ch_Wmg_Shtng_Lft_Def.png");
                    numOfFrames4++;
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "notM16ing"){
                    this.setImage("Ch_Wmg_Lft_Def.png");
                }
                if((currentEquip == 2 && grenadeCounter == 0) || (currentEquip == 3 && knifeCounter == 0) || (currentEquip == 4 && m16AmmoCounter == 0)
                  || (currentEquip == 5 && slot5Counter == 0) || (currentEquip == 6 && slot6Counter == 0) || (currentEquip == 7 && slot7Counter == 0)
                  || (currentEquip == 8 && slot8Counter == 0) || (currentEquip == 9 && slot9Counter == 0) || (currentEquip == 1 && handgunCounter == 0)){
                    this.setImage("Ch_Lft_Def.png");
                }
                counter = 0;
                switchTimer = switchTimerVar;
            }else if(counter > 1){
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "shooting"){
                    this.setImage("Ch_Wgun_Shtng_Lft_Lft.png");
                    numOfFrames++;
                }
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "notShooting"){
                    this.setImage("Ch_Wgun_Lft_Lft.png");
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "throwing"){
                    this.setImage("Ch_Wg_Shtng_Lft_Lft.png");
                    numOfFrames2++;
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "notThrowing"){
                    this.setImage("Ch_Wg_Lft_Lft.png");
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "shanking"){
                    this.setImage("Ch_Wk_Shtng_Lft_Lft.png");
                    numOfFrames3++;
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "notShanking"){
                    this.setImage("Ch_Wk_Lft_Lft.png");
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "m16ing"){
                    this.setImage("Ch_Wmg_Shtng_Lft_Lft.png");
                    numOfFrames4++;
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "notM16ing"){
                    this.setImage("Ch_Wmg_Lft_Lft.png");
                }
                if((currentEquip == 2 && grenadeCounter == 0) || (currentEquip == 3 && knifeCounter == 0) || (currentEquip == 4 && m16AmmoCounter == 0)
                  || (currentEquip == 5 && slot5Counter == 0) || (currentEquip == 6 && slot6Counter == 0) || (currentEquip == 7 && slot7Counter == 0)
                  || (currentEquip == 8 && slot8Counter == 0) || (currentEquip == 9 && slot9Counter == 0) || (currentEquip == 1 && handgunCounter == 0)){
                    this.setImage("Ch_Lft_Lft.png");
                }
                counter++;
                switchTimer = switchTimerVar;
            }else if(counter > 0){
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "shooting"){
                    this.setImage("Ch_Wgun_Shtng_Lft_Def.png");
                    numOfFrames++;
                }
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "notShooting"){
                    this.setImage("Ch_Wgun_Lft_Def.png");
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "throwing"){
                    this.setImage("Ch_Wg_Shtng_Lft_Def.png");
                    numOfFrames2++;
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "notThrowing"){
                    this.setImage("Ch_Wg_Lft_Def.png");
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "shanking"){
                    this.setImage("Ch_Wk_Shtng_Lft_Def.png");
                    numOfFrames3++;
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "notShanking"){
                    this.setImage("Ch_Wk_Lft_Def.png");
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "m16ing"){
                    this.setImage("Ch_Wmg_Shtng_Lft_Def.png");
                    numOfFrames4++;
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "notM16ing"){
                    this.setImage("Ch_Wmg_Lft_Def.png");
                }
                if((currentEquip == 2 && grenadeCounter == 0) || (currentEquip == 3 && knifeCounter == 0) || (currentEquip == 4 && m16AmmoCounter == 0)
                  || (currentEquip == 5 && slot5Counter == 0) || (currentEquip == 6 && slot6Counter == 0) || (currentEquip == 7 && slot7Counter == 0)
                  || (currentEquip == 8 && slot8Counter == 0) || (currentEquip == 9 && slot9Counter == 0) || (currentEquip == 1 && handgunCounter == 0)){
                    this.setImage("Ch_Lft_Def.png");
                }
                counter++;
                switchTimer = switchTimerVar;
            }else{
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "shooting"){
                    this.setImage("Ch_Wgun_Shtng_Lft_Rgt.png");
                    numOfFrames++;
                }
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "notShooting"){
                    this.setImage("Ch_Wgun_Lft_Rgt.png");
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "throwing"){
                    this.setImage("Ch_Wg_Shtng_Lft_Rgt.png");
                    numOfFrames2++;
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "notThrowing"){
                    this.setImage("Ch_Wg_Lft_Rgt.png");
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "shanking"){
                    this.setImage("Ch_Wk_Shtng_Lft_Rgt.png");
                    numOfFrames3++;
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "notShanking"){
                    this.setImage("Ch_Wk_Lft_Rgt.png");
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "m16ing"){
                    this.setImage("Ch_Wmg_Shtng_Lft_Rgt.png");
                    numOfFrames4++;
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "notM16ing"){
                    this.setImage("Ch_Wmg_Lft_Rgt.png");
                }
                if((currentEquip == 2 && grenadeCounter == 0) || (currentEquip == 3 && knifeCounter == 0) || (currentEquip == 4 && m16AmmoCounter == 0)
                  || (currentEquip == 5 && slot5Counter == 0) || (currentEquip == 6 && slot6Counter == 0) || (currentEquip == 7 && slot7Counter == 0)
                  || (currentEquip == 8 && slot8Counter == 0) || (currentEquip == 9 && slot9Counter == 0) || (currentEquip == 1 && handgunCounter == 0)){
                    this.setImage("Ch_Lft_Rgt.png");
                }
                counter++;
                switchTimer = switchTimerVar;
            }
        }
    }
    
    public void swapImageRight(){
        if(switchTimer > 0){
            switchTimer -= 1;
        }else{
            if(counter > 2){
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "shooting"){
                    this.setImage("Ch_Wgun_Shtng_Rgt_Def.png");
                    numOfFrames++;
                }
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "notShooting"){
                    this.setImage("Ch_Wgun_Rgt_Def.png");
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "throwing"){
                    this.setImage("Ch_Wg_Shtng_Rgt_Def.png");
                    numOfFrames2++;
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "notThrowing"){
                    this.setImage("Ch_Wg_Rgt_Def.png");
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "shanking"){
                    this.setImage("Ch_Wk_Shtng_Rgt_Def.png");
                    numOfFrames3++;
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "notShanking"){
                    this.setImage("Ch_Wk_Rgt_Def.png");
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "m16ing"){
                    this.setImage("Ch_Wmg_Shtng_Rgt_Def.png");
                    numOfFrames4++;
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "notM16ing"){
                    this.setImage("Ch_Wmg_Rgt_Def.png");
                }
                if((currentEquip == 2 && grenadeCounter == 0) || (currentEquip == 3 && knifeCounter == 0) || (currentEquip == 4 && m16AmmoCounter == 0)
                  || (currentEquip == 5 && slot5Counter == 0) || (currentEquip == 6 && slot6Counter == 0) || (currentEquip == 7 && slot7Counter == 0)
                  || (currentEquip == 8 && slot8Counter == 0) || (currentEquip == 9 && slot9Counter == 0) || (currentEquip == 1 && handgunCounter == 0)){
                    this.setImage("Ch_Rgt_Def.png");
                }
                counter = 0;
                switchTimer = switchTimerVar;
            }else if(counter > 1){
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "shooting"){
                    this.setImage("Ch_Wgun_Shtng_Rgt_Lft.png");
                    numOfFrames++;
                }
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "notShooting"){
                    this.setImage("Ch_Wgun_Rgt_Lft.png");
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "throwing"){
                    this.setImage("Ch_Wg_Shtng_Rgt_Lft.png");
                    numOfFrames2++;
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "notThrowing"){
                    this.setImage("Ch_Wg_Rgt_Lft.png");
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "shanking"){
                    this.setImage("Ch_Wk_Shtng_Rgt_Lft.png");
                    numOfFrames3++;
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "notShanking"){
                    this.setImage("Ch_Wk_Rgt_Lft.png");
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "m16ing"){
                    this.setImage("Ch_Wmg_Shtng_Rgt_Lft.png");
                    numOfFrames4++;
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "notM16ing"){
                    this.setImage("Ch_Wmg_Rgt_Lft.png");
                }
                if((currentEquip == 2 && grenadeCounter == 0) || (currentEquip == 3 && knifeCounter == 0) || (currentEquip == 4 && m16AmmoCounter == 0)
                  || (currentEquip == 5 && slot5Counter == 0) || (currentEquip == 6 && slot6Counter == 0) || (currentEquip == 7 && slot7Counter == 0)
                  || (currentEquip == 8 && slot8Counter == 0) || (currentEquip == 9 && slot9Counter == 0) || (currentEquip == 1 && handgunCounter == 0)){
                    this.setImage("Ch_Rgt_Lft.png");
                }
                counter++;
                switchTimer = switchTimerVar;
            }else if(counter > 0){
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "shooting"){
                    this.setImage("Ch_Wgun_Shtng_Rgt_Def.png");
                    numOfFrames++;
                }
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "notShooting"){
                    this.setImage("Ch_Wgun_Rgt_Def.png");
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "throwing"){
                    this.setImage("Ch_Wg_Shtng_Rgt_Def.png");
                    numOfFrames2++;
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "notThrowing"){
                    this.setImage("Ch_Wg_Rgt_Def.png");
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "shanking"){
                    this.setImage("Ch_Wk_Shtng_Rgt_Def.png");
                    numOfFrames3++;
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "notShanking"){
                    this.setImage("Ch_Wk_Rgt_Def.png");
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "m16ing"){
                    this.setImage("Ch_Wmg_Shtng_Rgt_Def.png");
                    numOfFrames4++;
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "notM16ing"){
                    this.setImage("Ch_Wmg_Rgt_Def.png");
                }
                if((currentEquip == 2 && grenadeCounter == 0) || (currentEquip == 3 && knifeCounter == 0) || (currentEquip == 4 && m16AmmoCounter == 0)
                  || (currentEquip == 5 && slot5Counter == 0) || (currentEquip == 6 && slot6Counter == 0) || (currentEquip == 7 && slot7Counter == 0)
                  || (currentEquip == 8 && slot8Counter == 0) || (currentEquip == 9 && slot9Counter == 0) || (currentEquip == 1 && handgunCounter == 0)){
                    this.setImage("Ch_Rgt_Def.png");
                }
                counter++;
                switchTimer = switchTimerVar;
            }else{
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "shooting"){
                    this.setImage("Ch_Wgun_Shtng_Rgt_Rgt.png");
                    numOfFrames++;
                }
                if(currentEquip == 1 && handgunCounter > 0 && isCharShooting == "notShooting"){
                    this.setImage("Ch_Wgun_Rgt_Rgt.png");
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "throwing"){
                    this.setImage("Ch_Wg_Shtng_Rgt_Rgt.png");
                    numOfFrames2++;
                }
                if(currentEquip == 2 && grenadeCounter > 0 && isCharThrowing == "notThrowing"){
                    this.setImage("Ch_Wg_Rgt_Rgt.png");
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "shanking"){
                    this.setImage("Ch_Wk_Shtng_Rgt_Rgt.png");
                    numOfFrames3++;
                }
                if(currentEquip == 3 && knifeCounter > 0 && isCharShanking == "notShanking"){
                    this.setImage("Ch_Wk_Rgt_Rgt.png");
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "m16ing"){
                    this.setImage("Ch_Wmg_Shtng_Rgt_Rgt.png");
                    numOfFrames4++;
                }
                if(currentEquip == 4 && m16AmmoCounter > 0 && isCharM16ing == "notM16ing"){
                    this.setImage("Ch_Wmg_Rgt_Rgt.png");
                }
                if((currentEquip == 2 && grenadeCounter == 0) || (currentEquip == 3 && knifeCounter == 0) || (currentEquip == 4 && m16AmmoCounter == 0)
                  || (currentEquip == 5 && slot5Counter == 0) || (currentEquip == 6 && slot6Counter == 0) || (currentEquip == 7 && slot7Counter == 0)
                  || (currentEquip == 8 && slot8Counter == 0) || (currentEquip == 9 && slot9Counter == 0) || (currentEquip == 1 && handgunCounter == 0)){
                    this.setImage("Ch_Rgt_Rgt.png");
                }
                counter++;
                switchTimer = switchTimerVar;
            }
        }
    }
    
    public void changeImageUp(){
        int moveX = 0;
        int moveY = 0;
        if ((((this.getImage()).toString() == "Ch_Bckwrd_Def.png") || ((this.getImage()).toString() == "Ch_Bckwrd_Lft.png") || ((this.getImage()).toString() == "Ch_Bckwrd_Rgt.png"))
            || (((this.getImage()).toString() == "Ch_Wgun_Bckwrd_Def.png") || ((this.getImage()).toString() == "Ch_Wgun_Bckwrd_Lft.png") || ((this.getImage()).toString() == "Ch_Wgun_Bckwrd_Rgt.png"))
            || (((this.getImage()).toString() == "Ch_Wgun_Shtng_Bckwrd_Def.png") || ((this.getImage()).toString() == "Ch_Wgun_Shtng_Bckwrd_Lft.png") || ((this.getImage()).toString() == "Ch_Wgun_Shtng_Bckwrd_Rgt.png"))
            || (((this.getImage()).toString() == "Ch_Wg_Bckwrd_Def.png") || ((this.getImage()).toString() == "Ch_Wg_Bckwrd_Lft.png") || ((this.getImage()).toString() == "Ch_Wg_Bckwrd_Rgt.png"))
            || (((this.getImage()).toString() == "Ch_Wg_Shtng_Bckwrd_Def.png") || ((this.getImage()).toString() == "Ch_Wg_Shtng_Bckwrd_Lft.png") || ((this.getImage()).toString() == "Ch_Wg_Shtng_Bckwrd_Rgt.png"))
            || (((this.getImage()).toString() == "Ch_Wk_Bckwrd_Def.png") || ((this.getImage()).toString() == "Ch_Wk_Bckwrd_Lft.png") || ((this.getImage()).toString() == "Ch_Wk_Bckwrd_Rgt.png"))
            || (((this.getImage()).toString() == "Ch_Wk_Shtng_Bckwrd_Def.png") || ((this.getImage()).toString() == "Ch_Wk_Shtng_Bckwrd_Lft.png") || ((this.getImage()).toString() == "Ch_Wk_Shtng_Bckwrd_Rgt.png"))
            || (((this.getImage()).toString() == "Ch_Wmg_Bckwrd_Def.png") || ((this.getImage()).toString() == "Ch_Wmg_Bckwrd_Lft.png") || ((this.getImage()).toString() == "Ch_Wmg_Bckwrd_Rgt.png"))
            || (((this.getImage()).toString() == "Ch_Wmg_Shtng_Bckwrd_Def.png") || ((this.getImage()).toString() == "Ch_Wmg_Shtng_Bckwrd_Lft.png") || ((this.getImage()).toString() == "Ch_Wmg_Shtng_Bckwrd_Rgt.png")))
            {
            }
            else
            {
                //this.setImage("Ch_Bckwrd_Def.png"); Apparently this line is NOT needed due to the swapImage methods
                setLocation(getX(), getY()-4);
                moveY -= 4;
                runIntoObject(moveX, moveY);
                runIntoWall(moveX, moveY);
            }
    }
    
    public void changeImageDown(){
        int moveX = 0;
        int moveY = 0;
        if ((((this.getImage()).toString() == "Ch_Def_Fwrd.png") || ((this.getImage()).toString() == "Ch_Def_Lft.png") || ((this.getImage()).toString() == "Ch_Def_Rgt.png"))
            || (((this.getImage()).toString() == "Ch_Wgun_Fwrd_Def.png") || ((this.getImage()).toString() == "Ch_Wgun_Fwrd_Lft.png") || ((this.getImage()).toString() == "Ch_Wgun_Fwrd_Rgt.png"))
            || (((this.getImage()).toString() == "Ch_Wgun_Shtng_Fwrd_Def.png") || ((this.getImage()).toString() == "Ch_Wgun_Shtng_Fwrd_Lft.png") || ((this.getImage()).toString() == "Ch_Wgun_Shtng_Fwrd_Rgt.png"))
            || (((this.getImage()).toString() == "Ch_Wg_Fwrd_Def.png") || ((this.getImage()).toString() == "Ch_Wg_Fwrd_Lft.png") || ((this.getImage()).toString() == "Ch_Wg_Fwrd_Rgt.png"))
            || (((this.getImage()).toString() == "Ch_Wg_Shtng_Fwrd_Def.png") || ((this.getImage()).toString() == "Ch_Wg_Shtng_Fwrd_Lft.png") || ((this.getImage()).toString() == "Ch_Wg_Shtng_Fwrd_Rgt.png"))
            || (((this.getImage()).toString() == "Ch_Wk_Fwrd_Def.png") || ((this.getImage()).toString() == "Ch_Wk_Fwrd_Lft.png") || ((this.getImage()).toString() == "Ch_Wk_Fwrd_Rgt.png"))
            || (((this.getImage()).toString() == "Ch_Wk_Shtng_Fwrd_Def.png") || ((this.getImage()).toString() == "Ch_Wk_Shtng_Fwrd_Lft.png") || ((this.getImage()).toString() == "Ch_Wk_Shtng_Fwrd_Rgt.png"))
            || (((this.getImage()).toString() == "Ch_Wmg_Fwrd_Def.png") || ((this.getImage()).toString() == "Ch_Wmg_Fwrd_Lft.png") || ((this.getImage()).toString() == "Ch_Wmg_Fwrd_Rgt.png"))
            || (((this.getImage()).toString() == "Ch_Wmg_Shtng_Fwrd_Def.png") || ((this.getImage()).toString() == "Ch_Wmg_Shtng_Fwrd_Lft.png") || ((this.getImage()).toString() == "Ch_Wmg_Shtng_Fwrd_Rgt.png")))
            {
            }
            else
            {
                //this.setImage("Ch_Def_Fwrd.png"); Apparently this line is NOT needed due to the swapImage methods
                setLocation(getX(), getY()+4);
                moveY += 4;
                runIntoObject(moveX, moveY);
                runIntoWall(moveX, moveY);
            }
    }
    
    public void changeImageLeft(){
        int moveX = 0;
        int moveY = 0;
        if ((((this.getImage()).toString() == "Ch_Lft_Def.png") || ((this.getImage()).toString() == "Ch_Lft_Lft.png" ) || ((this.getImage()).toString() == "Ch_Lft_Def.png"))
            || (((this.getImage()).toString() == "Ch_Wgun_Lft_Def.png") || ((this.getImage()).toString() == "Ch_Wgun_Lft_Lft.png" ) || ((this.getImage()).toString() == "Ch_Wgun_Lft_Def.png"))
            || (((this.getImage()).toString() == "Ch_Wgun_Shtng_Lft_Def.png") || ((this.getImage()).toString() == "Ch_Wgun_Shtng_Lft_Lft.png" ) || ((this.getImage()).toString() == "Ch_Wgun_Shtng_Lft_Def.png"))
            || (((this.getImage()).toString() == "Ch_Wg_Lft_Def.png") || ((this.getImage()).toString() == "Ch_Wg_Lft_Lft.png" ) || ((this.getImage()).toString() == "Ch_Wg_Lft_Def.png"))
            || (((this.getImage()).toString() == "Ch_Wg_Shtng_Lft_Def.png") || ((this.getImage()).toString() == "Ch_Wg_Shtng_Lft_Lft.png" ) || ((this.getImage()).toString() == "Ch_Wg_Shtng_Lft_Def.png"))
            || (((this.getImage()).toString() == "Ch_Wk_Lft_Def.png") || ((this.getImage()).toString() == "Ch_Wk_Lft_Lft.png" ) || ((this.getImage()).toString() == "Ch_Wk_Lft_Def.png"))
            || (((this.getImage()).toString() == "Ch_Wk_Shtng_Lft_Def.png") || ((this.getImage()).toString() == "Ch_Wk_Shtng_Lft_Lft.png" ) || ((this.getImage()).toString() == "Ch_Wk_Shtng_Lft_Def.png"))
            || (((this.getImage()).toString() == "Ch_Wmg_Lft_Def.png") || ((this.getImage()).toString() == "Ch_Wmg_Lft_Lft.png" ) || ((this.getImage()).toString() == "Ch_Wmg_Lft_Def.png"))
            || (((this.getImage()).toString() == "Ch_Wmg_Shtng_Lft_Def.png") || ((this.getImage()).toString() == "Ch_Wmg_Shtng_Lft_Lft.png" ) || ((this.getImage()).toString() == "Ch_Wmg_Shtng_Lft_Def.png")))
            {
            }
            else
            {
                //this.setImage("Ch_Lft_Def.png"); Apparently this line is NOT needed due to the swapImage methods
                move(-4);
                moveX -= 4;
                runIntoObject(moveX, moveY);
                runIntoWall(moveX, moveY);
            }
    }
    
    public void changeImageRight(){
        int moveX = 0;
        int moveY = 0;
        if ((((this.getImage()).toString() == "Ch_Rgt_Def.png") || ((this.getImage()).toString() == "Ch_Rgt_Lft.png" ) || ((this.getImage()).toString() == "Ch_Rgt_Def.png"))
            || (((this.getImage()).toString() == "Ch_Wgun_Rgt_Def.png") || ((this.getImage()).toString() == "Ch_Wgun_Rgt_Lft.png" ) || ((this.getImage()).toString() == "Ch_Wgun_Rgt_Def.png"))
            || (((this.getImage()).toString() == "Ch_Wgun_Shtng_Rgt_Def.png") || ((this.getImage()).toString() == "Ch_Wgun_Shtng_Rgt_Lft.png" ) || ((this.getImage()).toString() == "Ch_Wgun_Shtng_Rgt_Def.png"))
            || (((this.getImage()).toString() == "Ch_Wg_Rgt_Def.png") || ((this.getImage()).toString() == "Ch_Wg_Rgt_Lft.png" ) || ((this.getImage()).toString() == "Ch_Wg_Rgt_Def.png"))
            || (((this.getImage()).toString() == "Ch_Wg_Shtng_Rgt_Def.png") || ((this.getImage()).toString() == "Ch_Wg_Shtng_Rgt_Lft.png" ) || ((this.getImage()).toString() == "Ch_Wg_Shtng_Rgt_Def.png"))
            || (((this.getImage()).toString() == "Ch_Wk_Rgt_Def.png") || ((this.getImage()).toString() == "Ch_Wk_Rgt_Lft.png" ) || ((this.getImage()).toString() == "Ch_Wk_Rgt_Def.png"))
            || (((this.getImage()).toString() == "Ch_Wk_Shtng_Rgt_Def.png") || ((this.getImage()).toString() == "Ch_Wk_Shtng_Rgt_Lft.png" ) || ((this.getImage()).toString() == "Ch_Wk_Shtng_Rgt_Def.png"))
            || (((this.getImage()).toString() == "Ch_Wmg_Rgt_Def.png") || ((this.getImage()).toString() == "Ch_Wmg_Rgt_Lft.png" ) || ((this.getImage()).toString() == "Ch_Wmg_Rgt_Def.png"))
            || (((this.getImage()).toString() == "Ch_Wmg_Shtng_Rgt_Def.png") || ((this.getImage()).toString() == "Ch_Wmg_Shtng_Rgt_Lft.png" ) || ((this.getImage()).toString() == "Ch_Wmg_Shtng_Rgt_Def.png")))
            {
            }
            else
            {
                //this.setImage("Ch_Rgt_Def.png"); Apparently this line is NOT needed due to the swapImage methods
                move(4);
                moveX += 4;
                runIntoObject(moveX, moveY);
                runIntoWall(moveX, moveY);
            }
    }
    
    public void runIntoObject(int moveX, int moveY)
    { 
        if (getOneIntersectingObject(StillObject.class) != null)
        {
            setLocation(getX() - moveX, getY() - moveY);
        }        
    }
    
    public void runIntoWall(int moveX, int moveY)
    {
        if (getX() <= 20 || getX() >= getWorld().getWidth() - 20)
        {
            setLocation(getX() - (moveX *2), getY() - (moveY*2));
        }
        if (getY() <= 55 || getY() >= getWorld().getHeight())
        {
            setLocation(getX() - (moveX*2), getY() - (moveY*2));
        }
    }
    
    public void shoot()
    {
        greenfoot.MouseInfo mouse = Greenfoot.getMouseInfo();
        if(currentEquip == 1)
        {
            if(ammo != 0){
                if (shotTimer > 0)
                {
                    shotTimer = shotTimer -1;
                }
                else if ((Greenfoot.mouseClicked(this) == true) || (Greenfoot.mouseClicked(null) == true)  && (mouse.getButton() == 1))
                {
                    getWorld().addObject(new CharBullet(this), getX()+30, getY());
                    shotTimer = 5;
                    Greenfoot.playSound("char_pshot.wav");
                    ammo -= 1;
                    isCharShooting = "shooting";
                }
            }
        }
        if(currentEquip == 4)
        {
            if(m16AmmoCounter != 0)
            {
                if((Greenfoot.mouseClicked(this) == true) || (Greenfoot.mouseClicked(null) == true) || Greenfoot.mousePressed(this) == true || Greenfoot.mousePressed(null) == true && (mouse.getButton() == 1))
                {
                    if(shotTimer2 > 0)
                    {
                        shotTimer2--;
                    }
                    else
                    {
                        getWorld().addObject(new CharBullet(this), getX()+30, getY());
                        shotTimer2 = 3;
                        Greenfoot.playSound("m16_shot.wav");
                        m16AmmoCounter -= 1;
                        isCharM16ing = "m16ing";
                        clicked = "clicked";
                    }
                }
            }
        }
        if(currentEquip == 4)
        {
            if(m16AmmoCounter != 0)
            {
                if(clicked == "clicked"){
                    if(switchTimer > 0){
                        switchTimer2--;
                    }else{
                        switchTimer2 = 1;
                        if(anotherCounter == 0){
                            getWorld().addObject(new CharBullet(this), getX()+30, getY());
                            anotherCounter++;
                            Greenfoot.playSound("m16_shot.wav");
                            m16AmmoCounter -= 1;
                            isCharM16ing = "m16ing";
                        }else if(anotherCounter == 1){
                            if(m16AmmoCounter != 0){
                                getWorld().addObject(new CharBullet(this), getX()+30, getY());
                                Greenfoot.playSound("m16_shot.wav");
                                m16AmmoCounter -= 1;
                                isCharM16ing = "m16ing";
                                clicked = "notClicked";
                                anotherCounter = 0;
                            }
                        }else{}
                    }
                }
            }
        }
    }
    
    public void throwGrenade(){
        greenfoot.MouseInfo mouse = Greenfoot.getMouseInfo();
        if(grenadeCounter != 0){
            if(grenadeTimer > 0){
                grenadeTimer = grenadeTimer - 1;
            }else if((Greenfoot.mouseClicked(this) == true) || (Greenfoot.mouseClicked(null) == true)  && (mouse.getButton() == 1)){
                getWorld().addObject(new CharGrenade(this), getX()+30, getY());
                grenadeTimer = 10;
                grenadeCounter -= 1;
                minus = 1;
                isCharThrowing = "throwing";
            }
        }
    }
    
    public void shank(){
        greenfoot.MouseInfo mouse = Greenfoot.getMouseInfo();
        if(knifeCounter != 0){
            if(knifeTimer > 0){
                knifeTimer--;
            }else if((Greenfoot.mouseClicked(this) == true) || (Greenfoot.mouseClicked(null) == true)  && (mouse.getButton() == 1)){
                knifeTimer = 5;
                if(getOneIntersectingObject(Enemy.class) != null){
                    knifeCounter--;
                    minus = 1;
                    getWorld().addObject(knifeKillObject, this.getX(), this.getY());
                    List<Enemy> listOfCops = getObjectsInRange(100, Enemy.class);
                    for(int i = 0; i < listOfCops.size(); i++){
                        Enemy cop = listOfCops.get(i);
                        copX = cop.getX();
                        copY = cop.getY();
                    }
                    Greenfoot.playSound("knife_stab.mp3");
                    getWorld().addObject(copExplosion1, copX, copY);
                    //shankingTime = "itsShankingTime";
                }else{
                    //shankingTime = "itsNotShankingTime";
                }
                if(getOneIntersectingObject(Janitor.class) != null){
                    knifeCounter--;
                    minus = 1;
                    getWorld().addObject(knifeKillObject, this.getX(), this.getY());
                    Greenfoot.playSound("knife_stab.mp3");
                }else{
                    //shankingTime = "itsNotShankingTime";
                }
                isCharShanking = "shanking";
            }
        }
    }
    
    public void changeWorld()
    {
        if (getOneIntersectingObject(Door2.class) != null)
        {
            Background background = new Background(900,300);
            Greenfoot.setWorld(background);
            
        }
        
        if (getOneIntersectingObject(Door3.class) != null)
        {
            ParkingLot parkingLot = new ParkingLot();
            Greenfoot.setWorld(parkingLot);
        }
    }
    
    public void encounterItem(){
        Handgun handgun = (Handgun)getOneIntersectingObject(Handgun.class);
        Grenade grenade = (Grenade)getOneIntersectingObject(Grenade.class);
        Knife knife = (Knife)getOneIntersectingObject(Knife.class);
        M16 m16 = (M16)getOneIntersectingObject(M16.class);
        M16Ammo m16Ammo = (M16Ammo)getOneIntersectingObject(M16Ammo.class);
        PistolAmmo pAmmo = (PistolAmmo)getOneIntersectingObject(PistolAmmo.class);
        SafeCodes safeCodes = (SafeCodes)getOneIntersectingObject(SafeCodes.class);
        CharacterFile characterFile = (CharacterFile)getOneIntersectingObject(CharacterFile.class);
        SecurityCode securityCode = (SecurityCode)getOneIntersectingObject(SecurityCode.class);
        JanitorKey janitorKey = (JanitorKey)getOneIntersectingObject(JanitorKey.class);
        if(handgun != null){
            //inventory[inventoryCounter] = handgun;
            inventoryCounter++;
            ammo += 3;
            getWorld().removeObject(handgun);
            if(State.worldNumber == 1){
                State.parkingLotStart[handgun.getIndex()] = false;
            }
            //System.out.println(State.worldNumber);
            //System.out.println(State.parkingLotStart[0]);
            Greenfoot.playSound("p_reload.wav");
        }
        if(grenade != null){
            for(int i = 0; i < inventory.length; i++){
                if(inventory[i] == grenade){
                    grenadeInv = "in";
                }
            }
            if(grenadeInv == "in"){
                inventoryCounter++;
                grenadeCounter++;
                getWorld().removeObject(grenade);
                if(State.worldNumber == 1){
                    State.parkingLotStart[grenade.getIndex()] = false;
                }
                if(State.worldNumber == 8){
                    State.janitor1[grenade.getIndex()] = false;
                }
                if(State.worldNumber == 18){
                    State.level2Offices2[grenade.getIndex()] = false;
                }
                minus = 0;
            }
            if(grenadeInv == "out"){
                //inventory[inventoryCounter] = grenade;
                //System.out.println(inventory[0]);
                inventoryCounter++;
                grenadeCounter++;
                getWorld().removeObject(grenade);
                if(State.worldNumber == 1){
                    State.parkingLotStart[grenade.getIndex()] = false;
                }
                if(State.worldNumber == 8){
                    State.janitor1[grenade.getIndex()] = false;
                }
                if(State.worldNumber == 18){
                    State.level2Offices2[grenade.getIndex()] = false;
                }
                minus = 0;
            }
        }
        if(knife != null){
            for(int i = 0; i < inventory.length; i++){
                if(inventory[i] == knife){
                    knifeInv = "in";
                }
            }
            if(knifeInv == "in"){
                inventoryCounter++;
                knifeCounter++;
                getWorld().removeObject(knife);
                if(State.worldNumber == 9){
                    State.level2Security2[knife.getIndex()] = false;
                }
                if(State.worldNumber == 13){
                    State.hallway1[knife.getIndex()] = false;
                }
                if(State.worldNumber == 18){
                    State.level2Offices2[knife.getIndex()] = false;
                }
                minus = 0;
            }
            if(knifeInv == "out"){
                //inventory[inventoryCounter] = knife;
                //System.out.println(inventory[0]);
                inventoryCounter++;
                knifeCounter++;
                getWorld().removeObject(knife);
                if(State.worldNumber == 9){
                    State.level2Security2[knife.getIndex()] = false;
                }
                if(State.worldNumber == 13){
                    State.hallway1[knife.getIndex()] = false;
                }
                if(State.worldNumber == 18){
                    State.level2Offices2[knife.getIndex()] = false;
                }
                //State.parkingLotStart[knife.getIndex()] = false;
                minus = 0;
            }
        }
        if(m16 != null){
            for(int i = 0; i < inventory.length; i++){
                if(inventory[i] == m16){
                    m16Inv = "in";
                }
            }
            if(m16Inv == "in"){
                inventoryCounter++;
                getWorld().removeObject(m16);
                if(State.worldNumber == 15){
                    State.hallway3[m16.getIndex()] = false;
                }
                minus = 0;
            }
            if(m16Inv == "out"){
                //inventory[inventoryCounter] = knife;
                //System.out.println(inventory[0]);
                inventoryCounter++;
                getWorld().removeObject(m16);
                if(State.worldNumber == 15){
                    State.hallway3[m16.getIndex()] = false;
                }
                //State.parkingLotStart[knife.getIndex()] = false;
                minus = 0;
            }
        }
        if(m16Ammo != null){
            if(m16AmmoCounter < 25){
                if(m16AmmoCounter > 19){
                    m16AmmoCounter = 25;
                }else{
                    m16AmmoCounter += 5;
                }
            }
            getWorld().removeObject(m16Ammo);
            if(State.worldNumber == 15){
                State.hallway3[m16Ammo.getIndex()] = false;
            }
            //State.parkingLotStart[pAmmo.getIndex()] = false;
            Greenfoot.playSound("p_reload.wav");
        }
        if(pAmmo != null){
            if(ammo < 12){
                if((12 - ammo) < 3 && (12 - ammo) > 0){
                    ammo = ammo + (12 - ammo);
                }else{
                    ammo += 3;
                }
            }
            getWorld().removeObject(pAmmo);
            if(State.worldNumber == 5){
                State.background[pAmmo.getIndex()] = false;
            }
            if(State.worldNumber == 8){
                State.janitor1[pAmmo.getIndex()] = false;
            }
            if(State.worldNumber == 9){
                State.level2Security2[pAmmo.getIndex()] = false;
            }
            if(State.worldNumber == 12){
                State.level2OfficesLast[pAmmo.getIndex()] = false;
            }
            if(State.worldNumber == 13){
                State.hallway1[pAmmo.getIndex()] = false;
            }
            if(State.worldNumber == 14){
                State.hallway[pAmmo.getIndex()] = false;
            }
            if(State.worldNumber == 19){
                State.level2Offices[pAmmo.getIndex()] = false;
            }
            if(State.worldNumber == 23){
                State.janitor2[pAmmo.getIndex()] = false;
            }
            //State.parkingLotStart[pAmmo.getIndex()] = false;
            Greenfoot.playSound("p_reload.wav");
        }
        if(safeCodes != null){
            for(int i = 0; i < inventory.length; i++){
                if(inventory[i] == safeCodes){
                    safeCodesInv = "in";
                }
            }
            if(safeCodesInv == "in"){
                inventoryCounter++;
                slot5Counter++;
                getWorld().removeObject(safeCodes);
                if(State.worldNumber == 9){
                    State.level2Security2[safeCodes.getIndex()] = false;
                }
                minus = 0;
            }  
            if(safeCodesInv == "out"){
                inventoryCounter++;
                slot5Counter++;
                getWorld().removeObject(safeCodes);
                if(State.worldNumber == 9){
                    State.level2Security2[safeCodes.getIndex()] = false;
                }
                minus = 0;
            }
        }
        if(characterFile != null){
            for(int i = 0; i < inventory.length; i++){
                if(inventory[i] == characterFile){
                    characterFileInv = "in";
                }
            }
            if(characterFileInv == "in"){
                inventoryCounter++;
                slot6Counter++;
                getWorld().removeObject(characterFile);
                if(State.worldNumber == 12){
                    State.level2OfficesLast[characterFile.getIndex()] = false;
                }
                minus = 0;
            }  
            if(characterFileInv == "out"){
                inventoryCounter++;
                slot6Counter++;
                getWorld().removeObject(characterFile);
                if(State.worldNumber == 12){
                    State.level2OfficesLast[characterFile.getIndex()] = false;
                }
                minus = 0;
            }
        }
        if(securityCode != null){
            for(int i = 0; i < inventory.length; i++){
                if(inventory[i] == securityCode){
                    securityCodeInv = "in";
                }
            }
            if(securityCodeInv == "in"){
                inventoryCounter++;
                slot7Counter++;
                getWorld().removeObject(securityCode);
                if(State.worldNumber == 1){
                    State.parkingLotStart[securityCode.getIndex()] = false;
                }
                minus = 0;
            }  
            if(securityCodeInv == "out"){
                inventoryCounter++;
                slot7Counter++;
                getWorld().removeObject(securityCode);
                if(State.worldNumber == 1){
                    State.parkingLotStart[securityCode.getIndex()] = false;
                }
                minus = 0;
            }
        }
        if(janitorKey != null){
            for(int i = 0; i < inventory.length; i++){
                if(inventory[i] == janitorKey){
                    janitorKeyInv = "in";
                }
            }
            if(janitorKeyInv == "in"){
                inventoryCounter++;
                slot8Counter++;
                getWorld().removeObject(janitorKey);
                if(State.worldNumber == 23){
                    State.janitor2[janitorKey.getIndex()] = false;
                }
                minus = 0;
            }  
            if(janitorKeyInv == "out"){
                inventoryCounter++;
                slot8Counter++;
                getWorld().removeObject(janitorKey);
                if(State.worldNumber == 23){
                    State.janitor2[janitorKey.getIndex()] = false;
                }
                minus = 0;
            }
        }
    }
    
    public void detectEquip(){
        //int previousEquip = currentEquip;
        //currentEquip += amount;
        if(doOnly1Time == 0){
            getWorld().addObject(highlightInv, 145, 550);
            doOnly1Time++;
        }
        if(doOnly1Time == 1){
            if(Greenfoot.isKeyDown("1")){
                highlightInv.setLocation(145, 550);
                currentEquip = 1;
            }
            if(Greenfoot.isKeyDown("2")){
                highlightInv.setLocation(220, 550);
                currentEquip = 2;
            }
            if(Greenfoot.isKeyDown("3")){
                highlightInv.setLocation(299, 550);
                currentEquip = 3;
            }
            if(Greenfoot.isKeyDown("4")){
                highlightInv.setLocation(375, 550);
                currentEquip = 4;
            }
            if(Greenfoot.isKeyDown("5")){
                highlightInv.setLocation(450, 550);
                currentEquip = 5;
            }
            if(Greenfoot.isKeyDown("6")){
                highlightInv.setLocation(525, 550);
                currentEquip = 6;
            }
            if(Greenfoot.isKeyDown("7")){
                highlightInv.setLocation(601, 550);
                currentEquip = 7;
            }
            if(Greenfoot.isKeyDown("8")){
                highlightInv.setLocation(677, 550);
                currentEquip = 8;
            }
            if(Greenfoot.isKeyDown("9")){
                highlightInv.setLocation(751, 550);
                currentEquip = 9;
            }
        }
    }
    
    public void minusHealth(){
        HealthPackBg healthPackBg = (HealthPackBg)getOneIntersectingObject(HealthPackBg.class);
        if(healthPackBg != null){
            if(totalHealth < 10){
                totalHealth += 1;
                getWorld().removeObject(healthPackBg);
                if(State.worldNumber == 5){
                    State.background[healthPackBg.getIndex()] = false;
                }
                if(State.worldNumber == 8){
                    State.janitor1[healthPackBg.getIndex()] = false;
                }
                if(State.worldNumber == 9){
                    State.level2Security2[healthPackBg.getIndex()] = false;
                }
                if(State.worldNumber == 12){
                    State.level2OfficesLast[healthPackBg.getIndex()] = false;
                }
                if(State.worldNumber == 13){
                    State.hallway1[healthPackBg.getIndex()] = false;
                }
                if(State.worldNumber == 18){
                    State.level2Offices2[healthPackBg.getIndex()] = false;
                }
                if(State.worldNumber == 19){
                    State.level2Offices[healthPackBg.getIndex()] = false;
                }
                if(State.worldNumber == 22){
                    State.secretHallway2[healthPackBg.getIndex()] = false;
                }
                if(State.worldNumber == 23){
                    State.janitor2[healthPackBg.getIndex()] = false;
                }
            }
        }
        
        if((getOneIntersectingObject(CopBullet.class) != null) || (getOneIntersectingObject(CharBullet.class) != null) || (getOneIntersectingObject(JanitorBullet.class) != null)){
            CopBullet bullet = (CopBullet)getOneIntersectingObject(CopBullet.class);
            CharBullet bullet2 = (CharBullet)getOneIntersectingObject(CharBullet.class);
            JanitorBullet bullet3 = (JanitorBullet)getOneIntersectingObject(JanitorBullet.class);
            if(bullet2 != null){
                if(bullet2.deflected == "deflected"){
                    totalHealth -= 1;
                }
            }
            if(bullet != null){
                totalHealth -= 1;
                getWorld().removeObject(bullet);
            }
            if(bullet3 != null){
                totalHealth -= 1;
                getWorld().removeObject(bullet3);
            }
            if(bullet2 != null){
                if(bullet2.deflected == "deflected"){
                    getWorld().removeObject(bullet2);
                }
            }
            if(totalHealth == 0)
            {
                resetStatics();
                getWorld().removeObject(this);
                youShallNotPass = true;
                amIDead = "dead";
                GameOver deathScreen = new GameOver(killCount);
                Greenfoot.setWorld(deathScreen);
            }
        }
    }
    
    public void resetStatics(){
        grenadeCounter = 0;
        knifeCounter = 0;
    }
    
    public void updateHealth()
    {
        if(totalHealth == 10){
            getWorld().addObject(healthBar10, 50, 550);
        }
        if(totalHealth == 9){
            getWorld().removeObject(healthBar10);
            getWorld().addObject(healthBar9, 50, 550);
        }
        if(totalHealth == 8){
            getWorld().removeObject(healthBar9);
            getWorld().addObject(healthBar8, 50, 550);
        }
        if(totalHealth == 7){
            getWorld().removeObject(healthBar8);
            getWorld().addObject(healthBar7, 50, 550);
        }
        if(totalHealth == 6){
            getWorld().removeObject(healthBar7);
            getWorld().addObject(healthBar6, 50, 550);
        }
        if(totalHealth == 5){
            getWorld().removeObject(healthBar6);
            getWorld().addObject(healthBar5, 50, 550);
        }
        if(totalHealth == 4){
            getWorld().removeObject(healthBar5);
            getWorld().addObject(healthBar4, 50, 550);
        }
        if(totalHealth == 3){
            getWorld().removeObject(healthBar4);
            getWorld().addObject(healthBar3, 50, 550);
        }
        if(totalHealth == 2){
            getWorld().removeObject(healthBar3);
            getWorld().addObject(healthBar2, 50, 550);
        }
        if(totalHealth == 1){
            getWorld().removeObject(healthBar2);
            getWorld().addObject(healthBar1, 50, 550);
        }
    }
    
    public String getShankingTime(){
        return shankingTime;
    }
    
    public int getMinus(){
        return minus;
    }
    
    public int getCurrentEquip(){
        return currentEquip;
    }
    
    public Actor[] getInventory(){
        return inventory;
    }
    
    public int getAmmo(){
        return ammo;
    }
    
    public int getGrenades(){
        return grenadeCounter;
    }
    
    public int getKnifes(){
        return knifeCounter;
    }
    
    public int getM16Ammo(){
        return m16AmmoCounter;
    }
    
    public void setHealth(int health)
    {
        totalHealth = health;
    }
    
    public void setKillCount(int kills)
    {
        killCount = kills;
    }
    
    public int getHandgunCounter(){
        return handgunCounter;
    }
    
    public int getSlot5Counter(){
        return slot5Counter;
    }
    
    public int getSlot6Counter(){
        return slot6Counter;
    }
    
    public int getSlot7Counter(){
        return slot7Counter;
    }
    
    public int getSlot8Counter(){
        return slot8Counter;
    }
    
    public int getSlot9Counter(){
        return slot9Counter;
    }
}

/*class ScrollingListener implements MouseWheelListener
{
    int amount = 0;
    
    public void mouseWheelMoved(MouseWheelEvent e){
        amount += e.getWheelRotation();  
        e.consume();
    }
    
    public int getScroll(){
        int t = amount;
        amount = 0;
        return t;
    }
}*/