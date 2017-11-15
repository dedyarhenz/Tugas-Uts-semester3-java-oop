package com.pemograman;

public class senjata_api extends senjata{
    private double ukuran_peluru;
    private int max_peluru;
    private int jumlah_peluru;
    private int jarak_tembak;
    private String tombol_pengaman;

    public senjata_api(String name, double berat, String warna, double ukuran_peluru, int max_peluru, int jarak_tembak) {
        super(name, berat, warna);
        this.ukuran_peluru = ukuran_peluru;
        this.max_peluru = max_peluru;
        this.jarak_tembak = jarak_tembak;
        this.jumlah_peluru = 0;
        this.tombol_pengaman = "aktif";
    }

    public  void isi_amunisi(){
        if (this.jumlah_peluru<=0){

            this.jumlah_peluru=max_peluru;
            System.out.println("amunisi berhasil diisi ");
        }else{
            System.out.println("jumlah peluru masih ada "+jumlah_peluru);
        }
    }

    public void tombol_pengaman_tembakan(){
        if (tombol_pengaman=="aktif"){
            this.tombol_pengaman="mati";
            System.out.println("tombol pengaman berhasil di matikan");
        }else{
            this.tombol_pengaman="aktif";
            System.out.println("tombol pengaman berhasil di aktifkan");
        }
    }

    public void tembak(){
        if (tombol_pengaman=="aktif"){
            System.out.println("silahkan matikan tombol pengaman dulu untuk menembak");
        }else{
            if (this.jumlah_peluru>0){
                this.jumlah_peluru = jumlah_peluru-1;
                System.out.println("DOOOOOOOOOR");
                System.out.println("jumlah peluru sekarang "+getJumlah_peluru()+" Biji");
            }else{
                System.out.println("amunisi atau peluru sudah habis silahkan isi ulang");
            }
        }

    }


    public String getTombol_pengaman() {
        return tombol_pengaman;
    }

    public void setTombol_pengaman(String tombol_pengaman) {
        this.tombol_pengaman = tombol_pengaman;
    }

    public double getUkuran_peluru() {
        return ukuran_peluru;
    }

    public void setUkuran_peluru(double ukuran_peluru) {
        this.ukuran_peluru = ukuran_peluru;
    }

    public int getMax_peluru() {
        return max_peluru;
    }

    public void setMax_peluru(int max_peluru) {
        this.max_peluru = max_peluru;
    }

    public int getJumlah_peluru() {
        return jumlah_peluru;
    }

    public void setJumlah_peluru(int jumlah_peluru) {
        this.jumlah_peluru = jumlah_peluru;
    }

    public int getJarak_tembak() {
        return jarak_tembak;
    }

    public void setJarak_tembak(int jarak_tembak) {
        this.jarak_tembak = jarak_tembak;
    }
}
