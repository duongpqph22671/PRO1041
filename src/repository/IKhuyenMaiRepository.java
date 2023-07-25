/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import domainmodel.KhuyenMai;
import java.util.Date;
import java.util.List;

/**
 *
 * @author quyen
 */
public interface IKhuyenMaiRepository {

    public List<KhuyenMai> getListKhuyenMai();

    public List<KhuyenMai> locByTT(int tt);

    public Boolean insert(KhuyenMai km);

    public Boolean update(KhuyenMai km);

    public Boolean delete(String ma);
}
