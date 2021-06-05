package com.company;

public abstract class Tanaman {
    private int masaHidup;
    private int lamaHidup;
    private int berBuah;
    private int buah;
    private double perkembangan;
    private double prosesBerbuah;

    public Tanaman(int masaHidup, int berBuah, double perkembangan) {
        this.masaHidup = masaHidup;
        this.lamaHidup = 0;
        this.berBuah = berBuah;
        this.perkembangan = perkembangan;
        this.prosesBerbuah = 0;
    }

    public abstract void berkembang();
    public String status(){
        return lamaHidup > masaHidup ? "Mati" : "Hidup";
    }

    public void setMasaHidup(int masaHidup) {
        this.masaHidup = masaHidup;
    }

    public void setLamaHidup(int lamaHidup) {
        this.lamaHidup = lamaHidup;
    }

    public void setBerBuah(int berBuah) {
        this.berBuah = berBuah;
    }

    public void setBuah(int buah) {
        this.buah = buah;
    }

    public void setPerkembangan(double perkembangan) {
        this.perkembangan = perkembangan;
    }

    public void setProsesBerbuah(double prosesBerbuah) {
        this.prosesBerbuah = prosesBerbuah;
    }

    public int getMasaHidup() {
        return masaHidup;
    }

    public int getLamaHidup() {
        return lamaHidup;
    }

    public int getBerBuah() {
        return berBuah;
    }

    public int getBuah() {
        return buah;
    }

    public double getPerkembangan() {
        return perkembangan;
    }

    public double getProsesBerbuah() {
        return prosesBerbuah;
    }

    public abstract void treatment();
    public abstract String getNama();
    @Override
    public String toString() {
        return  "masaHidup:" + masaHidup + '\n'+
                "lamaHidup:" + lamaHidup + '\n'+
                "buah:" + buah + '\n'+
                "status:" + this.status() + '\n'
                ;
    }
}
