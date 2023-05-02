/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04019_Triangle;

import java.text.DecimalFormat;

/**
 *
 * @author admin
 */
public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle() {
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public boolean valid(){
        double area = 0.5 * (this.p1.getX() * (this.p2.getY() - this.p3.getY()) 
                + this.p2.getX() * (this.p3.getY() - this.p1.getY()) 
                + this.p3.getX() * (this.p1.getY() - this.p2.getY()));
        return area != 0;
    }
    
    public String getPerimeter(){
        double canh1 = Math.sqrt(Math.pow(this.p1.getX() - this.p2.getX(), 2) + Math.pow(this.p1.getY() - this.p2.getY(), 2));
        double canh2 = Math.sqrt(Math.pow(this.p1.getX() - this.p3.getX(), 2) + Math.pow(this.p1.getY() - this.p3.getY(), 2));
        double canh3 = Math.sqrt(Math.pow(this.p2.getX() - this.p3.getX(), 2) + Math.pow(this.p2.getY() - this.p3.getY(), 2));
        DecimalFormat df = new DecimalFormat("#0.000");
        return df.format(canh1+canh2+canh3);
    }
}
