package f_dem_so_chinh_phuong;

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

        int count = 0;
        for (int i = 0; i < n; i++) {
            double sqrt = Math.sqrt(arr[i]);
            if (sqrt == (int) sqrt) {
                count++;
            }
        }

        System.out.println("Số lượng số chính phương trong mảng là: " + count);
    }
}

