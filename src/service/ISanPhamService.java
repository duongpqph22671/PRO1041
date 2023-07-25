/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import domainmodel.SanPham;
import java.util.List;
import viewmodel.SanPhamViewMD;

/**
 *
 * @author quyen
 */
public interface ISanPhamService {

    public List<SanPham> getListSPK();

    public List<SanPham> timKiemK(String ten);

    public Boolean update(String ma, int soluong);

    public List<SanPham> getListSP();

    public List<SanPhamViewMD> getListSPV();

    public SanPham getSP(String ma);

    public List<SanPhamViewMD> timKiem(String ten);

    public boolean insert(SanPham sp);

    public boolean update(SanPham sp);

    public boolean delete(SanPhamViewMD sp);
}
