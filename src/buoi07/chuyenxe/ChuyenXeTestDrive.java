package buoi07.chuyenxe;

import java.util.Scanner;

public class ChuyenXeTestDrive {
 public static void main(String[] args) {
     DanhSachChuyenXe danhSachChuyenXe = new DanhSachChuyenXe();
     System.out.println("Chuyen Xe Ngoai Thanh: ");
     danhSachChuyenXe.nhapThongTinCXNgoaiThanh();
     System.out.println("Chuyen Xe Noi Thanh: ");
     danhSachChuyenXe.nhapThongTinCXNoiThanh();
     System.out.println("Thong tin cac Chuyen xe: ");
     System.out.println("Chuyen xe Ngoai Thanh");
     danhSachChuyenXe.inThongTinCXNgoaiThanh();
     System.out.println("Chuyen xe Noi Thanh");
     danhSachChuyenXe.inThongTinCXNoiThanh();
 }
}
