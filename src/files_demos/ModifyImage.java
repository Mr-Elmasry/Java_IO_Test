/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com *Date:Aug 24, 2014
 */
package files_demos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class ModifyImage {

    public static void main(String[] args) {
        FileInputStream in;
        FileOutputStream out;
        try {
            // Step One:
            File dodoPic = new File("ex_files\\dodo.jpg");
            File _dodoPic = new File("ex_files\\_dodo.jpg");
            
            in = new FileInputStream(dodoPic);
            out = new FileOutputStream(_dodoPic);
            // the Proccess to Copy
            byte[]buf = new byte[(int)dodoPic.length()];
            while(in.read(buf)!=-1){
            out.write(buf);
            }
            /*int c;int i =1;
            while((c = in.read())!=-1){
            if(i==1) c= c/4;
            out.write(c);
            i++;
            if(i==4)i=1;
            }*/
            System.out.println("Done");
            //Closing
            in.close();
            out.close();

        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
             System.out.println(ex);
        }
    }
}
