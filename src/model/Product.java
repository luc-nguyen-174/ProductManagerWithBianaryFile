package model;

import java.io.Serializable;

public class Product implements Serializable {
    private int maSanPham;
    private String tenSP;
    private String hangSanXuat;
    private double gia;
    private String moTaKhac;

    public Product() {
    }

    public Product(int maSanPham, String tenSP, String hangSanXuat, double gia, String moTaKhac) {
        this.maSanPham = maSanPham;
        this.tenSP = tenSP;
        this.hangSanXuat = hangSanXuat;
        this.gia = gia;
        this.moTaKhac = moTaKhac;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMoTaKhac() {
        return moTaKhac;
    }

    public void setMoTaKhac(String moTaKhac) {
        this.moTaKhac = moTaKhac;
    }

    @Override
    public String toString() {
        return "Product{" +
                "maSanPham=" + maSanPham +
                ", tenSP='" + tenSP + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", gia=" + gia +
                ", moTaKhac='" + moTaKhac + '\'' +
                '}';
    }
}
