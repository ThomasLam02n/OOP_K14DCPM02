package baikiemtragiuaki;

import java.text.ParseException;
import java.util.Date;

public class HoaDonTheoNgay extends HoaDon{
    private int soNgayThue;
    private double thanhTien;

    HoaDonTheoNgay(){
        
    }

    
    public HoaDonTheoNgay(int maHoaDon, Date ngayHoaDon, String tenKhachHang, String maPhong, double donGia,
            int soNgayThue, double thanhTien) {
        super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
        this.soNgayThue = soNgayThue;
        this.thanhTien = thanhTien;
    }



    public int getSoNgayThue() {
        return soNgayThue;
    }



    private void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }



    public double getThanhTien() {
        return thanhTien;
    }



    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    @Override
    protected void nhapThongTin() throws ParseException {
        // TODO Auto-generated method stub
        super.nhapThongTin();
        System.out.println("So ngay thue:");
        this.soNgayThue = scs.nextInt();
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+" So ngay thue: "+this.soNgayThue;
    }


    @Override
    protected void thanhTien() {
        // TODO Auto-generated method stub
        if(soNgayThue > 7){
            this.thanhTien = 7*getDonGia() + (((soNgayThue - 7) * getDonGia() * 20)/100);
        }else{
            this.thanhTien = soNgayThue*getDonGia();
        }
        return;
    }
    
}
