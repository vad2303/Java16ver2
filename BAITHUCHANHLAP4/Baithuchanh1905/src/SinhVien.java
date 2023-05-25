import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private String lop;

    public SinhVien(String maSv, String hoTen, String lop) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getName() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }

    public static void main(String[] args) {
        Map<String, SinhVien> sinhVienMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        // Nhap danh sach sinh vien
        System.out.println("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu" + (i + 1) + ":");
            System.out.println("Ma sinh vien:");
            String maSV = scanner.nextLine();
            System.out.println("Ho va ten: ");
            String hoTen = scanner.nextLine();
            System.out.println("Lop:");
            String lop = scanner.nextLine();

            SinhVien sinhVien = new SinhVien(maSV, hoTen, lop);
            sinhVienMap.put(maSV, sinhVien);
        }

        // Nhap ten lop va hien thi sinh vien thuoc lop do
        System.out.println("Nhap ten lop: ");
        String searchLop = scanner.nextLine();

        System.out.println("Danh sach sinh vien thuoc lop" + searchLop + ":");
        for (SinhVien sinhVien : sinhVienMap.values()) {
            if (sinhVien.getLop().equalsIgnoreCase(searchLop)) {
                System.out.println("Masinh vien:" + sinhVien.getMaSV() +
                        ",Ho va ten:" + sinhVien.getName() +
                        ",Lop" + sinhVien.getLop());
            }
        }

        // Nhap ma sinh vien va hien thi ho ten va lop tuong ung
        System.out.println("Nhap ma sinh vien:");
        String searchMaSV = scanner.nextLine();

        SinhVien sinhVien = sinhVienMap.get(searchMaSV);
        if (sinhVien != null) {
            System.out.println("Ho va ten: " + sinhVien.getName() +
                    ", Lop" + sinhVien.getLop());
        } else {
            System.out.println("Khong tim thay sinh vien voi MSV" + searchMaSV);
        }

        scanner.close();
    }
}