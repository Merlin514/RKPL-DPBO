/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubesdpbo_kanggoliving;

/**
 *
 * @author Meliana
 */

import java.util.Date;
import java.text.SimpleDateFormat;

public class Inspection {
    private int inspectionId;
    private String result;
    private Date inspectionDate;

    public Inspection(int inspectionId, String result, Date inspectionDate) {
        this.inspectionId = inspectionId;
        this.result = result;
        this.inspectionDate = inspectionDate;
    }
    
    public boolean performInspection() {
        System.out.println("Inspection is being performed...");
        return true;
    }
    
    public void recordResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public int getInspectionId() {
        return inspectionId;
    }

    public Date getInspectionDate() {
        return inspectionDate;
    }
    
    public String getFormattedDate() {
        return new  SimpleDateFormat("dd MM yyyy, HH: mm").format(inspectionDate);
    }
}
