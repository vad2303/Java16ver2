
import java.util.Scanner;
 
public abstract class NhanVien {
    private String tenNhanVien;
    protected long luongNhanVien;
    Scanner sc = new Scanner(System.in);
     
    public NhanVien() {
        super();
    }
    public NhanVien(String tenNhanVien, long luongNhanVien) {
        super();
        this.tenNhanVien = tenNhanVien;
        this.luongNhanVien = luongNhanVien;
    }
    public void nhapThongTin() {
        System.out.print("Ten Nhan Vien: ");
        tenNhanVien = sc.nextLine();
    }
    public abstract void tinhLuong();
 
    @Override
    public String toString() {
        return "Ten nhan vien: " + this.tenNhanVien + ", Luong: " + 
            this.luongNhanVien + " VND";
    }
 
}