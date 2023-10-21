package so_nghich_dao;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên N: ");
        int N = scanner.nextInt();

        int reverse = 0; // Số nghịch đảo

        while (N > 0) {
            int lastDigit = N % 10;
            reverse = reverse * 10 + lastDigit;
            N /= 10;
        }

        System.out.println("Số nghịch đảo của N là: " + reverse);
    }
}
