package buoi06.animal;

public class Wofl extends Canines{
    
    @Override
    protected void eat(){
        System.out.println("Wofl eatting meat");
    }

    @Override
    protected void makeNoise(){
        System.out.println("Wofl sound");
    }
}
