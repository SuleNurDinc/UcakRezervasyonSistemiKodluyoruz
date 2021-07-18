public abstract   class UcakRezervasyonSistemi {
    private int koltukSayisi;
    private boolean[] koltuklar ;

    public UcakRezervasyonSistemi(){
        this(10);
    }
    public UcakRezervasyonSistemi(int koltukSayisi) {
        if(koltukSayisi<=10) {System.out.println("Koltuk sayisi hatali. Otomatik olarak 10 yapildi."); this.koltukSayisi = 10;}
        else this.koltukSayisi = koltukSayisi;
        koltuklar = new boolean[koltukSayisi];
        for(int i=0;i<koltukSayisi;i++){
            koltuklar[i]=false;
        }

    }

    public void setKoltukSayisi(int koltukSayisi){
        if(this.koltukSayisi<koltukSayisi){
            for(int i=this.koltukSayisi; i<koltukSayisi;i++){
                koltuklar[i] = false;
            }
        }
        if(koltukSayisi<10) {System.out.println("Koltuk sayisi hatali. Otomatik olarak 10 yapildi."); this.koltukSayisi = 10;}
        else this.koltukSayisi = koltukSayisi;

    }

    public boolean[] getKoltuklar() {
        return koltuklar;
    }

    public int getKoltukSayisi(){
        return koltukSayisi;
    }

    public boolean ekonomiDoluMu(){
        int sayac=0;
        for(int i=5;i<koltukSayisi;i++){
            if(koltuklar[i]) sayac++;
        }
        if(sayac == koltukSayisi-5) return true;
        else return false;

    }

    public boolean businessDoluMu(){
        int sayac=0;
        for(int i=0;i<5;i++){
            if(koltuklar[i]) sayac++;
        }
        if(sayac==5) return true;
        else return false;

    }

    public boolean ucakDoluMu(){
        int sayac=0;
        for(int i=0;i<koltukSayisi;i++){
            if(koltuklar[i]) sayac++;
        }
        if(sayac==koltukSayisi) return true;
        else return false;

    }

    public abstract void rezervasyonAl(int istenenKoltukNum);
}
