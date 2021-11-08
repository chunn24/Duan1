/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmsys.DTO;

/**
 *
 * @author trieu
 */
public class CayTrong {
    private int maCay;
    private String tenCay;
    private int thoiGianThuHoach;
    private float doTDS;
    private float doPH;
    private float nhietDo;
    private float doAm;
    private String anh;

    public CayTrong(int maCay, String tenCay, int thoiGianThuHoach, float doTDS, float doPH, float nhietDo, float doAm, String anh) {
        this.maCay = maCay;
        this.tenCay = tenCay;
        this.thoiGianThuHoach = thoiGianThuHoach;
        this.doTDS = doTDS;
        this.doPH = doPH;
        this.nhietDo = nhietDo;
        this.doAm = doAm;
        this.anh = anh;
    }

    public CayTrong() {
    }

    public int getMaCay() {
        return maCay;
    }

    public void setMaCay(int maCay) {
        this.maCay = maCay;
    }

    public String getTenCay() {
        return tenCay;
    }

    public void setTenCay(String tenCay) {
        this.tenCay = tenCay;
    }

    public int getThoiGianThuHoach() {
        return thoiGianThuHoach;
    }

    public void setThoiGianThuHoach(int thoiGianThuHoach) {
        this.thoiGianThuHoach = thoiGianThuHoach;
    }

    public float getDoTDS() {
        return doTDS;
    }

    public void setDoTDS(float doTDS) {
        this.doTDS = doTDS;
    }

    public float getDoPH() {
        return doPH;
    }

    public void setDoPH(float doPH) {
        this.doPH = doPH;
    }

    public float getNhietDo() {
        return nhietDo;
    }

    public void setNhietDo(float nhietDo) {
        this.nhietDo = nhietDo;
    }

    public float getDoAm() {
        return doAm;
    }

    public void setDoAm(float doAm) {
        this.doAm = doAm;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }
    
    
}
