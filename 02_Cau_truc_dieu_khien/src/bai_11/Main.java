package bai_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên N: ");
        int N = scanner.nextInt();

        int sumEven = 0;
        int sumOdd = 0;
        int productEvenOdd = 1;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
            productEvenOdd *= i;

        }

        System.out.println("Tổng các số chẵn từ 1 đến " + N + " là: " + sumEven);
        System.out.println("Tổng các số lẻ từ 1 đến " + N + " là: " + sumOdd);
        System.out.println("Tích của các số chẵn và lẻ từ 1 đến " + N + " là: " + productEvenOdd);
    }
}
