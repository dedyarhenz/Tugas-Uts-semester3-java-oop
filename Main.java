package com.pemograman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pilihanMenu;
        String nama;
        double berat;
        String warna;
        double ukuran_peluru;
        int max_peluru;
        int jumlah_peluru;
        int jarak_tembak;

        Scanner input = new Scanner(System.in);

        System.out.println("buat shotgun");
        System.out.println("masukan nama shotgun : ");
        nama=input.next();
        System.out.println("masukan berat shotgun : ");
        berat=input.nextDouble();
        System.out.println("masukan warna shoutgan :");
        warna=input.next();
        System.out.println("masukan ukuran peluru : ");
        ukuran_peluru=input.nextDouble();
        System.out.println("masukan maksimal peluru : ");
        max_peluru=input.nextInt();
        System.out.println("masukan jarak tembak : ");
        jarak_tembak=input.nextInt();

        shotgun shotgunBaru = new shotgun(nama,berat,warna,ukuran_peluru,max_peluru,jarak_tembak);


        do {
            System.out.println("\n\n\n========MENU======");
            System.out.println(
                    "1. tampilkan rincian & gambar senjata\n" +
                    "2. isi amunisi atau peluru\n" +
                    "3. tembak\n" +
                    "4. buka atau tutup tombol pengaman\n"+
                    "5. exit\n" +
                    "masukan pilihan anda : ");
            pilihanMenu=input.nextInt();

            switch (pilihanMenu){
                case 1:
                     shotgunBaru.gambar_senjata();
                    System.out.println("nama shoutgan : "+shotgunBaru.getName());
                    System.out.println("berat shoutgan : "+shotgunBaru.getBerat() + " kg ");
                    System.out.println("warna shoutgan : "+shotgunBaru.getWarna());
                    System.out.println("ukuran peluru : "+shotgunBaru.getUkuran_peluru() + " Mm ");
                    System.out.println("maksimal peluru : "+shotgunBaru.getMax_peluru() + " Biji ");
                    System.out.println("jumlah peluru : "+shotgunBaru.getJumlah_peluru() + " Biji ");
                    System.out.println("jarak tembak : "+shotgunBaru.getJarak_tembak() + " M ");
                    System.out.println("posisi tombol pengaman : "+shotgunBaru.getTombol_pengaman());
                    break;
                case 2:
                    shotgunBaru.isi_amunisi();
                    break;
                case 3:
                    shotgunBaru.tembak();
                    break;
                case 4:
                    shotgunBaru.tombol_pengaman_tembakan();
                    break;
            }

        }while (pilihanMenu !=5);
    }
}
