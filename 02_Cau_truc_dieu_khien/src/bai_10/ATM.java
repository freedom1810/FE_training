package bai_10;

import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số tiền muốn rút (bội số của 50.000 đồng): ");
        int amount = scanner.nextInt();

        int count500 = amount / 500000;

        int remainingAmount = amount % 500000;

        int count200 = remainingAmount / 200000;

        remainingAmount = remainingAmount % 200000;

        int count100 = remainingAmount / 100000;

        remainingAmount = remainingAmount % 100000;

        int count50 = remainingAmount / 50000;

        System.out.println("Số tờ tiền 500.000 đồng: " + count500);
        System.out.println("Số tờ tiền 200.000 đồng: " + count200);
        System.out.println("Số tờ tiền 100.000 đồng: " + count100);
        System.out.println("Số tờ tiền 50.000 đồng: " + count50);

    }
}


