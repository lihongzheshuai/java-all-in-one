package com.coderli.one.quiz.aug24;

import java.util.HashSet;

/**
 * 问题：这段代码输出什么？为什么？
 * 本题考察HashSet中对象去重的原理。引申至对hashCode方法的理解。
 * @site https://www.coderli.com
 */
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