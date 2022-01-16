package buoi01.nonstructure;

import java.util.Scanner;

public class Bank {
    //Lập trình không có cấu trúc
    public static void main(String[] args) {
        int so_tk = 54321;
        int so_du_tk = 0;

        Scanner bienNhap = new Scanner(System.in);


        //gửi tiền
        System.out.println("Nhập số tiền gửi: ");
        int so_tien_gui = bienNhap.nextInt();
        so_du_tk += so_tien_gui;

        //in ra
        System.out.println("Thông tin khách hàng: ");
        System.out.println("Số tài khoản: "+so_tk);
        System.out.println("Số dư tài khoản: "+so_du_tk);

        //rút tiền
        System.out.println("Nhập số tiền rút: ");
        int so_tien_rut = bienNhap.nextInt();
        so_du_tk -= so_tien_rut;

        //in ra
        System.out.println("Thông tin khách hàng: ");
        System.out.println("Số tài khoản: "+so_tk);
        System.out.println("Số dư tài khoản: "+so_du_tk);

    }
}

