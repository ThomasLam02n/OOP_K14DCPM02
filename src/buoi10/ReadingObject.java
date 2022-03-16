package buoi10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.management.ObjectName;

import buoi06.hangthucpham.HangThucPham;

public class ReadingObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream inFile = new FileInputStream("htp.dat");

        ObjectInputStream objIn = new ObjectInputStream(inFile);

        HangThucPham htp = (HangThucPham) objIn.readObject();

        System.out.println(htp);
    }
}
