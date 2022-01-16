package buoi02;

public class CowTestDrive {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.Cow("Cái", "cobe", 19, "vàng");
        cow.inThongtinCow();
        cow.an();
        cow.keu();
        System.out.println("------------------");
        
        Cow cow2 = new Cow();
        cow2.Cow("Đực", "Úc", 80, "đen");
        cow2.inThongtinCow();
        cow2.an();
        cow2.keu();
    }
}
