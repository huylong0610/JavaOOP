/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04022_WordSet;

import java.util.TreeSet;

/**
 *
 * @author admin
 */
public class WordSet {
    TreeSet<String> ts = new TreeSet<>();
    String[] s;

    public WordSet() {
    }
    
    public WordSet(String s) {
        this.s = s.toLowerCase().split(" ");
        for(String str: this.s){
            ts.add(str);
        }
    }
    
    public String union(WordSet ws1){
        WordSet u = new WordSet();
        u.ts.addAll(ts);
        u.ts.addAll(ws1.ts);
        String test = "";
        for(String str: u.ts){
            test += str + " ";
        }
        return test.trim();
    }
    
    public String intersection(WordSet ws1){
        WordSet u = new WordSet();
        u.ts.addAll(ts);
        u.ts.retainAll(ws1.ts);
        String test = "";
        for(String str: u.ts){
            test += str + " ";
        }
        return test.trim();
    }
}
