import java.util.Scanner;

public class TestPegasus {
    public static void main(String[] args) {
        PegasusRezervasyonSistemi pegasusRezervasyonSistemi = new PegasusRezervasyonSistemi();
        pegasusRezervasyonSistemi(pegasusRezervasyonSistemi);
    }
    public static void pegasusRezervasyonSistemi(PegasusRezervasyonSistemi pegasusRezervasyonSistemi){
        Scanner scan = new Scanner(System.in);
        System.out.println("Pegasus Rezervasyon sistemine hoşgeldiniz.");
        if(!pegasusRezervasyonSistemi.ucakDoluMu()){
            System.out.println("Business class uçmak için 0'a basınız, ekonomi class uçmak için 1'e basınız.");
            int hangiSinif= scan.nextInt();
            boolean[] koltuklar = pegasusRezervasyonSistemi.getKoltuklar();
            if(hangiSinif == 0){
                for(int i=0;i<5;i++)
                {
                    if(!koltuklar[i]) System.out.print(i+1+" ");
                }
                System.out.println();
                System.out.println("Aşağıdaki boş koltuklardan birini seçiniz.");
                 int istenenKoltukNum=scan.nextInt();
                 pegasusRezervasyonSistemi.rezervasyonAl(istenenKoltukNum);
            }
            else if(hangiSinif == 1){
                for(int i=5;i<pegasusRezervasyonSistemi.getKoltukSayisi();i++)
                {
                    if(!koltuklar[i]) System.out.print(i+1+" ");
                }
                 System.out.println();
                 pegasusRezervasyonSistemi.rezervasyonAl();
            }

        }
        else {
            System.out.println("Maalesef ucak dolu rezervasyon alamıyoruz.");
        }

        System.out.println("Devam etmek için c'ye çıkmak için başka bir tuşa basın.");
        String c=scan.next();
        if(c.equals("c")){
            pegasusRezervasyonSistemi(pegasusRezervasyonSistemi);
        }
        else return;
    }
}
