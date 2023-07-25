/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodel;

/**
 *
 * @author admin
 */
public class SerialDaBan {
    private int id;
    private String ma;
    private int trangThai;
    private int IdCTHD;

    public SerialDaBan() {
    }

    public SerialDaBan(int id, String ma, int trangThai, int IdCTHD) {
        this.id = id;
        this.ma = ma;
        this.trangThai = trangThai;
        this.IdCTHD = IdCTHD;
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

    public int getIdCTHD() {
        return IdCTHD;
    }

    public void setIdCTHD(int IdCTHD) {
        this.IdCTHD = IdCTHD;
    }

    @Override
    public String toString() {
        return "SerialDaBan{" + "id=" + id + ", ma=" + ma + ", trangThai=" + trangThai + ", IdCTHD=" + IdCTHD + '}';
    }
    
}
