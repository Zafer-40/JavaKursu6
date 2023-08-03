package Gun43;

import Tools.MyFunc;

public class _10_JavaCheckedveUncheckedException {
    public static void main(String[] args) {

        // Checked ve Unchecked Exception
        // Java derki yani yazılımcı bıraktığı hatalara UnChecked exception
        // Ama öyle komutlar var ki bana ait: bunları hata kontrolü yapmadan
        // yani try-catch e almadan kullanmana izin VERMEM. bu gibi hat durumlarına
        // CHECKED yani kontrol ettiğim hatalar denir.


        String kelime = "";

        char ilkHarf = kelime.charAt(0);

        MyFunc.bekle(1000);


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
