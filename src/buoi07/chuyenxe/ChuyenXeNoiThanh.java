package buoi07.chuyenxe;

import java.util.Scanner;

public class ChuyenXeNoiThanh extends ChuyenXe {
    protected int soTuyen;
    protected double soKmDiDuoc;
    Scanner sc = new Scanner(System.in);
    Scanner scs = new Scanner(System.in);
    
    ChuyenXeNoiThanh(){}

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoKmDiDuoc(double soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public double getSoKmDiDuoc() {
        return soKmDiDuoc;
    }


    @Override
    public String toString() {
    
        return super.toString() + "So tuyen: "+this.soTuyen + "So KM di duoc: "+this.soKmDiDuoc;
    }

    public void input(){
        super.inputChuyenXe();
        System.out.println("So tuyen: ");
        this.soTuyen = sc.nextInt();
        System.out.println("So KM di duoc:");
        this.soKmDiDuoc = sc.nextDouble();
    }

    public void output(){
        super.outputChuyenXe();
        System.out.print("  So tuyen: "+soTuyen);
        System.out.println("  So KM di duoc: "+soKmDiDuoc);
    }

}
