package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj{

    int mobilnaMreza;
    String broj;

    MobilniBroj(int mobilnaMreza, String broj){
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        String mobilni = new String();
        mobilni = "0" + mobilnaMreza + "/" + broj;
        return  mobilni;
    }

    @Override
    public int hashCode() {
        return mobilnaMreza + broj.hashCode();
    }
}
