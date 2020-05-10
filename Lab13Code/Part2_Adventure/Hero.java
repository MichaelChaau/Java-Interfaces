
/**
 * Write a description of class Hero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly 
{
    public void swim(){
        System.out.println("swim()");
    }
    public void fly() {
        System.out.println("fly()");
    }
    public void fight() {
        System.out.println("fight()");
    }
}
