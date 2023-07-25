/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domainmodel.NhanVien;
import java.util.List;
import repository.NhanVienRepository;

/**
 *
 * @author quyen
 */
public class NhanVienService implements INhanVienService {

    NhanVienRepository nhanVienRepo = new NhanVienRepository();

    @Override
    public List<NhanVien> getListNV() {
        return nhanVienRepo.getListNhanVien();
    }

    @Override
    public List<NhanVien> getListNVByMa(String ma) {
        return nhanVienRepo.getListNhanVienByMa(ma);
    }

    @Override
    public int getIdNvByName(String ten) {
        return nhanVienRepo.getIdNVByName(ten);
    }

    @Override
    public String addNV(NhanVien nv) {
        if (nhanVienRepo.addNV(nv)) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String updateNV(NhanVien nv) {
        if (nhanVienRepo.updateNV(nv)) {
            return "Sửa thành công";
        }
        return "Sửa thất bại";
    }

    @Override
    public String deleteNV(String ma) {
        if (nhanVienRepo.deleteNV(ma)) {
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }

}
