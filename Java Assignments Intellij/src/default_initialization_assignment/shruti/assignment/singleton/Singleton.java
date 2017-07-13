package default_initialization_assignment.shruti.assignment.singleton;

public class Singleton {
    //makes sure singleton instance is created only once
    private static Singleton obj = new Singleton();
    private String s;

    /* A private Constructor prevents any other
    * class from instantiating.
    */
    private Singleton() {
    }


    //String s;
    public static Singleton create_obj(String str) {
        /*s=str;*/
		/*The above line is commented out since we cannot make 
		 *a static reference to a non static field so that was
		 * producing an error.
		 */
        // Singleton obj=new Singleton();
        obj.s = str;
		/*The above line initializes variable 's' of newly created 
		 * object obj to the string passed to the method.
		 */
        //System.out.println("obj "+obj.s);
        return obj;
    }

    public void print() {
        System.out.println(s);
    }
}

