/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import domainmodel.Hang;
import domainmodel.OCung;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IOcungService {
      public List<OCung> getListO();

    public OCung getO(String ma);

    public boolean addO(OCung o);

    public boolean updateO(OCung o);

    public boolean deleteO(OCung o);
}

