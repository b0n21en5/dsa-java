import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferedReader_output{
    

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new FileReader("buffer.txt"));

        String line;

        while((line=br.readLine())!=null){
            System.out.println(line);
        }
    }
}
