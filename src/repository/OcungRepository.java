/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import domainmodel.Hang;
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
public class OcungRepository implements IOcungRepository {

    PreparedStatement ps = null;
    ResultSet rs = null;
    DBConnection dBConnect = new DBConnection();
    ArrayList list;

    @Override
    public List<OCung> getListDB() {
        String selectDB = "select * from OCung";
        list = new ArrayList();
        try {
            ps = dBConnect.getConnection().prepareStatement(selectDB);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new OCung(rs.getInt(1), rs.getString(2), rs.getNString(3), rs.getInt(4)));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(HangRepository.class.getName()).log(Level.SEVERE, null, ex);
            return list;
        }
    }

    @Override
    public OCung getDB(String ma) {
        String selectDB = "select * from OCung where ma = ?";
        OCung o = null;
        try {
            ps = dBConnect.getConnection().prepareStatement(selectDB);
            ps.setObject(1, ma);
            rs = ps.executeQuery();
            while (rs.next()) {
                o = new OCung(rs.getInt(1), rs.getString(2), rs.getNString(3), rs.getInt(4));
            }
            return o;
        } catch (SQLException ex) {
            Logger.getLogger(OcungRepository.class.getName()).log(Level.SEVERE, null, ex);
            return o;
        }
    }

    @Override
    public boolean addO(OCung o) {
        String addDB = "insert into OCung (Ma,Ten) values (?, ?)";
        try {
            ps = dBConnect.getConnection().prepareStatement(addDB);
            ps.setObject(1, o.getMa());
            ps.setObject(2, o.getTen());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(OcungRepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean updateO(OCung o) {
        String updateDB = "update OCung set Ma = ?,ten = ? where Id = ?";
        try {
            ps = dBConnect.getConnection().prepareStatement(updateDB);
            ps.setObject(1, o.getMa());
            ps.setObject(2, o.getTen());
            ps.setObject(3, o.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(OcungRepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean deleteO(OCung o) {
        String deleteDB = "delete from OCung where Ma = ?";
        try {
            ps = dBConnect.getConnection().prepareStatement(deleteDB);
            ps.setObject(1, o.getMa());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(OcungRepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
