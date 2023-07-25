/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import domainmodel.ChiTietHoaDon;
import domainmodel.HoaDon;
import domainmodel.KhachHang;
import domainmodel.KhuyenMai;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utility.DBConnection;


public class BanHangRepository implements IBanHangRepository {

    PreparedStatement ps = null;
    ResultSet rs = null;
    DBConnection DBConnection;

    public BanHangRepository() {
        DBConnection = new DBConnection();
    }

    @Override
    public List<KhachHang> getListNameKH() {
        String select = "SELECT Id, Ten, SDT FROM KhachHang";
        List<KhachHang> list = new ArrayList<>();
        try {
            ps = DBConnection.getConnection().prepareStatement(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setId(rs.getInt(1));
                kh.setTen(rs.getNString(2));
                kh.setsDT(rs.getString(3));
                list.add(kh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BanHangRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<KhuyenMai> getListGiaTri() {
        String select = "SELECT Id, GiaTri FROM KhuyenMai";
        List<KhuyenMai> list = new ArrayList<>();
        try {
            ps = DBConnection.getConnection().prepareStatement(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                KhuyenMai kh = new KhuyenMai();
                kh.setId(rs.getInt(1));
                kh.setGiaTri(rs.getInt(2));
                list.add(kh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BanHangRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public int getSoLuongById(int id) {
        String select = "SELECT SLTon FROM SanPham WHERE Id = " + id + "";
        int soluong = 0;
        try {
            ps = DBConnection.getConnection().prepareStatement(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                soluong = rs.getInt(1);
                System.out.println(soluong);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BanHangRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return soluong;
    }

    @Override
    public Boolean insert(ChiTietHoaDon cthd) {
        String insert = "INSERT INTO ChiTietHoaDon(IdSP, IdHoaDon, IdKM, SoLuong, DonGia, TrangThai) VALUES (?,?,?,?,?,?)";
        try {
            ps = DBConnection.getConnection().prepareStatement(insert);
            ps.setInt(1, cthd.getIdSP());
            ps.setInt(2, cthd.getIdHoaDon());
            ps.setInt(3, cthd.getIdKM());
            ps.setInt(4, cthd.getSoLuong());
            ps.setDouble(5, cthd.getDonGia());
            ps.setInt(6, cthd.getTrangThai());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.getMessage();
            return false;
        }
    }

    @Override
    public Boolean update(int id, HoaDon hoaDon) {
        String update = "UPDATE HoaDon SET IdNV =?, IdKH =?, Ma =?, NgayThanhToan =?, TongTien =?, TrangThai =? WHERE Id =?";
        try {
            ps = DBConnection.getConnection().prepareStatement(update);
            ps.setInt(1, hoaDon.getIdNV());
            ps.setInt(2, hoaDon.getIdKH());
            ps.setString(3, hoaDon.getMa());
            ps.setDate(4, new java.sql.Date(hoaDon.getNgayThanhToan().getTime()));
            ps.setDouble(5, hoaDon.getTongtien());
            ps.setInt(6, hoaDon.getTrangThai());
            ps.setInt(7, id);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.getMessage();
            return false;
        }
    }

    public static void main(String[] args) {
        new BanHangRepository().getSoLuongById(1);
    }

}
