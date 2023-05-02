/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07059_DanhSachCaThi;

import java.text.ParseException;

/**
 *
 * @author admin
 */
public class CaThi implements Comparable<CaThi>{
    private String maCa, gioThi, phongThi;
    private String ngayThi;

    public CaThi(int id, String ngayThi, String gioThi, String phongThi){
        this.maCa = "C" + String.format("%03d", id);
        this.gioThi = gioThi;
        this.phongThi = phongThi;
        this.ngayThi = ngayThi;
    }

    @Override
    public String toString() {
        return maCa + " " + ngayThi + " " + gioThi + " " + phongThi;
    }

    @Override
    public int compareTo(CaThi o) {
        if(gioThi.compareTo(o.gioThi) > 0) return 1;
        if(gioThi.compareTo(o.gioThi) < 0) return -1;
        return maCa.compareTo(o.maCa);
    }
}
