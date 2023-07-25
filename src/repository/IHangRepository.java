/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import domainmodel.Hang;
import java.util.List;

/**
 *
 * @author quyen
 */
public interface IHangRepository {

    public List<Hang> getListDB();

    public Hang getDB(String ma);

    public boolean addH(Hang h);

    public boolean updateH(Hang h);

    public boolean deleteH(Hang h);
}
