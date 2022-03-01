package buoi06.animal;

public class Dog extends Feline{

    @Override
    protected void eat(){
        System.out.println("Dog eating Dog food");
    }

    @Override
    protected void makeNoise(){
        System.out.println("Dog sound");
    }
}
