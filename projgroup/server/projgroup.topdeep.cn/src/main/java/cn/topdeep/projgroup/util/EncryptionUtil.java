package cn.topdeep.projgroup.util;

import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.logging.LogFactory;

/**
 * @author niexin
 *
 */
public class EncryptionUtil {

	private static org.apache.commons.logging.Log logger = LogFactory.getLog(EncryptionUtil.class);
	
	public static String generateAESKeyStr(int keySize) throws Exception {
		byte[] key = generateAESKey(keySize);
		return Base64.encodeBase64(key)==null?null:new String(Base64.encodeBase64(key),Charset.forName("UTF-8"));
	}
	
	public static byte[] generateAESKey(int keySize) throws Exception {
		byte[] key = (byte[]) null;
		KeyGenerator kgen = null;
		if (keySize != 128)
			keySize = 128;
		try {
			kgen = KeyGenerator.getInstance("AES");
			kgen.init(keySize);
			SecretKey skey = kgen.generateKey();
			key = skey.getEncoded();
		} catch (NoSuchAlgorithmException e) {
			throw new Exception("执行AES密钥生成时发生异常！", e);
		}
		return key;
	}

	// 加密
	public static String Encrypt(String src, String key) throws Exception {
		if(key == null){
			return null;
		}
		return Encrypt(src, Base64.decodeBase64(key.getBytes(Charset.forName("UTF-8"))));
	}
	
	public static String Encrypt(String src, byte[] key) throws Exception {
		byte[] byteSrc = src.getBytes("utf-8");
		byte[] byteRect = Encrypt(byteSrc, key);
		return Base64.encodeBase64(key)==null?null:new String(Base64.encodeBase64(key),Charset.forName("UTF-8"));
	}
	
	public static byte[] Encrypt(byte[] src, String key) throws Exception {
		if(key == null){
			return null;
		}
		return Encrypt(src, Base64.decodeBase64(key.getBytes(Charset.forName("UTF-8"))));
	}
	
	public static byte[] Encrypt(byte[] src, byte[] key) throws Exception {
		if (key == null) {
			throw new Exception("加密Key为空");
		}
		SecretKeySpec skeySpec = new SecretKeySpec(key, "AES");
		Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");// "算法/模式/补码方式"
		cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
		byte[] encrypted = cipher.doFinal(src);
		return encrypted;
	}


	// 解密
	public static String Decrypt(String src, String key) throws Exception {
		return Decrypt(src, Base64.decodeBase64(key.getBytes(Charset.forName("UTF-8"))));
	}
	
	public static String Decrypt(String src, byte[] key) throws Exception {
		byte[] byteSrc = Base64.decodeBase64(src.getBytes(Charset.forName("UTF-8")));
		byte[] byteRect = Decrypt(byteSrc, key);
		return new String(byteRect,"utf-8");
	}
	
	public static byte[] Decrypt(byte[] src, String key) throws Exception {
		return Decrypt(src, Base64.decodeBase64(key.getBytes(Charset.forName("UTF-8"))));
	}
	
	public static byte[] Decrypt(byte[] src, byte[] key) throws Exception {
		// 判断Key是否正确
		if (key == null) {
			throw new Exception("加密Key为空");
		}
		SecretKeySpec skeySpec = new SecretKeySpec(key, "AES");
		Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE, skeySpec);
		byte[] original = cipher.doFinal(src);
		return original;
	}

}
