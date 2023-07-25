/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import domainmodel.ChiTietHoaDon;
import domainmodel.HoaDon;
import domainmodel.KhachHang;
import domainmodel.KhuyenMai;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IBanHangRepository {
    public List<KhachHang> getListNameKH();
    
    public List<KhuyenMai> getListGiaTri();
    
    public int getSoLuongById(int id);
    
    public Boolean insert(ChiTietHoaDon cthd);
    
    public Boolean update(int id, HoaDon hoaDon);
}
