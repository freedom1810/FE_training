package bai_3;

import java.util.Scanner;

public class Pt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double param1, param2;
        System.out.println("Param1: ");
        param1 = sc.nextDouble();
        System.out.println("Param2: ");
        param2 = sc.nextDouble();
        if(param1 != 0){
            double rs = -param2/param1;
            System.out.printf("x = -%.0f/%.0f => x = %.2f", param2, param1,rs);
        }else if(param2 == 0) {
            System.out.print("Phuong trinh vo so nghiem");
        }else{
            System.out.print("Phuong trinh vo nghiem");
        }
    }
}