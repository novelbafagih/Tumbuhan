package com.company;

public class Tomat extends Tanaman implements Perawatan{
    public Tomat(){
        super(100, 100, 25);
    }

    @Override
    public void berkembang() {
        super.setProsesBerbuah(super.getProsesBerbuah()+super.getPerkembangan());
        if(super.getProsesBerbuah() >= super.getBerBuah()){
            super.setBuah(super.getBuah()+1);
            setProsesBerbuah(super.getProsesBerbuah()-super.getBerBuah());
        }
        super.setLamaHidup(super.getLamaHidup()+1);
    }

    @Override
    public void treatment() {
        super.setPerkembangan(super.getPerkembangan()+5);
    }

    public String getNama(){
        return "Tomat";
    }
}
