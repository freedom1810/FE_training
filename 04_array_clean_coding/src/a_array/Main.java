package a_array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Câu 1
        System.out.print("Câu 1: Nhập họ và tên của bạn: ");
        String fullName = scanner.nextLine();
        String standardizedFullName = standardizeFullName(fullName);
        System.out.println("Họ và tên sau khi chuẩn hóa: " + standardizedFullName);

        // Câu 2
        System.out.print("Câu 2: Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Mảng ban đầu: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        increaseEvenNumbers(array);

        System.out.print("Mảng sau khi thay đổi các số chẵn: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static String standardizeFullName(String fullName) {
        String[] parts = fullName.split(" ");
        StringBuilder standardizedFullName = new StringBuilder();

        for (String part : parts) {
            standardizedFullName.append(part.substring(0, 1).toUpperCase());
            standardizedFullName.append(part.substring(1).toLowerCase());
            standardizedFullName.append(" ");
        }

        return standardizedFullName.toString().trim();
    }

    public static void increaseEvenNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i]++;
            }
        }
    }

}
