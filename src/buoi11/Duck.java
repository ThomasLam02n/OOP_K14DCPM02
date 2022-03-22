package buoi11;
import static java.lang.System.*;
public class Duck {
    private int size;
    private String name;
    private static int dem;//cứ mỗi đối tượng duck thì đếm số lượng duck ! thanh vien class
    //Khối static
    static{
        System.out.println("Hihi.....");
    }
    //thanh vien class 
    public static int getDem() {
        return dem;
    }

    public Duck(int size){
        this.size = size;
        demVit();// dùng chung cho tất cả object của cùng một class
    }

    public Duck(){
        demVit();
    }

    private void demVit(){
        dem++;
    }

    public int getSize() {
        dem = 0;
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    
}
