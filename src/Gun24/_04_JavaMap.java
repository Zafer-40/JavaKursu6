package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _04_JavaMap {
    public static void main(String[] args) {

        Map<String , String> ugurKartVizit = new HashMap<>();
        ugurKartVizit.put("isim" , "Ugur Yilmaz");
        ugurKartVizit.put("email" , "Ugur@gmail.com");
        ugurKartVizit.put("adres" , "cekmekoy/Istanbul");
        ugurKartVizit.put("telefon" , "0506788787");

        System.out.println("Kart vizit ismi = "+ugurKartVizit.get("isim"));
        System.out.println("Kart vizit e mail = "+ugurKartVizit.get("email"));

        System.out.println();

        Map<String , String> zaferKartVizit = new HashMap<>();
        zaferKartVizit.put("isim" , "Zafer Canli");
        zaferKartVizit.put("email" , "zafer@gmail.com");
        zaferKartVizit.put("adres" , "cekmekoy/Istanbul");
        zaferKartVizit.put("telefon" , "05326788787");
        System.out.println("Kart vizit telefon = "+zaferKartVizit.get("telefon"));
        System.out.println("Kart vizit e mail = "+zaferKartVizit.get("email"));

        Map<String , Map<String , String> > kartvizitler = new HashMap<>();
        kartvizitler.put("ugur" , ugurKartVizit);
        kartvizitler.put("zafer" , zaferKartVizit);

        System.out.println();

        //zaferin adresi
        System.out.println("Zaferin adresi = "+kartvizitler.get("zafer").get("adres"));

        //ugurun emaili
        System.out.println("Ugurun e maili ="+kartvizitler.get("ugur").get("email"));

        for (Map.Entry <String , Map<String , String> > kv : kartvizitler.entrySet()){

            System.out.println("kv = " + kv);

            System.out.println(kv.getValue());

            System.out.println(kv.getValue().get("email"));
        }

    }
}
