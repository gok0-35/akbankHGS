public class Yonetim {

    public void rapor(Gise gise) {

        double toplam = 0;

        for (int i = 0; i < gise.i; i++) {

            if (gise.liste[i].bakiye >= gise.liste[i].ucret) {
                System.out.println(gise.liste[i].toString() + "\n" + "---------------------------------");
                toplam += ((gise.liste[i]).ucret);
            } else
                System.out.println("!" + "\n" + "Yetersiz Bakiye olduğu için Belirtilen HGS Numaralı " + "araç geçirilmedi : "
                        + gise.liste[i].hgsNo + "\n" + "!" + "\n" + "---------------------------------");
        }

        System.out.println("Toplam Elde Edilen Bakiye : " + toplam);
    }

}

