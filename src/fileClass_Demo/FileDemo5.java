/*** @author Mr. Ahmed Elmasry 
 *   WWW.FanniaBackbone.wikispaces.com/java *  */
package fileClass_Demo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDemo5 {
    public static void main(String[] args) throws FileNotFoundException {
    File file = new File("ex_files\\a.txt");
    Scanner scnr = new Scanner(file);      
        
    while (scnr.hasNext()) {
        String s = scnr.next();
        System.out.print(s+" ");
    }
    }
}
