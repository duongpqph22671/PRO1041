/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import domainmodel.KhuyenMai;
import java.util.List;

/**
 *
 * @author quyen
 */
public interface IKhuyenMaiService {

    public List<KhuyenMai> getListKhuyenMai();

    public List<KhuyenMai> locByTT(int tt);

    public String insert(KhuyenMai km);

    public String update(KhuyenMai km);

    public String delete(String ma);
}
