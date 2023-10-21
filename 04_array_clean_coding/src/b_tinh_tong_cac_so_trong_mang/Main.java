package b_tinh_tong_cac_so_trong_mang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int N = scanner.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int sumPositive = 0;
        int sumNegative = 0;
        int sumTotal = 0;

        for (int i = 0; i < N; i++) {
            sumTotal += arr[i];
            if (arr[i] > 0) {
                sumPositive += arr[i];
            } else if (arr[i] < 0) {
                sumNegative += arr[i];
            }
        }

        double average = (double) sumTotal / N;

        System.out.println("Tổng các số dương trong mảng: " + sumPositive);
        System.out.println("Tổng các số âm trong mảng: " + sumNegative);
        System.out.println("Trung bình của các số trong mảng: " + average);
    }
}
