package buoi05;

public class DogTestDrive {
   public static void main(String[] args) {
    Dog dog = new Dog();

    dog.setSize(5);
    System.out.println("Size of Dog: "+ dog.getSize());
    dog.setBreed("Bull");
    System.out.println("Breed of Dog: "+dog.getBreed());
    dog.setName("Phèn");
    System.out.println("Name of Dog: "+ dog.getName());
   }
}
