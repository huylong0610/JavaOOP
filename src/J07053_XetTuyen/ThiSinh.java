/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07053_XetTuyen;

import java.util.StringTokenizer;


/**
 *
 * @author admin
 */
public class ThiSinh {
    private String ma;
    private String hoten;
    private String namsinh;
    private double lythuyet, thuchanh;

    public ThiSinh(int id, String hoten, String namsinh, double lythuyet, double thuchanh) {
        this.ma = "PH" + String.format("%02d", id);
        this.hoten = chuanHoa(hoten);
        this.namsinh = namsinh.substring(namsinh.length()-4);
        this.lythuyet = lythuyet;
        this.thuchanh = thuchanh;
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
    
    private int tuoi(){
        return 2021 - Integer.parseInt(namsinh);
    }
    
    private int tongdiem(){
        double tb = (lythuyet + thuchanh) / 2;
        double diem = tb;
        if(lythuyet >= 8 && thuchanh >= 8){
            diem = tb + 1;
        }
        else if(lythuyet >= 7.5 && thuchanh >= 7.5){
            diem = tb + 0.5;
        }
        int tongdiem = (int) Math.round(diem);
        if(tongdiem > 10)   tongdiem = 10;
        return tongdiem;
    }
    
    private String xeploai(){
        if(tongdiem() < 5)  return "Truot";
        if(tongdiem() == 5 || tongdiem() == 6)  return "Trung binh";
        if(tongdiem() == 7) return "Kha";
        if(tongdiem() == 8) return "Gioi";
        return "Xuat sac";
    }
    
    @Override
    public String toString() {
        return ma + " " + hoten + " " + tuoi() + " " + tongdiem() + " " + xeploai();
    }
}