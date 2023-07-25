/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;

/**
 *
 * @author admin
 */
public class QLHoaDonChiTiet {
    private String tenSP;
    private Double giaBan;
    private int giaTri;
    private int soLuong;
    private Double donGia;

    public QLHoaDonChiTiet() {
    }

    public QLHoaDonChiTiet(String tenSP, Double giaBan, int giaTri, int soLuong, Double donGia) {
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.giaTri = giaTri;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }

    public int getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(int giaTri) {
        this.giaTri = giaTri;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "QLHoaDonChiTiet{" + "tenSP=" + tenSP + ", giaBan=" + giaBan + ", giaTri=" + giaTri + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }

}
