package buoi06.animall;

public class Lion extends Animal{

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
