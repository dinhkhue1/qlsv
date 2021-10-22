package com.mycompany.poly.app.model;

/**
 *
 * @author Admin
 */
public class NguoiDung {
    private String TenDangNhap, MatKhau, VaiTro;

    public NguoiDung() {
    }

    public NguoiDung(String TenDangNhap, String MatKhau, String VaiTro) {
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
        this.VaiTro = VaiTro;
    }

    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public void setTenDangNhap(String TenDangNhap) {
        this.TenDangNhap = TenDangNhap;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(String VaiTro) {
        this.VaiTro = VaiTro;
    }
}
