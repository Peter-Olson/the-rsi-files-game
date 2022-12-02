import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AmmoBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AmmoBar extends BackgroundObject
{
    private int currentAmmo;
    private int currentM16Ammo;
    private int weaponEquipped;
    /**
     * Act - do whatever the AmmoBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        for(Object obj: getWorld().getObjects(Character.class)) 
        {
            Character character = (Character) obj;
            weaponEquipped = character.getCurrentEquip();
            currentAmmo = character.getAmmo();
            currentM16Ammo = character.getM16Ammo();
        }
        if(weaponEquipped == 1 || weaponEquipped == 2 || weaponEquipped == 3)
        {
            if(currentAmmo == 12)
            {
                setImage("Ammobar.png");
            }
            if(currentAmmo == 11)
            {
                setImage("Ammobar1.png");
            }
            if(currentAmmo == 10)
            {
                setImage("Ammobar2.png");
            }
            if(currentAmmo == 9)
            {
                setImage("Ammobar3.png");
            }
            if(currentAmmo == 8)
            {
                setImage("Ammobar4.png");
            }
            if(currentAmmo == 7)
            {
                setImage("Ammobar5.png");
            }
            if(currentAmmo == 6)
            {
                setImage("Ammobar6.png");
            }
            if(currentAmmo == 5)
            {      
                setImage("Ammobar7.png");
            }
            if(currentAmmo == 4)
            {
                setImage("Ammobar8.png");
            }
            if(currentAmmo == 3)
            {
                setImage("Ammobar9.png");
            }
            if(currentAmmo == 2)
            {
                setImage("Ammobar10.png");
            }
            if(currentAmmo == 1)
            {
                setImage("Ammobar11.png");
            }
            if(currentAmmo == 0)
            {
                setImage("Ammobar12.png");
            }
        }
        if(weaponEquipped == 4)
        {
            if(currentM16Ammo == 25)
            {
                setImage("M16Ammo.png");
            }
            if(currentM16Ammo == 24)
            {
                setImage("M16Ammo1.png");
            }
            if(currentM16Ammo == 23)
            {
                setImage("M16Ammo2.png");
            }
            if(currentM16Ammo == 22)
            {
                setImage("M16Ammo3.png");
            }
            if(currentM16Ammo == 21)
            {
                setImage("M16Ammo4.png");
            }
            if(currentM16Ammo == 20)
            {
                setImage("M16Ammo5.png");
            }
            if(currentM16Ammo == 19)
            {
                setImage("M16Ammo6.png");
            }
            if(currentM16Ammo == 18)
            {
                setImage("M16Ammo7.png");
            }
            if(currentM16Ammo == 17)
            {
                setImage("M16Ammo8.png");
            }
            if(currentM16Ammo == 16)
            {
                setImage("M16Ammo9.png");
            }
            if(currentM16Ammo == 15)
            {
                setImage("M16Ammo10.png");
            }
            if(currentM16Ammo == 14)
            {
                setImage("M16Ammo11.png");
            }
            if(currentM16Ammo == 13)
            {
                setImage("M16Ammo12.png");
            }
            if(currentM16Ammo == 12)
            {
                setImage("M16Ammo13.png");
            }
            if(currentM16Ammo == 11)
            {
                setImage("M16Ammo14.png");
            }
            if(currentM16Ammo == 10)
            {
                setImage("M16Ammo15.png");
            }
            if(currentM16Ammo == 9)
            {
                setImage("M16Ammo16.png");
            }
            if(currentM16Ammo == 8)
            {
                setImage("M16Ammo17.png");
            }
            if(currentM16Ammo == 7)
            {
                setImage("M16Ammo18.png");
            }
            if(currentM16Ammo == 6)
            {
                setImage("M16Ammo19.png");
            }
            if(currentM16Ammo == 5)
            {
                setImage("M16Ammo20.png");
            }
            if(currentM16Ammo == 4)
            {
                setImage("M16Ammo21.png");
            }
            if(currentM16Ammo == 3)
            {
                setImage("M16Ammo22.png");
            }
            if(currentM16Ammo == 2)
            {
                setImage("M16Ammo23.png");
            }
            if(currentM16Ammo == 1)
            {
                setImage("M16Ammo24.png");
            }
            if(currentM16Ammo == 0)
            {
                setImage("M16Ammo25.png");
            }
        }
       
    }    
}
