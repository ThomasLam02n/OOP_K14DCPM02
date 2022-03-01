package buoi06.animal;

public class AnimalTestDrive {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
        lion.makeNoise();
        lion.sleep();
        lion.roam();

        Wofl wofl = new Wofl();
        wofl.eat();
        wofl.makeNoise();
        wofl.roam();
    }
    
}
