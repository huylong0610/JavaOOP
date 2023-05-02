/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TN02015_ThongKeTuKhacNhau;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author admin
 */
public class WordSet {
    private Scanner sc;
    private TreeSet<String> ts = new TreeSet<>();

    public WordSet(Scanner sc) {
        this.sc = sc;
        while(sc.hasNext()){
            String s = sc.next().toLowerCase();
            ts.add(s);
        }
    }

    @Override
    public String toString() {
        String str = "";
        for(String x: ts){
            str = str + x + "\n";
        }
        return str;
    }
}
