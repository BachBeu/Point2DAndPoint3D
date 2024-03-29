package com.Bach;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D(){

    }
    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }
    public float getZ(){
        return z;
    }
    public void setZ(float z){
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        setX(x);
        setY(y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] getXYZ = {getX(), getY(), this.z};
        return getXYZ;
    }
    public String toString(){
        return "A Point3D with z is"
                + getZ() + ", which is a subclass of "
                + super.toString();
    }
}
