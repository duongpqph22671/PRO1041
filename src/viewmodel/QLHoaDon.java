/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;

import java.util.Date;

/**
 *
 * @author admin
 */
public class QLHoaDon {

    private String maHD;
    private String tenNV;
    private String tenKH;
    private String sdt;
    private Date ngayTao;
    private Date ngayThanhToan;
    private Double tongTien;
    private int trangThai;

    public QLHoaDon() {
    }

    public QLHoaDon(String maHD, String tenNV, String tenKH, String sdt, Date ngayTao, Date ngayThanhToan, Double tongTien, int trangThai) {
        this.maHD = maHD;
        this.tenNV = tenNV;
        this.tenKH = tenKH;
        this.sdt = sdt;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.tongTien = tongTien;
        this.trangThai = trangThai;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "QLHoaDon{" + "maHD=" + maHD + ", tenNV=" + tenNV + ", tenKH=" + tenKH + ", sdt=" + sdt + ", ngayTao=" + ngayTao + ", ngayThanhToan=" + ngayThanhToan + ", tongTien=" + tongTien + ", trangThai=" + trangThai + '}';
    }

}
