package buoi06.animal;

public class Cat extends Felines{
    @Override
    protected void eat(){
        System.out.println("Cat eating cat food");
    }

    @Override
    public void makeNoise(){
        System.out.println("Cat Sound");
    }

    public void chaseButterfly(){
        System.out.println("chaseButterfly...........");
    }
}
