package buoi06.animal;

public class Lion extends Felines{
   
    public Lion(){}
    @Override
    protected void eat(){
        System.out.println("Lion eating Meat");
    }

    @Override
    protected void makeNoise(){
        System.out.println("Lion Sound");
    }
}
