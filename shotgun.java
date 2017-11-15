package com.pemograman;


public class shotgun extends senjata_api {
    //construktor
    public shotgun(String name, double berat, String warna, double ukuran_peluru, int max_peluru, int jarak_tembak) {
        super(name, berat, warna, ukuran_peluru, max_peluru, jarak_tembak);

        System.out.println("\n\nshoutgun telah berhasil di buat dan siap di pakai ");

    }



    @Override
    public void gambar_senjata() {

        System.out.println("\n=====[Shotgun]=====\n" +
                " ,______________________________________\n" +
                "|_________________,----------._ [____]  \"\"-,__  __....-----=====\n" +
                "               (_(||||||||||||)___________/   \"\"                |\n" +
                "                  `----------' 8888888[ ))\"-,                   |\n" +
                "                                       \"\"    `,  _,--....___    |\n" +
                "                                               `/           \"\"\"\"");
    }
}
