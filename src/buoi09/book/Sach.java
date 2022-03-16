package buoi09.book;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Sach {
    private int maSach;
    private Date ngayNhap;
    private double donGia;
    private int soLuong;
    private String nhaXuatBan;
    Scanner sc = new Scanner(System.in);
    Scanner scs = new Scanner(System.in);
    SimpleDateFormat ngayVN = new SimpleDateFormat("dd/MM/yyyy");

    public Sach(){
        super();
    }

    public Sach(int maSach, Date ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getMaSach() {
        return this.maSach;
    }

    private int setMaSach() {
        System.out.println("Ma sach: ");
        return this.maSach = scs.nextInt();
    }

    public Date getNgayNhap() {
        return this.ngayNhap;
    }

    private Date setNgayNhap() throws ParseException {
        System.out.println("Ngay Nhap: ");
        return this.ngayNhap = ngayVN.parse(sc.nextLine());
    }

    public double getDonGia() {
        return this.donGia;
    }

    private double setDonGia() {
        System.out.println("Don gia: ");
        return this.donGia = scs.nextDouble();
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    private int setSoLuong() {
        System.out.println("So luong: ");
        return this.soLuong = scs.nextInt();
    }

    public String getNhaXuatBan() {
        return this.nhaXuatBan;
    }

    private String setNhaXuatBan() {
        System.out.println("Nha XB: ");
        return this.nhaXuatBan = sc.nextLine();
    }

    public void nhapThongTin() throws ParseException{
        this.setMaSach();
        this.setNgayNhap();
        this.setDonGia();
        this.setSoLuong();
        this.setNhaXuatBan();
    }

    @Override
    public String toString() {
        return "Ma sach: "+this.getMaSach()+" Ngay nhap: "+ngayVN.format(this.getNgayNhap())+
        " Don gia: "+this.getDonGia()+" So luong: "+this.getSoLuong()+" Nha XB: "+this.getNhaXuatBan();
    }


}
