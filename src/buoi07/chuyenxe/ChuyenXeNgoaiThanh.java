package buoi07.chuyenxe;

import java.util.Scanner;

public class ChuyenXeNgoaiThanh extends ChuyenXe{
   protected String noiDen;
   protected int soNgayDiDuoc;
   Scanner sc = new Scanner(System.in);
   Scanner scs = new Scanner(System.in);

   ChuyenXeNgoaiThanh(){}
   
   public void setNoiDen(String noiDen) {
       this.noiDen = noiDen;
   }

   public String getNoiDen() {
       return noiDen;
   }

   public void setSoNgayDiDuoc(int soNgayDiDuoc) {
       this.soNgayDiDuoc = soNgayDiDuoc;
   }

   public int getSoNgayDiDuoc() {
       return soNgayDiDuoc;
   }

   @Override
   public String toString() {
       return super.toString() + "Noi den: "+this.getNoiDen() + "So ngay di duoc: "+this.getSoNgayDiDuoc();
   }

   public void input(){
       System.out.println("Noi den: ");
       this.noiDen = sc.nextLine();
       System.out.println("So ngay di duoc");
       this.soNgayDiDuoc = sc.nextInt();
   }

   public void output(){
       System.out.println("Noi den: "+this.noiDen);
       System.out.println("So ngay di duoc: "+this.soNgayDiDuoc);
   }
}
