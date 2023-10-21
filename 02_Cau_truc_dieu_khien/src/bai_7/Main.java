package bai_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập N = ");
        double n = sc.nextDouble();
        double res = 0;
        if(n ==0 )
        {
            System.out.println(0);
        }
        else{
            if(n > 0){
                res = Math.pow(Math.abs(n), 1.0/3);
            }
            else{
                res = - Math.pow(Math.abs(n), 1.0/3);
            }
            System.out.println(res);
        }

    }
}


