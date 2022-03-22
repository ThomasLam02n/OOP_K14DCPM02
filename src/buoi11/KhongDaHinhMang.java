package buoi11;

import buoi06.animal.Cat;
import buoi06.animal.Dog;

public class KhongDaHinhMang {
    public static void main(String[] args) {
        //danh sách quản lý mèo

        Cat danhsach[] = new Cat[3];
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        danhsach[0] = cat;
        danhsach[1] = cat2;
        danhsach[2] = new Cat(); //trong mãng hiện tại chỉ là những cái remote ! ko có đối tượng mèo !

        //in danh sách
        for (Cat ca : danhsach) {
            ca.makeNoise();
        }
        
        Dog danhsachdog[] = new Dog[3];
        Dog dog = new Dog();
        Dog dog2 = new Dog();
        danhsachdog[0] = dog;
        danhsachdog[1] = dog2;
        danhsachdog[2] = new Dog();

        for (Dog dogg : danhsachdog) {
            //không đa hình ! ràng buộc code sớm
            dogg.makeNoise(); 
        }
    }
}
