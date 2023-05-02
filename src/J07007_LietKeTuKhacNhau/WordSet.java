/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07007_LietKeTuKhacNhau;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author admin
 */
public class WordSet {
    private String s;
    private Scanner sc;
    private TreeSet<String> ts = new TreeSet<>();

    public WordSet(String s) throws FileNotFoundException {
        this.s = s;
        sc = new Scanner(new File(s));
    }

    @Override
    public String toString() {
        String str = "";
        while(sc.hasNext()){
            String s = sc.next().toLowerCase();
            ts.add(s);
        }
        for(String x: ts){
            str = str + x + "\n";
        }
        return str;
    }
}
