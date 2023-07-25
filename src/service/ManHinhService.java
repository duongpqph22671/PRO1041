/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domainmodel.ManHinh;
import java.util.List;
import repository.ManHinhRepository;

/**
 *
 * @author admin
 */
public class ManHinhService implements IManHinhService {

    ManHinhRepository mR = new ManHinhRepository();

    @Override
    public List<ManHinh> getListM() {
        return mR.getListDB();
    }

    @Override
    public ManHinh getM(String ma) {
        return mR.getDB(ma);
    }

    @Override
    public boolean addM(ManHinh hinh) {
        return mR.addM(hinh);
    }

    @Override
    public boolean updateM(ManHinh hinh) {
        return mR.updateM(hinh);
    }

    @Override
    public boolean deleteM(ManHinh hinh) {
        return mR.deleteM(hinh);
    }

}
