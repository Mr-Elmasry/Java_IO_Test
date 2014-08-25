/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com *Date:Aug 13, 2014
 */
package files_demos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyBy_CharStream {

    public static void main(String[] args) {

        /*Create a Character Stream Objects
         suitable for text files            
         */
        try (FileReader in = new FileReader("ex_files\\a.txt");
             FileWriter out = new FileWriter("ex_files\\Copyof_a.txt");)
        {
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
