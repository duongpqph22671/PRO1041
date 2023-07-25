/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import domainmodel.VGA;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IVGAService {
        public List<VGA> getListV();

    public VGA getV(String ma);

    public boolean addV(VGA v);

    public boolean updateV(VGA v);

    public boolean deleteV(VGA v);
}
