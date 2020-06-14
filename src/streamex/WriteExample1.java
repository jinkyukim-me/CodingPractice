package streamex;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {
    public static void main(String[] args) throws Exception{
        OutputStream os = new FileOutputStream("/Users/jaden/JavaProject/test2.db");

        byte[] array = { 10, 20, 30 };

        os.write(array);

        os.flush();
        os.close();
    }
}
