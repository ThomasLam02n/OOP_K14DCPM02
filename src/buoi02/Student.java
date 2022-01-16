package buoi02;

public class Student {
    String name;
    int age;
    String mssv;
    String lop;

    public void Student(String n, int a, String m, String l){
        name = n;
        age = a;
        mssv = m;
        lop = l;
    }

    public void print_info_Student(){
        System.out.println("Thông tin sinh viên: ");
        System.out.println("Tên: "+name);
        System.out.println("Tuổi: "+age);
        System.out.println("MSSV: "+mssv);
        System.err.println("Lớp: "+lop);
    }
}
