package bai_5;

import java.util.Scanner;

public class NextDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập ngày: ");
        int day = input.nextInt();

        System.out.print("Nhập tháng: ");
        int month = input.nextInt();

        System.out.print("Nhập năm: ");
        int year = input.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Ba số nhập vào không phải là ngày tháng năm.");
            return;
        }

        if (year < 1) {
            System.out.println("Ba số nhập vào không phải là ngày tháng năm.");
            return;
        }

        int maxDay = 0;

        switch (month) {
            case 2:
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    maxDay = 29;
                } else {
                    maxDay = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDay = 30;
                break;
            default:
                maxDay = 31;
                break;
        }

        if (day < 1 || day > maxDay) {
            System.out.println("Ba số nhập vào không phải là ngày tháng năm.");
            return;
        }

        int nextDay = day + 1;
        int nextMonth = month;
        int nextYear = year;

        if (nextDay > maxDay) {
            nextDay = 1;
            nextMonth += 1;

            if (nextMonth > 12) {
                nextMonth = 1;
                nextYear += 1;
            }
        }

        System.out.printf("Ngày tiếp theo là: %d/%d/%d\n", nextDay, nextMonth, nextYear);
    }
}

