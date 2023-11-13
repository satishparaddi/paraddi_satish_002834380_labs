/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author psati
 */
public class Business {
    
    
    MasterOrderList masterOrderList;
    
    SupplierDirectory supplierDictory;
    
    public Business(){
        supplierDictory = new SupplierDirectory();
        masterOrderList = new MasterOrderList();
    }

    public MasterOrderList getMasterOrderList() {
        return masterOrderList;
    }

    public void setMasterOrderList(MasterOrderList masterOrderList) {
        this.masterOrderList = masterOrderList;
    }

    public SupplierDirectory getSupplierDictory() {
        return supplierDictory;
    }

    public void setSupplierDictory(SupplierDirectory supplierDictory) {
        this.supplierDictory = supplierDictory;
    }
    
}
