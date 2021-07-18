import java.util.Scanner;

public class TestTHY {
    public static void main(String[] args) {
        THYRezervasyonSistemi thyRezervasyonSistemi = new THYRezervasyonSistemi();
        thyRezervasyonSistemi(thyRezervasyonSistemi);

       // PegasusRezervasyonSistemi pegasusRezervasyonSistemi = new PegasusRezervasyonSistemi();
       // pegasusRezervasyonSistemi(pegasusRezervasyonSistemi);
    }
    public static void thyRezervasyonSistemi(THYRezervasyonSistemi thyRezervasyonSistemi){
        Scanner scan = new Scanner(System.in);
        if(!thyRezervasyonSistemi.ucakDoluMu()){
            System.out.println("Business class uçmak için 0'a basınız, ekonomi class uçmak için 1'e basınız.");
            int hangiSinif= scan.nextInt();
            System.out.println("Aşağıdaki boş koltuklardan birini seçiniz.");
            boolean[] koltuklar = thyRezervasyonSistemi.getKoltuklar();
            if(hangiSinif == 0){
                if(!thyRezervasyonSistemi.businessDoluMu()) {
                    for (int i = 0; i < 5; i++) {
                        if (!koltuklar[i]) System.out.print(i + 1 + " ");
                    }
                }
                else System.out.println("Maalesef business classımız dolu. Business classı için rezervasyon alamıyoruz!");
            }
            else if(hangiSinif == 1){
                if(!thyRezervasyonSistemi.ekonomiDoluMu()) {
                    for (int i = 5; i < thyRezervasyonSistemi.getKoltukSayisi(); i++) {
                        if (!koltuklar[i]) System.out.print(i + 1 + " ");
                    }
                    System.out.println();
                    int istenenKoltukNum=scan.nextInt();
                    thyRezervasyonSistemi.rezervasyonAl(istenenKoltukNum);
                }
                else System.out.println("Maalesef ekonomi classımız dolu. Ekonomi classı için rezervasyon alamıyoruz!");

            }

        }
        else {
            System.out.println("Maalesef ucak dolu rezervasyon alamıyoruz.");
        }

        System.out.println("Devam etmek için c'ye çıkmak için başka bir tuşa basın.");
        String c=scan.next();
        if(c.equals("c")){
            thyRezervasyonSistemi(thyRezervasyonSistemi);
        }
        else return;
    }

}
