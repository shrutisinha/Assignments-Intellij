/* Create an java program to search through the home directory and look for files that match
 * a regular expression. The program should be able to take inputs repeatedly and should print
 * out full absolute path of the matching files found.
 */
package day9.assignment1.solution;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by zemoso on 11/7/17.
 * Class containing main method.
 */

public class SearchFile {
    /**
     * Continuously asks user to enter a regex pattern and prints matching files in home directory
     * @param args not used
     * @throws IOException can throw this exception
     */
    public static void main(String args[])throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String s;
        FindPath path = new FindPath();
        while(true){
            boolean found;
            System.out.println("Enter java regular expression to be matched with file name");
            System.out.println("Enter \"exit\" to exit");
            s = br.readLine();
            if (s.equals("exit"))break;
            char separator = File.separatorChar;
            String directory=separator+"home";
            found=path.findFiles(s, directory);
            List<File> filesearches;
            filesearches=path.getmResultArray();
            if(!found){
                System.out.println("No result found!");
            }
            for(File file:filesearches){
                System.out.println("Found:  "+file);
            }
            path.clear();
        }
    }
}
