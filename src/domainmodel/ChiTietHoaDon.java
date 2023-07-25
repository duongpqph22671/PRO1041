/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodel;

/**
 *
 * @author quyen
 */
public class ChiTietHoaDon {
    private int Id;
    private int IdSP;
    private int IdHoaDon;
    private int IdKM;
    private int soLuong;
    private Double DonGia;
    private int trangThai;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(int Id, int IdSP, int IdHoaDon, int IdKM, int soLuong, Double DonGia, int trangThai) {
        this.Id = Id;
        this.IdSP = IdSP;
        this.IdHoaDon = IdHoaDon;
        this.IdKM = IdKM;
        this.soLuong = soLuong;
        this.DonGia = DonGia;
        this.trangThai = trangThai;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getIdSP() {
        return IdSP;
    }

    public void setIdSP(int IdSP) {
        this.IdSP = IdSP;
    }

    public int getIdHoaDon() {
        return IdHoaDon;
    }

    public void setIdHoaDon(int IdHoaDon) {
        this.IdHoaDon = IdHoaDon;
    }

    public int getIdKM() {
        return IdKM;
    }

    public void setIdKM(int IdKM) {
        this.IdKM = IdKM;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Double getDonGia() {
        return DonGia;
    }

    public void setDonGia(Double DonGia) {
        this.DonGia = DonGia;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "ChiTietHoaDon{" + "Id=" + Id + ", IdSP=" + IdSP + ", IdHoaDon=" + IdHoaDon + ", IdKM=" + IdKM + ", soLuong=" + soLuong + ", DonGia=" + DonGia + ", trangThai=" + trangThai + '}';
    }

    
}
