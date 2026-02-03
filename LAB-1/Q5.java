import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int arr[]=new int[5];
        int i=0;
        while(num>0){
            int a=num%10;
            arr[i]=a;
            i++;
            num=num/10;
        }

        for(int j=4;j>=0;j--){
            System.out.print(arr[j]+" ");
        }
    }
}
