package kiemtracuoikibaihanghoa;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThucPham extends HangHoa{
    public Date ngaySanXuat, ngayHetHang;
    private String nhaSanXuat;
    
    public ThucPham(String maHang, String tenHang, int soLuongTonKho, double donGia, Date ngaySanXuat, Date ngayHetHang,
            String nhaSanXuat) {
        super(maHang, tenHang, soLuongTonKho, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHang = ngayHetHang;
        this.nhaSanXuat = nhaSanXuat;
    }

    public ThucPham(Date ngaySanXuat, Date ngayHetHang, String nhaSanXuat) {
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHang = ngayHetHang;
        this.nhaSanXuat = nhaSanXuat;
    }

    public ThucPham() {
    }

    SimpleDateFormat ngayVN = new SimpleDateFormat("dd/MM/yyyy");

    public Date getNgayHetHang() {
        return ngayHetHang;
    }

    public void setNgayHetHang(Date ngayHetHang) {
        if(ngayHetHang.after(ngaySanXuat) || ngayHetHang.equals(ngaySanXuat))
        this.ngayHetHang = ngayHetHang;
        else{
            System.out.println("Ngay HH phai sau ngay SX be oi");
        }
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public boolean tinhHSD(){
        boolean hetHang = false;
        Date ngayHienTai = new Date();
        if(this.ngayHetHang.before(ngayHienTai)){
            hetHang = true;
        }else{
            hetHang = false;
        }
        return hetHang;
    }

    @Override
    protected double tinhTien(){
        // TODO Auto-generated method stub
        double tien = 0;
        tien = getSoLuongTonKho() * getDonGia() / 0.05;
        return tien;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() +"\tNgay SX: "+ngayVN.format(ngaySanXuat)+"\tNgay het hang: "+ngayVN.format(ngayHetHang)+
        "\tNha SX "+this.nhaSanXuat;
    }

    @Override
    protected String danhGia() {
        // TODO Auto-generated method stub
        if(getSoLuongTonKho() > 0 && tinhHSD() == true){
            System.out.println("Kho ban!");
        }else{
            System.out.println("Ban duoc!");
        }
        return null;
    }
}
