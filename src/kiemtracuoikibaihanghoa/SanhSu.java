package kiemtracuoikibaihanghoa;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SanhSu extends HangHoa{
    private String nhaSanXuat;
    private Date ngayNhapKho;

    SimpleDateFormat ngayVN = new SimpleDateFormat("dd/MM/yyyy");

    protected SanhSu(){
        
    }

    public SanhSu(String maHang, String tenHang, int soLuongTonKho, double donGia, String nhaSanXuat,
            Date ngayNhapKho) {
        super(maHang, tenHang, soLuongTonKho, donGia);
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKho = ngayNhapKho;
    }



    private int kiemtraTGLuuKho(){
        /*
        Date ngayHienTai = new Date();
        Calendar c = Calendar.getInstance();
        Calendar v = Calendar.getInstance();
        c.setTime(ngayHienTai);
        v.setTime(ngayNhapKho);
        int ngayHT = c.get(Calendar.DATE);
        int ngayNK = c.get(Calendar.DATE);
        int TGLuuKho = ngayHT - ngayNK;
        */
        
        return (int) (new Date().getTime() - ngayNhapKho.getTime()) / 100000000;
    }

    @Override
    protected double tinhTien(){
        // TODO Auto-generated method stub
        double tien = 0;
        tien =this.getSoLuongTonKho() * this.getDonGia() / 0.1;
        return tien;
    }

    @Override
    protected String danhGia() {
        String danhGia="Ban duoc!";
        if(getSoLuongTonKho() > 50 && kiemtraTGLuuKho() > 10){
            danhGia="Ban cham!";
        }
        return danhGia;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"\tNha SX: "+this.nhaSanXuat+ "\tNgay nhap Kho: "+ngayVN.format(ngayNhapKho);
    }
}
