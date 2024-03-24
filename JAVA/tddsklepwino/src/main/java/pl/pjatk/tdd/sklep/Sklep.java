package pl.pjatk.tdd.sklep;

public class Sklep {
    public static void dokonajZakupu(KartaKlienta karta, double kwotaZakupu) {
        if (kwotaZakupu > 50.00){
            if (kwotaZakupu > 100.00){
                if (karta.pobierzIloscDostepnychKuponow() >= 10) {
                    kwotaZakupu = kwotaZakupu - kwotaZakupu * 0.13;
                }
                else {
                    kwotaZakupu = kwotaZakupu - kwotaZakupu*0.10;
                }
            }
            else{
                if (karta.pobierzIloscDostepnychKuponow() >= 10) {
                    kwotaZakupu = kwotaZakupu - kwotaZakupu * 0.08;
                }
                else{
                    kwotaZakupu = kwotaZakupu - kwotaZakupu * 0.05;
                }
            }
        }
        else{
            if (karta.pobierzIloscDostepnychKuponow() >= 10){
                kwotaZakupu = kwotaZakupu - kwotaZakupu * 0.03;
            }
        }

        if (kwotaZakupu>=40.00){
            karta.dodajKupony(1);
            if (kwotaZakupu>=80.00){
                karta.dodajKupony(1);
                if (kwotaZakupu>=120.00){
                    karta.dodajKupony(1);
                }
            }
        }
    }

    public static KartaKlienta wydajNowaKarte(){
        return new KartaKlienta();
    }
}
