package buoi03;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog("Hugo", 2, "vàng", 5.2);
        dog.print_info_Dog();
        dog.bark();
        dog.run();

        Dog dog2 = new Dog("Fudo", 7, "đen", 10.2);
        dog2.print_info_Dog();
        dog2.bark();
        dog2.run();

        Dog dog3 = new Dog("Tangu", 10, "trắng", 12);
        dog3.print_info_Dog();
        dog3.bark();
        dog3.run();

    }
}
