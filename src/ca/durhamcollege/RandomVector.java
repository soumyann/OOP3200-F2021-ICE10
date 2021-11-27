/*
 * File : OOP3200_F2021_ICE 10
 * Created by: Tom Tsiliopoulos
 * Edited by: Soumya Narayanamandiram Narayananunni
 * Date: November 26, 2021
 */


package ca.durhamcollege;
import java.util.Random;

public class RandomVector
{
    private Random m_rand;
    //Step 1 - Private static instances
    private static RandomVector m_instance = null;

    //step 2 - Make the default cinstructor private
    private  RandomVector()
    {
        m_rand = new Random(); //Instances of Random class
    }
    //Step 3 - Make a public instance method that acts as "portal" to the class
    public static RandomVector Instance()
    {
        if(m_instance == null)
        {
            m_instance = new RandomVector();
        }
        return m_instance;
    }

    public static Vector2D createVector2D(Vector2D start, Vector2D end)
    {
        Random rand=new Random();  //Instance of random class

        // Generate random X values
        float minX = Math.min(start.getX(), end.getX());
        float maxX = Math.max(start.getX(), end.getX());

        float randomX = (rand.nextFloat() * maxX) + minX;

        // Generate random Y values
        float minY = Math.min(start.getY(), end.getY());
        float maxY = Math.max(start.getY(), end.getY());

        float randomY = (rand.nextFloat() * maxY) + minY;

        return new Vector2D(randomX, randomY);
    }
}
