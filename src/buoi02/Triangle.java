package buoi02;

public class Triangle {
    String sound = "triangle.aif";

    public Triangle(String sound){
        this.sound = sound;
    }

    void rotate(){
        System.out.println("Xoay 360 độ");
    }

    void playSound(){
        System.out.println("Play sound: "+ this.sound + " music");
    }
}
