package com.mycompany.poly.app.model;

/**
 *
 * @author Admin
 */
public class BangDiem {
    private int Ma;
    private String MaSinhVIen;
    private float TiengAnh,C,Java,GiaiTich;

    public BangDiem() {
    }

    public BangDiem(int Ma, String MaSinhVIen, float TiengAnh, float C, float Java, float GiaiTich) {
        this.Ma = Ma;
        this.MaSinhVIen = MaSinhVIen;
        this.TiengAnh = TiengAnh;
        this.C = C;
        this.Java = Java;
        this.GiaiTich = GiaiTich;
    }

    public int getMa() {
        return Ma;
    }

    public void setMa(int ma) {
        this.Ma = Ma;
    }

    public String getMaSinhVIen() {
        return MaSinhVIen;
    }

    public void setMaSinhVIen(String MaSinhVIen) {
        this.MaSinhVIen = MaSinhVIen;
    }

    public float getTiengAnh() {
        return TiengAnh;
    }

    public void setTiengAnh(float TiengAnh) {
        this.TiengAnh = TiengAnh;
    }

    public float getC() {
        return C;
    }

    public void setC(float C) {
        this.C = C;
    }

    public float getJava() {
        return Java;
    }

    public void setJava(float Java) {
        this.Java = Java;
    }

    public float getGiaiTich() {
        return GiaiTich;
    }

    public void setGiaiTich(float GiaiTich) {
        this.GiaiTich = GiaiTich;
    }

    
           
}
