
package lab1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bspor
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //C:\Users\bspor\Desktop\IO-Labs\src\lab1\lab1.txt.txt
                File data = new File("src" + File.separatorChar + "lab1" 
                        + File.separatorChar + "lab1.txt.txt");
        Map<String, String> map = new HashMap<String, String>();
        BufferedReader in = null;
        String line = "";
        try {
	   in = new BufferedReader(new FileReader(data));
	   
	   while(line != null){
		  System.out.println(line);
		  line = in.readLine();  // strips out any carriage return chars
                  String parts[] = line.split(":");
                  map.put(parts[0], parts[1]);
	   }
	 
        } catch(IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
        


        //System.out.println(map.toString());
        
    }
}
