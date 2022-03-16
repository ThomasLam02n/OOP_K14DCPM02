package baikiemtragiuaki;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class HoaDon {
    protected int maHoaDon;
    protected Date ngayHoaDon;
    protected String tenKhachHang;
    protected String maPhong;
    protected double donGia;
    Scanner sc = new Scanner(System.in);
    Scanner scs = new Scanner(System.in);
    SimpleDateFormat ngayVN = new SimpleDateFormat("dd/MM/yyyy");

    protected int getMaHoaDon() {
        return maHoaDon;
    }
    protected void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }
    protected Date getNgayHoaDon() {
        return ngayHoaDon;
    }
    protected void setNgayHoaDon(Date ngayHoaDon) {
        this.ngayHoaDon = ngayHoaDon;
    }
    protected String getTenKhachHang() {
        return tenKhachHang;
    }
    protected void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }
    protected String getMaPhong() {
        return maPhong;
    }
    protected void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }
    protected double getDonGia() {
        return donGia;
    }
    protected void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    protected Scanner getSc() {
        return sc;
    }
    protected void setSc(Scanner sc) {
        this.sc = sc;
    }

    protected HoaDon(){
        
    }
    
    
    protected HoaDon(int maHoaDon, Date ngayHoaDon, String tenKhachHang, String maPhong, double donGia) {
        this.maHoaDon = maHoaDon;
        this.ngayHoaDon = ngayHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.maPhong = maPhong;
        this.donGia = donGia;
    }

    protected void nhapThongTin() throws ParseException{
        System.out.println("Ma hoa don: ");
        this.maHoaDon = scs.nextInt();
        System.out.println("Ngay hoa don: ");
        this.ngayHoaDon = ngayVN.parse(sc.nextLine());
        System.out.println("Ten khach hang: ");
        this.tenKhachHang = sc.nextLine();
        System.out.println("Ma phong: ");
        this.maPhong = scs.nextLine();
        System.out.println("Don gia: ");
        this.donGia = scs.nextDouble();

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Ma hoa don: "+this.maHoaDon+" Ngay hoa don: "+ngayVN.format(this.ngayHoaDon)+
        " Ten khach hang: "+this.tenKhachHang+" Ma phong: "+this.maPhong+ "Don gia: "+this.donGia;
    }


}
