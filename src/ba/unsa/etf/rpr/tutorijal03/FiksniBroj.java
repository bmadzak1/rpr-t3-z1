package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj{

    private Grad grad;
    private String broj;

    FiksniBroj(Grad grad, String broj){
        this.setGrad(grad);
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        String fiksni = new String();
        switch (getGrad()){
            case SARAJEVO:
                fiksni += "033";
                break;
            case ORASJE:
                fiksni += "031";
                break;
            case ZENICA:
                fiksni += "032";
                break;
            case LIVNO:
                fiksni += "034";
                break;
            case TUZLA:
                fiksni += "035";
                break;
            case MOSTAR:
                fiksni += "036";
                break;
            case BIHAC:
                fiksni += "037";
                break;
            case GORAZDE:
                fiksni += "038";
                break;
            case SIROKI_BRIJEG:
                fiksni += "039";
                break;
            case TRAVNIK:
                fiksni += "030";
                break;
            case BRCKO:
                fiksni += "049";
                break;
        }

        fiksni += "/";
        fiksni += broj;
        return fiksni;
    }

    @Override
    public int hashCode() {
        return getGrad().hashCode() + broj.hashCode();
    }

    public Grad getGrad() {
        return grad;
    }

    public void setGrad(Grad grad) {
        this.grad = grad;
    }

    enum Grad{SARAJEVO, ORASJE, ZENICA, LIVNO, TUZLA, MOSTAR, BIHAC, GORAZDE, SIROKI_BRIJEG, TRAVNIK, BRCKO}
}



