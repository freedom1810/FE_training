package bai_4;

import java.util.Scanner;

public class Pt2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double param1, param2,param3;
        System.out.println("Param1: ");
        param1 = sc.nextDouble();
        System.out.println("Param2: ");
        param2 = sc.nextDouble();
        System.out.println("param3: ");
        param3 = sc.nextDouble();

        boolean isPtbacNhat = param1 == 0;
        if(isPtbacNhat){
            if(param2 != 0){
                double rs = -param3/param2;
                System.out.printf("Phuong trinh co nghiem: x = %.2f",rs);
            }else if(param3 == 0) {
                System.out.print("Phuong trinh vo so nghiem");
            }else{
                System.out.print("Phuong trinh vo nghiem");
            }
        }else{
            double delta = Math.pow(param2,2) - 4*param1*param3;
            if(delta < 0){
                System.out.print("Phuong trinh vo nghiem");
            }else if(delta == 0){
                double rs = -param2/(2*param1);
                System.out.printf("Phuong trinh co nghiem kep: x = %.2f", rs);
            }else{
                double rs1 = (-param2 - Math.sqrt(delta))/(2*param1);
                double rs2 = (-param2 + Math.sqrt(delta))/(2*param1);
                System.out.printf("Phuong trinh co 2 nghiem phan biet: x1 = %.2f, x2 = %.2f", rs1,rs2);
            }
        }
    }

}
