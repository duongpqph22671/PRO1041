/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import domainmodel.TaiKhoan;
import utility.DBConnection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author quyen
 */
public class TaiKhoanRepository implements ITaiKhoanRepository {

    DBConnection dBConnection;
    PreparedStatement ps = null;
    Statement st = null;
    ResultSet rs = null;
    TaiKhoan taiKhoan = null;

    public TaiKhoanRepository() {
        dBConnection = new DBConnection();
    }

    @Override
    public TaiKhoan getChucVu(String username, String password) {
        String select = "select * from TaiKhoan where TaiKhoan = '" + username + "' and MatKhau = '" + password + "'";
        try {
            st = dBConnection.getConnection().createStatement();
            rs = st.executeQuery(select);
            while (rs.next()) {
                taiKhoan = new TaiKhoan(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return taiKhoan;
    }

    @Override
    public Boolean update(TaiKhoan taiKhoan) {
        String update = "UPDATE TaiKhoan SET MatKhau = ? WHERE TaiKhoan = ?";
        try {
            ps = dBConnection.getConnection().prepareStatement(update);
            ps.setString(1, taiKhoan.getPassWord());
            ps.setString(2, taiKhoan.getUserName());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
}
