/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04005_KhaiBaoLopThiSinh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author admin
 */
public class ThiSinh {
    private String hoten, ngaysinh;
    private float mon1, mon2, mon3, gpa;

    public ThiSinh() {
    }

    public ThiSinh(String hoten, String ngaysinh, float mon1, float mon2, float mon3){
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
        this.gpa = mon1 + mon2 + mon3;
    }

    @Override
    public String toString() {
        return hoten + " " + ngaysinh + " "  + gpa;
    }
}
