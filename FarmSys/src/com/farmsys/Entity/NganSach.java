/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farmsys.Entity;

/**
 *
 * @author ASUS
 */
public class NganSach {
    int MaNS ;
    float TongNganSach;
    
    public NganSach(){
        
    }

    public NganSach(int MaNS, float TongNganSach) {
        this.MaNS = MaNS;
        this.TongNganSach = TongNganSach;
    }

    public int getMaNS() {
        return MaNS;
    }

    public void setMaNS(int MaNS) {
        this.MaNS = MaNS;
    }

    public float getTongNganSach() {
        return TongNganSach;
    }

    public void setTongNganSach(float TongNganSach) {
        this.TongNganSach = TongNganSach;
    }
    
}
