/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import domainmodel.Hang;
import domainmodel.OCung;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IOcungRepository {
    
    public List<OCung> getListDB();

    public OCung getDB(String ma);

    public boolean addO(OCung o);

    public boolean updateO(OCung o);

    public boolean deleteO(OCung o);
}
