package buoi02;

public class Cow {
    String gioitinh;
    String giong;
    int cannang;
    String color;


    public void Cow(String g, String gi, int c, String cl){
        gioitinh = g;
        giong = gi;
        cannang = c;
        color = cl;
    }

    public void inThongtinCow(){
        System.out.println("Thông tin:");
        System.out.println("Giới tính: "+gioitinh);
        System.out.println("Giống: "+giong);
        System.out.println("Cân nặng: "+cannang);
        System.out.println("Màu sắc: "+color);
    }

    public void an(){
        System.out.println("Đang ăn");
    }

    public void keu(){
        System.out.println("Đang kêu");
    }
}
