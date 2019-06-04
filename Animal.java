import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal extends Actor  
{
    // instance variables - replace the example below with your own
    private int direction;
    private int age;
    private int gender;
    private boolean alive;
    private int[] position;

    /**
     * Constructor for objects of class Animal
     */
    public Animal(int age, int gender, boolean alive, int[] position)
    {
        this.direction = 1;
        this.age = age;
        this.gender = gender;
        this.alive = alive;
        this.position = position;
    }
    
    public void turn()
    {
        if (this.getDirection() == -1) {
            this.setDirection(1);
        }
        else {
            this.setDirection(-1);
        }
    }

    /**
     * Mutator Methods
     */
    public void setAge(int newAge)
    {
        this.age = newAge;
    }

    public void setGender(int newGender)
    {
        this.gender = newGender;
    }

    public void setAlive(boolean newState)
    {
        this.alive = newState;
    }

    public void setPosition(int[] newPosition)
    {
        this.position = newPosition;
    }
    
    public void setDirection(int newDirection)
    {
        this.direction = newDirection;
    }

    /**
     * Accessor Methods
     */
    public int getAge()
    {
        return this.age;
    }

    public int getGender()
    {
        return this.gender;
    }

    public boolean getAlive()
    {
        return this.alive;
    }

    public int[] getPosition()
    {
        return this.position;
    }
    
    public int getDirection()
    {
        return this.direction;
    }
}
