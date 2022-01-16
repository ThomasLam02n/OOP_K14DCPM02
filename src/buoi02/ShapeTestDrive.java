package buoi02;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Shape cicle = new Shape();
        cicle.Shape("Hình tròn", "Màu vàng");
        cicle.print_info_shape();
        cicle.swingandplaymusic();
        System.out.println("-------------------------");

        Shape triangle = new Shape();
        triangle.Shape("Tam giác", "Màu xanh");
        triangle.print_info_shape();
        triangle.swingandplaymusic();
        System.out.println("-------------------------");

        Shape square = new Shape();
        square.Shape("Hình vuông", "Màu đỏ");
        square.print_info_shape();
        square.swingandplaymusic();
    }
}
