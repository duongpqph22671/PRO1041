/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import domainmodel.NhanVien;
import java.util.List;

/**
 *
 * @author quyen
 */
public interface INhanVienService {

    public List<NhanVien> getListNV();

    public List<NhanVien> getListNVByMa(String ma);

    public int getIdNvByName(String ten);

    public String addNV(NhanVien nv);

    public String updateNV(NhanVien nv);

    public String deleteNV(String ma);
}
