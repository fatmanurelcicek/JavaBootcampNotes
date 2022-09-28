package hafta2_odev2.methods2;
public class Main {
    public static void main(String[] args) {
        String mesaj= "Bugün hava çok güzel.";
        String yeniMesaj= sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(5,7);
        System.out.println(sayi);
        System.out.println(mesaj);
        int topla = topla2(2,3,4,5,6,10);
        System.out.println("-------------------");
        System.out.println(topla);
    }
    
    public static void ekle(){
        System.out.println("EKlendi");
    }

    public static void sil(){
        System.out.println("silindi");
    }

    public static void güncelle(){
        System.out.println("Güncellendi");
        return;
    }

    public static int topla(int x, int y) {
        
        return x+y;
    }

    public static int topla2 (int... sayilar) {
        int toplam = 0;

        for(int sayi : sayilar){
            toplam += sayi;
        }

        return toplam;
    }

    public static String sehirVer() {
        return "Hatay";
    }
}
