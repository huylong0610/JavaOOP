/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05009_ThuKhoaCuaKyThi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author admin
 */
public class ThiSinh implements Comparable<ThiSinh>{
    private String id;
    private String hoten;
    private String ngaysinh;
    private float tongdiem;

    public ThiSinh(String id, String hoten, String ngaysinh, float diem1, float diem2, float diem3) throws ParseException {
        this.id = id;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.tongdiem = diem1 + diem2 + diem3;
    }

    public float getTongdiem() {
        return tongdiem;
    }

    @Override
    public String toString() {
        return id + " " + hoten + " " + ngaysinh + " " + String.format("%.1f", tongdiem);
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(tongdiem < o.tongdiem) return 1;
        if(tongdiem > o.tongdiem) return -1;
        return id.compareTo(o.id);
    } 
}
