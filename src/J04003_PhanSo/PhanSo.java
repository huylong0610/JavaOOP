/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04003_PhanSo;

/**
 *
 * @author admin
 */
public class PhanSo {
    private long tuso;
    private long mauso;

    public PhanSo() {
    }

    public PhanSo(long tuso, long mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
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

    @Override
    public String toString() {
        return tuso + "/" + mauso;
    }
    
    
}
