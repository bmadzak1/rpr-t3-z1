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

    String naSlovo(char s){
        String s1 = "";
        int brojac = 1;
        for(String s2 : mapa.keySet()){
            if (s2.charAt(0) == s) {
                s1 = brojac + ". " + s2 + " - " + mapa.get(s2) + '\n';
                brojac++;
            }
        }
        return s1;
    }

}