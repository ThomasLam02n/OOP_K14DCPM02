package kiemtracuoikibaihanghoa;

public class DienMay extends HangHoa{
    private int thoiGianBaoHanh;
    private int congSuat;

    protected DienMay(){
        
    }

    public DienMay(String maHang, String tenHang, int soLuongTonKho, double donGia, int thoiGianBaoHanh, int congSuat) {
        super(maHang, tenHang, soLuongTonKho, donGia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }



    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }


    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        if(thoiGianBaoHanh >= 0)
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        else{
            System.out.println("Thieu thoi gian bao hanh roi be oi !!!");
        }
    }


    public int getCongSuat() {
        return congSuat;
    }


    public void setCongSuat(int congSuat) {
        if(congSuat > 0)
        this.congSuat = congSuat;
        else{
            System.out.println("Cong suat phai > 0 be oi !!!");
        }
    }


    @Override
    protected double tinhTien(){
        // TODO Auto-generated method stub
        double tien = 0;
        tien = getSoLuongTonKho() * getDonGia() / 0.1;
        return tien;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"\tThoi gian bao hanh "+this.thoiGianBaoHanh+"\tCong suat: "+this.congSuat;
    }

    @Override
    protected String danhGia() {
        // TODO Auto-generated method stub
        System.out.println("Danh gia hh Dien May:");
        if(getSoLuongTonKho() < 3){
            System.out.println("Ban duoc !!!");
        }else{
            System.out.println("khong ban duoc");
        }
        return null;
    }

}
