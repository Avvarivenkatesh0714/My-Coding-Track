import java.util.*;
class IllegalArgumentException extends Exception{
  IllegalArgumentException(String s){
     super(s);
  }
}

public class ExceptionHandlingProgram {
    public static void main(String[] args) {
      ExceptionHandlingProgram m=new ExceptionHandlingProgram();
      try{
      double result=m.divide(100,2);
      System.out.println(result);
      }
      catch(IllegalArgumentException e){
        System.out.println("Exception caught:"+ e.getMessage());
      }
  }
  public double divide(int divi, int dsor) throws IllegalArgumentException{
    if(dsor==0){
      throw new IllegalArgumentException("Divisor is zero not possible");
    }
    return (double)divi/dsor;
    
  }
}