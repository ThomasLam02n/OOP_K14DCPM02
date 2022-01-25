package baitaptet;

import java.util.Scanner;

public class SanPham {
    //Attribute
    private String tenSP;
    private double donGia;
    private double giamGia;
    private double thueNhapKhau;
    Scanner bienNhap = new Scanner(System.in);

    //Methods
    public SanPham() {

    }

    public SanPham(String tenSP, double donGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
    }

    public SanPham(String tenSP, double donGia, double giamGia) {
        this(tenSP, donGia);
        this.giamGia = giamGia;
    }

    private void getThueNhapKhau(double thueNhapKhau) {
        thueNhapKhau = 10 * donGia / 100;
        System.out.println("Thuế nhập khẩu: " + thueNhapKhau);
    }

    public String gettenSP(){
        return tenSP;
    }

    public void settenSP(String tenSP){
        this.tenSP = tenSP;
    }

    public double getdonGia(){
        return donGia;
    }

    public void setdonGia(double donGia){
        if(donGia <= 100.000){
        this.donGia = donGia;
        }
    }

    public double getgiamGia(){
        return giamGia;
    }

    public void setgiamGia(double giamGia){
        this.giamGia = giamGia;
    }


    public void xuat() {
        System.out.print("Tên sản phẩm: " + tenSP);
        System.out.print("  Đơn giá: " + donGia);
        System.out.print("  Giảm giá: " + giamGia + "  ");
        getThueNhapKhau(thueNhapKhau);
    }

    void nhap() {
        System.out.println("Tên sản phẩm: ");
        this.tenSP = bienNhap.nextLine();
        System.out.println("Đơn giá:");
        this.donGia = bienNhap.nextDouble();
        System.out.println("Giảm giá");
        this.giamGia = bienNhap.nextDouble();
    }
}