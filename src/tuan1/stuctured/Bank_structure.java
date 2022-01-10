package tuan1.stuctured;

import java.util.Scanner;

public class Bank_structure { //Lập trình có cấu trúc
    static int so_tk = 54321;
    static int so_du_tk = 0;
    static Scanner bienNhap = new Scanner(System.in);
    public static void main(String[] args) {
        deposit();
        show();
        withdraw();
        show();
    }
    
    //Gửi tiền
    static void deposit(){
        System.out.println("Nhập số tiền gửi: ");
        int so_tien_gui = bienNhap.nextInt();
        so_du_tk += so_tien_gui;
    }

    //Rút tiền
    static void withdraw(){
        System.out.println("Nhập số tiền rút: ");
        int so_tien_rut = bienNhap.nextInt();
        so_du_tk -= so_tien_rut;
    }

    //in ra
    static void show(){
        System.out.println("Thông tin khách hàng: ");
        System.out.println("Số tài khoản: "+so_tk);
        System.out.println("Số dư tài khoản: "+so_du_tk);
    }
}
