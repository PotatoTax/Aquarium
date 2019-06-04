import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pike here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pike extends Fish
{
    private static int speed = 10;
    public Pike(int age, int gender, boolean alive, int[] postition, int size)
    {
        super(age, gender, alive, postition, size);
    }
    
    /**
     * Act - do whatever the Pike wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        this.swim(this.speed);
    }
    
    
}
