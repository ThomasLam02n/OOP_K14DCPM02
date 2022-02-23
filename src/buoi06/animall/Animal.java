package buoi06.animall;

public class Animal {
    private String picture;
    private String food;
    private int hunger;

    public Animal(){}

    protected void makeNoise(){

    }

    protected void eat(){

    }

    protected void sleep(){
        System.out.println("Sleeping");
    }

    protected void roam(){
        System.out.println("Roaming");    
    }
}
