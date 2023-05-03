package com.kelompok2;

public class Luas {
    private double tinggi;
    private double alas;

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public void setAlas(double alas){
        this.alas = alas;
    }

    public double getLuas(){
        return (this.tinggi * this.alas * 0.5);
    }
}
