class X{
    int i;
    int j;
    X(int a,int b){
        i=a;
        j=b;
    }

    int final_sum(){
        return(i+j);
    }


}

class Y extends X{
    Y(int a,int b){
        super(a,b);
    }
    
    int final_product(){
        return(i*j);
    }
}

class Z extends Y{
    Z(int a,int b){
        super(a,b);
    }
    int final_difference(){
        return(i-j);
    }
}

public class  MultilevelDemo{
    public static void main(String args[]){
        Z m=new Z(5,3);
        System.out.println("Sum of 2 number is->"+m.final_sum());
        System.out.println("Difference of 2 number is->"+m.final_difference());
        System.out.println("Product of 2 number is->"+m.final_product());
    }
}