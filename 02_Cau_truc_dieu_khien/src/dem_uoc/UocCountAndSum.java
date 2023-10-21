package dem_uoc;

import java.util.Scanner;

public class UocCountAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên N: ");
        int N = scanner.nextInt();

        int countUoc = 0; // Số lượng ước
        int sumUoc = 0;   // Tổng các ước

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                countUoc++;
                sumUoc += i;
            }
        }

        System.out.println("Số lượng ước của N là: " + countUoc);
        System.out.println("Tổng các ước của N là: " + sumUoc);
    }
}
