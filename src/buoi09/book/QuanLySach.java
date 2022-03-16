package buoi09.book;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySach extends Sach {
    List<SachGiaoKhoa> arrSGK = new ArrayList<>();
    List<SachThamKhao> arrSTK = new ArrayList<>();

    private double tongThanhTienSGK = 0, tongThanhTienSTK = 0, tongDonGiaSTK = 0, trungBinhCongSTK;

    QuanLySach() {
    }

    public void nhapThongTinSGK() throws ParseException {
        while (true) {
            SachGiaoKhoa sgk = new SachGiaoKhoa();
            sgk.nhapThongTin();
            arrSGK.add(sgk);
            System.out.println("Nhap them SGK(y/n)?: ");
            if (sc.nextLine().equals("n")) {
                break;
            }
        }
    }

    public void inThongTinSGK() {
        System.out.println("Sach Giao Khoa");
        for (SachGiaoKhoa sgk : arrSGK) {
            System.out.println(sgk.toString());
        }
    }

    public void nhapThongTinSTK() throws ParseException {
        while (true) {
            SachThamKhao stk = new SachThamKhao();
            stk.nhapThongTin();
            arrSTK.add(stk);
            System.out.println("Nhap them STK(y/n)?: ");
            if (sc.nextLine().equals("n")) {
                break;
            }
        }
    }

    public void inThongTinSTK() {
        System.out.println("Sach Tham Khao");
        for (SachThamKhao stk : arrSTK) {
            System.out.println(stk.toString());
        }
    }

    public void tinhTongThanhTienSGK() {
        for (SachGiaoKhoa sgk : arrSGK) {
            if (sgk.getTinhTrang().equals("cu")) {
                tongThanhTienSGK += sgk.getSoLuong() * sgk.getDonGia() * 50 / 100;
            } else /* (sgk.getTinhTrang().equals("moi")) */ {
                tongThanhTienSGK += sgk.getSoLuong() * sgk.getDonGia();
            }
            System.out.println("Tong thanh tien SGK: " + tongThanhTienSGK);
        }
    }

    public void tinhTongThanhTienSTK() {
        for (SachThamKhao stk : arrSTK) {
            tongThanhTienSTK += stk.getDonGia()*stk.getSoLuong()+stk.getThue();
            System.out.println("Tong thanh tien STK: " + tongThanhTienSTK);
        }
    }

    public void tinhTrungBinhCongDonGiaSTK(){
        for(SachThamKhao stk: arrSTK){
            tongDonGiaSTK += stk.getDonGia();
            trungBinhCongSTK = tongDonGiaSTK / arrSTK.size();
        }
        System.out.println("Trung binh cong don gia STK: "+trungBinhCongSTK);

    }

    public void timNXB(){
        System.out.print("Nhap nha XB: ");
        String nhaXB = sc.nextLine();
        for (SachGiaoKhoa sgk : arrSGK) {
            if(sgk.getNhaXuatBan().equals(nhaXB)){
                System.out.println(sgk.toString());
            }
        }
        for (SachThamKhao stk : arrSTK) {
            if(stk.getNhaXuatBan().equals(nhaXB)){
                System.out.println(stk.toString());
            }
        }
    }

}
