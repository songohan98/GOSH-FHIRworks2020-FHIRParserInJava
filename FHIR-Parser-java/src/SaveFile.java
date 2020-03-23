import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SaveFile {
    protected  static void savefile(String filename, StringBuilder line){
        try {
            PrintWriter out = new PrintWriter(filename);
            out.println(line);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
