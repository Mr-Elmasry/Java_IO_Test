/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com *Date:Aug 13, 2014
 */
package fileClass_Demo;

import java.io.File;
import java.util.Arrays;
// keys ::
// .canRead() , .canWrite() , .isDirectory() ,.isFile() ,
// if isFolder() >>  .list() return String[] 

public class FileDemo1 {

    public static void main(String[] args) {
        File f = new File("ex_files\\a.txt");
        System.out.printf("Can Read?\t:%s\nCan Write?\t:%s\nIs Directory?\t:%s\nIs File?\t:%s\nThe Parent\t:%s",
                f.canRead(), f.canWrite(), f.isDirectory(), f.isFile(), f.getParent());

        File folder = new File("ex_files");
        String[] list = folder.list();
        System.out.println("\n------");
        for (String fileName : list) {
            System.out.println(fileName);
        }
        System.out.println("Folders & Files count :" + folder.list().length);
        System.out.println(Arrays.toString(folder.list()));
    }
}
