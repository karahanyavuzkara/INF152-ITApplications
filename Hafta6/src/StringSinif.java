
public class StringSinif {

    public static void main(String[] args) {
        /*
         * String ad1="Ali",ad2="ali",ad3="Cemil";
         * System.out.println(ad1+" compareTo("+ad2+" ) ="+ad1.compareTo(ad2));
         * System.out.println(ad1+" compareToIgnoreCase("+ad2+" ) ="+ad1.
         * compareToIgnoreCase(ad2));
         * System.out.println(ad1+" compareTo("+ad3+" ) ="+ad1.compareTo(ad3));
         * System.out.println(ad1+" compareToIgnoreCase("+ad3+" ) ="+ad1.
         * compareToIgnoreCase(ad3));
         * System.out.println(ad3+" compareTo("+ad1+" ) ="+ad3.compareTo(ad1));
         * System.out.println(ad3+" compareToIgnoreCase("+ad1+" ) ="+ad3.
         * compareToIgnoreCase(ad1));
         * System.out.println(ad1+" compareToIgnoreCase("+ad2+" ) ="+ad1.
         * compareToIgnoreCase(ad2));
         * System.out.println("ad3.charAt(0) : "+ad3.charAt(0));
         * System.out.println("ad3.charAt(2) : "+ad3.charAt(2));
         * System.out.println(ad3.codePointAt(0));//karakterin ascii karşılığını verir
         * String ad4="Nurşen",ad5="           ayşe        ",ad6="";
         * System.out.println(ad4.codePointAt(3));
         * System.out.println(ad4.codePointAt(1));
         * System.out.println(ad4.codePointBefore(2));
         *
         * System.out.println("|"+ad5+"|"); System.out.println("|"+ad5.trim()+"|");
         * System.out.println(ad4.toUpperCase()); System.out.println(ad4.toLowerCase());
         * System.out.println(ad1+" "+ad2); String eklenen =ad1.concat(" ");
         * System.out.println(eklenen.concat(ad2));
         * System.out.println(ad4.indexOf('ş')); System.out.println(ad4.isEmpty());
         * System.out.println(ad6.isEmpty()); System.out.println(ad4.length());
         */
        String sehir = "ankara";
        System.out.println(sehir.indexOf('a'));
        System.out.println(sehir.indexOf('a', 1));
        System.out.println(sehir.lastIndexOf('a'));
        System.out.println(sehir.replace('a', 'A'));
        System.out.println(sehir.startsWith("an"));
        System.out.println(sehir.startsWith("na"));
        System.out.println(sehir.endsWith("ra"));
        System.out.println(sehir.endsWith("na"));
        String sehirAdlari = "Ankara İstanbul İzmir Bursa";
        String sehirler[] = sehirAdlari.split(" ");
        for (String sehir1 : sehirler) {
            System.out.println(sehir1);
        }
        String sehirToplam = "";
        for (String sehir1 : sehirler) {
            sehirToplam += (sehir1 + "/");
        }
        System.out.println(sehirToplam);
        String sehirler1[] = sehirAdlari.split("/");
    }

}
