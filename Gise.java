public class Gise {

    Arac[] liste;
    int i;

    public Gise() {
        liste = new Arac[100];
        i = 0;
    }

    void odemeAl(Arac arac) {
        liste[i++] = arac;
        arac.odeme();
    }

}

