/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com *Date:Aug 13, 2014
 */
package fileClass_Demo;
import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        //File Class Can Represent File Or Directory!
        File dir = new File("c:\\windows\\system32");
        System.out.println("Is Directory? "+dir.isDirectory());//True
        long timeStart = System.currentTimeMillis();
        String[] list = dir.list(); // lists the files and Folders in this Dir;
        System.out.println("Files");
        for (String str : list) {
            System.out.println(str.toString());
        }
        long timeEnd = System.currentTimeMillis();
        System.out.printf("Time To Read is :%.3f second ",(timeEnd-timeStart)/1000.);
    }

}
