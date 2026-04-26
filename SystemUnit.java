/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubesdpbo_kanggoliving;

/**
 *
 * @author Meliana
 */
public class SystemUnit {
    private int systemId;
    private String systemName;
    private String condition;
    private String serialNumber;

    public SystemUnit(int systemId, String systemName, String condition, String serialNumber) {
        this.systemId = systemId;
        this.systemName = systemName;
        this.condition = condition;
        this.serialNumber = serialNumber;
    }
    
    public String diagnose(){
        switch (condition.toLowerCase()) {
            case "Rusak" :                  return "KRITIS: " + systemName + "perlu perbaikan segera!";
            case "Baik" :                   return "OK: " + systemName + "Kondisi normal.";
            case "Dalam Perbaikan" :        return "INFO: " + systemName + "sedang diperbaiki. ";
            default:                        return "PERINGATAN: " + systemName + "perlu ngecekan. ";
        }
    }
    
    public void updateCondition(String condition) {
        this.condition = condition;
    }

    public int getSystemId() {
        return systemId;
    }

    public String getSystemName() {
        return systemName;
    }

    public String getCondition() {
        return condition;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return systemName + " [" + serialNumber + "]";
    }
    
    
}
