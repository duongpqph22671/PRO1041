/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import domainmodel.NhanVien;
import java.util.List;

/**
 *
 * @author quyen
 */
public interface INhanVienRepository {
    public List<NhanVien> getListNhanVien();
    
    public List<NhanVien> getListNhanVienByMa(String ma);
    
    public int getIdNVByName(String ten);
    
    public boolean addNV(NhanVien nv);

    public boolean updateNV(NhanVien nv);

    public boolean deleteNV(String ma);
}
