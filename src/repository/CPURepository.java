/*
 * Click nbfs://nbcpuost/SystemFileSystem/Templates/Licenses/license-default.txt to cCPUe tcpuis license
 * Click nbfs://nbcpuost/SystemFileSystem/Templates/Classes/Class.java to edit tcpuis template
 */
package repository;

import domainmodel.CPU;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utility.DBConnection;

/**
 *
 * @autcpuor quyen
 */
public class CPURepository implements ICPURepository {

    PreparedStatement ps = null;
    ResultSet rs = null;
    DBConnection dBConnect = new DBConnection();
    ArrayList list = new ArrayList();

    public List<CPU> getListDB() {
        String selectDB = "select * from CPU";
        list = new ArrayList();
        try {
            ps = dBConnect.getConnection().prepareStatement(selectDB);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new CPU(rs.getInt(1), rs.getString(2), rs.getNString(3), rs.getInt(4)));
            }
            return list;
        } catch (SQLException ex) {
            return list;
        }
    }

    @Override
    public CPU getDB(String ma) {
        String selectDB = "select * from CPU where Ma = ?";
        CPU cpu = null;
        try {
            ps = dBConnect.getConnection().prepareStatement(selectDB);
            ps.setObject(1, ma);
            rs = ps.executeQuery();
            while (rs.next()) {
                cpu = new CPU(rs.getInt(1), rs.getString(2), rs.getNString(3), rs.getInt(4));
            }
            return cpu;
        } catch (SQLException ex) {
            return cpu;
        }
    }

    @Override
    public boolean add(CPU cpu) {
        String addDB = "insert into CPU (Ma,Ten) values (?, ?)";
        try {
            ps = dBConnect.getConnection().prepareStatement(addDB);
            ps.setObject(1, cpu.getMa());
            ps.setObject(2, cpu.getTen());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    @Override
    public boolean update(CPU cpu) {
        String updateDB = "update CPU set Ma = ?,Ten = ? where Id = ?";
        try {
            ps = dBConnect.getConnection().prepareStatement(updateDB);
            ps.setObject(1, cpu.getMa());
            ps.setObject(2, cpu.getTen());
            ps.setObject(3, cpu.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    @Override
    public boolean delete(CPU cpu) {
        String deleteDB = "delete from CPU where Ma = ?";
        try {
            ps = dBConnect.getConnection().prepareStatement(deleteDB);
            ps.setObject(1, cpu.getMa());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

}
