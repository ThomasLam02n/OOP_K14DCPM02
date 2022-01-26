package baitaptet;

public class SanPhamTestDrive {
    public static void main(String[] args) {
        //Bài 1,2
        /* SanPham sp1 = new SanPham();
        sp1.nhap();
        sp1.xuat();

        SanPham sp2 = new SanPham();
        sp2.nhap();
        sp2.xuat(); */


        //Bài 3
        /* SanPham sp1 = new SanPham("Bánh Bao", 17.5, 2.5);
        sp1.xuat();

        SanPham sp2 = new SanPham("Bánh Mì", 15.5);
        sp2.xuat(); */

        //Bài 4
        /* SanPham sp1 = new SanPham("Bánh Bao", 17.5, 2.5);
        sp1.setdonGia(18.5);
        System.out.println(sp1.getdonGia());
        sp1.setdonGia(101.0); // setdonGia đươc quy định ko lớn hơn 100.000
        System.out.println(sp1.getdonGia()); // vì lớn hơn 100.000 nên in ra giá trị trước
        sp1.xuat(); */
        

        //Bài 5
        QuanLySanPham qlsp = new QuanLySanPham();
        qlsp.addFirst();
        qlsp.print();
    }
}
