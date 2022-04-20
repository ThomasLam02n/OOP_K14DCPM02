package baikiemtragiuakiremake;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class QuanLyHangHoa{
    private List<HoaDon> danhSachHoaDon = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void nhapHoaDon(String name) throws ParseException {
        // System.out.println("Chọn Hóa Đơn: ");
        // name = sc.nextLine();
        
        if (name.equals("theo gio")) {
            while (true) {
                HoaDon hoaDonTheoGio = new HoaDonTheoGio();
                hoaDonTheoGio.input();
                danhSachHoaDon.add(hoaDonTheoGio);
                System.out.print("Thêm hoá đơn theo giờ(y/n): ");
                if (sc.nextLine().equals("n")) {
                    break;
                }
            }
        } else if (name.equals("theo ngay")) {
            while (true) {
                HoaDon hoaDonTheoNgay = new HoaDonTheoNgay();
                hoaDonTheoNgay.input();
                danhSachHoaDon.add(hoaDonTheoNgay);
                System.out.print("Thêm hoá đơn theo ngày(y/n): ");
                if (sc.nextLine().equals("n")) {
                    break;
                }
            }
        }
        
    }

    public void tongSoLuong() { 
        double tongG = 0, tongN = 0, tongTTG = 0, tongTTN = 0;

        for (HoaDon a : danhSachHoaDon) {
            if (a instanceof HoaDonTheoGio) {
                tongG++;
                tongTTG += a.getThanhTien();
            } else if (a instanceof HoaDonTheoNgay) {
                tongN++;
                tongTTN += a.getThanhTien();
            }            
        }
        
        System.out.println("Tổng số lượng hoá đơn phòng thuê theo giờ: " + tongG);
        System.out.println("Tổng số lượng hoá đơn phòng thuê theo ngày: " + tongN);
        System.out.println("Tổng thành tiền hoá đơn phòng thuê theo giờ: " + tongTTG);
        System.out.println("Tổng thành tiền hoá đơn phòng thuê theo ngày: " + tongTTN);
    }

    public void inDanhSach() {
        System.out.println("\t----------------------------------- Danh sách hoá đơn theo giờ -----------------------------------");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Mã hoá đơn", "Ngày hoá đơn", "Tên khách hàng", "Mã phòng", "Đơn giá", "Số giờ thuê", "Thành tiền");
        for (HoaDon hoaDonTheoGio : danhSachHoaDon) {
            if (hoaDonTheoGio instanceof HoaDonTheoGio) {
                System.out.println(hoaDonTheoGio.toString());
            }
        }

        System.out.println("\t----------------------------------- Danh sách hoá đơn theo ngày -----------------------------------");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Mã hoá đơn", "Ngày hoá đơn", "Tên khách hàng", "Mã phòng", "Đơn giá", "Số ngày thuê","Thành tiền");
        for (HoaDon hoaDonTheoNgay : danhSachHoaDon) {
            if (hoaDonTheoNgay instanceof HoaDonTheoNgay) {
                System.out.println(hoaDonTheoNgay.toString());
            }
        }
    }


    public void tinhTrungBinhThanhTien() throws ParseException {
        String ngayDauThang = "01/09/2013";
        String ngayCuoiThang = "30/09/2013";
        double tongG = 0, tongN = 0, tbG = 0, tbN = 0, tb = 0;
        int a = 0, b = 0;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        for (HoaDon hoaDon : danhSachHoaDon) {
            if (hoaDon.getNgayHD().after(simpleDateFormat.parse(ngayDauThang)) || hoaDon.getNgayHD().compareTo(simpleDateFormat.parse(ngayDauThang)) == 0
                && hoaDon.getNgayHD().before(simpleDateFormat.parse(ngayCuoiThang)) || hoaDon.getNgayHD().compareTo(simpleDateFormat.parse(ngayDauThang)) == 0) {
                if (hoaDon instanceof HoaDonTheoGio) {
                    tongG += hoaDon.getThanhTien();
                    a++;
                } else if (hoaDon instanceof HoaDonTheoNgay) {
                    tongN += hoaDon.getThanhTien();
                    b++;
                }
            }
        }
       
        tbG = tongG / a;
        tbN = tongN / b;
        tb = (tongG + tongN) / (a + b);
        System.out.println("Trung bình thành tiền của hoá đơn thuê phòng theo giờ trong tháng 9 năm 2013 là: " + tbG);
        System.out.println("Trung bình thành tiền của hoá đơn thuê phòng theo ngày trong tháng 9 năm 2013 là: " + tbN);
        System.out.println("Trung bình thành tiền của tất cả hoá đơn thuê phòng trong tháng 9 năm 2013 là: " + tb);
    }
}
