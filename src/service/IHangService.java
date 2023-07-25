/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import domainmodel.Hang;
import java.util.List;

/**
 *
 * @author quyen
 */
public interface IHangService {

    public List<Hang> getListH();

    public Hang getH(String ma);

    public boolean addH(Hang h);

    public boolean updateH(Hang h);

    public boolean deleteH(Hang h);
}
