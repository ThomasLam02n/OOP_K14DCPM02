package buoi06.cd;

public class CD {
    private int codeCD;
    private String titleCD;
    private String singer;
    private int numberOfSongs;
    private double priceOfCD;

    CD(){

    }

    CD(int codeCD, String titleCD, String singer, int numberOfSongs, double priceOfCD){
        this.codeCD = codeCD;
        this.titleCD = titleCD;
        this.singer = singer;
        this.numberOfSongs = numberOfSongs;
        this.priceOfCD = priceOfCD;
    }

    public void setCodeCD(int codeCD) {
        this.codeCD = codeCD;
    }

    public int getCodeCD() {
        return codeCD;
    }

    public void setTitleCD(String titleCD) {
        this.titleCD = titleCD;
    }

    public String getTitleCD() {
        return titleCD;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getSinger() {
        return singer;
    }

    public void setNumberOfSongs(int numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
    }

    public int getNumberOfSongs() {
        return numberOfSongs;
    }

    public void setPriceOfCD(double priceOfCD) {
        this.priceOfCD = priceOfCD;
    }
    
    public double getPriceOfCD() {
        return priceOfCD;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String stc = "Ma CD: "+this.getCodeCD() + "Tua CD: " +this.getTitleCD() + "Ca si: "+this.getSinger();
        stc += "So bai hat: "+this.getNumberOfSongs() + "Gia Thanh: "+this.getPriceOfCD();
        return super.toString();
    }
}
