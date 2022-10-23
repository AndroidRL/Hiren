package ProMex.classs.Utils;

public class Util {

     public static String skadjvbsadkjb = "1EC39B503E8B08B8F719D5662C2E228C0E6F5739649D41545E1C80FAF6C80565A62D1E4DA5F595CBAE68A8A0B105EF63D0C6FD59BBA03900F178CCD48B80FC85";


    public static String DEc(String aa) {
        String decrypted = "";
        try {
            decrypted = apiii.decrypt(aa);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return decrypted;
    }
}

