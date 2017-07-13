package JavaAssignmentDay5.strings_problem.solution;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
*Class that checks whther the given string starts with uppercase and ends with period.
*/
public class Regex{
	/**
	*Carries out the comparision using pattern and matcher
	*@param str The string to be checked.
	*@return True if str starts with Capital Letter and ends in period.
	*/
	public boolean checkPattern(String str){
		/* ^matches with beginning of line
		*  [A-Z] matches uppercase character from A through Z
		*  .* '.' mathes any character and '*' means 0 or more time, .*  matches any character sequence
		*  [\\.] matches '.' i.e. dot character
		*  $  matches end of line
		*/
		if(str==null)return  false;
		String rgx = "^[A-Z].*[\\.]$";
		Pattern p = Pattern.compile(rgx);
		Matcher m = p.matcher(str);
        return m.find();
    }
}
