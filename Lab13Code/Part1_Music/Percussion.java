
/**
 * Write a description of class Percussion here.
 *
 * @author (Michael Chau)
 * @version (1)
 */
public class Percussion implements Instrument
{
    public void play() 
    {
        System.out.print("Precussion.play()");
    }
    public String what()
    {
        return "Percussion";
    }
    public void adjust(){}
}
