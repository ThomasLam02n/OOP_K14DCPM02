package buoi06;

public class Car {
    private String carColor;
    private double carPrice = 0.0;

    public Car(){

    }

    public void Car(String carColor, double carPrice){
        this.carColor = carColor;
        this.carPrice = carPrice;
    }

    public String getCarColor() {
        return carColor;
    }
    
    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }
}
