/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TN02013_LopPhanSo;

/**
 *
 * @author admin
 */
public class PhanSo {
    private long tuso;
    private long mauso;

    public PhanSo(String s) {
        String[] str = s.split(" ");
        this.tuso = Long.parseLong(str[0]);
        this.mauso = Long.parseLong(str[1]);
    }

    public PhanSo() {
    }

    public long getTuso() {
        return tuso;
    }

    public void setTuso(long tuso) {
        this.tuso = tuso;
    }

    public long getMauso() {
        return mauso;
    }

    public void setMauso(long mauso) {
        this.mauso = mauso;
    }
    
    
    
    public PhanSo cong(PhanSo b){
        long ts = this.tuso * b.mauso + b.tuso * this.mauso;
        long ms = this.mauso * b.mauso;
        PhanSo c = new PhanSo();
        long ucln = ucln(ts, ms);
        c.setTuso(ts/ucln);
        c.setMauso(ms/ucln);
        return c;
    }
    
    public PhanSo nhan(PhanSo b){
        long ts = this.tuso * b.tuso;
        long ms =  this.mauso * b.mauso;
        PhanSo c = new PhanSo();
        long ucln = ucln(ts, ms);
        c.setTuso(ts/ucln);
        c.setMauso(ms/ucln);
        return c;
    }
    
    public long ucln(long a, long b){
        if(b == 0)  return a;
        return ucln(b, a%b);
    }

    @Override
    public String toString() {
        return tuso + "/" +mauso;
    }
}
