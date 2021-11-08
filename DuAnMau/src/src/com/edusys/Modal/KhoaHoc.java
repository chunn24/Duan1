/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.Modal;

import java.sql.Date;
import java.util.InputMismatchException;

/**
 *
 * @author ASUS
 */
public class KhoaHoc {
    int maKH;
    String maCD;
    Double hocPhi;
    int thoiLuong;
    Date ngayKG;
    String ghiChu;
    String maNV;
    Date ngayTao;

    public KhoaHoc() {
    }

    public KhoaHoc(int maKH, String maCD, Double hocPhi, int thoiLuong, Date ngayKG, String ghiChu, String maNV, Date ngayTao) {
        this.maKH = maKH;
        this.maCD = maCD;
        this.hocPhi = hocPhi;
        this.thoiLuong = thoiLuong;
        this.ngayKG = ngayKG;
        this.ghiChu = ghiChu;
        this.maNV = maNV;
        this.ngayTao = ngayTao;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        if (maKH <0 ) {
            throw new InputMismatchException("loi");
        }
        else{
        this.maKH = maKH;
        }
        
    }

    public String getMaCD() {
        return maCD;
    }

    public void setMaCD(String maCD) {
        this.maCD = maCD;
    }

    public Double getHocPhi() {
        
        return hocPhi;
    }

    public void setHocPhi(Double hocPhi) {
        if (hocPhi <0 ) {
            throw new InputMismatchException("loi");
        }
        else{
        this.hocPhi = hocPhi;
        }
        
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        if (thoiLuong <0 ) {
            throw new InputMismatchException("loi");
        }
        else{
        this.thoiLuong = thoiLuong;
        }
        
    }

    public Date getNgayKG() {
        return ngayKG;
    }

    public void setNgayKG(Date ngayKG) {
        this.ngayKG = ngayKG;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }
	
}
