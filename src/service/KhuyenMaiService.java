/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domainmodel.KhuyenMai;
import java.util.List;
import repository.KhuyenMaiRepository;

/**
 *
 * @author quyen
 */
public class KhuyenMaiService implements IKhuyenMaiService {

    KhuyenMaiRepository khuyenMaiRepository = new KhuyenMaiRepository();

    public KhuyenMaiService() {
    }

    @Override
    public List<KhuyenMai> getListKhuyenMai() {
        return khuyenMaiRepository.getListKhuyenMai();
    }

    @Override
    public List<KhuyenMai> locByTT(int tt) {
        return khuyenMaiRepository.locByTT(tt);
    }

    @Override
    public String insert(KhuyenMai km) {
        if (khuyenMaiRepository.insert(km)) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String update(KhuyenMai km) {
        if (khuyenMaiRepository.update(km)) {
            return "Sửa thành công";
        }
        return "Sửa thất bại";
    }

    @Override
    public String delete(String ma) {
        if (khuyenMaiRepository.delete(ma)) {
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }

}
