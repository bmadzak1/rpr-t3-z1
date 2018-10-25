package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends  TelefonskiBroj{

    enum Grad{SARAJEVO, ORASJE, ZENICA, LIVNO, TUZLA, MOSTAR, BIHAC, GORAZDE, SIROKI_BRIJEG, TRAVNIK, BRCKO}

    Grad grad;
    String broj;

    FiksniBroj(Grad grad, String broj){
        this.grad = grad;
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        return null;
    }

    @Override
    public int hashCode() {
        return 0;
    }

}

