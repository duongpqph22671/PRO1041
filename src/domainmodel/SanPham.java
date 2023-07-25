/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodel;


/**
 *
 * @author quyen
 */
public class SanPham {
    private int Id;
    private int IdMauSac;
    private int IdHang;
    private int IdRam;
    private int IdCpu;
    private int IdOCung;
    private int IdVga;
    private int IdManHinh;
    private String Ma;
    private String Ten;
    private  int SLTon;
    private Double GiaNhap;
    private Double GiaBan;
    private int trangThai;

    public SanPham() {
    }

    public SanPham(int Id, int IdMauSac, int IdHang, int IdRam, int IdCpu, int IdOCung, int IdVga, int IdManHinh, String Ma, String Ten, int SLTon, Double GiaNhap, Double GiaBan, int trangThai) {
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

    public int getIdMauSac() {
        return IdMauSac;
    }

    public void setIdMauSac(int IdMauSac) {
        this.IdMauSac = IdMauSac;
    }

    public int getIdHang() {
        return IdHang;
    }

    public void setIdHang(int IdHang) {
        this.IdHang = IdHang;
    }

    public int getIdRam() {
        return IdRam;
    }

    public void setIdRam(int IdRam) {
        this.IdRam = IdRam;
    }

    public int getIdCpu() {
        return IdCpu;
    }

    public void setIdCpu(int IdCpu) {
        this.IdCpu = IdCpu;
    }

    public int getIdOCung() {
        return IdOCung;
    }

    public void setIdOCung(int IdOCung) {
        this.IdOCung = IdOCung;
    }

    public int getIdVga() {
        return IdVga;
    }

    public void setIdVga(int IdVga) {
        this.IdVga = IdVga;
    }

    public int getIdManHinh() {
        return IdManHinh;
    }

    public void setIdManHinh(int IdManHinh) {
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
        return "SanPham{" + "Id=" + Id + ", IdMauSac=" + IdMauSac + ", IdHang=" + IdHang + ", IdRam=" + IdRam + ", IdCpu=" + IdCpu + ", IdOCung=" + IdOCung + ", IdVga=" + IdVga + ", IdManHinh=" + IdManHinh + ", Ma=" + Ma + ", Ten=" + Ten + ", SLTon=" + SLTon + ", GiaNhap=" + GiaNhap + ", GiaBan=" + GiaBan + ", trangThai=" + trangThai + '}';
    }

}
