import java.io.FileReader;
import java.io.IOException;

public class ReadData {
    

    public static void main(String[] args) {
        
        try{
            FileReader fr = new FileReader("buffer.txt");
            
            try{
                int i=0;
                while ((i=fr.read())!=-1){
                    System.out.print((char) i);
                }
            }
            finally{
                fr.close();
                System.out.println("\nfile closed");
            }
        }
        catch(IOException e){
            System.out.println("Exception handled");
        }
    }
}
