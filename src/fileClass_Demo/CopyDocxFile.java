/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com *Date:Aug 13, 2014
 */
package fileClass_Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyDocxFile {
    
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("ex_files\\ms_word.docx");
            FileOutputStream out = new FileOutputStream
                                             ("ex_files\\CopyOf_ms_word.docx");

            int c;
            while ((c = in.read()) != -1) {
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
