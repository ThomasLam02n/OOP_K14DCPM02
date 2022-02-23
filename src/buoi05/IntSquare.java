package buoi05;

public class IntSquare {
    private int squareValue;
    private int intSquare;

    //interfaces
    public int getSquare(int value){
        return this.caculateSquare(value);
    }

    //implementation
    private int caculateSquare(int value){
      this.squareValue = (int)Math.pow(value, 2);
      System.out.println("Result: "+squareValue);
      return this.squareValue;
    }
}
