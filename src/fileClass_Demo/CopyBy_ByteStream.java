/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com *Date:Aug 13, 2014
 */
package fileClass_Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CopyBy_ByteStream {

    public static void main(String[] args) {
        try {
            /*Create a Byte Stream Objects
             suitable for any format        
             the output file displays the Image */
            FileInputStream in = new FileInputStream("ex_files\\flower.jpg");
            FileOutputStream out = new FileOutputStream("ex_files\\new flower.jpg");
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
