package buoi02.shape;

public class Shape {
    private String sound;

    Shape(){

    }
    public Shape(String sound){
        this.sound = sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void rotate(){
        System.out.println("Xoay 360 do");
    }

    public void playSound(){
        System.out.println("Play sound.iaf "+ this.sound + " music");
    }
}
