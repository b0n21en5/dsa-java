import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    

    public static void main(String[] args) throws IOException {

        //file creation

        // File f = new File("C:\\Users\\Bikash\\Desktop\\_git\\data.txt");

        // if (f.createNewFile())  System.out.println("new file created..");

        // else System.out.println("file exists..");



        //file writer
        FileWriter fw = new FileWriter("C:\\Users\\Bikash\\Desktop\\_git\\data.txt");

        
        try{
            fw.write("i m currently working on java improvement");
        }
        finally{
            fw.close();
        }
        System.out.println("Successfully created");
    }
}
