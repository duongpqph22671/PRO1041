/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import domainmodel.CPU;
import java.util.List;

/**
 *
 * @author quyen
 */
public interface ICPUService {

    public List<CPU> getListCPU();

    public CPU getCPU(String ma);

    public boolean addCPU(CPU cpu);

    public boolean updateCPU(CPU cpu);

    public boolean delCPU(CPU cpu);
}
