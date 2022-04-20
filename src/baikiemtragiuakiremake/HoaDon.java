package baikiemtragiuakiremake;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class HoaDon {
    private int maHD;
    private Date ngayHD;
    private String tenKh;
    private int maPhong;
    private double donGia;
    protected double thanhTien;

    Scanner sc = new Scanner(System.in);
    Scanner scs = new Scanner(System.in);

    SimpleDateFormat ngayVN = new SimpleDateFormat("dd/MM/yyyy");

    protected HoaDon(){}

    protected HoaDon(int maHD, Date ngayHD, String tenKh, int maPhong, double donGia, double thanhTien) {
        this.maHD = maHD;
        this.ngayHD = ngayHD;
        this.tenKh = tenKh;
        this.maPhong = maPhong;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }

    protected int getMaHD() {
        return maHD;
    }

    protected void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    protected Date getNgayHD() {
        return ngayHD;
    }

    protected void setNgayHD(Date ngayHD) {
        this.ngayHD = ngayHD;
    }

    protected String getTenKh() {
        return tenKh;
    }

    protected void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }

    protected int getMaPhong() {
        return maPhong;
    }

    protected void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    protected double getDonGia() {
        return donGia;
    }

    protected void setDonGia(double donGia){
        this.donGia = donGia;
    }
    protected abstract double getThanhTien();

    protected abstract void setThanhTien(double thanhTien);

    protected SimpleDateFormat getNgayVN() {
        return ngayVN;
    }

    protected void setNgayVN(SimpleDateFormat ngayVN) {
        this.ngayVN = ngayVN;
    }

    @Override
    public String toString() {
        String str = String.format("%-20d%-20s%-20s%-20d%-20.2f", maHD, ngayVN.format(ngayHD), tenKh, maPhong, donGia);
        return str;
    }

    protected void input() throws ParseException{
        System.out.print("- Nhập vào mã hoá đơn: ");
        this.maHD = scs.nextInt();
        System.out.print("- Nhập vào ngày hoá đơn: ");
        this.ngayHD = ngayVN.parse(sc.nextLine());
        System.out.print("- Nhập vào tên khách hàng: ");
        this.tenKh = sc.nextLine();
        System.out.print("- Nhập vào mã phòng: ");
        this.maPhong = scs.nextInt();
        System.out.print("- Nhập vào đơn giá: ");
        this.donGia = scs.nextDouble();
    } 
    
}


