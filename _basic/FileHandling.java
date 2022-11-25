import java.io.File;
import java.io.FileWriter;


public class FileHandling {
    

    public static void main(String[] args) {

        //file creation

        File f = new File("C:\\Users\\Bikash\\Desktop\\_git\\data.txt");

        try{
            if (f.createNewFile())  System.out.println("new file created..");
            
            else System.out.println("file exists..");
        }
        catch (Exception e){System.out.println("Exception");}



        //file writer  can override existing file new data
        try{
            FileWriter fw = new FileWriter("C:\\Users\\Bikash\\Desktop\\_git\\data.txt");

            try{
            fw.write("i m currently working on java improvement, one can see improvement day by day");
            }
            
            finally{
                fw.close();
            }
            
            System.out.println("Successfully created");
            }
    
        catch (Exception e){
            System.out.println("already created");
        }
    }
}
