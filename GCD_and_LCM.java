// GCD and LCM

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1= s.nextInt();
        int num2=s.nextInt();
        int gcd = 1;
        int min=(num1<num2)? num1:num2;

        while (min > 1) {
            if (num1%min==0 && num2%min==0){
                gcd=min;
                break;
            }
            min--;

        }
        System.out.println("The GCD is:"+gcd);
        int lcm=(num1*num2)/gcd;
        System.out.println("the lcm is:"+lcm);
    }
}