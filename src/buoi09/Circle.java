package buoi09;

public class Circle extends Shape{

    private int radius;
    public Circle(int _x, int _y, int _r){
        super(_x, _y);
        radius = _r;
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle at: "+x+","+y);
        
    }

    @Override
    public void erase() {
        System.out.println("Erase Circle: "+x+","+y);
        
    }
    
}
