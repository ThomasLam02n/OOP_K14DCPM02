package buoi09.book;

import java.text.ParseException;

public class SachGiaoKhoa extends Sach {
    private String tinhTrang;
    private double thanhTien;
    private int number;

    public SachGiaoKhoa() {
        super();
    }

    public SachGiaoKhoa(String tinhTrang) {
        super();
        this.tinhTrang = tinhTrang;
    }

    public String setTinhTrang() {
        System.out.println("Tinh Trang:");
        return this.tinhTrang = sc.nextLine();
    }

    public String getTinhTrang() {
        return this.tinhTrang;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void nhapThongTin() throws ParseException {
        super.nhapThongTin();
        this.setTinhTrang();
    }

    @Override
    public String toString() {
        return super.toString()+" Tinh trang sach: "+this.getTinhTrang();
    }
}
