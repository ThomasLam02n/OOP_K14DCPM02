package buoi06.animal;

public class Cat extends Canine{
    @Override
    protected void eat(){
        System.out.println("Cat eating cat food");
    }

    @Override
    protected void makeNoise(){
        System.out.println("Cat Sound");
    }

}
