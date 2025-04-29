import java.util.*;

public class F_03_Multi {
    
    public static int calculateMulti(int a , int b){
        int multi = a * b ;
        return multi;
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Product of two number:"+calculateMulti(a, b));
    }
}
