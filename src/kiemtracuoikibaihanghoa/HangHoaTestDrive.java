package kiemtracuoikibaihanghoa;

import java.text.ParseException;

public class HangHoaTestDrive {
    public static void main(String[] args) throws ParseException {
        QuanLyDSHangHoa qlhh = new QuanLyDSHangHoa();
        String nhaptiep;
        
        Consoleinput consoleinput = new Consoleinput();

        do{
            HangHoa hangHoa = consoleinput.nhap();
            qlhh.themHH(hangHoa);
            System.out.println("Be co muon nhap tiep ko Y/N");
            nhaptiep = consoleinput.sc.nextLine();
        }while(nhaptiep.equalsIgnoreCase("y"));

        qlhh.moi();
        qlhh.inThongTinHH();
        //qlhh.baoCao();
        //qlhh.suaHangHoa("T002");
        //qlhh.inThongTinHHThucPham();
        //qlhh.sapXepHH();
        //qlhh.inThongTinHH();
        //qlhh.thongkeHangHoa();
        //qlhh.xoaHH();
        //qlhh.timHangHoaTheoMa();
        //qlhh.inThongTinHH();
        //qlhh.xoaHHTheoTenHang();
        /* System.out.println("nhapMH can tim:");
        String maHang = qlhh.sc.nextLine();
        qlhh.timHangHoaTheoMa(maHang); */

        //qlhh.suaThongTinHangHoa(6);
        //qlhh.inThongTinHH();
        
        //qlhh.sapXepHH();
    }

    
}
