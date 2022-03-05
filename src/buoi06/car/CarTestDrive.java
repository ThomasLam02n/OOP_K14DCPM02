package buoi06.car;

public class CarTestDrive {
    public static void main(String[] args) {
        Car car = new Car();
        car.Car("Red", 150.2);
        car.setCarColor("Yellow");
        car.setCarPrice(100.2);
        System.out.println("Car color: "+car.getCarColor());
        System.out.println("Car price: "+car.getCarPrice());
        
    }
}
