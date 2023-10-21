package so_hoan_hao;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số N: ");
        int N = scanner.nextInt();

        if (isPerfectNumber(N)) {
            System.out.println(N + " là số hoàn hảo.");
        } else {
            System.out.println(N + " không phải là số hoàn hảo.");
        }
    }

    public static boolean isPerfectNumber(int number) {
        int sumOfDivisors = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }

        return sumOfDivisors == number;
    }
}
