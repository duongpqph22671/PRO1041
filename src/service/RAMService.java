/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domainmodel.RAM;
import java.util.List;
import repository.RAMRepository;

/**
 *
 * @author quyen
 */
public class RAMService implements IRAMService {

    RAMRepository rR = new RAMRepository();

    @Override
    public List<RAM> getListRAM() {
        return rR.getListDB();
    }

    @Override
    public RAM getDB(String ma) {
       return rR.getDB(ma);
    }

    @Override
    public boolean add(RAM ram) {
       return rR.add(ram);
    }

    @Override
    public boolean update(RAM ram) {
        return rR.update(ram);
    }

    @Override
    public boolean del(RAM ram) {
       return rR.del(ram);
    }

}
