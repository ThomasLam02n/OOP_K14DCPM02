package buoi07.chuyenxe;

import java.util.Scanner;

public class ChuyenXe {
    private int maSoChuyen;
    private String hoTenTaiXe;
    private String soXe;
    private double doanhThu;
    Scanner sc = new Scanner(System.in);
    Scanner scs = new Scanner(System.in);

    ChuyenXe(){

    }

    ChuyenXe(int maSoChuyen, String hoTenTaiXe, String soXe, int soTuyen, double soKmDiDuoc, double doanhThu){
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    ChuyenXe(int maSoChuyen, String hoTenTaiXe, String soXe, String noiDen, String soNgayDiDuoc, double doanhThu){
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public void setMaSoChuyen(int maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public int getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }


    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public String toString() {
        return "Ma so Chuyen: "+this.maSoChuyen+ "Ho ten TX: "+this.hoTenTaiXe + "So xe: "+this.soXe
        + "Doanh Thu" +this.doanhThu;
    }

    public void inputChuyenXe(){
        System.out.println("Ma so Chuyen: ");
        this.maSoChuyen = scs.nextInt();
        System.out.println("Ho ten TX: ");
        this.hoTenTaiXe = sc.nextLine();
        System.out.println("So xe: ");
        this.soXe = sc.nextLine();
        System.out.println("Doanh Thu: ");
        this.doanhThu = scs.nextDouble();
    }

    public void outputChuyenXe(){
        System.out.print("Ma so Chuyen: "+maSoChuyen);
        System.out.print("  Ho ten TX: "+hoTenTaiXe);
        System.out.print("  So xe: "+soXe);
        System.out.print("  Doanh thu: "+doanhThu);
    }
}
