/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import domainmodel.RAM;
import java.util.List;

/**
 *
 * @author quyen
 */
public interface IRAMService {

    public List<RAM> getListRAM();

    public RAM getDB(String ma);

    public boolean add(RAM ram);

    public boolean update(RAM ram);

    public boolean del(RAM ram);
}
