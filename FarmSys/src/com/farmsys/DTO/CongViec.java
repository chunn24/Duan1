/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmsys.DTO;

/**
 *
 * @author NguyenTrung
 */
public class CongViec {
    int MaCV;
    String TenCV;

    @Override
    public String toString() {
        return this.toString(); //To change body of generated methods, choose Tools | Templates.
    }


    public CongViec(int MaCV, String TenCV) {
        this.MaCV = MaCV;
        this.TenCV = TenCV;
    }

    public CongViec() {
    }

    public int getMaCV() {
        return MaCV;
    }

    public void setMaCV(int MaCV) {
        this.MaCV = MaCV;
    }

    public String getTenCV() {
        return TenCV;
    }

    public void setTenCV(String TenCV) {
        this.TenCV = TenCV;
    }
    
}