import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args)throws IOException {


        try( FileInputStream  readFile = new FileInputStream("download.jfif");
             FileOutputStream writeFile = new FileOutputStream("image.pdf");)
        {



            int temp;
            while ((temp = readFile.read()) != -1){
                writeFile.write(temp);
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
