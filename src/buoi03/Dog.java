package buoi03;

import java.lang.reflect.WildcardType;

public class Dog {
    String name;
    int age;
    String color;
    double weight;

    Dog(){

    }

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age, String color, double weight){
        this(name, age);
        this.color = color;
        this.weight = weight;
    }

    public void print_info_Dog(){
        System.out.print("Tên: "+name);
        System.out.print(" Tuổi: "+age);
        System.out.print(" Màu sắc: "+color);
        System.out.print(" Cân nặng: "+weight+"kg");
    }

    public void bark(){
        if(age < 5){
            System.out.print(" Sủa: gâu gâu");
        }else{
            System.out.print(" Sủa: gu gu");
        }
    }

    public void run(){
        if(weight >= 10){
            System.out.println(" Chạy: slow");
        }else{
            System.out.println(" Chạy: Fast");
        }
        System.out.println("-----------------------");
    }

}
