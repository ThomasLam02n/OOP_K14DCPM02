package baikiemtragiuaki;

import java.text.ParseException;
import java.util.Date;

import javax.lang.model.util.ElementScanner14;

public class HoaDonTheoGio extends HoaDon {
    private int soGioThue;
    private double thanhtien;

    HoaDonTheoGio(){

    }

    public HoaDonTheoGio(int maHoaDon, Date ngayHoaDon, String tenKhachHang, String maPhong, double donGia,
            int soGioThue, double thanhtien) {
        super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
        this.soGioThue = soGioThue;
        this.thanhtien = thanhtien;
    }



    public int getSoGioThue() {
        return soGioThue;
    }

    private void setSoGioThue(int soGioThue) {
        if(soGioThue > 24 && soGioThue < 30 ){
            soGioThue = 24;
        }else if(soGioThue > 30){
            System.out.println("Khong dung loai hoa don theo gio !!!");
        }else
        this.soGioThue = soGioThue;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }

    @Override
    protected void nhapThongTin() throws ParseException {
        // TODO Auto-generated method stub
        super.nhapThongTin();
        System.out.println("So gio thue: ");
        this.soGioThue = scs.nextInt();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+" So gio thue: "+this.soGioThue;
    }

    @Override
    public void thanhTien() {
        // TODO Auto-generated method stub
        if(soGioThue > 24){
            this.thanhTien = this.soGioThue * getDonGia();
        }if(soGioThue > 24 && soGioThue < 30){
            thanhTien = getDonGia() * 24;
        }if(soGioThue > 30){
            System.out.println(" > 30h Khong dung hoa don theo gio !!!");
        }
        return;
    }
}
