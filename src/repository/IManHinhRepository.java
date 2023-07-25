/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import domainmodel.ManHinh;
import domainmodel.VGA;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IManHinhRepository {
    public List<ManHinh> getListDB();

    public ManHinh getDB(String ma);

    public boolean addM(ManHinh hinh);

    public boolean updateM(ManHinh hinh);

    public boolean deleteM(ManHinh hinh);
}
