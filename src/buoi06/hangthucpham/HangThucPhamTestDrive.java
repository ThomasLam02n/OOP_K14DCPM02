package buoi06.hangthucpham;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPhamTestDrive {
    public static void main(String[] args) throws ParseException {
        HangThucPham htp = new HangThucPham();
        
        Date date = new Date();

        String ngaySanXuat = "01/03/2022";
        String ngayHetHang = "08/03/2022";

        SimpleDateFormat ngayVN = new SimpleDateFormat("dd/mm/yyyy");

        HangThucPham htp2 = new HangThucPham("TP02", "Mi hao hao", 3_500,
         ngayVN.parse(ngaySanXuat), ngayVN.parse(ngayHetHang));

         System.out.println(htp2);
    }
}
