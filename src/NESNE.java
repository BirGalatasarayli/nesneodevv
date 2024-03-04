
//AYKHAN HUSEYNLI
//NO- 2021123158
// BİLGİSAYAR MÜHENDİSLİĞİ 3.SINIF





//Öğ.NO- 2021123158

public class NESNE {
public static void main(String[] args) {
        String[] yarismacilar = {"Kadir", "Gökhan", "Hakan", "Suzan", "Pınar", "Mehmet", "Ali", "Emel", "Fırat", "James", "Jale", "Ersin", "Deniz", "Gözde", "Anıl", "Burak",};
        int[] DRC = {341, 273, 278, 329, 445, 402, 388, 270, 243, 334, 412, 393, 299, 343, 317, 265};
        System.out.println("Birinci: " + birincilik(yarismacilar, DRC) + " dakika ");
        System.out.println("İkinci: " + ikincilik(yarismacilar, DRC) + " dakika ");
        System.out.println("Üçüncü: " + ucunculuk(yarismacilar, DRC) + " dakika ");
        harfPuanlari(DRC);
        }public static void harfPuanlari(int[] dereceler) {
                int dereceA = 0, dereceB = 0, dereceC = 0;
                for (int i = 0; i < dereceler.length; i++) {
                        if (200 <= dereceler[i] && dereceler[i] <= 299)
                                dereceA++;
                        if (300 <= dereceler[i] && dereceler[i] <= 399)
                                dereceB++;
                        if (400 <= dereceler[i])
                                dereceC++;
                }
                System.out.println("A -> " + dereceA);
                System.out.println("B -> " + dereceB);
                System.out.println("C -> " + dereceC);
        }
        public static String birincilik(String[] isimler, int[] dereceler) {
                int xx = 0;
                String syc;
                for (int i = 0; i < dereceler.length - 1; i++) {
                        for (int j = i + 1; j < dereceler.length; j++) {
                                if (dereceler[i] > dereceler[j]) {
                                        syc = isimler[i];
                                        isimler[i] = isimler[j];
                                        isimler[j] = syc;
                                        xx = dereceler[i];
                                        dereceler[i] = dereceler[j];
                                        dereceler[j] = xx;
                                }
                        }
                }
                return
                        isimler[0] + " " + dereceler[0];
        }

public static String ikincilik(String[] isimler, int[] dereceler) {
        birincilik(isimler, dereceler);
        return isimler[1] + " " + dereceler[1];
        }
public static String ucunculuk(String[] isimler, int[] dereceler) {
        ikincilik(isimler, dereceler);
        return isimler[2] + " " + dereceler[2];
        }


        }