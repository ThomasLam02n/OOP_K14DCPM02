package baikiemtragiuakiremake;

import java.text.ParseException;
import java.util.Date;

public class HoaDonTheoNgay extends HoaDon{
    private int soNgayThue;

    public HoaDonTheoNgay(){}

    public HoaDonTheoNgay(int maHD, Date ngayHD, String tenKh, int maPhong, double donGia, double thanhTien,
            int soNgayThue) {
        super(maHD, ngayHD, tenKh, maPhong, donGia, thanhTien);
        this.soNgayThue = soNgayThue;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + String.format("%-20d%-20.2f", soNgayThue, getThanhTien());
    }

    @Override
    protected double getThanhTien() {
        // TODO Auto-generated method stub
        setThanhTien(thanhTien);
        return thanhTien;
    }

    @Override
    protected void setThanhTien(double thanhTien) {
        // TODO Auto-generated method stub
        if (this.soNgayThue > 7) {
            this.thanhTien = 7 * getDonGia() + (((soNgayThue - 7) * getDonGia() * 20 ) / 100);
        } else {
            this.thanhTien = soNgayThue*getDonGia();   
        }
        return;
    }

    @Override
    protected void input() throws ParseException {
        // TODO Auto-generated method stub
        super.input();
        System.out.print("- Nhập vào số ngày thuê: ");
        this.soNgayThue = scs.nextInt(); 
    }
    
}
