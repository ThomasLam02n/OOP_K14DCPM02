package buoi06.animal;

public class Tiger extends Felines{
    
    @Override
    protected void eat(){
        System.out.println("Tiger eating meat");
    }

    @Override
    protected void makeNoise(){
        System.out.println("Tiger sound");
    }
}
