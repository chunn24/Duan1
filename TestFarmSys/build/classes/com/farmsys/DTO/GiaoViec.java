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
    private int TenCV;
    private String CayTrong;
    private String DanTrong;
    private  Date NgayBatDau;
    private  Date NgayKiemTra;
    private String NhanVien;
    private String GhiChu;
    
    public GiaoViec(){
    }

    public GiaoViec(int TenCV, String CayTrong, String DanTrong, Date NgayBatDau, Date NgayKiemTra, String NhanVien, String GhiChu) {
        this.TenCV = TenCV;
        this.CayTrong = CayTrong;
        this.DanTrong = DanTrong;
        this.NgayBatDau = NgayBatDau;
        this.NgayKiemTra = NgayKiemTra;
        this.NhanVien = NhanVien;
        this.GhiChu = GhiChu;
    }

    public int getTenCV() {
        return TenCV;
    }

    public void setTenCV(int TenCV) {
        this.TenCV = TenCV;
    }

    public String getCayTrong() {
        return CayTrong;
    }

    public void setCayTrong(String CayTrong) {
        this.CayTrong = CayTrong;
    }

    public String getDanTrong() {
        return DanTrong;
    }

    public void setDanTrong(String DanTrong) {
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


