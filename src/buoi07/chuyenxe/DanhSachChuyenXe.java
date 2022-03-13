package buoi07.chuyenxe;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachChuyenXe {

    DanhSachChuyenXe(){}
    static ArrayList<ChuyenXeNgoaiThanh> dsCXNgoaiThanh = new ArrayList<>();
    static ArrayList<ChuyenXeNoiThanh> dsCXNoiThanh = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void nhapThongTinCXNgoaiThanh() {
        while (true) {
            ChuyenXeNgoaiThanh cXeNgoaiThanh = new ChuyenXeNgoaiThanh();
            cXeNgoaiThanh.input();
            dsCXNgoaiThanh.add(cXeNgoaiThanh);
            System.out.println("Them CX(y/n) ");
            if (sc.nextLine().equals("n")) {
                break;
            }
        }
    }

    public static void inThongTinCXNgoaiThanh(){
        for(ChuyenXeNgoaiThanh cXeNgoaiThanh: dsCXNgoaiThanh){
            cXeNgoaiThanh.output();
        }
    }

    public static void nhapThongTinCXNoiThanh() {
        while (true) {
            ChuyenXeNoiThanh cXeNoiThanh = new ChuyenXeNoiThanh();
            cXeNoiThanh.input();
            dsCXNoiThanh.add(cXeNoiThanh);
            System.out.println("Them CX(y/n) ");
            if (sc.nextLine().equals("n")) {
                break;
            }
        }
    }

    public static void inThongTinCXNoiThanh(){
        for(ChuyenXeNoiThanh cXeNoiThanh: dsCXNoiThanh){
            cXeNoiThanh.output();
        }
    }
}
