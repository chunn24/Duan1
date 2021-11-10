/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmsys.DTO;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class GiaoViec {
    private String TenCV;
    private int CayTrong;
    private int DanTrong;
    private  Date NgayBatDau;
    private  Date NgayKiemTra;
    private String NhanVien;
    private String GhiChu;
    
    public GiaoViec(){
    }

    public GiaoViec(String TenCV, int CayTrong, int DanTrong, Date NgayBatDau, Date NgayKiemTra, String NhanVien, String GhiChu) {
        this.TenCV = TenCV;
        this.CayTrong = CayTrong;
        this.DanTrong = DanTrong;
        this.NgayBatDau = NgayBatDau;
        this.NgayKiemTra = NgayKiemTra;
        this.NhanVien = NhanVien;
        this.GhiChu = GhiChu;
    }

    public String getTenCV() {
        return TenCV;
    }

    public void setTenCV(String TenCV) {
        this.TenCV = TenCV;
    }

    public int getCayTrong() {
        return CayTrong;
    }

    public void setCayTrong(int CayTrong) {
        this.CayTrong = CayTrong;
    }

    public int getDanTrong() {
        return DanTrong;
    }

    public void setDanTrong(int DanTrong) {
        this.DanTrong = DanTrong;
    }

    public Date getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(Date NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public Date getNgayKiemTra() {
        return NgayKiemTra;
    }

    public void setNgayKiemTra(Date NgayKiemTra) {
        this.NgayKiemTra = NgayKiemTra;
    }

    public String getNhanVien() {
        return NhanVien;
    }

    public void setNhanVien(String NhanVien) {
        this.NhanVien = NhanVien;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    
}


