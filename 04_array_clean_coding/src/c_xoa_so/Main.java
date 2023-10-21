package c_xoa_so;

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

        System.out.print("Nhập số K để xoá: ");
        int K = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            if (arr[i] == K) {
                for (int j = i; j < N - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                N--;
                i--;
            }
        }

        System.out.println("Mảng sau khi xoá các phần tử có giá trị " + K + " là:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

