package com.pemograman;

public class senjata {
    private String name;
    private double berat;
    private String warna;

    public senjata(String name, double berat, String warna) {
        this.name = name;
        this.berat = berat;
        this.warna = warna;
    }

    public void gambar_senjata(){

        System.out.println("gambar belum tersedia");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }


    public String getWarna() { return warna; }

    public void setWarna(String warna) { this.warna = warna; }
}
