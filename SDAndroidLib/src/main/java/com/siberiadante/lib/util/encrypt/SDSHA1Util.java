package com.siberiadante.lib.util.encrypt;


import com.siberiadante.lib.util.encrypt.base.SDBaseEncrypt;

/**
 * @Created SiberiaDante
 * @Describe：
 * @CreateTime: 2017/11/9
 * @UpDateTime:
 * @Email: 2654828081@qq.com
 * @GitHub: https://github.com/SiberiaDante
 */

public class SDSHA1Util {

    /**
     * SHA1 哈希加密
     *
     * @param data 明文字符串
     * @return 16进制密文
     */
    public static String encrypt(String data) {
        return encrypt(data.getBytes());
    }

    /**
     * SHA1哈希加密
     *
     * @param data 明文字节数组
     * @return 16进制密文
     */
    public static String encrypt(byte[] data) {
        return SDBaseEncrypt.bytes2HexString(hashEncrypt(data));
    }

    /**
     * SHA1哈希加密
     *
     * @param data 明文字节数组
     * @return 密文字节数组
     */
    public static byte[] hashEncrypt(byte[] data) {
        return SDBaseEncrypt.hashTemplate(data, "SHA1");
    }


    /**
     * SHA1 Hmac 加密
     *
     * @param data 明文字符串
     * @param key  秘钥
     * @return 16进制密文
     */
    public static String encrypt(String data, String key) {
        return encrypt(data.getBytes(), key.getBytes());
    }

    /**
     * SHA1 Hmac 加密
     *
     * @param data 明文字节数组
     * @param key  秘钥
     * @return 16进制密文
     */
    public static String encrypt(byte[] data, byte[] key) {
        return SDBaseEncrypt.bytes2HexString(hmacEncrypt(data, key));
    }

    /**
     * SHA1 Hmac 加密
     *
     * @param data 明文字节数组
     * @param key  秘钥
     * @return 密文字节数组
     */
    public static byte[] hmacEncrypt(byte[] data, byte[] key) {
        return SDBaseEncrypt.hmacTemplate(data, key, "HmacSHA1");
    }

}
