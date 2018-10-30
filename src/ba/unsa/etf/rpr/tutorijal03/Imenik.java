package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.Set;

public class Imenik {
    HashMap<String, TelefonskiBroj> mapa = new HashMap<String, TelefonskiBroj>();

    void dodaj(String ime, TelefonskiBroj broj){
        mapa.put(ime, broj);
    }

    String dajBroj(String ime){
        return mapa.get(ime).ispisi();
    }



}