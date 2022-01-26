package baitaptet;

public class QuanLySanPham {
    static Node head = null;
    Node tail = null;
    Node current = null;
    SanPham sanPham;

    public QuanLySanPham() {

    }

    public void addFirst() {
        SanPham sanPham = new SanPham();
        Node newsanPham = new Node(sanPham);
        newsanPham.data.nhap();
        if (head == null) {
            head = newsanPham;
            tail = newsanPham;
        } else {
            newsanPham.next = head;
            head = newsanPham;
        }
    }

    void print() {
        Node current = head;
        if (head == null) {
            System.out.println("Danh sách không có sản phẩm nào !");
            return;
        }
        System.out.println("Danh sách sản phẩm:");
        current.data.xuat();
        current = current.next;
    }
}
