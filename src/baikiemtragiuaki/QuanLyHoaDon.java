package baikiemtragiuaki;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyHoaDon{
    List<HoaDonTheoGio> arrhdTheoGio = new ArrayList<>();
    List<HoaDonTheoNgay> arrhdTheoNgay = new ArrayList<>();

    private double tongThanhTienHDTG, tongThanhTienHDTN, tongTrungBinhCongThanhTien, tongDonGia;
    Scanner sc = new Scanner(System.in);

    public void nhapThongTinHDTheoGio() throws ParseException{
        while(true){
            HoaDonTheoGio hdTheoGio = new HoaDonTheoGio();
            hdTheoGio.nhapThongTin();
            arrhdTheoGio.add(hdTheoGio);
            System.out.println("Them hoa don(y/n)?: ");
            if(sc.nextLine().equals("n")){
                break;
            }
        }
    }

    public void inThongTinHDTheoGio(){
        System.out.println("Thong tin hoa don theo gio: ");
        for(HoaDonTheoGio hdTheoGio: arrhdTheoGio){
            System.out.println(hdTheoGio.toString());
        }
    }

    public void nhapThongTinHDTheoNgay() throws ParseException{
        while(true){
            HoaDonTheoNgay hdTheoNgay = new HoaDonTheoNgay();
            hdTheoNgay.nhapThongTin();
            arrhdTheoNgay.add(hdTheoNgay);
            System.out.println("Them hoa don(y/n)?: ");
            if(sc.nextLine().equals("n")){
                break;
            }
        }
        
    }

    public void inThongTinHDTheoNgay(){
        System.out.println("Thong tin hoa don theo ngay: ");
        for(HoaDonTheoNgay hdTheoNgay: arrhdTheoNgay){
            System.out.println(hdTheoNgay.toString());
        }
    }

    public void tinhTongThanhTienHDTheoGio(){
        for(HoaDonTheoGio hdTheoGio: arrhdTheoGio){
            tongThanhTienHDTG += hdTheoGio.getSoGioThue()*hdTheoGio.getMaHoaDon();
        }
        System.out.println("Tong thanh tien hoa don theo gio: "+tongThanhTienHDTG);
    }

    public void tinhTongThanhTienHDTheoNgay(){
        for(HoaDonTheoNgay hdTheoNgay: arrhdTheoNgay){
            tongThanhTienHDTN += hdTheoNgay.getSoNgayThue()*hdTheoNgay.getDonGia();
        }
    }

    public void tinhTrungBinhThanhTien(){
        for(HoaDonTheoNgay hdTheoNgay: arrhdTheoNgay){
            
            tongDonGia += hdTheoNgay.getDonGia();
            tongTrungBinhCongThanhTien = tongDonGia/ arrhdTheoNgay.size();


        }
        System.out.println("Trung binh cong thanh tien theo hd Ngay"+ tongTrungBinhCongThanhTien);
    }

    public void nhapHoaDon(String string) {
    }

    public void tongSoLuong() {
    }

    public void inDanhSach() {
    }




}
