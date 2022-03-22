package baikiemtragiuakiremake;

import java.text.ParseException;
import java.util.Date;

public class HoaDonTheoGio extends HoaDon{
    private int soGioThue;

    public HoaDonTheoGio(int maHD, Date ngayHD, String tenKh, int maPhong, double donGia, double thanhTien,
            int soGioThue) {
        super(maHD, ngayHD, tenKh, maPhong, donGia, thanhTien);
        this.soGioThue = soGioThue;
    }

    public HoaDonTheoGio() {
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + String.format("%-20d%-20.2f", soGioThue, getThanhTien());
    }

    @Override
    protected void setThanhTien(double thanhTien) {
        // TODO Auto-generated method stub
        if (this.soGioThue <= 24) {
            this.thanhTien = getDonGia()*soGioThue;
        }
        if (this.soGioThue > 24 && this.soGioThue < 30) {
            this.thanhTien = getDonGia()*24;
        } 
        if (this.soGioThue > 30) {
            System.out.println("Số giờ đã trên 30 giờ nên không thể tính theo loại hoá giờ!!!");
        }
    }

    
    @Override
    protected double getThanhTien() {
        // TODO Auto-generated method stub
        setThanhTien(thanhTien);
        return thanhTien;
    }

    @Override
    protected void input() throws ParseException {
        // TODO Auto-generated method stub
        super.input();
        System.out.print("- Nhập vào số giờ thuê: ");
        this.soGioThue = scs.nextInt();
    }
}
