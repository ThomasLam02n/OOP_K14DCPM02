package baitaptet;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class SanPham {
    //implementation
    private String tenSP;
    private double donGia;
    private double giamGia;
    private double thueNhapKhau;
    Scanner bienNhap = new Scanner(System.in);
    // Đang sài private cho attribute nên muốn thay đổi thì tham chiếu đến set và get của attribute đó

    //Methods

    //Constructor
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

    //interfaces
    public double getThueNhapKhau() {
        return this.caculateThueNhapKhau();
    }

    //implementation
    private double caculateThueNhapKhau(){
        this.thueNhapKhau = 10 * donGia / 100; 
        System.out.println("Thuế nhập khẩu: " + this.thueNhapKhau);
        return this.donGia;
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
        getThueNhapKhau();
    }

    public void nhap() {
        System.out.println("Tên sản phẩm: ");
        this.tenSP = bienNhap.nextLine();
        System.out.println("Đơn giá:");
        this.donGia = bienNhap.nextDouble();
        System.out.println("Giảm giá");
        this.giamGia = bienNhap.nextDouble();
    }
}