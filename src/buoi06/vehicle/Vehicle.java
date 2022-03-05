package buoi06.vehicle;

import java.util.Scanner;

import javax.lang.model.element.Element;

public class Vehicle {

    
    private String carownername;
    private String kindofcar;
    private double capacity; //dung tích
    private double price;
    private double tax;
    Scanner sc = new Scanner(System.in);

    public Vehicle(){}

    public Vehicle(String carownername, String kindogcar, double capacity, double price){
        this.carownername = carownername;
        this.kindofcar = kindogcar;
        this.capacity = capacity;
        this.price = price;
    }

    private double setTax() {
        if(capacity <= 100){
            tax = 1 * price / 100;
        }else if(100 < capacity && capacity < 200){
            tax = 2 * price / 100;
        }else{
            tax = 5 * price / 100;
        }
        System.out.println("  Thuế phải nộp: "+tax);
        return capacity;
    }

    public double getTax() {  
        return this.setTax();
    }

    public void input(){
        System.out.println("Car owner's name: ");
        this.carownername = sc.nextLine();
        System.out.println("Kind of car: ");
        this.kindofcar = sc.nextLine();
        System.out.println("Capacity");
        this.capacity = sc.nextDouble();
        System.out.println("Price: ");
        this.price = sc.nextDouble();
    }

    public void printinfo(){
        System.out.print("Tên chủ xe: "+carownername);
        System.out.print("  Loại xe: "+kindofcar);
        System.out.print("  Dung tích: "+capacity);
        System.out.print("  Trị giá: "+price);
        this.getTax();
    }
}
