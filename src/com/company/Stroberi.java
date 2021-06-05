package com.company;

public class Stroberi extends Tanaman implements Perawatan{
    public Stroberi(){
        super(60, 150, 35);
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
        super.setPerkembangan(super.getPerkembangan()+5);
    }

    public String getNama(){
        return "Stroberi";
    }
}
