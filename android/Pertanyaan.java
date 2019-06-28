package com.dimas.projectpi;

public class Pertanyaan {

    private String cPertanyaan [] = {

            "Ayam Sama Telur Duluan Yang Mana ?",
            "Siapa Nama Pembuat Aplikasi Ini ?",
            "Apa Game Terpopuler yang ramai dimainkan saat ini ?",
            "Berapa Core yg dimiliki procesor Intel Pentium G4560 ? ",
            "VGA Tipe Apa yang Menggunakan Teknologi Tensor Core ? "
    };

    private String cPilihan [][] = {

            {"Ayam", "Telur", "Bareng", "Tidak Ada Yang Benar"},
            {"M Dimas Farhansyah", "Ucup", "Mukidi", "Sapri"},
            {"PUBG", "FORTNITE", "APEX", "PB"},
            {"2 Core", "4 Core", "3 Core", "5 Core"},
            {"RX460", "GTX 1060", "GTX 1660", "GTX 2060"}
    };

    private String cJawaban [] = {


            "Bareng",
            "M Dimas Farhansyah",
            "APEX",
            "2 Core",
            "RTX 2060"
    };

    public String getQuestion (int nomor){
        String tanya = cPertanyaan[nomor];
        return tanya;
    }


    public String getAnswer (int nomor){
        String jawab = cJawaban[nomor];
        return jawab;
    }



    public String getChoice1 (int nomor){
        String pilih = cPilihan[nomor][0];
        return pilih;
    }
    public  String getChoice2 (int nomor){
        String pilih = cPilihan[nomor][1];
        return pilih;
    }
    public  String getChoice3 (int nomor){
        String pilih = cPilihan[nomor][2];
        return pilih;
    }
    public  String getChoice4 (int nomor){
        String pilih = cPilihan[nomor][3];
        return pilih;
    }

}
