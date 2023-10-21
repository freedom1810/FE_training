package i_xoa_cac_phan_tu_le_2;

import java.util.Arrays;
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

        int k = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 || arr[i] % 2 == 0) {
                arr[k] = arr[i];
                k++;
            }
        }
        int[] result = Arrays.copyOf(arr, k);

        System.out.println("Mảng sau khi xoá các phần tử có chỉ số lẻ và giá trị lẻ: " + Arrays.toString(result));
    }
}

