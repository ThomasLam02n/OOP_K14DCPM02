package buoi02.shape;

public class Circle {
    String sound = "circle.aif";

    public Circle(String sound){
        this.sound = sound;
    }
    void rotate(){
        System.out.println("Xoay 360 độ");
    }

    void playSound(){
        System.out.println("Play sound: "+ this.sound + " music");
    }
}
