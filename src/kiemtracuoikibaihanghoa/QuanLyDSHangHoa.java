package kiemtracuoikibaihanghoa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.lang.model.element.Element;

public class QuanLyDSHangHoa {

  private List<HangHoa> list = new ArrayList<>();
  FileWriter fileWriter = new FileWriter();
  Consoleinput consoleinput = new Consoleinput();
  SimpleDateFormat ngayVN = new SimpleDateFormat("dd/MM/yyyy");
  Scanner sc = new Scanner(System.in);
  Scanner scs = new Scanner(System.in);
  private Date ngayHetHang;

  public void themHH(HangHoa hangHoa) {
      this.list.add(hangHoa);
      FileWriter.writeFile("HangHoa.dat", list);
    }

  public void docFile(){
    FileWriter.writeFile("HangHoa.dat", list);
  }

  public void inThongTinHH() {
    for (HangHoa hangHoa : list) {
      System.out.println(hangHoa);
    }
  }

  public void inThongTinHHThucPham(){
    System.out.println("Thong tin HH Thuc Pham: ");
    for (HangHoa hangHoa : list) {
      if(hangHoa.getMaHang().contains("T"))
      System.out.println(hangHoa);
    }
  }

  public void inThongTinHHDienMay(){
    System.out.println("Thong tin HH Dien May: ");
    for (HangHoa hangHoa : list) {
      if(hangHoa.getMaHang().contains("D"))
      System.out.println(hangHoa);
    }
  }

  public void inThongTinHHSanhSu(){
    System.out.println("Thong tin HH Sanh Su: ");
    for (HangHoa hangHoa : list) {
      if(hangHoa.getMaHang().contains("S"))
      System.out.println(hangHoa);
    }
  }

  public void xoaHHTheoMaHang() {
    System.out.println("Nhap ma hang can xoa: ");
    String maHangCanXoa = sc.nextLine();
    HangHoa hangHoa1 = null;
    for (HangHoa hangHoa : list) {
      if (hangHoa.getMaHang().equalsIgnoreCase(maHangCanXoa))
        hangHoa1 = hangHoa;
    }
    if (hangHoa1 != null) {
      list.remove(hangHoa1);
      System.out.println("Xoa thanh cong!");
    } else {
      System.out.println("Nhap ma sai roi be oi !");
    }
  }

  public void xoaHHTheoTenHang() {
    System.out.println("Nhap ten hang can xoa: ");
    String tenHanHoaCanXoa = sc.nextLine();
    HangHoa hangHoa1 = null;
    for (HangHoa hangHoa : list) {
      if (hangHoa.getTenHang().equalsIgnoreCase(tenHanHoaCanXoa))
        hangHoa1 = hangHoa;
    }
    if (hangHoa1 != null) {
      list.remove(hangHoa1);
      System.out.println("Xoa thanh cong!");
    } else {
      System.out.println("Nhap ten hang sai roi be oi !");
    }
  }

  public void timHangHoaTheoMa() {
    System.out.println("Nhap ma hang can tim");
    String maHangCanTim = sc.nextLine();
    HangHoa hangHoa1 = null;
    for (HangHoa hangHoa : list) {
      if (hangHoa.getMaHang().equalsIgnoreCase(maHangCanTim)) {
        hangHoa1 = hangHoa;
        System.out.println("Ma hang da tim duoc:");
        System.out.println(hangHoa1);
      }
    }
  }

  public void timHangHoaTheoMaHang(String maHangCanTim) {
    System.out.println("Nhap ma hang can tim");
    maHangCanTim = sc.nextLine();
    HangHoa hangHoa1 = null;
    for (HangHoa hangHoa : list) {
      if (hangHoa.getMaHang().equalsIgnoreCase(maHangCanTim)) {
        hangHoa1 = hangHoa;
        System.out.println("Ma hang da tim duoc:");
        System.out.println(hangHoa1);
      }
    }
  }
  public HangHoa timHangHoaTheoMaHangTraVeHangHoa(String maHangCanTim) {
    HangHoa hangHoa =null;
    System.out.println("Nhap ma hang can tim");
    maHangCanTim = sc.nextLine();
    for (HangHoa hangHoa1 : list) {
      if (hangHoa1.getMaHang().equalsIgnoreCase(maHangCanTim)) {
        hangHoa = hangHoa1;
      }
    }
    return hangHoa;
  }


  public void timHangHoaTheoTenHang() {
    System.out.println("Nhap ten hang can tim");
    String tenHangCanTim = sc.nextLine();
    HangHoa hangHoa1 = null;
    for (HangHoa hangHoa : list) {
      if (hangHoa.getTenHang().equalsIgnoreCase(tenHangCanTim)) {
        hangHoa1 = hangHoa;
        System.out.println("ten hang da tim duoc:");
        System.out.println(hangHoa1);
      }
    }
  }

  public void sapXepHH() { //theo ki tu ban chu cai !
    System.out.println("Hang hoa đa duoc sap xep!: ");
    Collections.sort(list, (o1, o2) -> o1.getMaHang().compareTo(o2.getMaHang()));
  }

  public int timViTriHH(HangHoa hangHoa) {
    int viTri = -1;
    viTri = this.list.indexOf(hangHoa);
    return viTri;
  }

  
  public void suaHangHoa(String maHang) throws ParseException{
    int viTri = timViTriHH(timHangHoaTheoMaHangTraVeHangHoa(maHang));
    if(viTri == -1){
      System.out.println("Khong tim thay");
    }else{
      HangHoa hangHoa = consoleinput.suaHangHoa();
      if(hangHoa != null){
        this.list.set(viTri, hangHoa);
        System.out.println("Da sua hang hoa");
      }
    }
   }
  

  public void thongkeHangHoa() {
    int tongSLTKThucPham = 0, tongSLTKDienMay = 0, tongSLTKSanhSu = 0;
    double tongDonGiaThucPHam = 0, tongDonGiaDienMay = 0, tongDonGiaSanhSu = 0;
    for (HangHoa hangHoa : list) {
      if (hangHoa.getMaHang().contains("T")) {
        tongSLTKThucPham = tongSLTKThucPham + hangHoa.getSoLuongTonKho();
        tongDonGiaThucPHam = tongDonGiaThucPHam + hangHoa.getDonGia();
      } else if (hangHoa.getMaHang().contains("D")) {
        tongSLTKDienMay = tongSLTKDienMay + hangHoa.getSoLuongTonKho();
        tongDonGiaDienMay = tongDonGiaDienMay + hangHoa.getDonGia();
      } else if (hangHoa.getMaHang().contains("S"))
        tongSLTKSanhSu = tongSLTKSanhSu + hangHoa.getSoLuongTonKho();
      tongDonGiaSanhSu = tongDonGiaSanhSu + hangHoa.getDonGia();
    }
    System.out.println("\tTong so luong hang hoa ton kho");
    System.out.println("Tong SLTK Thuc Pham: " + tongSLTKThucPham);
    System.out.println("Tong SLTK Dien May: " + tongSLTKDienMay);
    System.out.println("Tong SLTK Sanh Su: " + tongSLTKSanhSu);
    System.out.println("\tTong don gia cac loai hang hoa");
    System.out.println("Tong don gia Thuc Pham: " + tongDonGiaThucPHam);
    System.out.println("Tong don gia Dien May: " + tongDonGiaDienMay);
    System.out.println("Tong don gia Sanh Su: " + tongDonGiaSanhSu);
  }

  public void baoCao(){
    double tongThanhTienThucPham = 0, tongThanhTienDienMay = 0, tongThanhTienSanhSu = 0;
    System.out.println("Tong thanh tien cac loai HH hien co:");
    for(HangHoa hangHoa : list){
      if (hangHoa.getMaHang().contains("T")) {
        tongThanhTienThucPham = tongThanhTienThucPham + hangHoa.tinhTien();
      } else if (hangHoa.getMaHang().contains("D")) {
        tongThanhTienDienMay = tongThanhTienDienMay + hangHoa.tinhTien();
      } else if (hangHoa.getMaHang().contains("S")){
        tongThanhTienSanhSu= tongThanhTienSanhSu + hangHoa.tinhTien();
      }
    }
    System.out.println("Tong thanh tien Thuc Pham: "+tongThanhTienThucPham);
      System.out.println("Tong thanh tien Dien May: "+tongThanhTienDienMay);
      System.out.println("Tong thanh tien Sanh Su: "+tongThanhTienSanhSu);
  }


  public void moi() throws ParseException {
    SimpleDateFormat ngayVN = new SimpleDateFormat("dd/MM/yyyy");
    String ngayNhapKho = "13/12/2002";
    String ngaySanXuat = "12/12/2002";
    String ngayHetHang = "12/6/2003";
    HangHoa hh1 = new ThucPham("T001", "Banh bao", 5, 15.000, ngayVN.parse(ngaySanXuat), ngayVN.parse(ngayHetHang),
        "VN");
    HangHoa hh2 = new ThucPham("T002", "Banh beo", 5, 7.000, ngayVN.parse(ngaySanXuat), ngayVN.parse(ngayHetHang),
        "VN");
    HangHoa hh3 = new ThucPham("T003", "Banh tet", 5, 5.000, ngayVN.parse(ngaySanXuat), ngayVN.parse(ngayHetHang),
        "VN");
    HangHoa hh4 = new ThucPham("T004", "Banh trung", 5, 9.000, ngayVN.parse(ngaySanXuat), ngayVN.parse(ngayHetHang),
        "VN");
    HangHoa hh5 = new ThucPham("T005", "Banh bo", 5, 3.000, ngayVN.parse(ngaySanXuat), ngayVN.parse(ngayHetHang), "VN");
    HangHoa hh6 = new DienMay("D006", "Quat may", 22, 320.000, 12, 36);
    HangHoa hh7 = new DienMay("D007", "Lo vi song", 7, 820.000, 12, 56);
    HangHoa hh8 = new DienMay("D008", "Bep dien tu", 19, 520.000, 12, 36);
    HangHoa hh9 = new SanhSu("S009", "To su", 194, 23.500, "VN", ngayVN.parse(ngayNhapKho));
    HangHoa hh10 = new SanhSu("S010", "Chen su", 325, 6.500, "VN", ngayVN.parse(ngayNhapKho));
    HangHoa hh11 = new SanhSu("S011", "Dia su", 224, 12.500, "VN", ngayVN.parse(ngayNhapKho));
    themHH(hh1);
    themHH(hh2);
    themHH(hh3);
    themHH(hh4);
    themHH(hh5);
    themHH(hh6);
    themHH(hh7);
    themHH(hh8);
    themHH(hh9);
    themHH(hh10);
    themHH(hh11);
  }
}
