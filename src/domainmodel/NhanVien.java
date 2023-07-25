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
public class NhanVien {
    private int Id;
    private String Ma;
    private String Ten;
    private String NgaySinh;
    private String GioiTinh;
    private String SDT;
    private String DiaChi;
    private int trangThai;
    private int IdTK;

    public NhanVien() {
    }

    public NhanVien(int Id, String Ma, String Ten, String NgaySinh, String GioiTinh, String SDT, String DiaChi, int trangThai, int IdTK) {
        this.Id = Id;
        this.Ma = Ma;
        this.Ten = Ten;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
        this.trangThai = trangThai;
        this.IdTK = IdTK;
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

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }
    
    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    

    public int getIdTK() {
        return IdTK;
    }

    public void setIdTK(int IdTK) {
        this.IdTK = IdTK;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "Id=" + Id + ", Ma=" + Ma + ", Ten=" + Ten + ", NgaySinh=" + NgaySinh + ", GioiTinh=" + GioiTinh + ", SDT=" + SDT + ", DiaChi=" + DiaChi + ", trangThai=" + trangThai + ", IdTK=" + IdTK + '}';
    }

}
