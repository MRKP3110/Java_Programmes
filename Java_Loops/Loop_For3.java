// print the sum of first n natural numbers (take input from user)

import java.util.*;

public class Loop_For3 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        for(int i = 0 ; i<=n ; i++){
            sum = sum+i;
        }

        System.out.println(sum);
    }
}
