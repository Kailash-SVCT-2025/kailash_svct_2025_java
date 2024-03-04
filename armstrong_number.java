//armstrong_number

import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner s =new Scanner(System.in);
        int n= s.nextInt();
        int temp=n;
        int digit;
        int sum =0 ;
        int i=0;
        int l= String.valueOf(n).length();
        while(i<l){
            digit=(temp%10);
            temp=temp/10;
            sum+=(int)Math.pow(digit,l);
            i++;
        }
        if(n==sum){
        System.out.println("the given number is an armstrong number");
    }
        else{
            System.out.println("the given number is not an armstrong number");
        }
    }
}