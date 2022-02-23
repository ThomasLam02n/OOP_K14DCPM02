package buoi02.shape;

public class Amoeba extends Shape {
    String sound;
    double xPoint;
    double yPoint;
    public Amoeba(){

    }
    public Amoeba( double xPoint, double yPoint){
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }
    public void setxPoint(double xPoint) {
        this.xPoint = xPoint;
    }

    public void setyPoint(double yPoint) {
        this.yPoint = yPoint;
    }

    @Override
    public void rotate(){
        System.out.println("Xoay 360 độ at xPoint: "+this.xPoint +" yPoint: "+this.yPoint);
    }

    @Override
    public void playSound(){
        System.out.println("Play sound .hif: "+ this.getSound() + " music");
    } 
}
