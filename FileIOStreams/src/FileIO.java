import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.System.Logger;
import java.nio.ByteBuffer;
import java.util.Scanner;
import org.apache.logging.log4j.*;


    public class FileIO {
        public static void main(String[] args) {

            try {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the number");
                int n=sc.nextInt();
                File f1=new File("Example.txt");
                f1.createNewFile();
                FileOutputStream fos=new FileOutputStream("Example.txt");
                byte[] bytes=ByteBuffer.allocate(4).putInt(n).array();
                fos.write(bytes);
                System.out.println("Integer data added to the file");
                fos.close();
                sc.close();

                FileInputStream fis=new FileInputStream("Example.txt");
                byte[] b=new byte[4];
                fis.read(b);
                ByteBuffer buffer = ByteBuffer.wrap(bytes);
                int num= buffer.getInt();
                System.out.println("Output:"+num);
                fis.close();
            }
            catch(Exception e) {
                e.printStackTrace();

            }
            Logger log= (Logger) LogManager.getLogger(FileIO.class);
            log.info("This is info message");

            // Log message

        }
    }
