/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import domainmodel.TaiKhoan;

/**
 *
 * @author admin
 */
public interface ITaiKhoanService {

    public TaiKhoan getChucVu(String username, String password);

    public String update(TaiKhoan taiKhoan);
}
