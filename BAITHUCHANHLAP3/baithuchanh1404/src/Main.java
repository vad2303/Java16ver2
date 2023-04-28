import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        int soNhanVienToanThoiGian, soNhanVienThoiVu;
        try (Scanner sc = new Scanner(System.in)) {
            NhanVien nhanvien;
            ArrayList<NhanVien> arrNhanVien = new ArrayList<>();
             
            System.out.print("Nhap so nhan vien toan thoi gian: ");
            soNhanVienToanThoiGian = sc.nextInt();
            System.out.println("Thong tin nhan vien toan thoi gian");
            for (int i = 0; i < soNhanVienToanThoiGian; i++) {
                System.out.println("Thong tin nhan vien toan thoi gian thu" + (i + 1) + ": ");
                nhanvien = new NhanVienToanThoiGian(); 
                nhanvien.nhapThongTin();
                arrNhanVien.add(nhanvien);
            }
             
            System.out.print("Nhap so nhan vien thoi vu: ");
            soNhanVienThoiVu = sc.nextInt();
            System.out.println("Thong tin nhan vien thoi vu");
            for (int i = 0; i < soNhanVienThoiVu; i++) {
                System.out.println("Thong tin nhan vien thoi vu thu" + (i + 1) + ": ");
                nhanvien = new NhanVienThoiVu(); 
                nhanvien.nhapThongTin();
                arrNhanVien.add(nhanvien);
            }
             
            System.out.println("Thong tin nhan vien");
            for (NhanVien nv : arrNhanVien) {
                nv.tinhLuong();
                System.out.println(nv.toString());
            }
        }
    }
 
}