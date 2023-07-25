/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodel;

/**
 *
 * @author admin
 */
public class Serial {
    private int id;
    private String ma;
    private int trangThai;
    private int idSP;

    public Serial() {
    }

    public Serial(int id, String ma, int trangThai, int idSP) {
        this.id = id;
        this.ma = ma;
        this.trangThai = trangThai;
        this.idSP = idSP;
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

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public int getIdSP() {
        return idSP;
    }

    public void setIdSP(int idSP) {
        this.idSP = idSP;
    }

    @Override
    public String toString() {
        return "Serial{" + "id=" + id + ", ma=" + ma + ", trangThai=" + trangThai + ", idSP=" + idSP + '}';
    }
    
}
