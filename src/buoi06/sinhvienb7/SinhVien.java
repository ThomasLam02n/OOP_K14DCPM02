package buoi06.sinhvienb7;

import java.util.Scanner;

public class SinhVien {
    private int mssv;
    private String name;
    private String address;
    private long phoneNumber;
    Scanner sc = new Scanner(System.in);
    Scanner scs = new Scanner(System.in);
    SinhVien(){

    }

    SinhVien(int mssv, String name, String address, long phoneNumber){
        this.mssv = mssv;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public int getMssv() {
        return mssv;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        String stc = "MSSV: " +this.getMssv() + "Name: " +this.getName() +"Address: "+this.getAddress();
        stc += "PhoneNumber: "+this.getPhoneNumber();
        return super.toString();
    }

    public void input(){
        System.out.println("MSSV: ");
        this.mssv = scs.nextInt();
        System.out.println("Name: ");
        this.name = sc.nextLine();
        System.out.println("Address: ");
        this.address = sc.nextLine();
        System.out.println("Phone: ");
        this.phoneNumber = scs.nextLong();
    }

    public void output(){
        System.out.print("MSSV: "+this.mssv);
        System.out.print("  Name: "+this.name);
        System.out.print("  Address: "+this.address);
        System.out.println("  Phone: "+this.phoneNumber);    }
}
