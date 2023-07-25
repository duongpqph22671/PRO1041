/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domainmodel.Hang;
import java.util.List;
import repository.HangRepository;

/**
 *
 * @author quyen
 */
public class HangService implements IHangService{
    HangRepository hR = new HangRepository();
    @Override
    public List<Hang> getListH() {
       return hR.getListDB();
    }

    @Override
    public Hang getH(String ma) {
       return hR.getDB(ma);
    }

    @Override
    public boolean addH(Hang h) {
       return hR.addH(h);
    }

    @Override
    public boolean updateH(Hang h) {
        return hR.updateH(h);
    }

    @Override
    public boolean deleteH(Hang h) {
        return hR.deleteH(h);
    }
    
}
