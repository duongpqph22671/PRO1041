/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domainmodel.Hang;
import domainmodel.OCung;
import domainmodel.VGA;
import java.util.List;
import repository.OcungRepository;
import repository.VGARepository;

/**
 *
 * @author admin
 */
public class VGAService implements IVGAService{
      VGARepository vR = new VGARepository();
    @Override
    public List<VGA> getListV() {
       return vR.getListDB();
    }

    @Override
    public VGA getV(String ma) {
       return vR.getDB(ma);
    }

    @Override
    public boolean addV(VGA v) {
       return vR.addV(v);
    }

    @Override
    public boolean updateV(VGA v) {
        return vR.updateV(v);
    }

    @Override
    public boolean deleteV(VGA v) {
        return vR.deleteV(v);
    }
}
