package buoi01.object_oriented;

public class Customer {
    String name;
    int id;
    int phonenumbers;

    Customer(){

    }

    public void Customer(String n, int i, int phone){
        name = n;
        id   = i;
        phonenumbers = phone;
    }

    public void print_info_Customer(){
        System.out.println("Thông tin Khách hàng: ");
        System.out.println("Tên: "+name);
        System.out.println("ID: "+id);
        System.out.println("Số điện thoại: "+phonenumbers);
    }
}
