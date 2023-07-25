/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import domainmodel.MauSac;
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
public class MauSacRepository implements IMauSacRepository {

    DBConnection dBConnect = new DBConnection();
    PreparedStatement ps = null;
    ResultSet rs = null;
    ArrayList list = new ArrayList();

    @Override
    public List<MauSac> getListDB() {
        String sql = "Select * from MauSac";
        List<MauSac> list = new ArrayList<>();
        try {
            ps = dBConnect.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new MauSac(rs.getInt(1), rs.getString(2), rs.getNString(3), rs.getInt(4)));
            }
            ps.close();
            rs.close();
            return list;
        } catch (SQLException ex) {
        }
        return list;
    }

    @Override
    public MauSac getMS(String ma) {
        String sql = "Select * from MauSac where Ma = ?";
        MauSac ms = null;
        try {
            ps = dBConnect.getConnection().prepareStatement(sql);
            ps.setObject(1, ma);
            rs = ps.executeQuery();
            while (rs.next()) {
                ms = new MauSac(rs.getInt(1), rs.getString(2), rs.getNString(3), rs.getInt(4));
            }
            return ms;

        } catch (SQLException ex) {
        }
        return ms;
    }

    @Override
    public boolean addMS(MauSac ms) {
        String sql = "insert into MauSac (Ma, Ten) values (?, ?)";
        try {
            ps = dBConnect.getConnection().prepareStatement(sql);
            ps.setObject(1, ms.getMa());
            ps.setObject(2, ms.getTen());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    @Override
    public boolean updateMS(MauSac ms) {
        String sql = "update MauSac set Ma = ?, Ten = ? where Id = ?";
        try {
            ps = dBConnect.getConnection().prepareStatement(sql);
            ps.setObject(1, ms.getMa());
            ps.setObject(2, ms.getTen());
            ps.setObject(3, ms.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    @Override
    public boolean deleteMS(MauSac ms) {
        String sql = "delete from MauSac where Ma = ? ";
        try {
            ps = dBConnect.getConnection().prepareStatement(sql);
            ps.setObject(1, ms.getMa());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }

    }

}
