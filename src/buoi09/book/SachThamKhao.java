package buoi09.book;

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
        return this.thue = scs.nextDouble();
    }

    public void nhapSachTK(){
        super.nhapThongTin();
        
    }

    @Override
    public String toString() {
        return super.toString()+" Thue: "+this.getThue();
    }
    

}
