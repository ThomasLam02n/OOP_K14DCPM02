package buoi09.book;

import java.text.ParseException;

public class SachThamKhao extends Sach{
    private double thue, thanhTien;

    public SachThamKhao(){
        super();
    }

    public SachThamKhao(double thue){
        super();
        this.thue = thue;
    }

    public double getThue() {
        return thue;
    }

    public double setThue() {
        System.out.println("Thue: ");
        return this.thue = scs.nextDouble();
    }

    @Override
    public void nhapThongTin() throws ParseException {
        // TODO Auto-generated method stub
        super.nhapThongTin();
        this.setThue();
    }

    @Override
    public String toString() {
        return super.toString()+" Thue: "+this.getThue();
    }
    

}
