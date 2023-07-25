/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import domainmodel.KhachHang;
import java.util.List;

/**
 *
 * @author quyen
 */
public interface IKhachHangRepository {

    public List<KhachHang> getListKhachHang();
    
    public List<KhachHang> getListKHByMa(String ma);

    public Boolean insert(KhachHang kh);

    public Boolean update(KhachHang kh);

    public Boolean delete(String ma);
}
