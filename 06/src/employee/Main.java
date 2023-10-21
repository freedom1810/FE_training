package employee;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();

        while (true) {
            System.out.println("Chọn chức năng:");
            System.out.println("1. Nhập thông tin nhân viên");
            System.out.println("2. In thông tin nhân viên");
            System.out.println("0. Kết thúc");
            int luaChon = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng new line

            if (luaChon == 0) {
                break;
            }

            switch (luaChon) {
                case 1:
                    System.out.println("Chọn loại nhân viên (1 - Lập trình viên, 2 - Kiểm chứng viên):");
                    int loaiNhanVien = scanner.nextInt();
                    scanner.nextLine(); // Đọc bỏ dòng new line

                    System.out.print("Mã nhân viên: ");
                    String maNhanVien = scanner.nextLine();
                    System.out.print("Họ tên: ");
                    String hoTen = scanner.nextLine();
                    System.out.print("Tuổi: ");
                    int tuoi = scanner.nextInt();
                    scanner.nextLine(); // Đọc bỏ dòng new line
                    System.out.print("Số điện thoại: ");
                    String soDienThoai = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Lương cơ bản: ");
                    double luongCoBan = scanner.nextDouble();
                    scanner.nextLine(); // Đọc bỏ dòng new line

                    if (loaiNhanVien == 1) {
                        System.out.print("Số giờ overtime: ");
                        int soGioOvertime = scanner.nextInt();
                        scanner.nextLine(); // Đọc bỏ dòng new line

                        LapTrinhVien lapTrinhVien = new LapTrinhVien(maNhanVien, hoTen, tuoi, soDienThoai, email, luongCoBan, soGioOvertime);
                        danhSachNhanVien.add(lapTrinhVien);
                    } else if (loaiNhanVien == 2) {
                        System.out.print("Số lỗi phát hiện: ");
                        int soLoiPhatHien = scanner.nextInt();
                        scanner.nextLine(); // Đọc bỏ dòng new line

                        KiemChungVien kiemChungVien = new KiemChungVien(maNhanVien, hoTen, tuoi, soDienThoai, email, luongCoBan, soLoiPhatHien);
                        danhSachNhanVien.add(kiemChungVien);
                    }
                    break;

                case 2:
                    if (danhSachNhanVien.isEmpty()) {
                        System.out.println("Danh sách nhân viên trống.");
                    } else {
                        System.out.println("Danh sách nhân viên:");
                        for (NhanVien nhanVien : danhSachNhanVien) {
                            nhanVien.inThongTin();
                            System.out.println("-------------------");
                        }
                    }
                    break;
            }
        }
    }
}

