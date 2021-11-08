/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.Modal;

import java.util.InputMismatchException;

/**
 *
 * @author ASUS
 */
public class HocVien {
    int maHV;
    int maKH;
    String maNH;
    Double Diem;

    public HocVien() {
    }

    public HocVien(int maHV, int maKH, String maNH, Double Diem) {
        this.maHV = maHV;
        this.maKH = maKH;
        this.maNH = maNH;
        this.Diem = Diem;
    }

    public int getMaHV() {
        return maHV;
    }

    public void setMaHV(int maHV) {
           if (maHV < 0) {
            throw new InputMismatchException("loi");
        }
        else{
          this.maHV = maHV;
        }
       
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        if (maKH < 0) {
            throw new InputMismatchException("loi");
        }
        else{
         this.maKH = maKH;
        }
    }

    public String getMaNH() {
        return maNH;
    }

    public void setMaNH(String maNH) {
        this.maNH = maNH;
    }

    public Double getDiem() {
        return Diem;
    }

    public void setDiem(Double Diem) {
        this.Diem = Diem;
    }
	
}
