/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.List;
import viewmodel.QLHoaDon;
import viewmodel.QLHoaDonChiTiet;

/**
 *
 * @author quyen
 */
public interface IHoaDonChiTietRepository {

    public List<QLHoaDon> getListHoaDon();

    public List<QLHoaDonChiTiet> getListHoaDonChiTiet(String ma);

    public List<QLHoaDon> filterHoaDonByNameNV(String ten);

    public List<QLHoaDon> filterHoaDonByTrangThai(int trangThai);

    public List<QLHoaDon> filterHoaDonByNameAndDate(String ten, String ngay, String startDate, String endDate);
}
