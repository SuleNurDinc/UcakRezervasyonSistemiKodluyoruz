import java.util.Random;

public class PegasusRezervasyonSistemi extends UcakRezervasyonSistemi{

    public PegasusRezervasyonSistemi() {
    }

    public PegasusRezervasyonSistemi(int koltukSayisi) {
        super(koltukSayisi);
    }

    @Override
    public void rezervasyonAl(int istenenKoltukNum) {
        boolean[] koltuklar = getKoltuklar();
        if(!(koltuklar[istenenKoltukNum-1]))  {
            koltuklar[istenenKoltukNum-1] = true;
            System.out.println("Koltuk No:" + istenenKoltukNum + " adınıza rezerve edildi.");
            System.out.println("İyi uçuşlar.");

        }
        else if(koltuklar[istenenKoltukNum-1] || ucakDoluMu() || istenenKoltukNum<=0 && istenenKoltukNum>getKoltukSayisi() ){
            System.out.println("Rezervasyon isteğiniz gerçekleştirilemedi:((");
        }

    }

    public void rezervasyonAl(){
        boolean[] koltuklar = getKoltuklar();
        int istenenKoltukNum=0;
        if(!ekonomiDoluMu()) {
            Random rand = new Random();
            int randomKoltukNum;
            for (int i = 5; i < koltuklar.length; i++) {
                randomKoltukNum = 6 + rand.nextInt(getKoltukSayisi() - 6);
                if (!koltuklar[randomKoltukNum]) {
                    istenenKoltukNum = randomKoltukNum;
                    break;
                }
            }
            if (!(koltuklar[istenenKoltukNum - 1])) {
                koltuklar[istenenKoltukNum - 1] = true;
                System.out.println("Koltuk No:" + istenenKoltukNum + " adınıza rezerve edildi.");
                System.out.println("İyi uçuşlar.");

            }
        }
        else if(koltuklar[istenenKoltukNum-1] || ucakDoluMu() || istenenKoltukNum<=0 && istenenKoltukNum>getKoltukSayisi() ){
            System.out.println("Rezervasyon isteğiniz gerçekleştirilemedi:((");
        }
    }


}
