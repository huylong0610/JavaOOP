/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07052_DanhSachTrungTuyen;

import java.text.DecimalFormat;
import java.util.StringTokenizer;

/**
 *
 * @author admin
 */
public class ThiSinh implements Comparable<ThiSinh>{
    private String maTS, hoten;
    private float math, phy, chemis, khuvuc;
    private float tongdiem;

    public ThiSinh(String maTS, String hoten, float math, float phy, float chemis, float khuvuc) {
        this.maTS = maTS;
        this.hoten = hoten;
        this.math = math;
        this.phy = phy;
        this.chemis = chemis;
        this.khuvuc = khuvuc;
        this.tongdiem = 2*math + phy + chemis + khuvuc;
    }

    public float getTongdiem() {
        return tongdiem;
    }
    
    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("0.#");
        String kv = format.format(khuvuc);
        String tong = format.format(tongdiem);
        return maTS + " " + chuanHoa(hoten) + " " + kv + " " + tong + " ";
    }
    
    private String chuanHoa(String s){
        StringBuilder kq = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            String t = st.nextToken();
            kq.append(Character.toUpperCase(t.charAt(0)));
            for(int i=1;i<t.length();i++){
                kq.append(Character.toLowerCase(t.charAt(i)));
            }
            kq.append(" ");
        }
        return kq.toString().trim();
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(this.tongdiem > o.tongdiem) return -1;
        if(this.tongdiem < o.tongdiem) return 1;
        else{
            String sub1 = this.maTS.substring(3);
            String sub2 = o.maTS.substring(3);
            return sub1.compareTo(sub2);
        }
    }
}


