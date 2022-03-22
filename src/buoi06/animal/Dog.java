package buoi06.animal;

public class Dog extends Canines{

    @Override
    protected void eat(){
        System.out.println("Dog eating Dog food");
    }

    @Override
    public void makeNoise(){
        System.out.println("Dog sound");
    }

    public void chaseCat(){
        System.out.println("chaseCat...............");
    }
}
