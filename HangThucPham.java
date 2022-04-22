package HuongN.TieuLuanCuoiKi;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class HangThucPham extends KhoHang {
    public HangThucPham(String MaHang, String TenHang, double SoLuongTon, double DonGia) {
        super(MaHang, TenHang, SoLuongTon, DonGia);
    }
    private int MaHang;
    private String TenHang;
    private double DonGia;
    private Date NSX, HSD;
    
    public void KhoHang(int MaHang, String TenHang, double DonGia, Date NSX, Date HSD) {
        this.MaHang = MaHang;
        this.TenHang = TenHang;
        this.DonGia = DonGia;
        this.NSX = NSX;
        this.HSD = HSD;
    }
    public void ThucPham() {
    }
 
    public int getMaHang() {
        return MaHang;
    }
 
    public void setMaHang(int MaHang) {
        this.MaHang = MaHang;
    }
 
    public String getTenHang() {
        return TenHang;
    }
 
    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }
 
    public double getDonGia() {
        return DonGia;
    }
 
    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }
 
    public Date getNSX() {
        return NSX;
    }
 
    public void setnSX(Date NSX) {
        this.NSX = NSX;
    }
 
    public Date getHSD() {
        return HSD;
    }
 
    public void sethSD(Date HSD) {
        this.HSD = HSD;
    }
    public void setSoLuongTon(double SoLuongTon) {
        if (getSoLuongTon() > 0 && NSX.after(this.HSD)) {
            System.out.println("Giam so Luong");
        }
        super.setSoLuongTon(soLuongTon);
    }
    public String toString() {
        SimpleDateFormat NgayVietNam = new SimpleDateFormat();
        return "ThucPham [HSD=" + NgayVietNam.format(HSD) + ", NSX=" + NgayVietNam.format(NSX) + "]" + super.toString();
    }
}