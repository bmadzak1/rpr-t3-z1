package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;

public class Imenik {
    HashMap<String, TelefonskiBroj> mapa = new HashMap<String, TelefonskiBroj>();

    void dodaj(String ime, TelefonskiBroj broj){
        mapa.put(ime, broj);
    }

}
