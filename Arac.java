public class Arac {

    int hgsNo;
    String isimSoyisim;
    String aracSinifi;
    String gecisBilgileri;
    double bakiye;
    double ucret;

    public Arac(int hgsNo, String isimSoyisim, String aracSinifi, String gecisBilgileri, double bakiye, double ucret) {
        this.hgsNo = hgsNo;
        this.isimSoyisim = isimSoyisim;
        this.aracSinifi = aracSinifi;
        this.gecisBilgileri = gecisBilgileri;
        this.bakiye = bakiye;
        this.ucret = ucret;
    }

    public void odeme() {
        bakiye -= ucret;
    }

    @Override
    public String toString() {
        return
                "HGS No = " + hgsNo + "\n" +
                        "İsim Soyisim = " + isimSoyisim + "\n" +
                        "Araç Sınıfı = " + aracSinifi + "\n" +
                        "Geçiş Bilgileri = " + gecisBilgileri + "\n" +
                        "Ücret = " + ucret;
    }

}
