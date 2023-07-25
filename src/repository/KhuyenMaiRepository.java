/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import domainmodel.KhuyenMai;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utility.DBConnection;

/**
 *
 * @author quyen
 */
public class KhuyenMaiRepository implements IKhuyenMaiRepository {

    PreparedStatement ps = null;
    ResultSet rs = null;
    DBConnection DBConnection;

    public KhuyenMaiRepository() {
        DBConnection = new DBConnection();
    }

    @Override
    public List<KhuyenMai> getListKhuyenMai() {
        String select = "SELECT * FROM KhuyenMai";
        List<KhuyenMai> list = new ArrayList<>();
        try {
            ps = DBConnection.getConnection().prepareStatement(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new KhuyenMai(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDate(4), rs.getDate(5), rs.getInt(6)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhuyenMaiRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<KhuyenMai> locByTT(int tt) {
        String select = "SELECT * FROM KhuyenMai WHERE TrangThai = " + tt + "";
        List<KhuyenMai> list = new ArrayList<>();
        try {
            ps = DBConnection.getConnection().prepareStatement(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new KhuyenMai(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDate(4), rs.getDate(5), rs.getInt(6)));
            }
            for (KhuyenMai khuyenMai : list) {
                System.out.println(khuyenMai.getId() + " " + khuyenMai.getMa() + " " + khuyenMai.getGiaTri() + " " + khuyenMai.getNgayTao() + " " + khuyenMai.getNgayHetHan() + " " + khuyenMai.getTrangThai());
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhuyenMaiRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Boolean insert(KhuyenMai km) {
        String insert = "INSERT INTO KhuyenMai(Ma, GiaTri, NgayTao, NgayHetHan, TrangThai) VALUES (?,?,?,?,?)";
        try {
            ps = DBConnection.getConnection().prepareStatement(insert);
            ps.setString(1, km.getMa());
            ps.setInt(2, km.getGiaTri());
            ps.setDate(3, new java.sql.Date(km.getNgayTao().getTime()));
            ps.setDate(4, new java.sql.Date(km.getNgayHetHan().getTime()));
            ps.setInt(5, km.getTrangThai());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.getMessage();
            return false;
        }
    }

    @Override
    public Boolean update(KhuyenMai km) {
        String update = "UPDATE KhuyenMai SET GiaTri =?, NgayTao =?, NgayHetHan =?, TrangThai=? WHERE Ma = ?";
        try {
            ps = DBConnection.getConnection().prepareStatement(update);
            ps.setInt(1, km.getGiaTri());
            ps.setDate(2, new java.sql.Date(km.getNgayTao().getTime()));
            ps.setDate(3, new java.sql.Date(km.getNgayHetHan().getTime()));
            ps.setInt(4, km.getTrangThai());
            ps.setString(5, km.getMa());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.getMessage();
            return false;
        }
    }

    @Override
    public Boolean delete(String ma) {
        String delete = "DELETE FROM KhuyenMai WHERE Ma = ?";
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
}
