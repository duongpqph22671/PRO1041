/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import domainmodel.HoaDon;
import java.util.List;

/**
 *
 * @author quyen
 */
public interface IHoaDonRepository {

    public List<HoaDon> getListHoaDon();

    public Boolean insert(HoaDon hd);

    public Boolean update(HoaDon hd);
}
