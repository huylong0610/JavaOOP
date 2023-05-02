/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07059_DanhSachCaThi;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<CaThi> list = new ArrayList<>();
        for(int i=1; i<=n; i++){
            CaThi ct = new CaThi(i, sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(ct);
        }
        Collections.sort(list);
        for(CaThi x: list){
            System.out.println(x);
        }
    }
}
