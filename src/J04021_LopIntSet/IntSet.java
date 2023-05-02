/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04021_LopIntSet;

import java.util.TreeSet;

/**
 *
 * @author admin
 */
public class IntSet {
    private TreeSet<Integer> ts = new TreeSet<>();

    public IntSet() {
    }
    
    public IntSet(int a[]){
        for(int i=0; i<a.length; i++){
            ts.add(a[i]);
        }
    }

    @Override
    public String toString() {
        String kq = "";
        for(Integer x: ts){
            kq = kq + x + " ";
        }
        return kq;
    }
    
    public IntSet union(IntSet a){
        IntSet u = new IntSet();
        u.ts.addAll(ts);
        u.ts.addAll(a.ts);
        return u;
    }
}
