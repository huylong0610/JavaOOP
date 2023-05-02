/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07014_HopGiao2FileVanBan;

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
        while(sc.hasNext()){
            String word = sc.next().toLowerCase();
            ts.add(word);
        }
    }

    public WordSet() {
    }

    public String union(WordSet ws1){
        WordSet u = new WordSet();
        u.ts.addAll(ws1.ts);
        u.ts.addAll(ts);
        String str = "";
        for(String word: u.ts){
            str += word + " ";
        }
        return str.trim();
    }
    
    public String intersection(WordSet ws1){
        WordSet u = new WordSet();
        u.ts.addAll(ts);
        u.ts.retainAll(ws1.ts);
        String str = "";
        for(String word: u.ts){
            str += word + " ";
        }
        return str.trim();
    }
}
