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

    String dajIme(TelefonskiBroj broj){
        String s1 = "";
        for(String s : mapa.keySet()) {
            if (mapa.get(s).equals(broj))
                s1 = s;
        }
        return s1;
    }



}