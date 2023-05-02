/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07054_TinhDiemTrungBinh;

import java.util.StringTokenizer;

/**
 *
 * @author admin
 */
public class SinhVien implements Comparable<SinhVien>{
    private String ma;
    private String hoten;
    private int xephang;
    private float diemtb;

    public SinhVien(int id, String hoten, float diem1, float diem2, float diem3) {
        this.ma = "SV" + String.format("%02d", id);
        this.hoten = chuanHoa(hoten);
        this.diemtb = ((diem1 * 3 + diem2 * 3 + diem3 * 2)/8);
    }

    public float getDiemtb() {
        return diemtb;
    }

    public void setXephang(int xephang) {
        this.xephang = xephang;
    }
    
    private String chuanHoa(String s){
        StringBuilder kq = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        
        while(st.hasMoreTokens()){
            String t = st.nextToken();
            kq.append(Character.toUpperCase(t.charAt(0)));
            for(int i=1; i<t.length(); i++){
                kq.append(Character.toLowerCase(t.charAt(i)));
            }
            kq.append(" ");
        }
        return kq.toString().trim();
    }

    @Override
    public String toString() {
        return ma + " " + hoten + " " + String.format("%.2f", diemtb) + " " + xephang;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(diemtb < o.diemtb) return 1;
        if(diemtb > o.diemtb) return -1;
        return ma.compareTo(o.ma);
    }

}
