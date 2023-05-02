/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05009_ThuKhoaCuaKyThi;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> list = new ArrayList<>();
        
        for(int i=1; i<=n; i++){
            ThiSinh ts = new ThiSinh(Integer.toString(i), sc.nextLine(), sc.nextLine(), 
                    Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            list.add(ts);
        }
        Collections.sort(list);
        float max = list.get(0).getTongdiem();
        
        for(ThiSinh ts: list){
            if(ts.getTongdiem() == max){
                System.out.println(ts.toString());
            }
        }
    }
}
