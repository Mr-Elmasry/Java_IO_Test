/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com *Date:Aug 13, 2014
 */
package fileClass_Demo;
import java.io.File;
public class FileDemo4 {
    public static void main(String[] args) {
        //File Class Has List Of Files 
        File dir = new File("c:\\windows\\system32");
        System.out.println("IS Directory? "+dir.isDirectory());
        File[] listFiles = dir.listFiles();
        System.out.println("Count of Files & Directories are: "+listFiles.length);
        for (File file : listFiles) {
            System.out.println(file);
        }
    }
}
