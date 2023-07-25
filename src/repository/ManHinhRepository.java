/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import domainmodel.Hang;
import domainmodel.ManHinh;
import domainmodel.OCung;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utility.DBConnection;

/**
 *
 * @author admin
 */
public class ManHinhRepository implements IManHinhRepository{
    PreparedStatement ps = null;
    ResultSet rs = null;
    DBConnection dBConnect = new DBConnection();
    ArrayList list;

    @Override
    public List<ManHinh> getListDB() {
        String selectDB = "select * from ManHinh";
        list = new ArrayList();
        try {
            ps = dBConnect.getConnection().prepareStatement(selectDB);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new ManHinh(rs.getInt(1), rs.getString(2), rs.getNString(3),rs.getInt(4)));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(HangRepository.class.getName()).log(Level.SEVERE, null, ex);
            return list;
        }
    }

    @Override
    public ManHinh getDB(String ma) {
        String selectDB = "select * from ManHinh where ma = ?";
        ManHinh hinh = null;
        try {
            ps = dBConnect.getConnection().prepareStatement(selectDB);
            ps.setObject(1, ma);
            rs = ps.executeQuery();
            while (rs.next()) {
                hinh = new ManHinh(rs.getInt(1), rs.getString(2), rs.getNString(3),rs.getInt(4));
            }
            return hinh;
        } catch (SQLException ex) {
            Logger.getLogger(OcungRepository.class.getName()).log(Level.SEVERE, null, ex);
            return hinh;
        }
    }

    @Override
    public boolean addM(ManHinh hinh) {
        String addDB = "insert into ManHinh (Ma,Ten) values (?, ?)";
        try {
            ps = dBConnect.getConnection().prepareStatement(addDB);
            ps.setObject(1, hinh.getMa());
            ps.setObject(2, hinh.getTen());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(OcungRepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean updateM(ManHinh hinh) {
        String updateDB = "update ManHinh set Ma = ?,Ten = ? where Id = ?";
        try {
            ps = dBConnect.getConnection().prepareStatement(updateDB);
            ps.setObject(1, hinh.getMa());
            ps.setObject(2, hinh.getTen());
            ps.setObject(3, hinh.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(OcungRepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean deleteM(ManHinh hinh) {
        String deleteDB = "delete from ManHinh where Ma = ?";
        try {
            ps = dBConnect.getConnection().prepareStatement(deleteDB);
            ps.setObject(1, hinh.getMa());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(OcungRepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
