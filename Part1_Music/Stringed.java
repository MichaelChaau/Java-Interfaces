/**
 * Write a description of class Stringed here.
 *
 * @author (Michael Chau)
 * @version (1)
 */
public class Stringed implements Instrument
{
    public void play() 
    {
        System.out.print("Stringed.play()");
    }
    public String what() 
    {
        return "Stringed";
    }
    public void adjust(){}
}
