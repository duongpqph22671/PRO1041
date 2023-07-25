/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import domainmodel.Hang;
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
 * @author quyen
 */
public class HangRepository implements IHangRepository {

    PreparedStatement ps = null;
    ResultSet rs = null;
    DBConnection dBConnect = new DBConnection();
    ArrayList list;

    @Override
    public List<Hang> getListDB() {
        String selectDB = "select * from Hang";
        list = new ArrayList();
        try {
            ps = dBConnect.getConnection().prepareStatement(selectDB);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Hang(rs.getInt(1), rs.getString(2), rs.getNString(3)));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(HangRepository.class.getName()).log(Level.SEVERE, null, ex);
            return list;
        }
    }

    @Override
    public Hang getDB(String ma) {
        String selectDB = "select * from Hang where ma = ?";
        Hang h = null;
        try {
            ps = dBConnect.getConnection().prepareStatement(selectDB);
            ps.setObject(1, ma);
            rs = ps.executeQuery();
            while (rs.next()) {
                h = new Hang(rs.getInt(1), rs.getString(2), rs.getNString(3));
            }
            return h;
        } catch (SQLException ex) {
            Logger.getLogger(HangRepository.class.getName()).log(Level.SEVERE, null, ex);
            return h;
        }
    }

    @Override
    public boolean addH(Hang h) {
        String addDB = "insert into Hang (Ma,Ten) values (?, ?)";
        try {
            ps = dBConnect.getConnection().prepareStatement(addDB);
            ps.setObject(1, h.getMa());
            ps.setObject(2, h.getTen());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(HangRepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean updateH(Hang h) {
        String updateDB = "update Hang set Ma = ?,ten = ? where Id = ?";
        try {
            ps = dBConnect.getConnection().prepareStatement(updateDB);
            ps.setObject(1, h.getMa());
            ps.setObject(2, h.getTen());
            ps.setObject(3, h.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(HangRepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean deleteH(Hang h) {
        String deleteDB = "delete from Hang where Ma = ?";
        try {
            ps = dBConnect.getConnection().prepareStatement(deleteDB);
            ps.setObject(1, h.getMa());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(HangRepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
