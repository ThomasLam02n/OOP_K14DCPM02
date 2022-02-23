package buoi05;

public class Dog {
    //interface
    private int size;
    private String breed;
    private String name;

    public void setSize (int size){
        if(size > 0){
        this.size = size;
        }else{
            System.out.println("Size không được âm !");
        }
    }
    public int getSize(){
        return this.size;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return breed;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
