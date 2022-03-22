package buoi09;

public class Hippo extends Animal{
    
    @Override
    protected void eat(){
        System.out.println("Hippo eating vetageble");
    }

    @Override
    public void makeNoise(){
        System.out.println("Hippo sound");
    }
}
