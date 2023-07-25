/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;

/**
 *
 * @author admin
 */
public class GioHang {
    private int id;
    private String ma;
    private String ten;
    private int soLuong;
    private Double donGia;

    public GioHang() {
    }

    public GioHang(int id, String ma, String ten, int soLuong, Double donGia) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
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
        return "GioHang{" + "ma=" + ma + ", ten=" + ten + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }

}
