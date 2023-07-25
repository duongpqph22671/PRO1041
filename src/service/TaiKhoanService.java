/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domainmodel.TaiKhoan;
import repository.TaiKhoanRepository;

/**
 *
 * @author admin
 */
public class TaiKhoanService implements ITaiKhoanService {

    TaiKhoanRepository taiKhoanRepository = new TaiKhoanRepository();

    public TaiKhoanService() {
    }

    @Override
    public TaiKhoan getChucVu(String username, String password) {
        return taiKhoanRepository.getChucVu(username, password);
    }

    @Override
    public String update(TaiKhoan taiKhoan) {
        if (taiKhoanRepository.update(taiKhoan)) {
            return "Đổi thành công";
        }
        return "Đổi thất bại";
    }

}
