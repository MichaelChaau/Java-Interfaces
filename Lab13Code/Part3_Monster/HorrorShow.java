/*
    You can easily add new method declarations to an interface using
    inheritance, and you can also combine several interfaces into a
    new interface with inheritance.  In both cases you get a new
    interface, as seen in this example.

    This public class HorrorShow has 5 static
    methods.
    method u takes a Monster object and calls only those methods 
    that are appropriate for that object.

    method v takes a DangerousMonster object and calls only those 
    methods that are appropriate for that object.

    method w takes a Vampire object and calls only those 
    methods that are appropriate for that object.

    method x takes a Lethal object and calls only those 
    methods that are appropriate for that object.

    method y takes a Godzilla object and calls only those methods 
    that are appropriate for that object.
 */

/**
 * A tester class that tests all the interfaces and the
 * classes that implement them.
 * 
 * @version 1
 */
public class HorrorShow {

    /**
     * @param m a Monster
     * The body just invokes the method menace()
     * on the parameter.  Since every Monster can be a 
     * menace it makes sense.
     */    
    public static void u(Monster m) {
		m.menace();
	}

    /**
     * @param dm a DangerousMonster
     * The body just invokes the methods menace()
     * and destroy() on the parameter.  Since every
     * DangerousMonster can be a menace and can destroy
     * these calls make sense
     */ 
	public static void v(DangerousMonster dm)  {
        dm.menace();
        dm.destroy();
    }

    /**
     * @param v a Vampire
     * The body just invokes the methods menace(),
     * destroy(), kill() and drinkBlood() on the parameter.
     * Since every Vampire can be a menace, can destroy,
     * can kill and can drink blood, these calls 
     * make sense.
     */ 
    public static void w(Vampire v)    {
        v.menace();
        v.destroy();
        v.kill();
        v.drinkBlood();
    }

    /**
     * @param d Lethal
     * The body just invokes the method kill()
     * on the parameter.
     * Since every Lethal can kill this method call
     * makes sense.
     */ 
    public static void x(Lethal d)  {
		d.kill();
	}

    /**
     * @param g a Godzilla
     * The body just invokes the method menace() and destroy()
     * on the parameter.
     * Since every Godzilla ISA DangerousMonster, it can
     * be a menace and can destroy.  So these method calls
     * make sense.
     */ 
    public static void y(Godzilla g)  {
        g.menace();
        g.destroy();
    }

    /**
     * The main method creates a Dracula object
     * called movie and invokes the methods
     * u, v, w, x and y on the movie object.
     * 
     * Understand why these calls are legal on the 
     * Dracula object called movie.
     */
    public static void main(String args[])  {
        Dracula movie = new Dracula();

        u(movie);
        v(movie);
        w(movie);
        x(movie);
        y(movie);
    }
}
