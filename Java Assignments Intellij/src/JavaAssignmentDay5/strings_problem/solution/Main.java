package JavaAssignmentDay5.strings_problem.solution;

/* Using the documentation for java.util.regex.Pattern as a resource,
* write and test a regular expression that checks a sentence to see
* that it begins with a captial letter and ends with a period.
*/
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
/**
 * <h3>Main class </h3>
 * This program finds whether a sting starts with uppercase and ends in period.
 */
public class Main {
	/**
	 * This is the main method which prints boolean output to the screen.
	 * It uses java.util.regex.Pattern class.
	 * @param args Unused.
	 */

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		Regex r = new Regex();
		String str;
		while(true){
			System.out.println("Enter a string and we will return true if it starts with uppercase and ends with period");
			System.out.println("Enter \"exit\"to exit");
			str=br.readLine();
			if(str.equals("exit"))break;
			System.out.println(r.checkPattern(str));
		}
		// System.out.println("My name is Sinha.".matches(str));//true
		// System.out.println("#$^%$^.".matches(str));//false
		// System.out.println("A.".matches(str));//true
		// System.out.println("^Whats in name.".matches(str));//false
		// System.out.println("W.$".matches(str));//false
		// System.out.println("Empty.".matches(str));//true
	}
}
