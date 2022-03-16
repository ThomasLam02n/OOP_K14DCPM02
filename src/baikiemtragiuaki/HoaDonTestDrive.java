package baikiemtragiuaki;

import java.text.ParseException;
import java.util.Scanner;

public class HoaDonTestDrive {
    public static void main(String[] args) throws ParseException {
        QuanLyHoaDon qlhd = new QuanLyHoaDon();
        Scanner sc = new Scanner(System.in);
        int key;
        do{
            System.out.println("---------------------------");
            System.out.println("1 .Nhap hoa don theo gio:");
            System.out.println("2. Nhap hoa don theo ngay:");
            System.out.println("3. Xuat tat ca hoa don: ");
            System.out.println("4. Tong thanh tien cac hoa don theo gio:");
            System.out.println("5. Tong thanh tien cac hoa don theo ngay: ");
            System.out.println("6. Trung binh cong thanh tien:");
            System.out.println("7. Thoat");
            key = sc.nextInt();
            switch(key){
                case 1:
                    qlhd.nhapThongTinHDTheoGio();
                    break;
                case 2:
                    qlhd.nhapThongTinHDTheoNgay();
                    break;
                case 3:
                    qlhd.inThongTinHDTheoGio();
                    qlhd.inThongTinHDTheoNgay();
                    break;
                case 4:
                    qlhd.tinhTongThanhTienHDTheoGio();
                    break;
                case 5:
                    qlhd.tinhTongThanhTienHDTheoNgay();
                    break;
                case 6:
                    qlhd.tinhTrungBinhThanhTien();
                    break;
                case 7:
                    System.out.println("Cam on da su dung chuong trinh !");
                    break;
            }
            System.out.println("Quay ve menu?(y/n):");
        }while(sc.nextLine().equals("y"));
        
    }
}
