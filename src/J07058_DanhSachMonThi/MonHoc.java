/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07058_DanhSachMonThi;

/**
 *
 * @author admin
 */
public class MonHoc implements Comparable<MonHoc>{
    private String maMon, tenMon, hinhthuc;

    public MonHoc(String maMon, String tenMon, String hinhthuc) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinhthuc = hinhthuc;
    }
    
    @Override
    public String toString() {
        return maMon + " " + tenMon + " " + hinhthuc;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.maMon.compareTo(o.maMon);
    }
}
