package buoi09.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySach extends Sach{
    List<SachGiaoKhoa> arrSGK = new ArrayList<>();
    List<SachThamKhao> arrSTK = new ArrayList<>();

    private double tongThanhTienSGK = 0, tongThanhTienSTK = 0, tongDonGiaSTK = 0;

  QuanLySach(){}

    public void nhapThongTinSGK(){
        while(true){
            SachGiaoKhoa sgk = new SachGiaoKhoa();
            sgk.nhapSachGK();
            arrSGK.add(sgk);
            System.out.println("Nhap them SGK(y/n)?: ");
            if(sc.nextLine().equals("n")){
                break;
            }
        }
    }

    public void inThongTinSGK(){
        for(SachGiaoKhoa sgk: arrSGK){
            System.out.println(sgk.toString());
        }
    }

    public void nhapThongTinSTK(){
        while(true){
            SachThamKhao stk = new SachThamKhao();
            stk.nhapSachTK();
            arrSTK.add(stk);
            System.out.println("Nhap them STK(y/n)?: ");
            if(sc.nextLine().equals("n")){
                break;
            }
        }
    }

    public void inThongTinSTK(){
        for(SachThamKhao stk: arrSTK){
            System.out.println(stk.toString());
        }
    }



    public void tinhTongThanhTienSGK(){
        for(SachGiaoKhoa sgk: arrSGK){
        if(sgk.getTinhTrang().equals("cu")){
            tongThanhTienSGK += sgk.getSoLuong()*sgk.getDonGia()*50/100;
        }else /* (sgk.getTinhTrang().equals("moi")) */{
            tongThanhTienSGK += sgk.getSoLuong()*sgk.getDonGia();
        }
        System.out.println("Tong thanh tien SGK: "+tongThanhTienSGK);
    }
    }
}
