/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import domainmodel.KhachHang;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import utility.DBConnection;

/**
 *
 * @author quyen
 */
public class KhachHangRepository implements IKhachHangRepository {

    DBConnection DBConnection;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public KhachHangRepository() {
        DBConnection = new DBConnection();
    }

    @Override
    public List<KhachHang> getListKhachHang() {
        String select = "SELECT * FROM KhachHang";
        List<KhachHang> list = new ArrayList<>();
        try {
            ps = DBConnection.getConnection().prepareStatement(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new KhachHang(rs.getInt(1), rs.getString(2), rs.getNString(3), rs.getString(4), rs.getNString(5), rs.getString(6), rs.getNString(7), rs.getInt(8)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<KhachHang> getListKHByMa(String ma) {
        String select = "SELECT * FROM KhachHang WHERE Ten LIKE '%"+ma+"%'";
        List<KhachHang> list = new ArrayList<>();
        try {
            ps = DBConnection.getConnection().prepareStatement(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new KhachHang(rs.getInt(1), rs.getString(2), rs.getNString(3), rs.getString(4), rs.getNString(5), rs.getString(6), rs.getNString(7), rs.getInt(8)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Boolean insert(KhachHang kh) {
        String insert = "INSERT INTO KhachHang(Ma, Ten, NgaySinh, GioiTinh, SDT, DiaChi, TrangThai) VALUES (?,?,?,?,?,?,?)";
        try {
            ps = DBConnection.getConnection().prepareStatement(insert);
            ps.setString(1, kh.getMa());
            ps.setNString(2, kh.getTen());
            ps.setString(3, kh.getNgaySinh());
            ps.setNString(4, kh.getGioiTinh());
            ps.setString(5, kh.getsDT());
            ps.setNString(6, kh.getDiaChi());
            ps.setInt(7, kh.getTrangThai());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.getMessage();
            return false;
        }
    }

    @Override
    public Boolean update(KhachHang kh) {
        String update = "UPDATE KhachHang SET Ten=?, NgaySinh=?, GioiTinh=?, SDT=?, DiaChi=?, TrangThai=? WHERE Ma =?";
        try {
            ps = DBConnection.getConnection().prepareStatement(update);
            ps.setNString(1, kh.getTen());
            ps.setString(2, kh.getNgaySinh());
            ps.setNString(3, kh.getGioiTinh());
            ps.setString(4, kh.getsDT());
            ps.setNString(5, kh.getDiaChi());
            ps.setInt(6, kh.getTrangThai());
            ps.setString(7, kh.getMa());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.getMessage();
            return false;
        }
    }

    @Override
    public Boolean delete(String ma) {
        String delete = "DELETE FROM KhachHang WHERE Ma = ?";
        try {
            ps = DBConnection.getConnection().prepareStatement(delete);
            ps.setString(1, ma);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.getMessage();
            return false;
        }
    }

    public static void main(String[] args) {
        new KhachHangRepository().getListKHByMa("KH01");
    }

}
