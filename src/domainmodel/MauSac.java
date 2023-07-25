/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodel;

/**
 *
 * @author quyen
 */
public class MauSac {
    private int Id;
    private String Ma;
    private String Ten;
    private int trangThai;

    public MauSac() {
    }

    public MauSac(int Id, String Ma, String Ten, int trangThai) {
        this.Id = Id;
        this.Ma = Ma;
        this.Ten = Ten;
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

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    @Override
    public String toString() {
        return Ten;
    }

}
