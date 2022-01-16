package buoi02;

public class StudentTestDrive {
    public static void main(String[] args) {
        Student taistudent = new Student();
        taistudent.Student("Tai", 18, "014", "K14DCPM02");
        taistudent.print_info_Student();
        System.out.println("--------------------------------");

        Student thachstudent = new Student();
        thachstudent.Student("Thạch", 20, "018", "K14DCPM02");
        thachstudent.print_info_Student();
        System.out.println("--------------------------------");

        Student trungstudent = new Student();
        trungstudent.Student("Trung", 19, "012", "K14DCPM02");
        trungstudent.print_info_Student();
     
    }
}
