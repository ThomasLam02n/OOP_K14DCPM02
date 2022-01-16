package buoi01.object_oriented;

public class Employee {
    String name;
    int id;
    String position;

    public void Employee(String n,int i, String p ){
        name = n;
        id = i;
        position = p;
    }

    public void print_info_Employee(){
        System.out.println("Thông tin nhân viên: ");
        System.out.println("Tên: "+name);
        System.out.println("ID: "+id);
        System.out.println("Vị trí làm việc: "+position);
    }
}
