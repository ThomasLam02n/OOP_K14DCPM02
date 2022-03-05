package buoi06.sinhvienb2;

import java.util.Scanner;

public class SinhVien {
    private int mssv;
    private String name;
    private float diemLT;
    private float diemTH;
    Scanner sc = new Scanner(System.in);

    SinhVien(){

    }

    SinhVien(int mssv, String name, float diemLT, float diemTH){
        this.mssv = mssv;
        this.name = name;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMssv() {
        return mssv;
    }
    
    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public float getDiemLT() {
        return diemLT;
    }
    
    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float tinhdiemTB(){
        return (this.diemLT + this.diemTH)/2;
    }

    public String toString(){
        String stc = "Tên: " +this.getName() + "Mssv: "+ this.getMssv();
        stc += "ĐiểmTB: " +this.tinhdiemTB();
        return stc;
    }

    public void nhapThongTinSV(){
        System.out.println("Điền Thông Tin");
        System.out.println("tên: ");
        this.name = sc.nextLine();
        System.out.println("mssv: ");
        this.mssv = sc.nextInt();
        System.out.println("diemLT: ");
        this.diemLT = sc.nextFloat();
        System.out.println("diemTH: ");
        this.diemTH = sc.nextFloat();
    }
    public void inThongTinSV(){
        System.out.print("  Tên: "+this.name);
        System.out.print(" Mssv: "+this.mssv);
        System.out.print("  ĐiểmLT: "+this.diemLT);
        System.out.print("  ĐiểmTH: "+this.diemTH);
        System.out.println("ĐiểmTB: "+this.tinhdiemTB());
    }
}
