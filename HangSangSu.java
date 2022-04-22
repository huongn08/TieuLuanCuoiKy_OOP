package HuongN.TieuLuanCuoiKi;

public class HangSanhSu extends KhoHang {
    public HangSanhSu(int MaHang, String TenHang, double SoLuongTon, double DonGia) {
        super(MaHang, TenHang, SoLuongTon, DonGia);   
        
    }
    public void NSX() {
        System.out.println("NHA SAN XUAT LA:");
    }
    public void NNK() {
        System.out.println("NGAY NHAP KHO LA:");
    }
    public void setDonGia(double DonGia) {
        DonGia = DonGia * 0.1;
        System.out.println("DA TINH VAT" + DonGia);
    }
    public void setSoLuongTon(double SoLuongTon) {
        if (getSoLuongTon() > 50) {
            System.out.println("NGUNG NHAP");
        } else {
            System.out.println("NHAP THEM");
        }
        super.setSoLuongTon(soLuongTon);
    }

    public void SanhSu(String MaHang, String TenHang, double SoLuongTon, double DonGia) {
        this.NNK();
        this.NSX();
    }
    public String toString() {
        return "SanhSu []" + super.toString();
    } 
}
