/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import domainmodel.NhanVien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utility.DBConnection;

/**
 *
 * @author quyen
 */
public class NhanVienRepository implements INhanVienRepository {

    DBConnection DBConnection;
    PreparedStatement pstm = null;
    ResultSet rs = null;

    public NhanVienRepository() {
        DBConnection = new DBConnection();
    }

    @Override
    public List<NhanVien> getListNhanVien() {
        String select = "Select Id, Ma, Ten, NgaySinh, GioiTinh, SDT, DiaChi, TrangThai from NhanVien";
        List<NhanVien> list = new ArrayList<>();
        try {
            pstm = DBConnection.getConnection().prepareStatement(select);
            rs = pstm.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setId(rs.getInt(1));
                nv.setMa(rs.getString(2));
                nv.setTen(rs.getNString(3));
                nv.setNgaySinh(rs.getString(4));
                nv.setGioiTinh(rs.getNString(5));
                nv.setSDT(rs.getString(6));
                nv.setDiaChi(rs.getNString(7));
                nv.setTrangThai(rs.getInt(8));
                list.add(nv);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return list;
    }

    @Override
    public List<NhanVien> getListNhanVienByMa(String ma) {
        String select = "Select Id, Ma, Ten, NgaySinh, GioiTinh, SDT, DiaChi, TrangThai from NhanVien WHERE Ten = '" + ma + "'";
        List<NhanVien> list = new ArrayList<>();
        try {
            pstm = DBConnection.getConnection().prepareStatement(select);
            rs = pstm.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setId(rs.getInt(1));
                nv.setMa(rs.getString(2));
                nv.setTen(rs.getNString(3));
                nv.setNgaySinh(rs.getString(4));
                nv.setGioiTinh(rs.getNString(5));
                nv.setSDT(rs.getString(6));
                nv.setDiaChi(rs.getNString(7));
                nv.setTrangThai(rs.getInt(8));
                list.add(nv);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return list;
    }

    @Override
    public int getIdNVByName(String ten) {
        String select = "SELECT Id FROM NhanVien WHERE Ten = '" + ten + "'";
        int id = 0;
        try {
            pstm = DBConnection.getConnection().prepareStatement(select);
            rs = pstm.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
                System.out.println(id);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return id;
    }

    @Override
    public boolean addNV(NhanVien nv) {
        String addDB = "insert into NhanVien (Ma,Ten,NgaySinh, GioiTinh, SDT, DiaChi, TrangThai) values (?, ?, ?, ?, ?, ?, ?)";
        try {
            pstm = DBConnection.getConnection().prepareStatement(addDB);
            pstm.setObject(1, nv.getMa());
            pstm.setObject(2, nv.getTen());
            pstm.setObject(3, nv.getNgaySinh());
            pstm.setObject(4, nv.getGioiTinh());
            pstm.setObject(5, nv.getSDT());
            pstm.setObject(6, nv.getDiaChi());
            pstm.setObject(7, nv.getTrangThai());
            pstm.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.getMessage();
            return false;
        }
    }

    @Override
    public boolean updateNV(NhanVien nv) {
        String updateNV = "update NhanVien set Ten=?, NgaySinh=?, GioiTinh=?, SDT=?, DiaChi=?, TrangThai=? where Ma = ?";
        try {
            pstm = DBConnection.getConnection().prepareStatement(updateNV);
            pstm.setObject(1, nv.getTen());
            pstm.setObject(2, nv.getNgaySinh());
            pstm.setObject(3, nv.getGioiTinh());
            pstm.setObject(4, nv.getSDT());
            pstm.setObject(5, nv.getDiaChi());
            pstm.setObject(6, nv.getTrangThai());
            pstm.setObject(7, nv.getMa());
            pstm.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    @Override
    public boolean deleteNV(String ma) {
        String deleteNV = "delete from NhanVien where Ma = ?";
        try {
            pstm = DBConnection.getConnection().prepareStatement(deleteNV);
            pstm.setObject(1, ma);
            pstm.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        new NhanVienRepository().getIdNVByName("Kien");
    }

}
