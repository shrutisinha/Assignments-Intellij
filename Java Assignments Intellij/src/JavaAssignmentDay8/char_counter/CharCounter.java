/*Using TextFile and a Map(Character,Integer), create a program that takes the file name as a 
*command line argument and counts the occurrence of all the different characters. Save the results 
*in a text file.
*/
package JavaAssignmentDay8.char_counter;
import java.io.*;
import java.util.*;

/**
*<h3>The main class.</h3>
*This program that takes the file name as a command line argument and counts the occurrence of all
* the different characters. Save the results in a text file.
*/
public class CharCounter {
	/**
	*<h3>Main Function</h3>
	*@param args String array that takes input from command line. Write the name of file to read from in the command line before execution 
	*@throws IOException Because we are writting into and reading from a file so IOException can occur. throws handles such occurences
	*/
	public static void main(String[] args) throws IOException{
		ReadWrite rw= new ReadWrite();
		// File whose Charame = "CharCounteacters are to be counted:
		//String fileNr.java";
		String fileName=args[0];
		// Array of all char in file:

		char[] ca = rw.read(fileName).toCharArray();
		//Maps char:frequency
		Map<Character,Integer> charMap = new HashMap<>();
		for(char c:ca){
			if(charMap.containsKey(c)){
				charMap.put(c,charMap.get(c)+1);
			}
			else{
				charMap.put(c,1);
			}
		}
		
		StringBuilder s= new StringBuilder();
		s.append("Char      Frequency\n");
		//System.out.println("Char        Frequency");
		for (char ch:charMap.keySet()){
			StringBuilder sn= new StringBuilder();
			s.append(ch).append("          ").append(charMap.get(ch)).append('\n');
			//System.out.println(ch+"          "+charMap.get(ch));
		}
		rw.write(s+"","CharacterFreq.txt");	
		System.out.println(s+"");	
		
	}
}