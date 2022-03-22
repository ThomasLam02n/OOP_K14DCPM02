package buoi11;

import java.util.ArrayList;
import java.util.List;

import buoi09.giaodich.*;
import buoi09.Cat;
import buoi09.Dog;
import buoi09.DogRoBot;
import buoi09.Pet;

public class DaHinhPet {
    public static void main(String[] args) {
        List<Pet> list = new ArrayList<>();

        Pet dsPet[] = new Pet[2];

        DogRoBot dog = new DogRoBot();
        Dog dogg = new Dog();
        Cat cat = new Cat();

        list.add(dog);
        list.add(cat);

        for (Pet pet : list) {
            pet.beFriendly();
        }
    }
}
