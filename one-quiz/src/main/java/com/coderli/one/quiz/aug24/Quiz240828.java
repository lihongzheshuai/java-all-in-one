package com.coderli.one.quiz.aug24;

import java.util.HashSet;

public class Quiz240828 {

    public static void main(String[] args) {
        HashSet<Point> set = new HashSet<>();
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);

        set.add(p1);
        set.add(p2);

        System.out.println("Set Size: " + set.size());
    }

}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}