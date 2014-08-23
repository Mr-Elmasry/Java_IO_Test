/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com *Date:Aug 13, 2014
 */
package fileClass_Demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStream {    
    public static void main(String[] args) {
        try {
            //Create a Character Stream Objects
            // suitable for text files
            FileReader in = new FileReader("ex_files\\flower.jpg");
            FileWriter out = new FileWriter("ex_files\\CopyofFlower.jpg");
            int c;
            while ((c =in.read())!=-1) {
                out.write(c);
            }
            System.out.println("Done!");
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
            
        } catch (IOException ex) {
             System.out.println(ex);
        }
       
    }
}
