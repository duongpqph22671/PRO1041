/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import domainmodel.RAM;
import domainmodel.RAM;
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
public class RAMRepository implements IRAMRepository {

    PreparedStatement ps = null;
    ResultSet rs = null;
    DBConnection dBConnect = new DBConnection();
    ArrayList list = new ArrayList();

    public List<RAM> getListDB() {
        String selectDB = "select * from RAM";
        list = new ArrayList();
        try {
            ps = dBConnect.getConnection().prepareStatement(selectDB);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new RAM(rs.getInt(1), rs.getString(2), rs.getNString(3), rs.getInt(4)));
            }
            return list;
        } catch (SQLException ex) {
            return list;
        }
    }

    @Override
    public RAM getDB(String ma) {
        String selectDB = "select * from RAM where Ma = ?";
        RAM ram = null;
        try {
            ps = dBConnect.getConnection().prepareStatement(selectDB);
            ps.setObject(1, ma);
            rs = ps.executeQuery();
            while (rs.next()) {
                ram = new RAM(rs.getInt(1), rs.getString(2), rs.getNString(3), rs.getInt(4));
            }
            return ram;
        } catch (SQLException ex) {
            return ram;
        }
    }

    @Override
    public boolean add(RAM ram) {
        String addDB = "insert into RAM (Ma,Ten) values (?, ?)";
        try {
            ps = dBConnect.getConnection().prepareStatement(addDB);
            ps.setObject(1, ram.getMa());
            ps.setObject(2, ram.getTen());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    @Override
    public boolean update(RAM ram) {
        String updateDB = "update RAM set Ma = ?,Ten = ? where Id = ?";
        try {
            ps = dBConnect.getConnection().prepareStatement(updateDB);
            ps.setObject(1, ram.getMa());
            ps.setObject(2, ram.getTen());
            ps.setObject(3, ram.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    @Override
    public boolean del(RAM ram) {
        String deleteDB = "delete from RAM where Ma = ?";
        try {
            ps = dBConnect.getConnection().prepareStatement(deleteDB);
            ps.setObject(1, ram.getMa());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

}
