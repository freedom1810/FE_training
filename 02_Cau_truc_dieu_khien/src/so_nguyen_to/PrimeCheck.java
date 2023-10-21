package so_nguyen_to;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên N: ");
        int N = scanner.nextInt();

        boolean isPrime = isPrime(N);

        if (isPrime) {
            System.out.println(N + " là số nguyên tố.");
        } else {
            System.out.println(N + " không phải là số nguyên tố.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

