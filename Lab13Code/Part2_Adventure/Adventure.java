/** 
 * "Multiple Inheritance" in Java.  
 * 
 * The interface isn't simply a "more pure" form of abstract class.
 * It has higher purpose than that.  Because an interface has no
 * implementation at all- That is, there is no storage associated
 * with an interface -	there is nothing to prevent many interfaces
 * from being combined. This is valuable because there are times
 * when you need to say: "an x is an a and a b and a c".  In C++,
 * this act of combining multiple class interfaces is called multiple
 * inheritance, and it carries with it some sticky baggage because
 * each class can have an	implementation.  In Java, you can perform
 * the same act but only one of the classes can have an implementation,
 * so the problems	seen in C++ do not occur with Java when combining
 * multiple interfaces.
 *  
 * Tester class for the inheritance/interface hierarchy
 * 
 * @version 1
 */
public class Adventure  {
    /**
     * Calls the fight method on the parameter
     * 
     * @param x - an object that can fight (that is
     * an object of the class that has implemented the
     * CanFight interface).  
     */ 
    public static void t(CanFight x) {
		x.fight();
    }
    /**
     * Calls the swim method on the parameter
     * 
     * @param x - an object that can swim (that is
     * an object of the class that has implemented the
     * CanSwim interface).  
     */ 
    public static void u(CanSwim x ) {
		x.swim();
    }
    
	/**
     * Calls the fly method on the parameter
     * 
     * @param x - an object that can fly (that is
     * an object of the class that has implemented the
     * CanFly interface).  
     */ 
    public static void v(CanFly  x ) {
		x.fly();
    }
    
	/**
     * Calls the fight method with a value of 10
     * 
     * @param x - ActionCharacter object who can fight
     * certain number of times.
     */ 
    public static void w(ActionCharacter x) {
		x.fight(10);
    }

    /**
     * This method creates a Hero object and calls
     * the methods t, u, v and w with the Hero object
     * as the parameter.
     */
    public static void main(String args[]) {
        Hero i = new Hero();

        t(i);   // treat it as a CanFight
        u(i);   // treat it as a CanSwim
        v(i);   // treat it as a CanFly
        w(i);   // treat it as an ActionCharacter
    }
}
