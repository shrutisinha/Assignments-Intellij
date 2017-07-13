
/*Using TextFile and a Map<Character,Integer>, create a program that takes
* the file name as a command line argument and counts the occurrence of all
* the different characters. Save the results in a text file.
*/
package JavaAssignmentDay8.char_counter;
import java.io.*;

/**
*ReadWrite class contains functions that can read from and write to the provided filename.
*/
public class ReadWrite{
	/**
	*Takes a filepath as parameter and stores its contents to a string.
	*@param filename filepath whose contents are to be read
 	*@return A string which stores the file contents
	*/
	String read(String filename)  {
		// Reading input by lines:
		try(BufferedReader in = new BufferedReader(	new FileReader(filename))){
			String s;
			StringBuilder sb = new StringBuilder();
			while((s = in.readLine())!= null)
			sb.append(s).append("\n");
			//in.close();
			return sb.toString();
		} catch (IOException e) { 
            System.out.println(e.getMessage()); 
            return null;
        }
	}
	/**
	*Writes data into a file using FileWriter.
	*@param text Its the data that is to be written in the file
	*@param filename Its is the name/path of the file to which data is to be written 
	*/
	public void write(String text,String filename){
		File newFile=new File(filename);
		if(!newFile.exists()){
			try { 
	            newFile.createNewFile(); 
	        } catch (IOException e) { 
	            System.out.println(e.getMessage()); 
	        }
		}
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))) {
            bw.write(text);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
	}
}