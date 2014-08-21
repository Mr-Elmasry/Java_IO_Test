/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com *Date:Aug 13, 2014
 */
package fileClass_Demo;
import java.io.File;
public class FileDemo3 {
    public static void main(String[] args) {
        //File Class Can Use Filter By Type!
        // File dir = new File("c:\\windows\\system32"); 
        File jBin = new File("C:\\Program Files\\Java\\jdk1.7.0_17\\bin");
        System.out.println("Is Directory? :" + jBin.isDirectory());
        String[] list = jBin.list();
        
        int countOfExe = 0;    
        for (String str : list) {
            if (str.endsWith("exe")) {
                System.out.println(str);
                countOfExe++;
            }
        }
        System.out.println("Count Of EXE's Files is :"+ countOfExe);
    }

}
