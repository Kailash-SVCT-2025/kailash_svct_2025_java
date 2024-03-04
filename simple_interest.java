// simple interest

import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        System.out.println("enter the values of P,R,N");
        Scanner s=new Scanner(System.in);
        int p =s.nextInt();
        int r =s.nextInt();
        int n=s.nextInt();
        int SI =(p*r*n)/100;
        System.out.println("the simple interest is"+ SI );
    }
}