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
public class KhuyenMai {
    private int Id;
    private String Ma;
    private int GiaTri;
    private Date NgayTao;
    private Date NgayHetHan;
    private int trangThai;

    public KhuyenMai() {
    }

    public KhuyenMai(int Id, String Ma, int GiaTri, Date NgayTao, Date NgayHetHan, int trangThai) {
        this.Id = Id;
        this.Ma = Ma;
        this.GiaTri = GiaTri;
        this.NgayTao = NgayTao;
        this.NgayHetHan = NgayHetHan;
        this.trangThai = trangThai;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public int getGiaTri() {
        return GiaTri;
    }

    public void setGiaTri(int GiaTri) {
        this.GiaTri = GiaTri;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public Date getNgayHetHan() {
        return NgayHetHan;
    }

    public void setNgayHetHan(Date NgayHetHan) {
        this.NgayHetHan = NgayHetHan;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return GiaTri + "";
    }

}
