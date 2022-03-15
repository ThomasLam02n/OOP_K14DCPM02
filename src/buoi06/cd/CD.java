package buoi06.cd;

import java.util.Scanner;

public class CD {
    private int codeCD;
    private String titleCD;
    private String singer;
    private int numberOfSongs;
    private double priceOfCD;
    Scanner sc = new Scanner(System.in);

    CD(){

    }

    CD(int codeCD, String titleCD, String singer, int numberOfSongs, double priceOfCD){
        this.codeCD = codeCD;
        this.titleCD = titleCD;
        this.singer = singer;
        this.numberOfSongs = numberOfSongs;
        this.priceOfCD = priceOfCD;
    }

    

    public int getCodeCD() {
        return codeCD;
    }

    public void setCodeCD(int codeCD) {
        this.codeCD = codeCD;
    }

    public String getTitleCD() {
        return titleCD;
    }

    public void setTitleCD(String titleCD) {
        this.titleCD = titleCD;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getNumberOfSongs() {
        return numberOfSongs;
    }

    public void setNumberOfSongs(int numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
    }

    public double getPriceOfCD() {
        return priceOfCD;
    }

    public void setPriceOfCD(double priceOfCD) {
        this.priceOfCD = priceOfCD;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String stc = "Ma CD: "+this.getCodeCD() + "Title CD: " +this.getTitleCD() + "Ca si: "+this.getSinger();
        stc += "So bai hat: "+this.getNumberOfSongs() + "Gia Thanh: "+this.getPriceOfCD();
        return super.toString();
    }

    void input(){
        System.out.println("Ma CD:");
        this.codeCD = sc.nextInt();
        System.out.println("Title CD:");
        this.titleCD = sc.nextLine();
        System.out.println("Ca si: ");
        this.singer = sc.nextLine();
        System.out.println("So bai hat:");
        this.numberOfSongs = sc.nextInt();
        System.out.println("Gia Thanh: ");
        this.priceOfCD = sc.nextDouble();
    }
    
    void output(){
        System.out.print("Ma CD:"+this.codeCD);
        System.out.print("  Title CD:"+this.titleCD);
        System.out.print("  Ca si: "+this.singer);
        System.out.print("  So bai hat:"+this.numberOfSongs);
        System.out.println("  Gia Thanh: "+this.priceOfCD);
    }
}