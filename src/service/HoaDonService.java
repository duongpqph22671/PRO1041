/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domainmodel.HoaDon;
import java.util.List;
import repository.HoaDonRepository;

/**
 *
 * @author quyen
 */
public class HoaDonService implements IHoaDonService{
    
    HoaDonRepository hoaDonRepository = new HoaDonRepository();

    public HoaDonService() {
    }
    
    @Override
    public List<HoaDon> getListHoaDon() {
        return hoaDonRepository.getListHoaDon();
    }

    @Override
    public Boolean insert(HoaDon hd) {
        return hoaDonRepository.insert(hd);
    }

    @Override
    public Boolean update(HoaDon hd) {
        return hoaDonRepository.update(hd);
    }
    
}
