import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InventoryBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InventoryBar extends BackgroundObject
{
    public Actor[] currentInventory;
    public static int currentGrenades;
    public static int currentKnifes;
    public static int currentM16Ammo;
    public static int currentAmmo;
    public static int currentMinus;
    public static int currentSlot5;
    public static int currentSlot6;
    public static int currentSlot7;
    public static int currentSlot8;
    public int grenadePos;
    public int knifePos;
    public int m16Pos;
    public int ammoPos;
    public String addGrenade = "dontAdd";
    
     X2 gx2 = new X2();
     X3 gx3 = new X3();
     X4 gx4 = new X4();
     X5 gx5 = new X5();
     X6 gx6 = new X6();
     X7 gx7 = new X7();
     X8 gx8 = new X8();
     X9 gx9 = new X9();
     X10 gx10 = new X10();
     X2 kx2 = new X2();
     X3 kx3 = new X3();
     X4 kx4 = new X4();
     X5 kx5 = new X5();
     X6 kx6 = new X6();
     X7 kx7 = new X7();
     X8 kx8 = new X8();
     X9 kx9 = new X9();
     X10 kx10 = new X10();
     KnifeInv knifeInv = new KnifeInv();
     GrenadeInv grenadeInv = new GrenadeInv();
     SafeCodesInv safeCodesInv = new SafeCodesInv();
     CharacterFileInv characterFileInv = new CharacterFileInv();
     SecurityCodeInv securityCodeInv = new SecurityCodeInv();
     JanitorKeyInv janitorKeyInv = new JanitorKeyInv();
     M16Inv m16Inv = new M16Inv();
    /**
     * Act - do whatever the InventoryBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        for(Object obj: getWorld().getObjects(Character.class)){
            Character character = (Character) obj;
            currentInventory = character.getInventory();
        }
        for(Object obj: getWorld().getObjects(Character.class)){
            Character character = (Character) obj;
            currentGrenades = character.getGrenades();
        }
        for(Object obj: getWorld().getObjects(Character.class)){
            Character character = (Character) obj;
            currentKnifes = character.getKnifes();
        }
        for(Object obj: getWorld().getObjects(Character.class)){
            Character character = (Character) obj;
            currentM16Ammo = character.getM16Ammo();
        }
        for(Object obj: getWorld().getObjects(Character.class)){
            Character character = (Character) obj;
            currentAmmo = character.getAmmo();
        }
        for(Object obj: getWorld().getObjects(Character.class)){
            Character character = (Character) obj;
            currentSlot5 = character.getSlot5Counter();
        }
        for(Object obj: getWorld().getObjects(Character.class)){
            Character character = (Character) obj;
            currentSlot6 = character.getSlot6Counter();
        }
        for(Object obj: getWorld().getObjects(Character.class)){
            Character character = (Character) obj;
            currentSlot7 = character.getSlot7Counter();
        }
        for(Object obj: getWorld().getObjects(Character.class)){
            Character character = (Character) obj;
            currentSlot8 = character.getSlot8Counter();
        }
        for(Object obj: getWorld().getObjects(Character.class)){
            Character character = (Character) obj;
            currentMinus = character.getMinus();
        }
        changeGrenades();
        changeKnifes();
        changeSlot5();
        changeSlot6();
        changeSlot7();
        changeSlot8();
        changeM16();
    }
    
    public void changeM16(){
        if(currentM16Ammo == 0){
            if(currentMinus == 1){
                getWorld().removeObject(m16Inv);
            }
        }
        if(currentM16Ammo >= 1){
            if(currentMinus == 0){
                getWorld().addObject(m16Inv, 370, 550);
            }
        }
    }
    
    public void changeSlot8(){
        if(currentSlot8 == 0){
            if(currentMinus == 1){
                getWorld().removeObject(janitorKeyInv);
            }
        }
        if(currentSlot8 == 1){
            if(currentMinus == 0){
                getWorld().addObject(janitorKeyInv, 675, 550);
            }
        }
    }
    
    public void changeSlot7(){
        if(currentSlot7 == 0){
            if(currentMinus == 1){
                getWorld().removeObject(securityCodeInv);
            }
        }
        if(currentSlot7 == 1){
            if(currentMinus == 0){
                getWorld().addObject(securityCodeInv, 605, 550);
            }
        }
    }
    
    public void changeSlot5(){
        if(currentSlot5 == 0){
            if(currentMinus == 1){
                getWorld().removeObject(safeCodesInv);
            }
        }
        if(currentSlot5 == 1){
            if(currentMinus == 0){
                getWorld().addObject(safeCodesInv, 460, 550);
            }
        }
    }
    
    public void changeSlot6(){
        if(currentSlot6 == 0){
            if(currentMinus == 1){
                getWorld().removeObject(characterFileInv);
            }
        }
        if(currentSlot6 == 1){
            if(currentMinus == 0){
                getWorld().addObject(characterFileInv, 530, 550);
            }
        }
    }
    
    public void changeKnifes(){
        if(currentKnifes == 0){
            if(currentMinus == 1){
                getWorld().removeObject(knifeInv);
            }
        }
        if(currentKnifes == 1){
            if(currentMinus == 0){
                getWorld().addObject(knifeInv, 300, 550);
            }
            if(currentMinus == 1){
                getWorld().addObject(knifeInv, 300, 550);
                getWorld().removeObject(kx2);
            }
        }
        if(currentKnifes == 2){
            if(currentMinus == 0){
                getWorld().addObject(knifeInv, 300, 550);
                getWorld().addObject(kx2, 320, 560);
            }
            if(currentMinus == 1){
                getWorld().addObject(knifeInv, 300, 550);
                getWorld().addObject(kx2, 320, 560);
                getWorld().removeObject(kx3);
            }
        }
        if(currentKnifes == 3){
            if(currentMinus == 0){
                getWorld().addObject(knifeInv, 300, 550);
                getWorld().removeObject(kx2);
                getWorld().addObject(kx3, 320, 560);
            }
            if(currentMinus == 1){
                getWorld().addObject(knifeInv, 300, 550);
                getWorld().removeObject(kx4);
                getWorld().addObject(kx3, 320, 560);
            }
        }
        if(currentKnifes == 4){
            if(currentMinus == 0){
                getWorld().addObject(knifeInv, 300, 550);
                getWorld().removeObject(kx3);
                getWorld().addObject(kx4, 320, 560);
            }
            if(currentMinus == 1){
                getWorld().addObject(knifeInv, 300, 550);
                getWorld().removeObject(kx5);
                getWorld().addObject(kx4, 320, 560);
            }
        }
        if(currentKnifes == 5){
            if(currentMinus == 0){
                getWorld().addObject(knifeInv, 300, 550);
                getWorld().removeObject(kx4);
                getWorld().addObject(kx5, 320, 560);
            }
            if(currentMinus == 1){
                getWorld().addObject(knifeInv, 300, 550);
                getWorld().removeObject(kx6);
                getWorld().addObject(kx5, 320, 560);
            }
        }
        if(currentKnifes == 6){
            if(currentMinus == 0){
                getWorld().addObject(knifeInv, 300, 550);
                getWorld().removeObject(kx5);
                getWorld().addObject(kx6, 320, 560);
            }
            if(currentMinus == 1){
                getWorld().addObject(knifeInv, 300, 550);
                getWorld().removeObject(kx7);
                getWorld().addObject(kx6, 320, 560);
            }
        }
        if(currentKnifes == 7){
            if(currentMinus == 0){
                getWorld().addObject(knifeInv, 300, 550);
                getWorld().removeObject(kx6);
                getWorld().addObject(kx7, 320, 560);
            }
            if(currentMinus == 1){
                getWorld().addObject(knifeInv, 300, 550);
                getWorld().removeObject(kx8);
                getWorld().addObject(kx7, 320, 560);
            }
        }
        if(currentKnifes == 8){
            if(currentMinus == 0){
                getWorld().addObject(knifeInv, 300, 550);
                getWorld().removeObject(kx7);
                getWorld().addObject(kx8, 320, 560);
            }
            if(currentMinus == 1){
                getWorld().addObject(knifeInv, 300, 550);
                getWorld().removeObject(kx9);
                getWorld().addObject(kx8, 320, 560);
            }
        }
        if(currentKnifes == 9){
            if(currentMinus == 0){
                getWorld().addObject(knifeInv, 300, 550);
                getWorld().removeObject(kx8);
                getWorld().addObject(kx9, 320, 560);
            }
            if(currentMinus == 1){
                getWorld().addObject(knifeInv, 300, 550);
                getWorld().removeObject(kx10);
                getWorld().addObject(kx9, 320, 560);
            }
        }
        if(currentKnifes == 10){
            if(currentMinus == 0){
                getWorld().addObject(knifeInv, 300, 550);
                getWorld().removeObject(kx9);
                getWorld().addObject(kx10, 320, 560);
            }
            if(currentMinus == 1){
                getWorld().addObject(knifeInv, 300, 550);
                getWorld().removeObject(kx10);
                getWorld().addObject(kx10, 320, 560);
            }
        }
        if(currentKnifes > 10){
            getWorld().addObject(knifeInv, 300, 550);
            getWorld().addObject(kx10, 320, 560);
        }
    }
    
    public void changeGrenades(){
        if(currentGrenades == 0){           //currentGrenades is the current number of grenades in the inventory
            if(currentMinus == 1){                 //when currentMinus = 0, grenades are being added to the inv
                getWorld().removeObject(grenadeInv);  //when currentMinus = 1, grenades are being subtracted from the inv
            }
        }
        if(currentGrenades == 1){
            if(currentMinus == 0){
                getWorld().addObject(grenadeInv, 220, 550);
            }
            if(currentMinus == 1){
                getWorld().addObject(grenadeInv, 220, 550);
                getWorld().removeObject(gx2);
            }
        }
        if(currentGrenades == 2){
            if(currentMinus == 0){
                getWorld().addObject(grenadeInv, 220, 550);
                getWorld().addObject(gx2, 245, 560);
            }
            if(currentMinus == 1){
                getWorld().addObject(grenadeInv, 220, 550);
                getWorld().removeObject(gx3);
                getWorld().addObject(gx2, 245, 560);
            }
        }
        if(currentGrenades == 3){
            if(currentMinus == 0){
                getWorld().addObject(grenadeInv, 220, 550);
                getWorld().removeObject(gx2);
                getWorld().addObject(gx3, 245, 560);
            }
            if(currentMinus == 1){
                getWorld().addObject(grenadeInv, 220, 550);
                getWorld().removeObject(gx4);
                getWorld().addObject(gx3, 245, 560);
            }
        }
        if(currentGrenades == 4){
            if(currentMinus == 0){
                getWorld().addObject(grenadeInv, 220, 550);
                getWorld().removeObject(gx3);
                getWorld().addObject(gx4, 245, 560);
            }
            if(currentMinus == 1){
                getWorld().addObject(grenadeInv, 220, 550);
                getWorld().removeObject(gx5);
                getWorld().addObject(gx4, 245, 560);
            }
        }
        if(currentGrenades == 5){
            if(currentMinus == 0){
                getWorld().addObject(grenadeInv, 220, 550);
                getWorld().removeObject(gx4);
                getWorld().addObject(gx5, 245, 560);
            }
            if(currentMinus == 1){
                getWorld().addObject(grenadeInv, 220, 550);
                getWorld().removeObject(gx6);
                getWorld().addObject(gx5, 245, 560);
            }
        }
        if(currentGrenades == 6){
            if(currentMinus == 0){
                getWorld().addObject(grenadeInv, 220, 550);
                getWorld().removeObject(gx5);
                getWorld().addObject(gx6, 245, 560);
            }
            if(currentMinus == 1){
                getWorld().addObject(grenadeInv, 220, 550);
                getWorld().removeObject(gx7);
                getWorld().addObject(gx6, 245, 560);
            }
        }
        if(currentGrenades == 7){
            if(currentMinus == 0){
                getWorld().addObject(grenadeInv, 220, 550);
                getWorld().removeObject(gx6);
                getWorld().addObject(gx7, 245, 560);
            }
            if(currentMinus == 1){
                getWorld().addObject(grenadeInv, 220, 550);
                getWorld().removeObject(gx8);
                getWorld().addObject(gx7, 245, 560);
            }
        }
        if(currentGrenades == 8){
            if(currentMinus == 0){
                getWorld().addObject(grenadeInv, 220, 550);
                getWorld().removeObject(gx7);
                getWorld().addObject(gx8, 245, 560);
            }
            if(currentMinus == 1){
                getWorld().addObject(grenadeInv, 220, 550);
                getWorld().removeObject(gx9);
                getWorld().addObject(gx8, 245, 560);
            }
        }
        if(currentGrenades == 9){
            if(currentMinus == 0){
                getWorld().addObject(grenadeInv, 220, 550);
                getWorld().removeObject(gx8);
                getWorld().addObject(gx9, 245, 560);
            }
            if(currentMinus == 1){
                getWorld().addObject(grenadeInv, 220, 550);
                getWorld().removeObject(gx10);
                getWorld().addObject(gx9, 245, 560);
            }
        }
        if(currentGrenades == 10){
            if(currentMinus == 0){
                getWorld().addObject(grenadeInv, 220, 550);
                getWorld().removeObject(gx9);
                getWorld().addObject(gx10, 245, 560);
            }
            if(currentMinus == 1){
                getWorld().addObject(grenadeInv, 220, 550);
                getWorld().removeObject(gx10);
                getWorld().addObject(gx10, 245, 560);
            }
        }
        if(currentGrenades > 10){
            getWorld().addObject(grenadeInv, 220, 550);
            getWorld().addObject(gx10, 245, 560);
        }
    }
    
}
