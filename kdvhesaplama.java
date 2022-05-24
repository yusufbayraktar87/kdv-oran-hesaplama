import java.util.Scanner;

public class kdvhesaplama {

    public static void main(String[] args){

        /*  Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız. */




        double fiyat, kdv, kdvOrani, kdvliFiyat;
        boolean kdvsec;

        Scanner input = new Scanner(System.in);

        System.out.print("Fiyatı Giriniz :");
        fiyat = input.nextDouble();

        kdvsec = (fiyat > 0 ) && (fiyat < 1000);
        kdvOrani = kdvsec ? 0.18d : 0.10d;

        kdv = fiyat * kdvOrani;
        kdvliFiyat = fiyat + kdv;

        System.out.println("KDV Tutarınız : " + kdv);
        System.out.println("KDV Dahil Tutarınız : " + kdvliFiyat);

    }
}
