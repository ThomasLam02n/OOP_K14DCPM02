package buoi09.book;

import java.text.ParseException;

public class SachTestDrive {
    public static void main(String[] args) throws ParseException {
        QuanLySach qlsach = new QuanLySach();
        System.out.println("Nhap thong tin sach GK");
        qlsach.nhapThongTinSGK();
        System.out.println("Nhap thong tin sach TK");
        qlsach.nhapThongTinSTK();
        System.out.println("In thong tin cac loai sach");
        qlsach.inThongTinSGK();
        qlsach.inThongTinSTK();
        System.out.println("Tong thanh tien cac loai sach");
        qlsach.tinhTongThanhTienSGK();
        qlsach.tinhTongThanhTienSTK();
        qlsach.tinhTrungBinhCongDonGiaSTK();
        qlsach.timNXB();
    }

   
}
