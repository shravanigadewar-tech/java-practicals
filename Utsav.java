import java.util.Scanner;

 class Utsav{

 static void utsav2(StringBuffer b){
    for(int i=0;i<=2026;i++){
           b.append("_").append(i);
    }
}
static void utsav3(StringBuilder c){
    for(int i=0;i<=2026;i++){
         c.append("_").append(i);
    }
}
    static void utsav1(String a){

for(int i=0;i<=2026;i++){
         a= a.concat("_"+ i);
        } 
        
}
    
     public static void main(String args[]){

String a ="U";
 StringBuffer b = new StringBuffer("U");
StringBuilder c = new StringBuilder("U");
Scanner sc=new Scanner(System.in);
System.out.println("Enter your choice");
int choice =sc.nextInt();
switch(choice){

case 1:
  long start1 = System.nanoTime();
  utsav1(a);
  long end1 =System.nanoTime();
  System.out.println("Time taken = " + (end1-start1) + " nanoseconds");
   break;

case 2:
  long start2 = System.nanoTime();
  utsav2(b);
  long end2 =System.nanoTime();
   System.out.println("Time taken = " + (end2-start2) + " nanoseconds");
   break;

case 3:
   long start3 = System.nanoTime();
   utsav3(c);
   long end3 =System.nanoTime();
   System.out.println("Time taken = " + (end3-start3) + " nanoseconds");
   break;

default:
    System.out.println("invalid choice");
}   

     }
 }
     

