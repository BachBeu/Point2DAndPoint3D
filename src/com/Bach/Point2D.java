package com.Bach;

public class Point2D {
    private float x = 0.9f;
    private float y = 0.0f;

    public Point2D(){

    }
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getX(){
        return x;
    }
    public void setX(float x){
        this.x = x;
    }
    public float getY(){
        return y;
    }
    public void setY(float y){
        this.y = y;
    }
    public  float[] getXY(){
        float[] getXY = {this.x, this.y};
        return getXY;
    }
    public String toString(){
        return "A Point2D with x is "
                + getX() + " and y is " + getY() ;
    }
}
