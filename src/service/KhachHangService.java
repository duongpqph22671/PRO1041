/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domainmodel.KhachHang;
import java.util.List;
import repository.KhachHangRepository;

/**
 *
 * @author quyen
 */
public class KhachHangService implements IKhachHangService {

    KhachHangRepository khRepo = new KhachHangRepository();

    public KhachHangService() {
    }

    @Override
    public List<KhachHang> getListKhachHang() {
        return khRepo.getListKhachHang();
    }

    @Override
    public List<KhachHang> getListKHByMa(String ma) {
        return khRepo.getListKHByMa(ma);
    }

    @Override
    public String insert(KhachHang kh) {
        if (khRepo.insert(kh)) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String update(KhachHang kh) {
        if (khRepo.update(kh)) {
            return "Sửa thành công";
        }
        return "Sửa thất bại";
    }

    @Override
    public String delete(String ma) {
        if (khRepo.delete(ma)) {
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }

}
