package buoi06.sinhvienb7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SinhVienTestDrive {
    public static void main(String[] args) {

    //Add Sinh viên vào Array
        int n;
        Scanner sc = new Scanner(System.in);
            System.out.println("So luong SV can nhap: ");
            n = sc.nextInt();

        SinhVien[] dssv = new SinhVien[n];
        for(int i = 0;i < dssv.length;i++){
            dssv[i] = new SinhVien();
            System.out.printf("Nhap thong tin SV thu %d:\n", i+1);
            dssv[i].input();
        }
        System.out.println("Danh Sach SV:");
        for(int i = 0;i < dssv.length;i++){
            
            dssv[i].output();
        }



    //Sắp xếp theo giá trị tăng dần
        List<SinhVien> list = Arrays.asList(dssv);
        Comparator<SinhVien> comparator = new Comparator<SinhVien>() {

            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                // TODO Auto-generated method stub
                return Integer.compare(o1.getMssv(), o2.getMssv());
            }    
        };
        list.sort(comparator);

        System.out.println("Sau khi sap xep: ");

        for(int i = 0;i < dssv.length;i++){
            
            dssv[i].output();
        }
        sc.close();
    }
}
