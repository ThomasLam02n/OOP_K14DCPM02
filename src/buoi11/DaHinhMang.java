package buoi11;

import java.security.Policy;

import buoi09.Animal;
import buoi09.Cat;
import buoi09.Dog;
import buoi09.Pig;

public class DaHinhMang {
    public static void main(String[] args) {
        
        Animal dsThu[] = new Animal[5];

        Cat cat = new Cat();
        Cat cat2 = new Cat();

        Dog dog = new Dog();
        Dog dog2 = new Dog();

        dsThu[0] = cat;
        dsThu[1] = cat2;
        dsThu[2] = dog;
        dsThu[3] = dog2;

        Pig pig = new Pig();

        dsThu[4] = pig;

        for (Animal animal : dsThu) {
            //đa hình ! rang buộc code trễ
            animal.makeNoise(); //lợi ích: thay đổi code khi đang trình đang chạy !
            if(animal instanceof Dog){
                animal.makeNoise();
            }
        }
    }
}
