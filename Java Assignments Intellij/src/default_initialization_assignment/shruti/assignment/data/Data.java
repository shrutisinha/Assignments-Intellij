package default_initialization_assignment.shruti.assignment.data;

public class Data {
    int a;
    char b;

    public void print() {
        System.out.println(a);
        System.out.println(b);

    }

    public void printloc() {
        int x;
        char y;
        /*since x and y are local variables, so they are not
		 * initialized by default. We need to initialize them 
		 * before using. Since its not possible to print the 
		 * values without initializing as asked by the question,
		 *  we must either initialize them or comment out the 
		 *  print statements to prevent error.
		 */
		/*System.out.println(x);
		System.out.println(y);*/
    }
}
