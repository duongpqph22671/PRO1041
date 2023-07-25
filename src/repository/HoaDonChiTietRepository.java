/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utility.DBConnection;
import viewmodel.QLHoaDon;
import viewmodel.QLHoaDonChiTiet;

/**
 *
 * @author quyen
 */
public class HoaDonChiTietRepository implements IHoaDonChiTietRepository {

    PreparedStatement ps = null;
    ResultSet rs = null;
    DBConnection DBConnection;

    public HoaDonChiTietRepository() {
        DBConnection = new DBConnection();
    }

    @Override
    public List<QLHoaDon> getListHoaDon() {
        String select = "Select h.Ma, n.Ten, k.Ten, k.SDT, NgayTao, NgayThanhToan, TongTien, h.TrangThai From HoaDon h join NhanVien"
                + " n on h.IdNV = n.Id join KhachHang k on h.IdKH = k.Id";
        List<QLHoaDon> list = new ArrayList<>();
        try {
            ps = DBConnection.getConnection().prepareStatement(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                QLHoaDon qlhd = new QLHoaDon(rs.getString(1), rs.getNString(2), rs.getNString(3), rs.getString(4), rs.getDate(5), rs.getDate(6), rs.getDouble(7), rs.getInt(8));
                list.add(qlhd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonChiTietRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<QLHoaDonChiTiet> getListHoaDonChiTiet(String ma) {
        String select = "Select s.Ten, s.GiaBan, k.GiaTri, c.SoLuong, c.DonGia From ChiTietHoaDon c join SanPham s "
                + "on c.IdSP = s.Id join KhuyenMai k on c.IdKM = k.Id join HoaDon h on c.IdHoaDon = h.Id Where h.Ma = N'" + ma + "'";
        List<QLHoaDonChiTiet> list = new ArrayList<>();
        try {
            ps = DBConnection.getConnection().prepareStatement(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                QLHoaDonChiTiet qlhdct = new QLHoaDonChiTiet(rs.getNString(1), rs.getDouble(2), rs.getInt(3), rs.getInt(4), rs.getDouble(5));
                list.add(qlhdct);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonChiTietRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<QLHoaDon> filterHoaDonByNameNV(String ten) {
        String select = "Select h.Ma, n.Ten, k.Ten, k.SDT, NgayTao, NgayThanhToan, TongTien, h.TrangThai From HoaDon "
                + "h join NhanVien n on h.IdNV = n.Id join KhachHang k on h.IdKH = k.Id WHERE n.Ten LIKE N'%" + ten + "%'";
        List<QLHoaDon> list = new ArrayList<>();
        try {
            ps = DBConnection.getConnection().prepareStatement(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                QLHoaDon qlhd = new QLHoaDon(rs.getString(1), rs.getNString(2), rs.getNString(3), rs.getString(4), rs.getDate(5), rs.getDate(6), rs.getDouble(7), rs.getInt(8));
                list.add(qlhd);
            }

        } catch (SQLException ex) {
            Logger.getLogger(HoaDonChiTietRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<QLHoaDon> filterHoaDonByNameAndDate(String ten, String ngay, String startDate, String endDate) {
        String select = "Select h.Ma, n.Ten, k.Ten, k.SDT, NgayTao, NgayThanhToan, TongTien, h.TrangThai From HoaDon h join "
                + "NhanVien n on h.IdNV = n.Id join KhachHang k on h.IdKH = k.Id WHERE n.Ten LIKE N'%" + ten + "%' "
                + "and h." + ngay + " between '" + startDate + "' and '" + endDate + "'";
        List<QLHoaDon> list = new ArrayList<>();
        try {
            ps = DBConnection.getConnection().prepareStatement(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                QLHoaDon qlhd = new QLHoaDon(rs.getString(1), rs.getNString(2), rs.getNString(3), rs.getString(4), rs.getDate(5), rs.getDate(6), rs.getDouble(7), rs.getInt(8));
                list.add(qlhd);
            }
            for (QLHoaDon qLHoaDon : list) {
                System.out.println(qLHoaDon.toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonChiTietRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<QLHoaDon> filterHoaDonByTrangThai(int trangThai) {
        String select = "Select h.Ma, n.Ten, k.Ten, k.SDT, NgayTao, NgayThanhToan, TongTien, h.TrangThai From HoaDon "
                + "h join NhanVien n on h.IdNV = n.Id join KhachHang k on h.IdKH = k.Id WHERE h.TrangThai =  " + trangThai + "";
        List<QLHoaDon> list = new ArrayList<>();
        try {
            ps = DBConnection.getConnection().prepareStatement(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                QLHoaDon qlhd = new QLHoaDon(rs.getString(1), rs.getNString(2), rs.getNString(3), rs.getString(4), rs.getDate(5), rs.getDate(6), rs.getDouble(7), rs.getInt(8));
                list.add(qlhd);
            }
            for (QLHoaDon qLHoaDon : list) {
                System.out.println(qLHoaDon.toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonChiTietRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static void main(String[] args) {
        new HoaDonChiTietRepository().filterHoaDonByTrangThai(1);
    }
}
