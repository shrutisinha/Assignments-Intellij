package default_initialization_assignment.shruti.assignment.main;


import default_initialization_assignment.shruti.assignment.data.Data;
import default_initialization_assignment.shruti.assignment.singleton.Singleton;

public class Main {
    public static void main(String args[]) {
        Data obj1 = new Data();
        obj1.print();
        /* Output of print function is "0" which is default
		 * initialization for int and " " i.e. null which is 
		 * default initialization for char.
		 */
        obj1.printloc();
		/*Error while using printloc as local variables are not 
		 *Initialized by default in JAVA. Only variables created 
		 *using new keywords are initialized by default
		 */
        Singleton obj2 = Singleton.create_obj("shruti");
		/* since in this code we have initialised the member 
		 * variable of obj2 to "shruti", the output prints "shruti"
		 */
        obj2.print();
        //below code proves only one instance of singleton class can be created.
        //All objects created are the same
        Singleton obj3 = Singleton.create_obj("suruti");
        obj2.print();
        obj3.print();

    }
}


