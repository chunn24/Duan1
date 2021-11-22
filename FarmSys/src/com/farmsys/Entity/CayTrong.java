/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmsys.Entity;

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
    private String hinh;

    public CayTrong(int maCay, String tenCay, int thoiGianThuHoach, float doTDS, float doPH, float nhietDo, float doAm, String hinh) {
        this.maCay = maCay;
        this.tenCay = tenCay;
        this.thoiGianThuHoach = thoiGianThuHoach;
        this.doTDS = doTDS;
        this.doPH = doPH;
        this.nhietDo = nhietDo;
        this.doAm = doAm;
        this.hinh = hinh;
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

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    @Override
    public String toString() {
        return tenCay;
    }

}
