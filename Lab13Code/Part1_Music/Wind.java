
/**
 * Write a description of class Wind here.
 *
 * @author (Michael Chau)
 * @version (1)
 */
public class Wind implements Instrument
{
    public void play() {
        System.out.println("Wind.play ");
    }   
    public String what() {
        return "Wind";
    }
    public void adjust() {}  
}      