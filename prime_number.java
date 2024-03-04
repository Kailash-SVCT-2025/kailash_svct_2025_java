//prime number

import java.util.Scanner;

public class prime_num {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count =0 ;

        for (int i=1 ; i<=n ; i++) {
            if (n % i == 0) {
                count++;
            }
        }
            if(count==2){
                System.out.println("it is a prime number");
            }
            else {
                System.out.println("it is not a prime number");
            }
        }
}