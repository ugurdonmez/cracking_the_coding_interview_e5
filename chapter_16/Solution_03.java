/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_16;

/**
 *
 * @author ugurdonmez
 */
public class Solution_03 {
    
    
    public static void main(String [] args){
        
        Line l1 = new Line(new Point(-1, -1), new Point(1, 1));
        Line l2 = new Line(new Point(-1, 1), new Point(1, -1));
        
        System.out.println(getIntersection(l1, l2));
        
    }
    
    public static Point getIntersection(Line l1, Line l2) {
        
        // no intersection
        if (l1.getSlope() == l2.getSlope()) {
            return null;
        }
        
        double x = (l2.getCoeff() - l1.getCoeff()) / (l1.getSlope() - l2.getSlope());
        double y = l1.getSlope() * x + l1.getCoeff();
        
        return new Point(x, y);
    }
    
    
}

class Line {
    
    private Point start;
    private Point end;

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }
    
    public double getSlope() {
        return (end.getY() - start.getY()) / (end.getX() - start.getX());
    }
    
    public double getCoeff() {
        return start.getY() - start.getX() * this.getSlope();
    }
    
    public boolean isInclude(Point p) {
        return p.getY() == p.getX() * this.getSlope() + this.getCoeff();
    }
    
}

class Point {
    
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "x = " + this.getX() + " y = " + this.getY();
    }
}
