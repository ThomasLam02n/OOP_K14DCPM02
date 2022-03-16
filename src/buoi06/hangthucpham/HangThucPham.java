package buoi06.hangthucpham;


import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham implements Serializable{
    private String maHang;
    private String tenHang;
    private double donGia;
    private Date ngaySanXuat;
    private Date ngayHetHang;
    
    HangThucPham(){}
    
    public String getMaHang() {
        return maHang;
    }

    private void setMaHang(String maHang) {
        if(maHang != null){
            this.maHang = maHang;
        }else{
            System.out.println("Ma hang khong duoc null");
        }
    }
    
    public String getTenHang() {
        return tenHang;
    }

    private void setTenHang(String tenHang) {
        if(tenHang != null){
            this.tenHang = tenHang;
        }else{
            System.out.println("Ten hang khong duoc rong !!!");
        }
    }

    public double getDonGia() {
        return donGia;
    }

    private void setDonGia(double donGia) {
        if(donGia > 0){
            this.donGia = donGia;
    }else{
   System.out.println("Don gia khong duoc be hon 0");
        }
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        if(ngaySanXuat != null){
            this.ngaySanXuat = ngaySanXuat;
        }else{
            System.out.println("Ngay san xuat khong");
        }
    }

    public Date getNgayHetHang() {
        return ngayHetHang;
    }

    public void setNgayHetHang(Date ngayHetHang) {
       /*  if(ngayHetHang.after(ngaySanXuat)){
            this.ngayHetHang = ngayHetHang;
        }else{
            System.out.println("Ngay het hang phai sau ngay san xuat !!!");
        }
        this.ngayHetHang = ngayHetHang; */
    }

    public HangThucPham(String maHang){
        this.setMaHang(maHang);
    }

    
    @Override
    public String toString() {

        SimpleDateFormat ngayVN = new SimpleDateFormat("dd/mm/yyyy");

        return "HangThucPham [donGia=" + donGia + ", maHang=" + maHang + ", ngayHetHang=" + ngayVN.format(ngayHetHang)
                + ", ngaySanXuat=" + ngayVN.format(ngaySanXuat) + ", tenHang=" + tenHang + "]";
    }

    

    public HangThucPham(String maHang, String tenHang, double donGia, Date ngaySanXuat, Date ngayHetHang) {
        setMaHang(maHang);
        setTenHang(tenHang);
        setDonGia(donGia);
        setNgaySanXuat(ngaySanXuat);
        setNgayHetHang(ngayHetHang);
    }

    public boolean kiemTraHSD(){
        boolean isHetHan = false;
        Date ngayHienTai = new Date();
        
        return isHetHan;
    }

}
