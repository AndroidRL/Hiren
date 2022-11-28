package ProMex.classs.Utils;

public class Util {

     public static String skadjvbsadkjb = "1EC39B503E8B08B8F719D5662C2E228C97FB4F76E208FFAA9822BEE1B8D1756046A452C1CE541115137C67A400643E0651AFA8D5205B564E611851659A6020D7";


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

