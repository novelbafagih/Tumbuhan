package com.company;

public class Persik extends Tanaman implements Perawatan{
    public Persik(){
        super(180, 250, 15);
    }

    @Override
    public void berkembang() {
        super.setProsesBerbuah(super.getProsesBerbuah()+super.getPerkembangan());
        if(super.getProsesBerbuah() >= super.getBerBuah()){
            super.setBuah(super.getBuah()+1);
            setProsesBerbuah(super.getProsesBerbuah()-super.getBerBuah());
        }
    }

    @Override
    public void treatment() {
        super.setPerkembangan(super.getPerkembangan()+2.5);
    }

    public String getNama(){
        return "Persik";
    }
}
