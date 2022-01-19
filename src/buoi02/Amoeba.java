package buoi02;

public class Amoeba {
    String sound = "amoeba.hif";
    
    public Amoeba(String sound){
        this.sound = sound;
    }

    void rotate(){
        System.out.println("Xoay 360 độ");
    }

    void playSound(){
        System.out.println("Play sound: "+ this.sound + " music");
    } 
}
