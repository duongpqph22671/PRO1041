/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;

/**
 *
 * @author admin
 */
public class SanPhamViewMD {
    private int Id;
    private String IdMauSac;
    private String IdHang;
    private String IdRam;
    private String IdCpu;
    private String IdOCung;
    private String IdVga;
    private String IdManHinh;
    private String Ma;
    private String Ten;
    private int SLTon;
    private Double GiaNhap;
    private Double GiaBan;
    private int trangThai;

    public SanPhamViewMD() {
    }

    public SanPhamViewMD(int Id, String IdMauSac, String IdHang, String IdRam, String IdCpu, String IdOCung, String IdVga, String IdManHinh, String Ma, String Ten, int SLTon, Double GiaNhap, Double GiaBan, int trangThai) {
        this.Id = Id;
        this.IdMauSac = IdMauSac;
        this.IdHang = IdHang;
        this.IdRam = IdRam;
        this.IdCpu = IdCpu;
        this.IdOCung = IdOCung;
        this.IdVga = IdVga;
        this.IdManHinh = IdManHinh;
        this.Ma = Ma;
        this.Ten = Ten;
        this.SLTon = SLTon;
        this.GiaNhap = GiaNhap;
        this.GiaBan = GiaBan;
        this.trangThai = trangThai;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getIdMauSac() {
        return IdMauSac;
    }

    public void setIdMauSac(String IdMauSac) {
        this.IdMauSac = IdMauSac;
    }

    public String getIdHang() {
        return IdHang;
    }

    public void setIdHang(String IdHang) {
        this.IdHang = IdHang;
    }

    public String getIdRam() {
        return IdRam;
    }

    public void setIdRam(String IdRam) {
        this.IdRam = IdRam;
    }

    public String getIdCpu() {
        return IdCpu;
    }

    public void setIdCpu(String IdCpu) {
        this.IdCpu = IdCpu;
    }

    public String getIdOCung() {
        return IdOCung;
    }

    public void setIdOCung(String IdOCung) {
        this.IdOCung = IdOCung;
    }

    public String getIdVga() {
        return IdVga;
    }

    public void setIdVga(String IdVga) {
        this.IdVga = IdVga;
    }

    public String getIdManHinh() {
        return IdManHinh;
    }

    public void setIdManHinh(String IdManHinh) {
        this.IdManHinh = IdManHinh;
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

    public int getSLTon() {
        return SLTon;
    }

    public void setSLTon(int SLTon) {
        this.SLTon = SLTon;
    }

    public Double getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(Double GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public Double getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(Double GiaBan) {
        this.GiaBan = GiaBan;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "SanPhamViewMD{" + "Id=" + Id + ", IdMauSac=" + IdMauSac + ", IdHang=" + IdHang + ", IdRam=" + IdRam + ", IdCpu=" + IdCpu + ", IdOCung=" + IdOCung + ", IdVga=" + IdVga + ", IdManHinh=" + IdManHinh + ", Ma=" + Ma + ", Ten=" + Ten + ", SLTon=" + SLTon + ", GiaNhap=" + GiaNhap + ", GiaBan=" + GiaBan + ", trangThai=" + trangThai + '}';
    }
    
}
