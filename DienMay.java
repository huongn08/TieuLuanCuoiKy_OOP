package HuongN.TieuLuanCuoiKi;

public class HangDienMay extends KhoHang {
    public HangDienMay(String MaHang, String TenHang, double SoLuongTon, double DonGia) {
        super(MaHang, TenHang, SoLuongTon, DonGia);
    }
    public void BaoHanh() {

        for (int i = 0; i > 0; i++) {

            if (i > 0) {
                System.out.println("Thoi gian bao hanh 3 thang");
            } else {
                System.out.println("Khong ho tro bao hanh");
            }
        }
    }
    public void setDonGia(double DonGia) {
        System.out.println(" Da Tinh Vat" + DonGia);
        DonGia = DonGia * 0.1;
    }
    public void setSoLuongTon(double SoLuongTon) {
        if (getSoLuongTon() < 3) {
            System.out.println("Nhap Them Hang");
        } else {
            System.out.println("Giam gia Hang");
        }
        super.setSoLuongTon(SoLuongTon);
    }
    public double getSoLuongTon() {
        return 0;
    }
    public void CongSuat() {
        for (int i = 1; i > 1; i++) {
            if (i > 0) {
                System.out.println(" cong suat la ");
            }
        }
    }

    public void DienMay(String MaHang, String TenHang, double SoLuongTon, double DonGia) {
        this.BaoHanh();
        this.CongSuat();
    }

    public String toString() {
        return "DienMay []" + super.toString();
    }
}