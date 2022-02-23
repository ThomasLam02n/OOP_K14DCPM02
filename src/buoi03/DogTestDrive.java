package buoi03;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog("Hugo", 2, "vàng", 5.2);
        dog.print_info_Dog();
        dog.setbark(5);
        dog.run();

        Dog dog2 = new Dog("Fudo", 7, "đen", 10.2);
        dog2.print_info_Dog();
        dog2.setbark(8);
        dog2.run();

        Dog dog3 = new Dog("Tangu", 10, "trắng", 12);
        dog3.print_info_Dog();
        dog3.setbark(7);
        dog3.run();

    }
}
