package baitaptet;

public class Node {
    SanPham data;
    Node next;

    public Node(){
        this.data = null;
        this.next = null;
    }

    public Node(SanPham sanPham){
        this.data = sanPham;
        this.next = null;
    }

    public Node(SanPham sanPham, Node node){
        this.data = sanPham;
        this.next = node;
    }
}
