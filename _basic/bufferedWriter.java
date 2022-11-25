import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedWriter {
    

    public static void main(String[] args) throws IOException {
         

        FileWriter fw = new FileWriter("C:\\Users\\Bikash\\Desktop\\_git\\buffer.txt");

        BufferedWriter bf = new BufferedWriter(fw);

        bf.write("buffered writer file created, using file writer too");

        bf.close();

        System.out.println("successfully written");
    }
}
