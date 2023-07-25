/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domainmodel.ChiTietHoaDon;
import domainmodel.HoaDon;
import domainmodel.KhachHang;
import domainmodel.KhuyenMai;
import java.util.List;
import repository.BanHangRepository;

/**
 *
 * @author admin
 */
public class BanHangService implements IBanHangService{

    BanHangRepository banhang = new BanHangRepository();
    @Override
    public List<KhachHang> getListNameKH() {
        return banhang.getListNameKH();
    }

    @Override
    public List<KhuyenMai> getListGiaTri() {
        return banhang.getListGiaTri();
    }
    
    @Override
    public int getSLById(int id) {
        return banhang.getSoLuongById(id);
    }

    @Override
    public Boolean insert(ChiTietHoaDon cthd) {
        return banhang.insert(cthd);
    }

    @Override
    public Boolean update(int id, HoaDon hoaDon) {
        return banhang.update(id, hoaDon);
    }

    
    
}
