import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Minnow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Minnow extends Fish
{
    private static int speed = 20;
    public Minnow(int age, int gender, boolean alive, int[] location, int size)
    {
        super(age, gender, alive, location, size);
    }
    
    /**
     * Act - do whatever the Minnow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        this.swim(this.speed);
    }
}
