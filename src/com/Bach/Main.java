package com.Bach;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(3.5f, 5.6f);
        System.out.println(point2D);

        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(4.6f, 7.8f, 5.0f);
        System.out.println(point3D);
    }
}
