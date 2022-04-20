package kiemtracuoikibaihanghoa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

import baikiemtragiuaki.HoaDon;

public class Consoleinput {
    public Scanner sc = new Scanner(System.in);
    public Scanner scs = new Scanner(System.in);
    SimpleDateFormat ngayVN = new SimpleDateFormat("dd/MM/yyyy");
    private int soLuongTonKho;
    private double donGia;
    private Date ngaySanXuat;
    private Date ngayHetHang;
    private int thoiGianBaoHanh;
    private Date ngayNhapKho;

    public HangHoa nhap() throws ParseException {
        HangHoa hangHoa = null;
        System.out.println("Nhap ma hang:");
        String maHang = sc.nextLine();
        System.out.println("Ten hang:");
        String tenHang = sc.nextLine();
        System.out.println("So luong ton kho");
        try {
            soLuongTonKho = scs.nextInt();
        } catch (Exception e) {
            scs = new Scanner(System.in);
            System.out.println("Nhap so be oi !!!");
            e.printStackTrace();
        }

        
        System.out.println("Don gia: ");
        try {
            donGia = scs.nextDouble();
        } catch (Exception e) {
            scs = new Scanner(System.in);
            System.out.println("Nhap so be oi !!!");
            e.printStackTrace();
        }

        if (maHang.contains("T")) {
            System.out.println("Ngay SX:");
            Date ngaySanXuat=null;
            Date ngayHetHang=null;
            try {
                ngaySanXuat = ngayVN.parse(sc.nextLine()); 
            } catch (Exception e) {
                scs = new Scanner(System.in);
                System.out.println("Nhap dd/mm/yyyy be oi !");
                e.printStackTrace();
            }
            System.out.println("Ngay het hang: ");
            try {
                ngayHetHang = ngayVN.parse(sc.nextLine());
            } catch (Exception e) {
                scs = new Scanner(System.in);
                System.out.println("Nhap dd/mm/yyyy be oi !");
                e.printStackTrace();
            }
            System.out.println("Nha SX");
            String nhaSanXuat = sc.nextLine();
            hangHoa = new ThucPham(maHang, tenHang, soLuongTonKho, donGia, ngaySanXuat, ngayHetHang, nhaSanXuat);

        } else if (maHang.contains("D")) {
            System.out.println("Thoi gian bao hanh:");
            int thoiGianBaoHanhint = 0;
            try {
                thoiGianBaoHanh = scs.nextInt();
            } catch (Exception e) {
                scs = new Scanner(System.in);
                System.out.println("Nhap dd/mm/yyyy be oi !");
                e.printStackTrace();
            }
            System.out.println("Cong suat:");
            int congSuat = scs.nextInt();
            hangHoa = new DienMay(maHang, tenHang, soLuongTonKho, donGia, thoiGianBaoHanh, congSuat);

        } else if (maHang.contains("S")) {
            System.out.println("Nha san xuat:");
            String nhaSanXuat = sc.nextLine();
            System.out.println("Ngay nhap kho:");
            Date ngayNhapKho=null;
            try {
                ngayNhapKho = ngayVN.parse(sc.nextLine());
            } catch (Exception e) {
                scs = new Scanner(System.in);
                System.out.println("Nhap dd/mm/yyyy be oi !");
                e.printStackTrace();
            }
            hangHoa = new SanhSu(maHang, tenHang, soLuongTonKho, donGia, nhaSanXuat, ngayNhapKho);
        }

        return hangHoa;
    }

    public HangHoa suaHangHoa() throws ParseException {
        HangHoa hangHoa = null;
        System.out.println("Nhap ma hang:");
        String maHang = sc.nextLine();
        System.out.println("Ten hang:");
        String tenHang = sc.nextLine();
        System.out.println("So luong ton kho");
        try {
            soLuongTonKho = scs.nextInt();
        } catch (Exception e) {
            scs = new Scanner(System.in);
            System.out.println("Nhap so be oi !!!");
            e.printStackTrace();
        }

        
        System.out.println("Don gia: ");
        try {
            donGia = scs.nextDouble();
        } catch (Exception e) {
            scs = new Scanner(System.in);
            System.out.println("Nhap so be oi !!!");
            e.printStackTrace();
        }

        if (maHang.contains("T")) {
            System.out.println("Ngay SX:");
            try {
                Date ngaySanXuat = ngayVN.parse(sc.nextLine()); 
            } catch (Exception e) {
                scs = new Scanner(System.in);
                System.out.println("Nhap dd/mm/yyyy be oi !");
                e.printStackTrace();
            }
            System.out.println("Ngay het hang: ");
            try {
                Date ngayHetHang = ngayVN.parse(sc.nextLine());
            } catch (Exception e) {
                scs = new Scanner(System.in);
                System.out.println("Nhap dd/mm/yyyy be oi !");
                e.printStackTrace();
            }
            System.out.println("Nha SX");
            String nhaSanXuat = sc.nextLine();
            hangHoa = new ThucPham(maHang, tenHang, soLuongTonKho, donGia, ngaySanXuat, ngayHetHang, nhaSanXuat);

        } else if (maHang.contains("D")) {
            System.out.println("Thoi gian bao hanh:");
            int thoiGianBaoHanh = 0;
            try {
                thoiGianBaoHanh = scs.nextInt();
            } catch (Exception e) {
                scs = new Scanner(System.in);
                System.out.println("Nhap dd/mm/yyyy be oi !");
                e.printStackTrace();
            }
            System.out.println("Cong suat:");
            int congSuat = scs.nextInt();
            hangHoa = new DienMay(maHang, tenHang, soLuongTonKho, donGia, thoiGianBaoHanh, congSuat);

        } else if (maHang.contains("S")) {
            System.out.println("Nha san xuat:");
            String nhaSanXuat = sc.nextLine();
            System.out.println("Ngay nhap kho:");
            try {
                Date ngayNhapKho = ngayVN.parse(sc.nextLine());
            } catch (Exception e) {
                scs = new Scanner(System.in);
                System.out.println("Nhap dd/mm/yyyy be oi !");
                e.printStackTrace();
            }
            hangHoa = new SanhSu(maHang, tenHang, soLuongTonKho, donGia, nhaSanXuat, ngayNhapKho);
        }

        return hangHoa;
    }
}
