package buoi02;

public class Student {
    String name;
    int age;
    String mssv;
    String lop;

    public void Student(String name, int age, String mssv, String lop){
        this.name = name;
        this.age = age;
        this.mssv = mssv;
        this.lop = lop;
    }

    public void print_info_Student(){
        System.out.println("Thông tin sinh viên: ");
        System.out.println("Tên: "+name);
        System.out.println("Tuổi: "+age);
        System.out.println("MSSV: "+mssv);
        System.err.println("Lớp: "+lop);
    }
}
