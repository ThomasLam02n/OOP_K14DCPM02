package buoi09;

public abstract class Animal { //abstract dùng để ko cho class này tạo đối tượng trong vùng nhớ heap
    private String picture;
    private String food;
    private int hunger;

    public Animal(){}

    protected abstract void makeNoise();

    protected abstract void eat();

    protected void sleep(){
        System.out.println("Sleeping");
    }

    protected void roam(){
        System.out.println("Roaming");    
    }
}
