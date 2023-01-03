package day28_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_MultipleCheckedExceptions {
    public static void main(String[] args) {

        //metin txt dosyasindaki yazilari yazdiralim
        /*
        eger birden fazla catch cumlemiz varsa ve exc.lar arasinda parent child iliskisi varsa

        1- ikiisini de yazmak istiyorsak, once child exception, sonra parent yazilmalidir
        aksi takdirde parent ustte olursa, tum exception lari yakalayacagindan child exc. yazmak
        anlamsiz olur
        2-ikisini yazmak istemezsek sadece parent exc. yeterli olacaktir cunku parent daha kapasayicidir
        ve daha cok excep. yakalar
         */

        try {
            FileInputStream fis=new FileInputStream("src/day28_exceptions/metin.txt");
            int k=0;
            while ((k= fis.read())!= -1){
                System.out.println((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamdai");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
