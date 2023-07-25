/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import domainmodel.MauSac;
import java.util.List;

/**
 *
 * @author quyen
 */
public interface IMauSacService {

    public List<MauSac> getListMS();

    public MauSac getMS(String ma);

    public boolean addMS(MauSac ms);

    public boolean updateMS(MauSac ms);

    public boolean deleteMS(MauSac ms);
}
