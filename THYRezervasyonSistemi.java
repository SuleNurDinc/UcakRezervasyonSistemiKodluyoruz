public  class THYRezervasyonSistemi extends UcakRezervasyonSistemi{

    public  THYRezervasyonSistemi() {
        super();
        System.out.println("THY Rezervasyon sitemine hoşgeldiniz.");
    }

    public  THYRezervasyonSistemi(int koltukSayisi) {
        super(koltukSayisi);
        System.out.println("THY Rezervasyon sitemine hoşgeldiniz.");
    }

    @Override
    public void rezervasyonAl(int istenenKoltukNum) {
        boolean[] koltuklar = getKoltuklar();
        if(!(koltuklar[istenenKoltukNum-1]))  {
            koltuklar[istenenKoltukNum-1] = true;
            System.out.println("Koltuk No: " + istenenKoltukNum + " adınıza rezerve edildi.");
            System.out.println("İyi uçuşlar.");

        }
        else if(koltuklar[istenenKoltukNum-1] || ucakDoluMu() || istenenKoltukNum<=0 && istenenKoltukNum>getKoltukSayisi() ){
            System.out.println("Rezervasyon isteğiniz gerçekleştirilemedi:((");
        }

    }


}
