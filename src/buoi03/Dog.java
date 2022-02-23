package buoi03;

import java.lang.reflect.WildcardType;
import java.util.Set;

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


    public int setbark(int age){
        return this.bark(age);
    }
    private int bark(int age){
        if(age < 5){
            System.out.print(" Sủa: gâu gâu");
        }else{
            System.out.print(" Sủa: gu gu");
        }
        return this.age;
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
