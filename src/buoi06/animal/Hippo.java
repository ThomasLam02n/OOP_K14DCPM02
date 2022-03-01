package buoi06.animal;

public class Hippo extends Animal{
    
    @Override
    protected void eat(){
        System.out.println("Hippo eating vetageble");
    }

    @Override
    protected void makeNoise(){
        System.out.println("Hippo sound");
    }
}
