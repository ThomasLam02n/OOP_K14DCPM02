package buoi02;

public class Square {
    String sound = "square_aif";

    public Square(String sound){
        this.sound = sound;
    }
    void rotate(){
        System.out.println("Xoay 360 độ");
    }

    void playSound(){
        System.out.println("Play sound: "+ this.sound + " music");
    }
}
