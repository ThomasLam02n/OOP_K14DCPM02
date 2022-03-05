package buoi06.hinhcn;

import java.util.Scanner;

public class HinhChuNhat {
    private double length;
    private double width;
    Scanner sc = new Scanner(System.in);
    HinhChuNhat(){}

    HinhChuNhat(double length, double width){
        this.length = length;
        this.width = width;
    }

    public void input(){
    System.out.println("Length: ");
    double length = sc.nextDouble();
    System.out.println("Width: ");
    double width = sc.nextDouble();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

   
    public double caculateacreage(){
        return this.length * this.width;
    }
    
    public double caculateperimeter(){
        return (this.length + this.width)*2;
    }

    public String toString(){
        String stc = "Length :" +this.getLength() + " Width: "+this.getLength();
        stc += " acreage: " +this.caculateacreage() + ", periameter: " +this.caculateperimeter();
        return stc;
    }


}
