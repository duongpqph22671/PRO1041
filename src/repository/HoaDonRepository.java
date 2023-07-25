/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import domainmodel.HoaDon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
public class HoaDonRepository implements IHoaDonRepository {

    PreparedStatement ps = null;
    ResultSet rs = null;
    DBConnection DBConnection;

    public HoaDonRepository() {
        DBConnection = new DBConnection();
    }

    @Override
    public List<HoaDon> getListHoaDon() {
        List<HoaDon> list = new ArrayList<>();
        String select = "SELECT * FROM HoaDon";
        try {
            ps = DBConnection.getConnection().prepareStatement(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new HoaDon(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getDate(5), rs.getDate(6), rs.getDouble(7), rs.getInt(8)));
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return list;
    }

    @Override
    public Boolean insert(HoaDon hd) {
        String insert = "INSERT INTO HoaDon(Ma, NgayTao, TrangThai, IdNV, IdKH) VALUES (?,?,?,?,?)";
//        String insert = "INSERT INTO HoaDon(Ma, NgayTao, TrangThai) VALUES(?,?,?)";
        try {
            ps = DBConnection.getConnection().prepareStatement(insert);
            ps.setString(1, hd.getMa());
            ps.setDate(2, new java.sql.Date(hd.getNgayTao().getTime()));
            ps.setInt(3, hd.getTrangThai());
            ps.setInt(4, hd.getIdNV());
            ps.setInt(5, hd.getIdKH());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    @Override
    public Boolean update(HoaDon hd) {
        String update = "UPDATE HoaDon SET IdNV = ?, IdKH =?, Ma = ?, NgayThanhToan = ?, TongTien = ?, TrangThai = ? WHERE Id = ?";
        try {
            ps = DBConnection.getConnection().prepareStatement(update);
            ps.setInt(1, hd.getIdNV());
            ps.setInt(2, hd.getIdKH());
            ps.setString(3, hd.getMa());
            ps.setDate(4, new java.sql.Date(hd.getNgayThanhToan().getTime()));
            ps.setDouble(5, hd.getTongtien());
            ps.setInt(6, hd.getTrangThai());
            ps.setInt(7, hd.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = dateFormat.parse("2022-11-10");
            Date date1 = dateFormat.parse("2022-12-12");
//            Date date2 = dateFormat.parse(new Date().toString());
            System.out.println(date.after(date1));
            System.out.println(date1.after(date));
            System.out.println(date.before(date1));
            System.out.println(date1.before(date));
            System.out.println(dateFormat.format(new Date()) instanceof String);
        } catch (ParseException ex) {
            Logger.getLogger(HoaDonRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
