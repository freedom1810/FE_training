package d_tim_kiem;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Nhập số K cần tìm vị trí: ");
        int k = scanner.nextInt();

        System.out.print("Các vị trí của các phần tử bằng K là: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                System.out.print( (i+1) + " ");
            }
        }
    }
}

