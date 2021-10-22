package com.mycompany.poly.app.model;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String MaSinhVIen, HoTen, Email, SoDT, DiaChi; 
    private int GioiTinh;
    private byte[] Hinh;

    public SinhVien() {
    }

    public SinhVien(String MaSinhVIen, String HoTen, String Email, String SoDT, String DiaChi, int GioiTinh, byte[] Hinh) {
        this.MaSinhVIen = MaSinhVIen;
        this.HoTen = HoTen;
        this.Email = Email;
        this.SoDT = SoDT;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
        this.Hinh = Hinh;
    }

    public String getMaSinhVIen() {
        return MaSinhVIen;
    }

    public void setMaSinhVIen(String MaSinhVIen) {
        this.MaSinhVIen = MaSinhVIen;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public byte[] getHinh() {
        return Hinh;
    }

    public void setHinh(byte[] Hinh) {
        this.Hinh = Hinh;
    }
    
    
}
