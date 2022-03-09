package buoi08;

public class Cow extends Animal{
    double giveMilk = 50.25;

    Cow(){}
    
    public Cow(double giveMilk, String name){
        super(name); //do class Animal sử lí
        this.giveMilk = giveMilk; // do class Cow sử lí
    }

    @Override
    public String toString() {
        String str = "Name "+ this.getName() +" Givemilk: "+this.giveMilk;
        return str;
        
    }

}
