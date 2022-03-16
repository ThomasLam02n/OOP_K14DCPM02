package buoi10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

import buoi06.hangthucpham.HangThucPham;

public class WritingObject {
    private static final Object HangThucPham = null;

    public static void main(String[] args) throws IOException {
        HangThucPham htp = new HangThucPham("P02", "Mi Hao", 3.500, new Date(), new Date());

        //gi vào 1 file cụ thể
        FileOutputStream outFile = new FileOutputStream("htp.dat");

        //chuyễn đối tượng 
        ObjectOutputStream objout = new ObjectOutputStream(outFile);

        //tiến hành ghi
        objout.writeObject(htp);
        objout.close();
    }
}
