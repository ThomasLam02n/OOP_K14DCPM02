package buoi02.shape;

public class Amoeba {
    String sound = "amoeba.hif";
    double xPoint;
    double yPoint;
    
    public Amoeba(String sound, double xPoint, double yPoint){
        this.sound = sound;
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }


    void rotate(){
        System.out.println("Xoay 360 độ at xPoint: "+this.xPoint +" yPoint: "+this.yPoint);
    }

    void playSound(){
        System.out.println("Play sound: "+ this.sound + " music");
    } 
}
