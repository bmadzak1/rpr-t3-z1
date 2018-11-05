package ba.unsa.etf.rpr.tutorijal03;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Program {

    static Scanner ulaz = new Scanner(System.in);

    public static void main(String[] args) {

        int input = 1;

        while(input != 0) {
            System.out.println("Unesite 1 za dodavanje telefonskog broja");
            System.out.println("Unesite 2 da dobijete broj preko imena");
            System.out.println("Unesite 3 da dobijete ime preko broja");
            System.out.println("Unesite 4 da ispisete sve brojeve cije ime pocinje sa nekim slovom");
            System.out.println("Unesite 5 da ispisete imena svih osoba koje zive u nekom gradu");
            System.out.println("Unesite 6 da ispisete brojeve svih osoba koje zive u nekom gradu");
            System.out.println("Unesite 0 za kraj");

            input = ulaz.nextInt();

            switch(input) {
                case 0:
                    return;
                case 1:
                    dodavanjeTelefonskogBroja();
                break;
                case 2:
                    dajBrojPrekoImena();
                break;
                case 3:
                    dajImePrekoBroja();
                break;
                case 4:
                    ispisiBrojeveSaSlovom();
                break;
                case 5:
                    ispisiImenaIzGrada();
                break;
                case 6:
                    ispisiBrojeveIzGrada();
                break;
                default:
                    System.out.println("Pogresan unos");
            }
        }
    }

    static void dodavanjeTelefonskogBroja(){

    }

    static void dajBrojPrekoImena(){

    }

    static void dajImePrekoBroja(){

    }

    static void ispisiBrojeveSaSlovom(){

    }

    static void ispisiImenaIzGrada(){

    }

    static void ispisiBrojeveIzGrada(){

    }
}
