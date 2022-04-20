package kiemtracuoikibaihanghoa;

import java.lang.invoke.CallSite;
import java.text.ParseException;
import java.util.Scanner;

public class HangHoaMain {
    public static void main(String[] args) throws ParseException {
        Consoleinput consoleinput = new Consoleinput();
        QuanLyDSHangHoa qlhh = new QuanLyDSHangHoa();
        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        qlhh.moi();

        do {
            System.out.println("-----------------MENU:----------------- ");
            System.out.println("\t1. Them hang hoa vao danh sach.");
            System.out.println("\t2. Xoa hang hoa.");
            System.out.println("\t3. Sua mot hang hoa bat ky.");
            System.out.println("\t4. In danh sach hang hoa.");
            System.out.println("\t5. Tim kiem hang hoa.");
            System.out.println("\t6. Thong ke hang hoa.");
            System.out.println("\t7. Bao cao hang hoa.");
            System.out.println("\t8. Sap xep hang hoa theo ky tu.");
            System.out.println("\t9. Doc file");
            System.out.println("\t0. Thoat");
            System.out.println("-------------------------------------------");

            System.out.print("Chon chuc nang(nhap so): ");
            int key = scs.nextInt();
            switch (key) {
                case 1:
                    do {
                        HangHoa hangHoa = consoleinput.nhap();
                        qlhh.themHH(hangHoa);
                        System.out.println("Be co muon nhap tiep ko Y/N");
                        sc.nextLine();
                    } while (sc.nextLine().equalsIgnoreCase("y"));
                    break;
                case 2:
                    System.out.println("\t1) Xoa hang hoa theo ma hang.");
                    System.out.println("\t2) Xoa hang hoa theo ten hang.");
                    System.out.println("Chon xoa hang hoa theo? (1 -> 2):");
                    int chon = sc.nextInt();
                    switch (chon) {
                        case 1:
                            qlhh.xoaHHTheoMaHang();
                            break;
                        case 2:
                            qlhh.xoaHHTheoTenHang();
                            break;
                        default:
                            System.out.println(" Chon 1 hoac 2 thoi be oi !!!");
                    }
                    break;
                case 3:
                    System.out.println("Nhap ma hang muon sua: ");
                    String maHang = sc.nextLine();
                    qlhh.suaHangHoa(maHang);
                    break;
                case 4:
                    System.out.println("\t1) In thong tin tat ca hang hoa.");
                    System.out.println("\t2) In thong tin hang hoa thuc pham.");
                    System.out.println("\t3) In thong tin hang hoa dien may.");
                    System.out.println("\t4) In thong tin hang hoa sanh su.");
                    System.out.println("Chon in thong tin loai HH nao(1 -> 4) ?");
                    int chon1 = sc.nextInt();
                    switch (chon1) {
                        case 1:
                            qlhh.inThongTinHH();
                            break;
                        case 2:
                            qlhh.inThongTinHHThucPham();
                            break;
                        case 3:
                            qlhh.inThongTinHHDienMay();
                            break;
                        case 4:
                            qlhh.inThongTinHHSanhSu();
                            break;
                        default:
                            System.out.println(" Chon 1 den 4 thoi be oi !!!");
                    }
                    break;
                case 5:
                    System.out.println("\t1) Tim hang hoa theo ma hang.");
                    System.out.println("\t2) Tim hang hoa theo ten hang.");
                    System.out.println("Chon xoa hang hoa theo? (1 -> 2):");
                    int chon3 = sc.nextInt();
                    switch (chon3) {
                        case 1:
                            qlhh.timHangHoaTheoMa();
                            break;
                        case 2:
                            qlhh.timHangHoaTheoTenHang();
                            break;
                        default:
                            System.out.println(" Chon 1 hoac 2 thoi be oi !!!");
                    }
                    break;
                case 6:
                    qlhh.thongkeHangHoa();
                    break;
                case 7:
                    qlhh.baoCao();
                    break;
                case 8:
                    qlhh.sapXepHH();
                    break;
                case 9:
                    System.out.println("Da ghi file !!!");
                    qlhh.docFile();
                case 0:
                    System.out.println("Cam on da su dung chuong trinh !");
                    break;
                default:
                    System.out.println("Tu 1 den 9 thoi be oi !!!");
            }
            System.out.println("Về Menu(y/n)?: ");
        } while (qlhh.sc.nextLine().equals("y"));
    }

}
