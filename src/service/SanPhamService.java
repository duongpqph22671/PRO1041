/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domainmodel.SanPham;
import java.util.List;
import repository.SanPhamRepository;
import viewmodel.SanPhamViewMD;

/**
 *
 * @author quyen
 */
public class SanPhamService implements ISanPhamService {

    SanPhamRepository sanPhamRepository = new SanPhamRepository();

    public SanPhamService() {
    }

    @Override
    public List<SanPham> getListSP() {
        return sanPhamRepository.getListSanPham();
    }

    @Override
    public List<SanPhamViewMD> timKiem(String ten) {
        return sanPhamRepository.timKiem(ten);
    }

    @Override
    public boolean update(SanPham sp) {
        return sanPhamRepository.update(sp);
    }

    @Override
    public boolean insert(SanPham sp) {
        return sanPhamRepository.insert(sp);
    }

    @Override
    public boolean delete(SanPhamViewMD sp) {
        return sanPhamRepository.delete(sp);
    }

    @Override
    public List<SanPhamViewMD> getListSPV() {
        return sanPhamRepository.getListSPV();
    }

    @Override
    public SanPham getSP(String ma) {
        return sanPhamRepository.getSP(ma);
    }

    @Override
    public List<SanPham> getListSPK() {
        return sanPhamRepository.getListSanPham();
    }

    @Override
    public List<SanPham> timKiemK(String ten) {
        return sanPhamRepository.timKiemK(ten);
    }

    @Override
    public Boolean update(String ma, int soluong) {
        return sanPhamRepository.update(ma, soluong);
    }
}
