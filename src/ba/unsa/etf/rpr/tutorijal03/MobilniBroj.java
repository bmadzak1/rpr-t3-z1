package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends  TelefonskiBroj{

    int mobilnaMreza;
    String broj;

    MobilniBroj(int mobilnaMreza, String broj){
        this.mobilnaMreza = mobilnaMreza;
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
