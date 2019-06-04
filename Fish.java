import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
* Write a description of class Fish here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class Fish extends Animal
{
    private int size;
    
    public Fish(int age, int gender, boolean alive, int[] position, int size)
    {
        super(age, gender, alive, position);
        this.size = size;
    }
    
    public void swim(int speed)
    {
        int randTurn = Greenfoot.getRandomNumber(30);
        if (randTurn > 28 || hitWall()) {
            this.turn();
        }
        int newX = this.getPosition()[0] + (speed * this.getDirection());
        //int newY = position[1];// + Greenfoot.getRandomNumber(10) - 4.5);
        int[] pos = {newX, this.getPosition()[1]};
        this.setPosition(pos);
        this.setLocation(pos[0], pos[1]);
    }
    
    public void setSize(int newSize)
    {
        this.size = newSize;
    }
    
    public int getSize()
    {
        return this.size;
    }
    
    public boolean hitWall()
    {
        if (this.getPosition()[0] > getWorld().getWidth() || this.getPosition()[0] < 0) {
            return true;
        }
        else {return false;}
    }
}
