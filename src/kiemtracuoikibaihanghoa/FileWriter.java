package kiemtracuoikibaihanghoa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class FileWriter {
    public static void writeFile(String fileName, List<HangHoa> listHangHoa) {
        File file = new File(fileName);
        PrintWriter out;
        try {
            out = new PrintWriter(file);
            for (HangHoa hangHoa : listHangHoa) {
                out.println("\n"+hangHoa);
            }
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("Sai roi be oi!!!");
            e.printStackTrace();
        }
    }
}
