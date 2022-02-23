package buoi04;

public class Player {

    //implementation
    private int number = 0;

    
    public void guess()
    {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing "+number);
    }

    public int getnumber(){
        return number;
    }
}
