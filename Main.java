public class Main {

    public static void main(String[] args) {

        Otobus otobus = new Otobus(213141, "Gökmen Soysal", "Saat 8:21, Pazar", 100);
        Otomobil otomobil = new Otomobil(1234321, "Fatih Terim", "Saat 8:23, Pazar", 75);
        Minibus minibus = new Minibus(102938, "Sebastian Vettel", "Saat 8:25, Pazar", 50);
        Otomobil yetersiz = new Otomobil(242308, "Lebron James", "Saat 8.32, Pazar", 15);

        Gise gise = new Gise();
        gise.odemeAl(otobus);
        gise.odemeAl(otomobil);
        gise.odemeAl(minibus);
        gise.odemeAl(yetersiz);

        Yonetim yonetim = new Yonetim();
        yonetim.rapor(gise);
    }

}
