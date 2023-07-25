/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import domainmodel.SanPham;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utility.DBConnection;
import viewmodel.SanPhamViewMD;

/**
 *
 * @author quyen
 */
public class SanPhamRepository implements ISanPhamRepository {

    DBConnection dBConnection;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public SanPhamRepository() {
        dBConnection = new DBConnection();
    }

    @Override
    public List<SanPham> getListSanPham() {
        String select = "SELECT Id, IdMauSac, IdHang, IdRAM, IdCPU, IdOCung, IdVGA, IdManHinh,Ma,Ten, SLTon, GiaNhap, GiaBan FROM SanPham";
        List<SanPham> list = new ArrayList<>();
        try {
            ps = dBConnection.getConnection().prepareStatement(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sanPham = new SanPham();
                sanPham.setId(rs.getInt(1));
                sanPham.setIdMauSac(rs.getInt(2));
                sanPham.setIdHang(rs.getInt(3));
                sanPham.setIdRam(rs.getInt(4));
                sanPham.setIdCpu(rs.getInt(5));
                sanPham.setIdOCung(rs.getInt(6));
                sanPham.setIdVga(rs.getInt(7));
                sanPham.setIdManHinh(rs.getInt(8));
                sanPham.setMa(rs.getString(9));
                sanPham.setTen(rs.getNString(10));
                sanPham.setSLTon(rs.getInt(11));
                sanPham.setGiaNhap(rs.getDouble(12));
                sanPham.setGiaBan(rs.getDouble(13));

                list.add(sanPham);
            }
//            for (SanPham sanPham : list) {
//                System.out.println(sanPham.toString());
//            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<SanPhamViewMD> getListSPV() {
        String select = "SELECT SanPham.Id, MauSac.Ten, Hang.Ten, RAM.Ten, CPU.Ten, OCung.Ten, VGA.Ten, ManHinh.Ten, SanPham.Ma, SanPham.Ten,\n"
                + "  SanPham.SLTon, SanPham.GiaNhap, SanPham.GiaBan \n"
                + "  FROM MauSac, Hang, RAM, CPU, OCung, VGA, ManHinh, SanPham\n"
                + "  WHERE	(MauSac.Id=SanPham.IdMauSac) AND (Hang.Id = SanPham.IdHang) AND (RAM.Id = SanPham.IdRAM)\n"
                + "  AND (CPU.Id = SanPham.IdCPU) AND (OCung.Id = SanPham.IdOCung) AND ( VGA.Id = SanPham.IdVGA) AND (ManHinh.Id = SanPham.IdManHinh)";
        List<SanPhamViewMD> list = new ArrayList<>();
        try {
            ps = dBConnection.getConnection().prepareStatement(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                SanPhamViewMD sanPham = new SanPhamViewMD();
                sanPham.setId(rs.getInt(1));
                sanPham.setIdMauSac(rs.getString(2));
                sanPham.setIdHang(rs.getString(3));
                sanPham.setIdRam(rs.getString(4));
                sanPham.setIdCpu(rs.getString(5));
                sanPham.setIdOCung(rs.getString(6));
                sanPham.setIdVga(rs.getString(7));
                sanPham.setIdManHinh(rs.getString(8));
                sanPham.setMa(rs.getString(9));
                sanPham.setTen(rs.getNString(10));
                sanPham.setSLTon(rs.getInt(11));
                sanPham.setGiaNhap(rs.getDouble(12));
                sanPham.setGiaBan(rs.getDouble(13));

                list.add(sanPham);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public SanPham getSP(String ma) {
        String selectDB = "select * from SanPham where Ma = ?";
        SanPham sp = null;
        try {
            ps = dBConnection.getConnection().prepareStatement(selectDB);
            ps.setObject(1, ma);
            rs = ps.executeQuery();
            while (rs.next()) {
                sp = new SanPham(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6),
                        rs.getInt(7), rs.getInt(8), rs.getString(9), rs.getNString(10), rs.getInt(11),
                        rs.getDouble(12), rs.getDouble(13), rs.getInt(14));
            }
            return sp;
        } catch (SQLException ex) {
            return sp;
        }
    }

    @Override
    public List<SanPhamViewMD> timKiem(String ten) {
        String select = "SELECT SanPham.Id, MauSac.Ten, Hang.Ten, RAM.Ten, CPU.Ten, OCung.Ten, VGA.Ten, ManHinh.Ten, SanPham.Ma, SanPham.Ten,\n"
                + "  SanPham.SLTon, SanPham.GiaNhap, SanPham.GiaBan \n"
                + "  FROM MauSac, Hang, RAM, CPU, OCung, VGA, ManHinh, SanPham\n"
                + "  WHERE	(MauSac.Id=SanPham.IdMauSac) AND (Hang.Id = SanPham.IdHang) AND (RAM.Id = SanPham.IdRAM)\n"
                + "  AND (CPU.Id = SanPham.IdCPU) AND (OCung.Id = SanPham.IdOCung) AND ( VGA.Id = SanPham.IdVGA) AND (ManHinh.Id = SanPham.IdManHinh) AND SanPham.Ten = N'" + ten + "'";
        List<SanPhamViewMD> list = new ArrayList<>();
        try {
            ps = dBConnection.getConnection().prepareStatement(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                SanPhamViewMD sanPham = new SanPhamViewMD();
                sanPham.setId(rs.getInt(1));
                sanPham.setIdMauSac(rs.getString(2));
                sanPham.setIdHang(rs.getString(3));
                sanPham.setIdRam(rs.getString(4));
                sanPham.setIdCpu(rs.getString(5));
                sanPham.setIdOCung(rs.getString(6));
                sanPham.setIdVga(rs.getString(7));
                sanPham.setIdManHinh(rs.getString(8));
                sanPham.setMa(rs.getString(9));
                sanPham.setTen(rs.getNString(10));
                sanPham.setSLTon(rs.getInt(11));
                sanPham.setGiaNhap(rs.getDouble(12));
                sanPham.setGiaBan(rs.getDouble(13));

                list.add(sanPham);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public boolean insert(SanPham sp) {
        String addDB = "insert into SanPham (IdHang, IdCPU, IdRAM, IdOCung, IdVGA, IdManHinh, IdMauSac, Ma, Ten, SLTon, GiaNhap, GiaBan)\n"
                + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            ps = dBConnection.getConnection().prepareStatement(addDB);
            ps.setObject(1, sp.getIdHang());
            ps.setObject(2, sp.getIdCpu());
            ps.setObject(3, sp.getIdRam());
            ps.setObject(4, sp.getIdOCung());
            ps.setObject(5, sp.getIdVga());
            ps.setObject(6, sp.getIdManHinh());
            ps.setObject(7, sp.getIdMauSac());
            ps.setObject(8, sp.getMa());
            ps.setObject(9, sp.getTen());
            ps.setObject(10, sp.getSLTon());
            ps.setObject(11, sp.getGiaNhap());
            ps.setObject(12, sp.getGiaBan());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    @Override
    public boolean update(SanPham sp) {
        String updateDB = "UPDATE SanPham set IdHang= ?, IdCPU= ?, IdRAM= ?, IdOCung= ?, IdVGA= ?, IdManHinh= ?, "
                + "IdMauSac= ?, Ma= ?, Ten= ?, SLTon= ?, GiaNhap= ?, GiaBan= ? WHERE Id = ?";
        try {
            ps = dBConnection.getConnection().prepareStatement(updateDB);
            ps.setObject(1, sp.getIdHang());
            ps.setObject(2, sp.getIdCpu());
            ps.setObject(3, sp.getIdRam());
            ps.setObject(4, sp.getIdOCung());
            ps.setObject(5, sp.getIdVga());
            ps.setObject(6, sp.getIdManHinh());
            ps.setObject(7, sp.getIdMauSac());
            ps.setObject(8, sp.getMa());
            ps.setObject(9, sp.getTen());
            ps.setObject(10, sp.getSLTon());
            ps.setObject(11, sp.getGiaNhap());
            ps.setObject(12, sp.getGiaBan());
            ps.setObject(13, sp.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    @Override
    public boolean delete(SanPhamViewMD sp) {
        String deleteDB = "delete from SanPham where Ma = ?";
        try {
            ps = dBConnection.getConnection().prepareStatement(deleteDB);
            ps.setObject(1, sp.getMa());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    @Override
    public List<SanPham> getListSanPhamK() {
        String select = "SELECT Id, Ma, Ten, GiaBan, SLTon FROM SanPham";
        List<SanPham> list = new ArrayList<>();
        try {
            ps = dBConnection.getConnection().prepareStatement(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sanPham = new SanPham();
                sanPham.setId(rs.getInt(1));
                sanPham.setMa(rs.getString(2));
                sanPham.setTen(rs.getNString(3));
                sanPham.setGiaBan(rs.getDouble(4));
                sanPham.setSLTon(rs.getInt(5));
                list.add(sanPham);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<SanPham> timKiemK(String ten) {
        String select = "SELECT Id, Ma, Ten, GiaBan, SLTon FROM SanPham WHERE Ten = N'" + ten + "'";
        List<SanPham> list = new ArrayList<>();
        try {
            ps = dBConnection.getConnection().prepareStatement(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sanPham = new SanPham();
                sanPham.setId(rs.getInt(1));
                sanPham.setMa(rs.getString(2));
                sanPham.setTen(rs.getNString(3));
                sanPham.setGiaBan(rs.getDouble(4));
                sanPham.setSLTon(rs.getInt(5));
                list.add(sanPham);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Boolean update(String ma, int soluong) {
        String update = "UPDATE SanPham SET SLTon = ? WHERE Ma = ?";
        try {
            ps = dBConnection.getConnection().prepareStatement(update);
            ps.setInt(1, soluong);
            ps.setString(2, ma);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.getMessage();
            return false;
        }
    }
//
//    public static void main(String[] args) {
//        new SanPhamRepository().timKiem("Laptop Gaming");
//    }

}
