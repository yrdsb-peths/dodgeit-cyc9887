import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{
    boolean atTop = true;
    public void act()
    {
        if(Greenfoot.mouseClicked(null))
        {
            atTop = !atTop;
            setLocation(100, 200);
        }
        
        if(atTop)
        {
            setLocation(100, 100);
        }
        else
        {
            setLocation(100, 300);
        }
    }
}
