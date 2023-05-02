/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05081_DanhSachMatHang;

/**
 *
 * @author admin
 */
public class MatHang implements Comparable<MatHang>{
    private String ma, tenmh, donvi;
    private int giamua, giaban;
    private int loinhuan;

    public MatHang(int id, String tenmh, String donvi, int giamua, int giaban) {
        this.ma = "MH" + String.format("%03d", id);
        this.tenmh = tenmh;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
        this.loinhuan = giaban - giamua;
    }

    public MatHang() {
    }

    @Override
    public String toString() {
        return ma + " " + tenmh + " " + donvi + " " + giamua + " " + giaban + " " + loinhuan;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }
    
    @Override
    public int compareTo(MatHang o) {
        if(this.loinhuan > o.loinhuan) return -1;
        if(this.loinhuan < o.loinhuan) return 1;
        if(this.loinhuan == o.loinhuan){
            int m1 = Integer.parseInt(this.ma.substring(2));
            int m2 = Integer.parseInt(o.ma.substring(2));
            if(m1 > m2) return 1;
            if(m1 < m2) return -1;
        }
        return 0;
    }
    
    
}
