package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;

public class ZalanaLakaTrawiasta extends Wedrowka {
    public ZalanaLakaTrawiasta(double odleglosc) {
        super(odleglosc);
    }

    @Override
    public String getNazwa() {
        return null;
    }

    @Override
    public double modyfikujPredkoscGrupy(double predkosc) {
        return 0;
    }

    @Override
    public int getTrudnoscNawigacyjna() {
        return 0;
    }
}
