import java.io.FileReader;
import java.io.FileNotFoundException;
class Basic{
   public static void main(String []args){
      FileReader fr=null;
      try{
       fr= new FileReader("pract11.java");
       
       }
       catch(FileNotFoundException e){
        System.out.println("This file is not in directory");
          System.out.println(fr);
       }
         System.out.println(fr);
      
      int [] arr=new int[] {22,44,66};
     try{
       System.out.println("The lenght is:"+ arr[3]);
     }
    catch (ArrayIndexOutOfBoundsException a){
      System.out.println("the index not found in the array");
     }
     
     int a=9;
     int b=0;
     
      
      try{
     System.out.println(a/b);
     }
      catch(ArithmeticException m){
       System.out.println("not defined");
      }
   
}
}
