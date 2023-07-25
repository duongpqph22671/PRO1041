/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domainmodel.Hang;
import domainmodel.OCung;
import java.util.List;
import repository.HangRepository;
import repository.OcungRepository;

/**
 *
 * @author admin
 */
public class OcungService implements IOcungService {

    OcungRepository oR = new OcungRepository();

    @Override
    public List<OCung> getListO() {
        return oR.getListDB();
    }

    @Override
    public OCung getO(String ma) {
        return oR.getDB(ma);
    }

    @Override
    public boolean addO(OCung o) {
        return oR.addO(o);
    }

    @Override
    public boolean updateO(OCung o) {
        return oR.updateO(o);
    }

    @Override
    public boolean deleteO(OCung o) {
        return oR.deleteO(o);
    }
}
