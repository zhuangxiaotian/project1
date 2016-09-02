package cn.topdeep.projgroup.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.security.PrivateKey;
import java.security.PublicKey;

import org.w3c.dom.Document;

import cn.topdeep.projgroup.util.sign.DocumentUtil;
import cn.topdeep.projgroup.util.sign.KeyReader;
import cn.topdeep.projgroup.util.sign.KeyUtil;
import cn.topdeep.projgroup.util.sign.SignUtil;
import cn.topdeep.projgroup.util.sign.XmlBuildUtil;

public class XmlSignEncryptUtil {

	private static String xmlBasePath = XmlSignEncryptUtil.class.getClassLoader().getResource("").getPath();

	public static ByteArrayOutputStream buildXmlDoc(Document doc) throws Exception {
		ByteArrayOutputStream baos = XmlBuildUtil.createXml(doc);
		return baos;
	}

	public static void sign(String certPath) throws Exception {
		// String path = (new XmlSignTest()).getClass().getResource("config_test.xml").getFile();
		String path = xmlBasePath + "config_test.xml";
		// System.out.println(path);
		Document doc = DocumentUtil.getDocFromFile(new File(path));
		PrivateKey priKey = KeyUtil.getMOCKPriKey(certPath);
		String resultXml = SignUtil.sign(doc, priKey, "Configs");
		// System.out.println("签名后的结果是:" + resultXml);
		XmlBuildUtil.createXml(doc);
	}

	public static void verifySign(String certPath) throws Exception {
		// String path = (new XmlSignTest()).getClass().getResource(xmlBasePath + "config_test_sign.xml").getFile();
		String path = xmlBasePath + "config_test_sign.xml";
		// System.out.println(path);
		Document doc = DocumentUtil.getDocFromFile(new File(path));
		PublicKey pubKey = KeyUtil.getMOCKPubKey(certPath);
		// System.out.println(doc.getTextContent());
		boolean isChecked = SignUtil.check(doc, pubKey);
		// System.out.println("对xml签名后的结果进行验证签名是:" + isChecked);
	}

	public static void encrypt(String aesKey) throws Exception {
		String sourceFilePath = xmlBasePath + "config_test_sign.xml";
		String destFilePath = xmlBasePath + "config_test_sign_encrypt.xml";
		// PrivateKey priKey = KeyUtil.getMOCKPriKey();
		// System.out.println("key:" + new String(Base64Util.encode(priKey.getEncoded())));
		// String key = AESUtil.getSecretKey();
		// System.out.println("key:" + key);// VJ2/SxkNZuHT50hNx8HMXQ==
		AESUtil.encryptFile(aesKey, sourceFilePath, destFilePath);
	}

	public static void decrypt(String aesKey) throws Exception {
		String sourceFilePath = xmlBasePath + "config_test_sign_encrypt.xml";
		String destFilePath = xmlBasePath + "config_test_sign_encrypt_decrypt.xml";
		// String key = "VJ2/SxkNZuHT50hNx8HMXQ==";
		AESUtil.decryptFile(aesKey, sourceFilePath, destFilePath);
	}

	public static void decryptAndVerifySign(String aesKey, String certPath) throws Exception {
		String sourceFilePath = xmlBasePath + "config_test_sign_encrypt.xml";
		byte[] bt = AESUtil.toByteArray(sourceFilePath);
		byte[] decryptBt = EncryptionUtil.Decrypt(bt, aesKey);
		ByteArrayInputStream bi = new ByteArrayInputStream(decryptBt);

		Document doc = DocumentUtil.getDocFromInputStream(bi);
		PublicKey pubKey = KeyUtil.getMOCKPubKey(certPath);
		// System.out.println(doc.getTextContent());
		boolean isChecked = SignUtil.check(doc, pubKey);
		// System.out.println("对xml签名后的结果进行验证签名是:" + isChecked);
	}

	public static byte[] signAndEncrypt(InputStream is, String aesKey, String certPath, String password) throws Exception {
		Document doc = DocumentUtil.getDocFromInputStream(is);
		KeyReader keyReader = new KeyReader();
		PrivateKey priKey = keyReader.readPrivateKeyfromPKCS12StoredFile(certPath, password);
		String resultXml = SignUtil.sign(doc, priKey, "Configs");
		resultXml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" + resultXml;
		// System.out.println("签名后的结果是:" + resultXml);
		byte[] xml = resultXml.getBytes("UTF-8");
		// String key = "VJ2/SxkNZuHT50hNx8HMXQ==";
		byte[] en = EncryptionUtil.Encrypt(xml, aesKey);

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		out.write(en);
		byte[] ret = out.toByteArray();
		out.close();
		return ret;
		// XmlBuildUtil.createXml(xmlBasePath + "config_test_sign_encrypt.xml", doc);
	}

	public static byte[] signAndEncrypt(Document orgDoc, String aesKey, String certPath, String password) throws Exception {
		ByteArrayOutputStream baos = buildXmlDoc(orgDoc);
		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		return signAndEncrypt(bais, aesKey, certPath, password);
	}

	public static void delXmlFile() {
		File file1 = new File(xmlBasePath + "config_test.xml");
		File file2 = new File(xmlBasePath + "config_test_sign_encrypt.xml");
		if (file1.exists()) {
			file1.delete();
		}

		if (file2.exists()) {
			file2.delete();
		}
	}
}
