package buoi02;

public class Shape {
    String kind;
    String color;

    Shape(){}
    
    public void Shape(String kind, String color){
        this.kind = kind;
        this.color = color;
    }

    public void print_info_shape(){
        System.out.println("Thông tin Shape:");
        System.out.print("Loại: "+kind);
        System.out.println(" Màu sắc: "+color);
    }
    public void swing360Degree(){
        System.out.println("Đã xoay 360 độ");
    }

    public void playmusic(){
        System.out.println("Đã chơi một bản nhạc");
    }

    public void swingandplaymusic(){
        this.swing360Degree();
        this.playmusic();
    }
}
