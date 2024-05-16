package learn_java.com.ghou;


import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;


public class EncryptUtils {

    public static String md5(String txt){

        return encrypt(txt, "MD5");
    }

    public static String sha(String txt){

        return encrypt(txt, "SHA");
    }

    public static  String sha1(String txt){

        return encrypt(txt, "SHA1");
    }

    private static String encrypt(String txt, String algorithName){

        if(txt == null || txt.trim().length() == 0){
            return null;
        }

        if(algorithName == null || algorithName.trim().length() == 0){
            algorithName = "MD5";
        }

        String result = null;

        try{
            MessageDigest m = MessageDigest.getInstance(algorithName);
            m.reset();
            m.update(txt.getBytes(Charset.forName("UTF-8")));
            byte[] bts = m.digest();

            return hex(bts);
        }catch (Exception e){
            System.out.printf("encrypt error.", e);
        }


        return null;
    }

    private static String hex(byte[] bts){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<bts.length; i++){
            sb.append(Integer.toHexString((bts[i] & 0xFF) | 0x100).substring(1,3));
        }

        return sb.toString();
    }

    /**
     * HmacMD5算法
     * @param msg 加密信息
     * @param keyString 秘钥
     * @return digest 结果
     */
    public static String hmac(String msg, String keyString) {
        String digest = null;
        try {
            SecretKeySpec key = new SecretKeySpec((keyString).getBytes("UTF-8"), "HmacMD5");
            Mac mac = Mac.getInstance("HmacMD5");
            mac.init(key);

            byte[] bytes = mac.doFinal(msg.getBytes("UTF-8"));

            StringBuffer hash = new StringBuffer();
            for (int i = 0; i < bytes.length; i++) {
                String hex = Integer.toHexString(0xFF & bytes[i]);
                if (hex.length() == 1) {
                    hash.append('0');
                }
                hash.append(hex);
            }
            digest = hash.toString();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return digest;
    }


    /**
     * Des带base64加密
     *
     * @param str
     * @param sign
     * @return
     * @throws Exception
     */
    public static String desEncodeWithBase64(String str, String sign) throws Exception {
        SecureRandom sr = new SecureRandom();
        DESKeySpec dks = new DESKeySpec(sign.getBytes());
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        SecretKey securekey = keyFactory.generateSecret(dks);
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.ENCRYPT_MODE, securekey, sr);
        byte[] bytes = cipher.doFinal(str.getBytes());
        return Base64.encode(bytes);
    }

    /**
     * Des带base64解密
     *
     * @param entry
     * @param sign
     * @return
     * @throws Exception
     */
    public static String desDecodeWithBase64(String entry, String sign) throws Exception {
        byte[] bytes = Base64.decode2Bytes(entry);
        SecureRandom sr = new SecureRandom();
        DESKeySpec dks = new DESKeySpec(sign.getBytes());
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        SecretKey securekey = keyFactory.generateSecret(dks);
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.DECRYPT_MODE, securekey, sr);
        byte[] ret = cipher.doFinal(bytes);
        String str = new String(ret, "UTF-8");
        return str;
    }

}
