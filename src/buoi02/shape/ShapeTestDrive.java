package buoi02.shape;

public class ShapeTestDrive {
    public static void main(String[] args) {
        System.out.println("Triangle");
        Triangle triangle = new Triangle();
        triangle.setSound("Mua xuan");
        triangle.rotate();
        triangle.playSound();

        System.out.println("Square");
        Square square = new Square();
        square.setSound("Mua he");
        square.rotate();
        square.playSound();

        System.out.println("Circle");
        Circle circle = new Circle();
        circle.setSound("Mua thu");
        circle.rotate();
        circle.playSound();

        System.out.println("Amoeba");
        Amoeba amoeba = new Amoeba();
        amoeba.setxPoint(7);
        amoeba.setyPoint(8);
        amoeba.setSound("Mua dong");
        amoeba.rotate();
        amoeba.playSound();
    }
}
