package ua.bolzhelarskii.hw7;

import java.util.Arrays;
import java.util.Random;

public class Vector {
    private final double x;
    private final double y;
    private final double z;
    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void main(String[] args) {
        Vector firstVector = new Vector(1, 2, 3);
        System.out.println(firstVector);
        Vector secondVector = new Vector(3, 2, 5);
        System.out.println(secondVector);
        System.out.println("First vector length: " + firstVector.getLength());
        System.out.println("Vector product: " + firstVector.vectorProduct(secondVector));
        System.out.println("Vector sum: " + firstVector.add(secondVector));
        System.out.println("Vector diff: " + firstVector.substract(secondVector));
        System.out.println("Cos between vectors: " + firstVector.getCosBetween(secondVector));
        System.out.println(Arrays.toString(getRandomVectors(5)));
    }
    public static Vector[] getRandomVectors(int size){
        Vector[] vectors = new Vector[size];
        Random random = new Random();
        for (int i = 0; i < vectors.length; i++) {
            vectors[i] = new Vector(random.nextInt(100), random.nextInt(100),
                    random.nextInt(100));
        }
        return vectors;
    }
    public double getLength(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }
    public Vector vectorProduct(Vector vector){
        return new Vector(this.y*vector.z-this.z*vector.y,this.x*vector.z-this.z*vector.x,this.x*vector.y-this.y*vector.x);
    }
    public Vector add(Vector vector){
        return new Vector(this.x + vector.x, this.y + vector.y,this.z + vector.z);
    }
    public Vector substract(Vector vector){
        return new Vector(this.x - vector.x, this.y - vector.y, this.z - vector.z);
    }
    public double getCosBetween(Vector vector){
        return getScalarProduct(vector)/(this.getLength()*vector.getLength());
    }
    public double getScalarProduct(Vector vector){
        return this.x * vector.x + this.y * vector.y + this.z * vector.z;
    }
    @Override
    public String toString(){
        return "Vector{" +
                "x = " + x +
                ", y = " + y +
                ", z = " + z +
                '}';
    }
}
