package baitaptet;

import java.util.Scanner;

public class SanPham {
    String tenSP;
    double donGia;
    double giamGia;

    Scanner bienNhap = new Scanner(System.in);
    private double thueNhapKhau;

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
        thueNhapKhau = 10 * (donGia - giamGia) / 100;
        System.out.println("Thuế nhập khẩu: " + thueNhapKhau);
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