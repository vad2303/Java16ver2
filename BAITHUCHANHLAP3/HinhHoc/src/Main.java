
public class Main {
    public static void main(String[] args) {
        // Hinh tron
        HinhTron ht = new HinhTron();
        ht.xuatTen();
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.inChuVi();
        ht.inDienTich();
        // Hinh tru
        HinhTru htr = new HinhTru();
        htr.xuatTen();
        htr.nhapChieuCao();
        htr.tinhTheTich();
        htr.inTheTich();
        // Hinh chu nhat
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.xuatTen();
        hcn.xuatTen();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inChuVi();
        hcn.inTheTich();
        // Hinh vuong
        HinhVuong hv = new HinhVuong();
        hv.xuatTen();
        hv.nhapCanh();
        hv.tinhChuVi();
        hv.tinhDienTich();
        hv.inChuVi();
        hv.inDienTich();
    }
}