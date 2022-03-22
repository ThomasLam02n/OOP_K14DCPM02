package buoi11;

public class DuckTestDrive {
    public static void main(String[] args) {

        System.out.println("So vit: "+Duck.getDem()); //dem = 0

        Duck duck = new Duck(5);// dem = 1
        Duck duck2 = new Duck();// dem = 2

        System.out.println("So vit: "+Duck.getDem());   
    }
}
