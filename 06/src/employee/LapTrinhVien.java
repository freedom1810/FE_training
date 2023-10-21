package employee;

public class LapTrinhVien extends NhanVien {
    private int soGioOvertime;

    public LapTrinhVien(String maNhanVien, String hoTen, int tuoi, String soDienThoai, String email, double luongCoBan, int soGioOvertime) {
        super(maNhanVien, hoTen, tuoi, soDienThoai, email, luongCoBan);
        this.soGioOvertime = soGioOvertime;
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong() + soGioOvertime * 200000;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Số giờ overtime: " + soGioOvertime);
        System.out.println("Lương: " + tinhLuong());
    }

    public int getSoGioOvertime() {
        return soGioOvertime;
    }

    public void setSoGioOvertime(int soGioOvertime) {
        this.soGioOvertime = soGioOvertime;
    }
}