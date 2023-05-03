package com.kelompok2;

public class Keliling extends Luas {
    private double sisi1;
    private double sisi2;
    private double sisi3;

    public void setSisi1(double sisi1){
        this.sisi1 = sisi1;
    }
    public void setSisi2(double sisi2){
        this.sisi2 = sisi2;
    }
    public void setSisi3(double sisi3){
        this.sisi3 = sisi3;
    }
    public double getKeliling(){
        return (this.sisi1 + this.sisi2 + this.sisi3);
    }

}
