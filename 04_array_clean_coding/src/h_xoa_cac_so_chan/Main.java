package h_xoa_cac_so_chan;

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
            if (arr[i] % 2 != 0) {
                arr[k] = arr[i];
                k++;
            }
        }
        int[] result = Arrays.copyOf(arr, k);

        // In kết quả
        System.out.println("Mảng sau khi xoá các phần tử chẵn: " + Arrays.toString(result));
    }
}

