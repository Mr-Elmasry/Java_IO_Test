/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com *Date:Aug 13, 2014
 */
package fileClass_Demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;

// JFileChooser * .getSelectedFile
// .showOpenDialog() * .showSaveDialog()
public class FileChooser {

    public static void main(String[] args) {
        try {
            File f = null;
            JFileChooser fChsr = new JFileChooser();
            int ret = fChsr.showOpenDialog(null);
            if (ret == JFileChooser.APPROVE_OPTION) {
                f = fChsr.getSelectedFile();
            }
            Scanner scnr = new Scanner(f);
            while (scnr.hasNext()) {
                System.out.println(scnr.next());
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
