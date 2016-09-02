package cn.topdeep.projgroup.util;


import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class AESUtil {

    private static final String ALGORITHM = "AES";
    private static final int KEY_SIZE = 128;
    private static final int CACHE_SIZE = 1024;
    
    /**
     * <p>
     * 生成随机密钥
     * </p>
     * 
     * @return
     * @throws Exception
     */
    public static String getSecretKey() throws Exception {
        return getSecretKey(null);
    }
    
    /**
     * <p>
     * 生成密钥
     * </p>
     * 
     * @param seed 密钥种子
     * @return
     * @throws Exception
     */
    public static String getSecretKey(String seed) throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(ALGORITHM);
        SecureRandom secureRandom;
        if (seed != null && !"".equals(seed)) {
            secureRandom = new SecureRandom(seed.getBytes());
        } else {
            secureRandom = new SecureRandom();
        }
        keyGenerator.init(KEY_SIZE, secureRandom); 
        SecretKey secretKey = keyGenerator.generateKey(); 
        return Base64Util.encode(secretKey.getEncoded());
    }
    
    /**
     * <p>
     * 加密
     * </p>
     * 
     * @param data
     * @param key
     * @return
     * @throws Exception
     */
    public static byte[] encrypt(byte[] data, String key) throws Exception {
        Key k = toKey(Base64Util.decode(key));
        byte[] raw = k.getEncoded(); 
        SecretKeySpec secretKeySpec = new SecretKeySpec(raw, ALGORITHM); 
        Cipher cipher = Cipher.getInstance(ALGORITHM); 
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        return cipher.doFinal(data);
    }
    
    /**
     * <p>
     * 文件加密
     * </p>
     * 
     * @param key
     * @param sourceFilePath
     * @param destFilePath
     * @throws Exception
     */
    public static void encryptFile(String key, String sourceFilePath, String destFilePath) throws Exception {
        File sourceFile = new File(sourceFilePath);
        File destFile = new File(destFilePath); 
        if (sourceFile.exists() && sourceFile.isFile()) {
            if (!destFile.getParentFile().exists()) {
                destFile.getParentFile().mkdirs();
            }
            destFile.createNewFile();
            InputStream in = new FileInputStream(sourceFile);
            OutputStream out = new FileOutputStream(destFile);
            Key k = toKey(Base64Util.decode(key));
            byte[] raw = k.getEncoded(); 
            SecretKeySpec secretKeySpec = new SecretKeySpec(raw, ALGORITHM); 
            Cipher cipher = Cipher.getInstance(ALGORITHM); 
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            CipherInputStream cin = new CipherInputStream(in, cipher);
            byte[] cache = new byte[CACHE_SIZE];
            int nRead = 0;
            while ((nRead = cin.read(cache)) != -1) {
                out.write(cache, 0, nRead);
                out.flush();
            }
            out.close();
            cin.close();
            in.close();
        }
    }
    
    /**
     * <p>
     * 解密
     * </p>
     * 
     * @param data
     * @param key
     * @return
     * @throws Exception
     */
    public static byte[] decrypt(byte[] data, String key) throws Exception {
        Key k = toKey(Base64Util.decode(key));
        byte[] raw = k.getEncoded(); 
        SecretKeySpec secretKeySpec = new SecretKeySpec(raw, ALGORITHM); 
        Cipher cipher = Cipher.getInstance(ALGORITHM); 
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
        return cipher.doFinal(data);
    }
    
    /**
     * <p>
     * 文件解密
     * </p>
     * 
     * @param key
     * @param sourceFilePath
     * @param destFilePath
     * @throws Exception
     */
    public static void decryptFile(String key, String sourceFilePath, String destFilePath) throws Exception {
        File sourceFile = new File(sourceFilePath);
        File destFile = new File(destFilePath); 
        if (sourceFile.exists() && sourceFile.isFile()) {
            if (!destFile.getParentFile().exists()) {
                destFile.getParentFile().mkdirs();
            }
            destFile.createNewFile();
            FileInputStream in = new FileInputStream(sourceFile);
			FileOutputStream out = new FileOutputStream(destFile);
            Key k = toKey(Base64Util.decode(key));
            byte[] raw = k.getEncoded(); 
            SecretKeySpec secretKeySpec = new SecretKeySpec(raw, ALGORITHM); 
            Cipher cipher = Cipher.getInstance(ALGORITHM); 
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
			CipherOutputStream cout = new CipherOutputStream(out, cipher);
			byte[] cache = new byte[CACHE_SIZE];
			int nRead = 0;
			while ((nRead = in.read(cache)) != -1) {
				cout.write(cache, 0, nRead);
				cout.flush();
			}
			cout.close();
			out.close();
			in.close();
        }
    }
    
	public static byte[] toByteArray(String filename) throws IOException {

		File f = new File(filename);
		if (!f.exists()) {
			throw new FileNotFoundException(filename);
		}

		ByteArrayOutputStream bos = new ByteArrayOutputStream((int) f.length());
		BufferedInputStream in = null;
		try {
			in = new BufferedInputStream(new FileInputStream(f));
			byte[] buffer = new byte[CACHE_SIZE];
			int len = 0;
			while (-1 != (len = in.read(buffer, 0, CACHE_SIZE))) {
				bos.write(buffer, 0, len);
			}
			return bos.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			bos.close();
		}
	}

    /**
     * <p>
     * 转换密钥
     * </p>
     * 
     * @param key
     * @return
     * @throws Exception
     */
    private static Key toKey(byte[] key) throws Exception {
        SecretKey secretKey = new SecretKeySpec(key, ALGORITHM);
        return secretKey;
    }
}