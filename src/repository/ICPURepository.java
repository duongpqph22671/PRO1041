/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import domainmodel.CPU;
import java.util.List;

/**
 *
 * @author quyen
 */
public interface ICPURepository {

    public List<CPU> getListDB();

    public CPU getDB(String ma);

    public boolean add(CPU cpu);

    public boolean update(CPU cpu);

    public boolean delete(CPU cpu);
}
