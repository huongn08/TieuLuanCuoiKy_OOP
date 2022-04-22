package HuongN.TieuLuanCuoiKi;

public abstract class KhoHang {
    private String MaHang;
    private String TenHang;
    private double DonGia;
    private double SoLuongTon;

    public void setMaHang(String MaHang) {
        MaHang = "111";
        MaHang = MaHang;
    }

    public String getMaHang() {
        return MaHang;
    }
    public void setTenHang(String TenHang) {
        TenHang = "Ten Hang";
        TenHang = TenHang;
    }

    public String getTenHang() {
        return TenHang;
    }
    public void setDonGia(doubleDonGia) {
        if (donGia > 0) {
            DonGia = DonGia;

        }
        DonGia = DonGia;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setSoLuongTon(double soluongton) {
        if (soluongton > 0) {
            SoLuongTon = soluongton;

        } else {
            System.out.println("Da Het Hang");
        }
        SoLuongTon = soluongton;
    }

    public double getSoLuongTon() {
        return SoLuongTon;
    }
        public KhoHang(String MaHang, String TenHang, double SoLuongTon, double DonGia) {
            MaHang = MaHang;
            TenHang = TenHang;
            SoLuongTon = SoLuongTon;
            DonGia = DonGia;
        }
    
        
        public String toString() {
            return "HangHoa [DonGia=" + DonGia + ", MaHang=" + MaHang + ", SoLuongTon=" + SoLuongTon + ", TenHang=" + TenHang + "]";
        }
    
}