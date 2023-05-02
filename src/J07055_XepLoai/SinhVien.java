/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07055_XepLoai;

import java.util.StringTokenizer;

/**
 *
 * @author admin
 */
public class SinhVien implements Comparable<SinhVien>{
    private String ma;
    private String hoten;
    private int luyentap, thuchanh, thi;

    public SinhVien(int id, String hoten, int luyentap, int thuchanh, int thi) {
        this.ma = "SV" + String.format("%02d", id);
        this.hoten = chuanHoa(hoten);
        this.luyentap = luyentap;
        this.thuchanh = thuchanh;
        this.thi = thi;
    }
    
    private double tongdiem(){
        double tongdiem = luyentap*0.25 + thuchanh*0.35 + thi*0.4;
        return tongdiem;
    }
    
    private String xeploai(){
        if(tongdiem() < 5)  return "KEM";
        if(tongdiem() >= 5 && tongdiem() < 6.5) return "TRUNG BINH";
        if(tongdiem() >= 6.5 && tongdiem() < 8) return "KHA";
        return "GIOI";
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
        return ma + " " + hoten + " " + String.format("%.2f", tongdiem()) + " " + xeploai();
    }

    @Override
    public int compareTo(SinhVien o) {
        if(tongdiem() > o.tongdiem())   return -1;
        if(tongdiem() < o.tongdiem())   return 1;
        return 0;
    }
}
