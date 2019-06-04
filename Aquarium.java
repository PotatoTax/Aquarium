import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.Random;

/**
 * Write a description of class Aquarium here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aquarium extends World
{
    private Minnow[] school = new Minnow[20];
    private Pike[] gang = new Pike[2];
    private int randAge;
    private int randGender;
    private boolean randAlive;
    private int[] randPosition = new int[2];
    private int randSize;
    
    /**
     * Constructor for objects of class Aquarium.
     * 
     */
    public Aquarium()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        //setBackground("wet-blue.jpg");
        this.populate();
    }
    
    public void populate()
    {
        /**
        int[] postition = {200, 200};
        Pike dave = new Pike(10, 1, true, postition, 1000);
        addObject(dave, 200, 200);
        */
        for (int i = 0; i < 20; i++) {
            randAge = Greenfoot.getRandomNumber(10);
            randGender = Greenfoot.getRandomNumber(1);
            if (Greenfoot.getRandomNumber(1) == 1) {
                randAlive = true;
            } else {
                randAlive = false;
            }
            randPosition[0] = Greenfoot.getRandomNumber(getWidth());
            randPosition[1] = Greenfoot.getRandomNumber(getHeight());
            randSize = Greenfoot.getRandomNumber(3000);
            school[i] = new Minnow(randAge, randGender, randAlive, randPosition, randSize);
            addObject(school[i], school[i].getPosition()[0], school[i].getPosition()[1]);
        }
        
        for (int i = 0; i < 2; i++) {
            randAge = Greenfoot.getRandomNumber(10);
            randGender = Greenfoot.getRandomNumber(1);
            if (Greenfoot.getRandomNumber(1) == 1) {
                randAlive = true;
            } else {
                randAlive = false;
            }
            randPosition[0] = Greenfoot.getRandomNumber(getWidth());
            randPosition[1] = Greenfoot.getRandomNumber(getHeight());
            randSize = Greenfoot.getRandomNumber(3000);
            gang[i] = new Pike(randAge, randGender, randAlive, randPosition, randSize);
            addObject(gang[i], gang[i].getPosition()[0], gang[i].getPosition()[1]);
        }
    }
}
