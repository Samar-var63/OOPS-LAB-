
import java.util.Scanner;

public class Q2 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int a=sc.nextInt();
    int b=sc.nextInt();

    if(a>b){
        System.out.println("First number Is larger");
    }
    else if(a==b){
        System.out.println("Numbers are equal");;
    }
    else{
        System.out.println("Second number is larger");
    }
   } 
}
