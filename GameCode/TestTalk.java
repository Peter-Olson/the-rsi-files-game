import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class TestTalk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestTalk extends Dialogue
{
    String[] text = {"I heard what happened to you... I'm so sorry. \n Is there anything I can do to help you?", 
            "Press Z, X, or C \n Z. How can I open this locked door? \n X. Where can I find the files the company has on me? \n C. Where can I find a powerful weapon?"};
    String[] z = {"If you want to get through this door, you're going \n to have to find the janitor and get his key", "I'd be careful though, he's usually in a bad mood",
                  "Press Z, X, or C \n Z. How can I open this locked door? \n X. Where can I find the files the company has on me? \n C. Where can I find a powerful weapon?"};
    String[] x = {"I heard they're keeping your file locked away in a safe.", "Be careful! There are lazers blocking the safe, \n but you may be able to turn them off in the control room.",
                  "You also might be able to find the safe codes \n written down somewhere in the control room",
                  "Press Z, X, or C \n Z. How can I open this locked door? \n X. Where can I find the files the company has on me? \n C. Where can I find a powerful weapon?"};
    String[] c = {"Oh a weapon for hunting?", "Well you may be able to find one in \n the security headquarters, but there are always lots \n of guards in there",
                  "You may be able to get them out with a distraction or something", "Press Z, X, or C \n Z. How can I open this locked door? \n X. Where can I find the files the company has on me? \n C. Where can I find a powerful weapon?"};
    int i = 0;
    int j = 0;
    int k = 0;
    int l = 0;
    private String zContinue = "dontContinue";
    private String xContinue = "dontContinue";
    private String cContinue = "dontContinue";
    /**
     * Act - do whatever the TestTalk wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public TestTalk()
    {
        setImage(new GreenfootImage("Welcome to the R.S.I.!", 25, Color.BLUE, null));
    }

    public void act() 
    {
        greenfoot.MouseInfo mouse = Greenfoot.getMouseInfo();
        if (Greenfoot.mouseClicked(this) || Greenfoot.mouseClicked(null))
        {
            if (mouse.getButton() == 3 || mouse.getButton() == 2)
            {
                setImage(new GreenfootImage(text[i], 25, Color.BLUE, null));
                i++;
                if (i == text.length)
                {
                    i = text.length - 1;
                }
            }
        }
        if(Greenfoot.isKeyDown("Z")){
            setImage(new GreenfootImage(z[0], 25, Color.BLUE, null));
            zContinue = "continue";
            j = 0;
        }
        if ((Greenfoot.mouseClicked(this) || Greenfoot.mouseClicked(null)) && zContinue == "continue")
        {
            if (mouse.getButton() == 3 || mouse.getButton() == 2)
            {
                if(j != z.length + 1){
                    j++;
                    zContinue = "dontContinue";
                }
                setImage(new GreenfootImage(z[j], 25, Color.BLUE, null));
            }
        }
        if(Greenfoot.isKeyDown("X")){
            setImage(new GreenfootImage(x[0], 25, Color.BLUE, null));
            xContinue = "continue";
            k = 0;
        }
        if ((Greenfoot.mouseClicked(this) || Greenfoot.mouseClicked(null)) && xContinue == "continue")
        {
            if (mouse.getButton() == 3 || mouse.getButton() == 2)
            {
                if(k != x.length + 1){
                    k++;
                    xContinue = "dontContinue";
                }
                setImage(new GreenfootImage(x[k], 25, Color.BLUE, null));
            }
        }
        if(Greenfoot.isKeyDown("C")){
            setImage(new GreenfootImage(c[0], 25, Color.BLUE, null));
            cContinue = "continue";
            l = 0;
        }
        if ((Greenfoot.mouseClicked(this) || Greenfoot.mouseClicked(null)) && cContinue == "continue")
        {
            if (mouse.getButton() == 3 || mouse.getButton() == 2)
            {
                if(l != c.length + 1){
                    l++;
                    cContinue = "dontContinue";
                }
                setImage(new GreenfootImage(c[l], 25, Color.BLUE, null));
            }
        }
    }    
}
