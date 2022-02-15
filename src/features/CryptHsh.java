package features;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CryptHsh {

    public static String sha256 (String input){

        StringBuffer hexHsh = new StringBuffer();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] hsh = messageDigest.digest(input.getBytes(StandardCharsets.UTF_8));


            int i=0;
            while (i<hsh.length){
                String hex = Integer.toHexString(
                0xFF & hsh[i]);
                if(hex.length()==1)
                    hexHsh.append('0');
                hexHsh.append(hex);
                i++;
            }

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return hexHsh.toString();
    }
}
