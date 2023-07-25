/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodel;

/**
 *
 * @author quyen
 */
public class TaiKhoan {
    
    private int id;
    private String userName;
    private String passWord;
    private String chucVu;
    private int trangThai;

    public TaiKhoan() {
    }

    public TaiKhoan(int id, String userName, String passWord, String chucVu, int trangThai) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.chucVu = chucVu;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", chucVu=" + chucVu + ", trangThai=" + trangThai + '}';
    }
    
}
