/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import domainmodel.TaiKhoan;

/**
 *
 * @author quyen
 */
public interface ITaiKhoanRepository {

    public TaiKhoan getChucVu(String username, String password);

    public Boolean update(TaiKhoan taiKhoan);
}
