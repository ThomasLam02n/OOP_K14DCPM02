package kiemtracuoikibaihanghoa;

public abstract class HangHoa {
    private String maHang;
    private String tenHang;
    private int soLuongTonKho;
    private double donGia;

    public String getMaHang() {
        return maHang;
    }
    protected void setMaHang(String maHang) {
        if(maHang != null)
        this.maHang = maHang;
        else{
            System.out.println("Ma hang khong duoc rong be oi !!!");
        }
    }
    protected String getTenHang() {
        return tenHang;
    }
    protected void setTenHang(String tenHang) {
        if(tenHang != null)
        this.tenHang = tenHang;
        else{
            System.out.println("Ten hang khong duoc rong be oi !!!");
        }
    }
    protected int getSoLuongTonKho() {
        return soLuongTonKho;
    }
    protected void setSoLuongTonKho(int soLuongTonKho) {
        if(soLuongTonKho >= 0)
        this.soLuongTonKho = soLuongTonKho;
        else{
            System.out.println("SL ton kho phai >= 0 be oi !!!");
        }
    }
    protected double getDonGia() {
        return donGia;
    }
    protected void setDonGia(double donGia) {
        if(donGia > 0)
        this.donGia = donGia;
        else{
            System.out.println("Don gia phai > 0 be oi !!!");
        }
    }

    protected abstract double tinhTien();
    protected abstract String danhGia();

    public HangHoa(){

    }
    
    protected HangHoa(String maHang, String tenHang, int soLuongTonKho, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTonKho = soLuongTonKho;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Ma hang: "+this.maHang+"\t Ten hang: "+this.tenHang+
        "\tSo luong ton kho: "+this.soLuongTonKho+"\tDon gia: "+this.donGia;
    }


    
}
