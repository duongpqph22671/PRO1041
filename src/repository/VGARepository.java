/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import domainmodel.Hang;
import domainmodel.OCung;
import domainmodel.VGA;
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
public class VGARepository implements IVGARepository {

    PreparedStatement ps = null;
    ResultSet rs = null;
    DBConnection dBConnect = new DBConnection();
    ArrayList list;

    @Override
    public List<VGA> getListDB() {
        String selectDB = "select * from VGA";
        list = new ArrayList();
        try {
            ps = dBConnect.getConnection().prepareStatement(selectDB);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new VGA(rs.getInt(1), rs.getString(2), rs.getNString(3), rs.getInt(4)));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(HangRepository.class.getName()).log(Level.SEVERE, null, ex);
            return list;
        }
    }

    @Override
    public VGA getDB(String ma) {
        String selectDB = "select * from VGA where ma = ?";
        VGA v = null;
        try {
            ps = dBConnect.getConnection().prepareStatement(selectDB);
            ps.setObject(1, ma);
            rs = ps.executeQuery();
            while (rs.next()) {
                v = new VGA(rs.getInt(1), rs.getString(2), rs.getNString(3), rs.getInt(4));
            }
            return v;
        } catch (SQLException ex) {
            Logger.getLogger(OcungRepository.class.getName()).log(Level.SEVERE, null, ex);
            return v;
        }
    }

    @Override
    public boolean addV(VGA v) {
        String addDB = "insert into VGA (Ma,Ten) values (?, ?)";
        try {
            ps = dBConnect.getConnection().prepareStatement(addDB);
            ps.setObject(1, v.getMa());
            ps.setObject(2, v.getTen());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(OcungRepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean updateV(VGA v) {
        String updateDB = "update VGA set Ma = ?,ten = ? where Id = ?";
        try {
            ps = dBConnect.getConnection().prepareStatement(updateDB);
            ps.setObject(1, v.getMa());
            ps.setObject(2, v.getTen());
            ps.setObject(3, v.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(OcungRepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean deleteV(VGA v) {
        String deleteDB = "delete from VGA where Ma = ?";
        try {
            ps = dBConnect.getConnection().prepareStatement(deleteDB);
            ps.setObject(1, v.getMa());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(OcungRepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
