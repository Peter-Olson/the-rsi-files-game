import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class ExplosionRadius here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExplosionRadius extends BackgroundObject
{
    private int exRadius = 50;
    private Enemy cop;
    private Janitor janitor;
    private int doOnce1 = 0;
    private String exploded = "notExploded";
    private int switchCounter = 10;
    /**
     * Act - do whatever the ExplosionRadius wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        detectEntities();
    }
    
    public void detectEntities(){
        if(doOnce1 == 0){
            List<Enemy> listOfCops = getObjectsInRange(exRadius, Enemy.class);
            List<Janitor> listOfJanitors = getObjectsInRange(exRadius, Janitor.class);
            for(int i = 0; i < listOfCops.size(); i++){
                cop = listOfCops.get(i);
                cop.setHealth(-3);
            }
            if(listOfJanitors.size() > 0){
                listOfJanitors.get(0).setHealth(-3);
            }
            doOnce1++;
            exploded = "exploded";
        }
        if(exploded == "exploded"){
            if(switchCounter > 0){
                switchCounter--;
            }else{
                switchCounter = 10;
                getWorld().removeObject(this);
                exploded = "notExploded";
            }
        }
    }
}
