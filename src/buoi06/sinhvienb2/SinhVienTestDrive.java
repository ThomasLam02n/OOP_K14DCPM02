package buoi06.sinhvienb2;

public class SinhVienTestDrive {
public static void main(String[] args) {
    
    SinhVien sv1 = new SinhVien(2004110014, "Lam Vu Thanh Tai", 7, 7);
    SinhVien sv2 = new SinhVien(2005236236, "Nguyen Van A", 9, 10);

    SinhVien sv3 = new SinhVien();
    sv3.nhapThongTinSV();
    sv3.setName("Nguyen Van B");
    sv3.setMssv(2007235687);
    sv3.setDiemLT(8);
    sv3.setDiemTH(9);

    sv1.inThongTinSV();
    sv2.inThongTinSV();
    sv3.inThongTinSV();
     
}
}
