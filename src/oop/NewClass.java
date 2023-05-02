/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author admin
 */
public class NewClass {
    public static String chuanHoa(String s){
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
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "A001";
        String s2 = "A002";
        System.out.println(s1.compareTo(s2));
    }
}
