/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domainmodel.CPU;
import java.util.List;
import repository.CPURepository;

/**
 *
 * @author quyen
 */
public class CPUService implements ICPUService {

    CPURepository cpuR = new CPURepository();

    @Override
    public List<CPU> getListCPU() {
        return cpuR.getListDB();
    }

    @Override
    public CPU getCPU(String ma) {
        return cpuR.getDB(ma);
    }

    @Override
    public boolean addCPU(CPU cpu) {
        return cpuR.add(cpu);
    }

    @Override
    public boolean updateCPU(CPU cpu) {
        return cpuR.update(cpu);
    }

    @Override
    public boolean delCPU(CPU cpu) {
        return cpuR.delete(cpu);
    }

}
