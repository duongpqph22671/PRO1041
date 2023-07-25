/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import domainmodel.KhachHang;
import java.util.List;

/**
 *
 * @author quyen
 */
public interface IKhachHangService {

    public List<KhachHang> getListKhachHang();
    
    public List<KhachHang> getListKHByMa(String ma);

    public String insert(KhachHang kh);

    public String update(KhachHang kh);

    public String delete(String ma);
}
