/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import repository.HoaDonChiTietRepository;
import viewmodel.QLHoaDon;
import viewmodel.QLHoaDonChiTiet;

/**
 *
 * @author quyen
 */
public class HoaDonChiTietService implements IHoaDonChiTietService {

    HoaDonChiTietRepository hoaDonRepo = new HoaDonChiTietRepository();

    public HoaDonChiTietService() {
    }

    @Override
    public List<QLHoaDon> getListHoaDon() {
        return hoaDonRepo.getListHoaDon();
    }

    @Override
    public List<QLHoaDonChiTiet> getListHoaDonChiTiet(String ma) {
        return hoaDonRepo.getListHoaDonChiTiet(ma);
    }

    @Override
    public List<QLHoaDon> filterHoaDonByNameNV(String ten) {
        return hoaDonRepo.filterHoaDonByNameNV(ten);
    }

    @Override
    public List<QLHoaDon> filterHoaDonByTrangThai(int trangThai) {
        return hoaDonRepo.filterHoaDonByTrangThai(trangThai);
    }

    @Override
    public List<QLHoaDon> filterHoaDonByNameAndDate(String ten, String ngay, String startDate, String endDate) {
        return hoaDonRepo.filterHoaDonByNameAndDate(ten, ngay, startDate, endDate);
    }
}
