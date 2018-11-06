package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;

import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad;

public class Imenik{
    private HashMap<String, TelefonskiBroj> mapa = new HashMap<String, TelefonskiBroj>();

    void dodaj(String ime, TelefonskiBroj broj){
        mapa.put(ime, broj);
    }

    String dajBroj(String ime){
        return mapa.get(ime).ispisi();
    }

    String dajIme(TelefonskiBroj broj){
        String s1 = "";
        for(String s : mapa.keySet()) {
            if (mapa.get(s).equals(broj)) {
                s1 = s;
            }
        }
        return s1;
    }

    String naSlovo(char s){
        String s1 = "";
        int brojac = 1;
        for(String s2 : mapa.keySet()){
            if (s2.charAt(0) == s) {
                s1 = brojac + ". " + s2 + " - " + mapa.get(s2).ispisi() + '\n';
                brojac++;
            }
        }
        return s1;
    }

    Set<String> izGrada(Grad g){
        TreeSet<String> imena = new TreeSet<String>();
        for(String s : mapa.keySet()) {
            if (mapa.get(s) instanceof FiksniBroj) {
                FiksniBroj broj = (FiksniBroj) mapa.get(s);
                if (g == broj.getGrad()) {
                    imena.add(s);
                }
            }
        }
        return imena;
    }

    Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        TreeSet<TelefonskiBroj> brojevi = new TreeSet<TelefonskiBroj>();
        for(String s : mapa.keySet()) {
            if (mapa.get(s) instanceof FiksniBroj) {
                FiksniBroj broj = (FiksniBroj) mapa.get(s);
                if (g == broj.getGrad()) {
                    brojevi.add(mapa.get(s));
                }
            }
        }
        return brojevi;
    }

}