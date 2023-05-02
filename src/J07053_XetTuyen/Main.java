/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07053_XetTuyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> list = new ArrayList<>();
        
        for(int i=1; i<=n; i++){
            ThiSinh ts = new ThiSinh(i, sc.nextLine(), sc.nextLine(), 
                    Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            list.add(ts);
        }
        
        for(ThiSinh ts: list){
            System.out.println(ts.toString());
        }
    }
}
