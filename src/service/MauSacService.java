/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domainmodel.MauSac;
import java.util.List;
import repository.MauSacRepository;

/**
 *
 * @author quyen
 */
public class MauSacService implements IMauSacService {

    private final MauSacRepository msR = new MauSacRepository();

    @Override
    public List<MauSac> getListMS() {
        return this.msR.getListDB();
    }

    @Override
    public MauSac getMS(String ma) {
        return this.msR.getMS(ma);
    }

    @Override
    public boolean addMS(MauSac ms) {
        return this.msR.addMS(ms);
    }

    @Override
    public boolean updateMS(MauSac ms) {
        return this.msR.updateMS(ms);
    }

    @Override
    public boolean deleteMS(MauSac ms) {
        return this.msR.deleteMS(ms);
    }

}
