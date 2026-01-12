import java.util.Scanner; 

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int sum=a+b+c;
        int average=(a+b+c)/3;
        int product=a*b*c;
        
        int largest,smallest;

        if(a>b){
            if(a>c){
                largest=a;
                if(b>c){
                    smallest=c;
                }
                else{
                    smallest=b;
                }
            }
            else{
                largest=c;
                smallest=b;
            }
        }
        else{
            if(b>c){
                largest=b;
                if(a>c){
                    smallest=c;
                }
                else{
                    smallest=a;
                }
            }
            else{
                largest=c;
                smallest=a;
            }
        }

        System.out.println(sum);
        System.out.println(average);
        System.out.println(product);
        System.out.println(largest);
        System.out.println(smallest);
    }
}
