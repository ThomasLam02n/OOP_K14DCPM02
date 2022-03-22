package baikiemtragiuakiremake;

import java.util.Scanner;

import baikiemtragiuaki.QuanLyHoaDon;

public class HoaDonTestDrive {
    public static void main(String[] args) {
        int luaChon;
        Scanner scs = new Scanner(System.in);
        QuanLyHoaDon quanLyHoaDon = new QuanLyHoaDon();

        do {
            System.out.println("\n\t-------------------------------- Menu --------------------------------");
            System.out.println("\t1. Nhập danh sách hoá đơn thuê phòng theo giờ.");
            System.out.println("\t2. Nhập danh sách hoá đơn thuê phòng theo ngày.");
            System.out.println("\t3. Tổng số lượng từng loại phòng thuê.");
            System.out.println("\t4. Trung bình thành tiền cho hoá đơn thuê phòng trong tháng 9 năm 2013.");
            System.out.println("\t5. Xuất danh sách hoá đơn theo từng loại.");
            System.out.println("\t0. Thoát.");
            System.out.println("\t------------------------------------------------------------------------");
            System.out.print("\n- Vui lòng nhập lựa chọn: ");
            luaChon = scs.nextInt();

            switch (luaChon) {
                case 1:
                    quanLyHoaDon.nhapHoaDon("theo gio");
                    break;
                case 2:
                    quanLyHoaDon.nhapHoaDon("theo ngay");
                    break;
                case 3:
                    quanLyHoaDon.tongSoLuong();
                    break;
                case 4:
                    quanLyHoaDon.tinhTrungBinhThanhTien();
                    break;
                case 5:
                    quanLyHoaDon.inDanhSach();
                    break;
                default:
                    break;
            }
            System.out.println("Quay ve menu?(y/n):");
            scs.nextLine();
        }while(scs.nextLine().equals("y"));
    }

}
