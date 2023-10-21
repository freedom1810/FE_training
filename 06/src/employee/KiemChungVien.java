package employee;

public class KiemChungVien extends NhanVien {
    private int soLoiPhatHien;

    public KiemChungVien(String maNhanVien, String hoTen, int tuoi, String soDienThoai, String email, double luongCoBan, int soLoiPhatHien) {
        super(maNhanVien, hoTen, tuoi, soDienThoai, email, luongCoBan);
        this.soLoiPhatHien = soLoiPhatHien;
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong() + soLoiPhatHien * 50000;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Số lỗi phát hiện: " + soLoiPhatHien);
        System.out.println("Lương: " + tinhLuong());
    }

    public int getSoLoiPhatHien() {
        return soLoiPhatHien;
    }

    public void setSoLoiPhatHien(int soLoiPhatHien) {
        this.soLoiPhatHien = soLoiPhatHien;
    }
}