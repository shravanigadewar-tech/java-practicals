public class Handling1{
   public static void main (String []args){
     int []marks=new int[3];
      marks[0]=7;
      marks[1]=56;
      marks[2]=6;
      try{
         System.out.println("welcome");
          try{
            System.out.println(marks[9]);

          }
         catch(ArithmeticException e){
              System.out.println("index not exist");
              System.out.println("exception is in level 2");

          }  

      }
    catch(Exception e){
       System.out.println("exception is in level 1");
     }

  }
}