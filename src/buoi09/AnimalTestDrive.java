package buoi09;

public class AnimalTestDrive {
    public static void main(String[] args) {
       /*  Animal animal = new Animal(); // bị lỗi ! vì compiler ko cho phép tạo đối tượng Aniaml
        animal.makeNoise();
        animal.eat(); */

        Animal hippo = new Hippo(); // có thể sử dụng Animal để điều khiển và tạo đối tượng trong vùng nhớ heap
        hippo.eat();
        hippo.makeNoise();
        
    }
}
