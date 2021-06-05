package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    Scanner sc = new Scanner(System.in);
    ArrayList<Tanaman> tanamans;
    ArrayList<Tanaman> lokasi;
    Data(){
        tanamans = new ArrayList<Tanaman>();
        lokasi = new ArrayList<Tanaman>();
    }

    public void menanam(){
        System.out.println("Mau menanam apa?");
        System.out.print("1. Tomat \n" +
                "2. Stroberi \n" +
                "3. Persik \n");
        System.out.println("Pilih Tanaman:");
        short pilihan = sc.nextShort();
        if(pilihan == 1)
            tanamans.add(new Tomat());
        if(pilihan ==  2)
            tanamans.add(new Stroberi());
        if(pilihan == 3)
            tanamans.add(new Persik());


    }

    public void mulai() {
        System.out.println("Masa Tanam (Bulan)\t:");
        int masaTanamHari = sc.nextInt() * 30;

        this.menanam();
        this.menanam();
        this.menanam();

        for (int i = 1; i <= masaTanamHari; i++) {
            int index = 0;
            for(int j = 0; j <tanamans.size();j++){
                if (tanamans.get(j).status().equals("Hidup")) {
                    tanamans.get(j).berkembang();
                }
                else{
                    lokasi.add(tanamans.get(j));
                    tanamans.remove(index);
                    this.menanam();
                }
            }
            if (i % 90 == 0) {
                for (Tanaman tanaman : tanamans) {
                    tanaman.treatment();
                }
            }
        }
    }

    public void info(){
        System.out.println("===HASIL MENANAM===");
        int tanamanKe = 1;
        for (Tanaman tanaman : tanamans){
            System.out.println("Tanaman Ke " + tanamanKe + " tanaman "+ tanaman.getNama());
            System.out.println(tanaman.toString());
            tanamanKe++;
        }
        System.out.println("Tanaman Yang Mati");
        for(Tanaman tanaman : lokasi){
            System.out.println("Tanaman Ke " + tanamanKe + " tanaman "+ tanaman.getNama());
            System.out.println(tanaman.toString());
            tanamanKe++;
        }
    }

}
