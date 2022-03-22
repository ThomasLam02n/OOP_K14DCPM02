package buoi11;

import java.util.ArrayList;
import java.util.List;

import buoi06.animal.Animal;
import buoi09.Dog;
import buoi09.Pet;

public class MatHanhViObject {
    public static void main(String[] args) {
        List<Pet> list = new ArrayList<>();
        Dog dog = new Dog();
        list.add(dog);
        Pet pet = list.get(0);
        //mất hành vi
        //lấy lại hành vi - ép kiểu
        Dog dog2 = (Dog)pet; //cú pháp ép kiểu
        dog2.makeNoise();
        dog2.chaseCat();
        dog2.beFriendly();

    }
}
