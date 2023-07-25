/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodel;

import java.util.Date;

/**
 *
 * @author quyen
 */
public class HoaDon {
    private int Id;
    private int IdNV;
    private int IdKH;
    private String Ma;
    private Date NgayTao;
    private Date NgayThanhToan;
    private Double Tongtien;
    private int TrangThai;

    public HoaDon() {
    }

    public HoaDon(int Id, int IdNV, int IdKH, String Ma, Date NgayTao, Date NgayThanhToan, Double Tongtien, int TrangThai) {
        this.Id = Id;
        this.IdNV = IdNV;
        this.IdKH = IdKH;
        this.Ma = Ma;
        this.NgayTao = NgayTao;
        this.NgayThanhToan = NgayThanhToan;
        this.Tongtien = Tongtien;
        this.TrangThai = TrangThai;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getIdNV() {
        return IdNV;
    }

    public void setIdNV(int IdNV) {
        this.IdNV = IdNV;
    }

    public int getIdKH() {
        return IdKH;
    }

    public void setIdKH(int IdKH) {
        this.IdKH = IdKH;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public Date getNgayThanhToan() {
        return NgayThanhToan;
    }

    public void setNgayThanhToan(Date NgayThanhToan) {
        this.NgayThanhToan = NgayThanhToan;
    }

    public Double getTongtien() {
        return Tongtien;
    }

    public void setTongtien(Double Tongtien) {
        this.Tongtien = Tongtien;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "Id=" + Id + ", IdNV=" + IdNV + ", IdKH=" + IdKH + ", Ma=" + Ma + ", NgayTao=" + NgayTao + ", NgayThanhToan=" + NgayThanhToan + ", Tongtien=" + Tongtien + ", TrangThai=" + TrangThai + '}';
    }

    
}
