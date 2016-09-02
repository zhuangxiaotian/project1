package cn.topdeep.projgroup.util.sign;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Enumeration;

/**
 * 这个是key的工具类，用来管理我们的key
 * 
 * @author sheng.liuzs
 *
 */
public class KeyUtil {
	/**
	 * 
	 * 这个类用来得到支付宝的公钥，返回一个PublicKey
	 * 
	 * @return
	 * @throws Exception
	 */
	public static PublicKey getAlipayPubKey() throws Exception {
		KeyReader keyReader = new KeyReader();
		// 注意这里java在读取文件路径中有空格的情况下是会抛异常的。
		String filename = keyReader.getClass().getResource("Katong.cer").getFile();
		PublicKey pubKey = (PublicKey) keyReader.fromCerStoredFile(filename);
		// System.out.println("PublicKey => " + new String(Base64.encodeBase64(pubKey.getEncoded())));
		return pubKey;
	}

	/**
	 * 
	 * 这个类用来得到模拟银行的公钥，返回一个PublicKey
	 * 
	 * @return
	 * @throws Exception
	 */
	public static PublicKey getMOCKPubKey(String filename) throws Exception {
		KeyReader keyReader = new KeyReader();
		// 注意这里java在读取文件路径中有空格的情况下是会抛异常的。
		PublicKey pubKey = (PublicKey) keyReader.fromCerStoredFile(filename);
		// System.out.println("PublicKey => " + new String(Base64.encodeBase64(pubKey.getEncoded())));
		return pubKey;
	}

	/**
	 * 
	 * 这个类用来得到模拟银行的私钥，返回一个PrivateKey
	 * 
	 * @return
	 * @throws Exception
	 */
	public static PrivateKey getMOCKPriKey(String certPath) throws Exception {
		KeyReader keyReader = new KeyReader();
		// 注意这里java在读取文件路径中有空格的情况下是会抛异常的。
		String filename = certPath + "mock.pfx";
		PrivateKey priKey = keyReader.readPrivateKeyfromPKCS12StoredFile(filename, "12345678");
//		System.out.println("privateKey => " + new String(Base64.encodeBase64(priKey.getEncoded())));
		return priKey;
	}

	/**
	 * 
	 * 这个类用来得到模拟银行的公钥，返回一个PublicKey
	 * 
	 * @return
	 * @throws Exception
	 */
	// public static PublicKey getMOCKPubKey(String filename) throws Exception {
	// KeyReader keyReader = new KeyReader();
		// 注意这里java在读取文件路径中有空格的情况下是会抛异常的。
		// String filename = keyReader.getClass().getResource("mock.cer").getFile();
	// PublicKey pubKey = (PublicKey) keyReader.fromCerStoredFile(filename);
		// System.out.println("PublicKey => " + new String(Base64.encodeBase64(pubKey.getEncoded())));
	// return pubKey;
	// }

	/**
	 * 
	 * 这个类用来得到模拟银行的私钥，返回一个PrivateKey
	 * 
	 * @return
	 * @throws Exception
	 */
	public static PrivateKey getMOCKPriKey(String filename, String pwd) throws Exception {
		KeyReader keyReader = new KeyReader();
		// 注意这里java在读取文件路径中有空格的情况下是会抛异常的。
		// String filename = keyReader.getClass().getResource("mock.pfx").getFile();
		PrivateKey priKey = keyReader.readPrivateKeyfromPKCS12StoredFile(filename, pwd);
//		System.out.println("privateKey => " + new String(Base64.encodeBase64(priKey.getEncoded())));
		return priKey;
	}

	/**
	 * PFX证书转换为JKS(Java Key Store)
	 * 
	 * @param pfxPassword PFX证书密码
	 * @param pfxFilePath PFX证书路径
	 * @param jksPassword JKS证书密码
	 * @param jksFilePath JKS证书路径
	 */
	public static void covertPFXtoJKS(String pfxPassword, String pfxFilePath, String jksPassword, String jksFilePath) {
		FileInputStream fis = null;
		FileOutputStream out = null;
		try {
			// 加载PFX证书
			KeyStore inputKeyStore = KeyStore.getInstance("PKCS12");
			fis = new FileInputStream(pfxFilePath);
			char[] inPassword = pfxPassword == null ? null : pfxPassword.toCharArray();
			char[] outPassword = jksPassword == null ? null : jksPassword.toCharArray();
			inputKeyStore.load(fis, inPassword);
			KeyStore outputKeyStore = KeyStore.getInstance("JKS");
			outputKeyStore.load(null, outPassword);
			Enumeration<String> enums = inputKeyStore.aliases();
			while (enums.hasMoreElements()) {
				String keyAlias = enums.nextElement();
				if (inputKeyStore.isKeyEntry(keyAlias)) {
					Key key = inputKeyStore.getKey(keyAlias, inPassword);
					Certificate[] certChain = (Certificate[]) inputKeyStore.getCertificateChain(keyAlias);
					outputKeyStore.setKeyEntry(keyAlias, key, pfxPassword.toCharArray(), (java.security.cert.Certificate[]) certChain);
				}
			}
			out = new FileOutputStream(jksFilePath);
			outputKeyStore.store(out, outPassword);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 从JKS格式转换为PKCS12格式
	 * 
	 * @param jksFilePath String JKS格式证书库路径
	 * @param jksPasswd String JKS格式证书库密码
	 * @param pfxFilePath String PKCS12格式证书库保存文件夹
	 * @param pfxPasswd String PKCS12格式证书库密码
	 */
	public static void covertJKSToPFX(String jksFilePath, String jksPasswd, String pfxFolderPath, String pfxPasswd) throws Throwable {
		FileInputStream fis = null;
		try {
			KeyStore inputKeyStore = KeyStore.getInstance("JKS");
			fis = new FileInputStream(jksFilePath);
			char[] srcPwd = jksPasswd == null ? null : jksPasswd.toCharArray();
			char[] destPwd = pfxPasswd == null ? null : pfxPasswd.toCharArray();
			inputKeyStore.load(fis, srcPwd);
			KeyStore outputKeyStore = KeyStore.getInstance("PKCS12");
			Enumeration<String> enums = inputKeyStore.aliases();
			while (enums.hasMoreElements()) {
				String keyAlias = enums.nextElement();
//				System.out.println("alias=[" + keyAlias + "]");
				outputKeyStore.load(null, destPwd);
				if (inputKeyStore.isKeyEntry(keyAlias)) {
					Key key = inputKeyStore.getKey(keyAlias, srcPwd);
					java.security.cert.Certificate[] certChain = inputKeyStore.getCertificateChain(keyAlias);
					outputKeyStore.setKeyEntry(keyAlias, key, destPwd, certChain);
				}
				String fName = pfxFolderPath + "_" + keyAlias + ".pfx";
				FileOutputStream out = new FileOutputStream(fName);
				outputKeyStore.store(out, destPwd);
				out.close();
				outputKeyStore.deleteEntry(keyAlias);
			}
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 从BKS格式转换为PKCS12格式
	 * 
	 * @param jksFilePath String JKS格式证书库路径
	 * @param jksPasswd String JKS格式证书库密码
	 * @param pfxFilePath String PKCS12格式证书库保存文件夹
	 * @param pfxPasswd String PKCS12格式证书库密码
	 */
	public static void covertBKSToPFX(String jksFilePath, String jksPasswd, String pfxFolderPath, String pfxPasswd) throws Throwable {
		FileInputStream fis = null;
		try {
			KeyStore inputKeyStore = KeyStore.getInstance("BKS", new org.bouncycastle.jce.provider.BouncyCastleProvider());
			Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
			fis = new FileInputStream(jksFilePath);
			char[] srcPwd = jksPasswd == null ? null : jksPasswd.toCharArray();
			char[] destPwd = pfxPasswd == null ? null : pfxPasswd.toCharArray();
			inputKeyStore.load(fis, srcPwd);
			KeyStore outputKeyStore = KeyStore.getInstance("PKCS12");
			Enumeration<String> enums = inputKeyStore.aliases();
			while (enums.hasMoreElements()) {
				String keyAlias = enums.nextElement();
//				System.out.println("alias=[" + keyAlias + "]");
				outputKeyStore.load(null, destPwd);
				if (inputKeyStore.isKeyEntry(keyAlias)) {
					Key key = inputKeyStore.getKey(keyAlias, srcPwd);
					java.security.cert.Certificate[] certChain = inputKeyStore.getCertificateChain(keyAlias);
					outputKeyStore.setKeyEntry(keyAlias, key, destPwd, certChain);
				}
				String fName = pfxFolderPath + "_" + keyAlias + ".pfx";
				FileOutputStream out = new FileOutputStream(fName);
				outputKeyStore.store(out, destPwd);
				out.close();
				outputKeyStore.deleteEntry(keyAlias);
			}
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 列出JKS库内所有X509证书的属性
	 * 
	 * @param jksFilePath 证书库路径
	 * @param jksPasswd 证书库密码
	 * @param algName 库类型
	 */
	public static void listAllCerts(String jksFilePath, String jksPasswd, String algName) {
		try {
			char[] srcPwd = jksPasswd == null ? null : jksPasswd.toCharArray();
			FileInputStream in = new FileInputStream(jksFilePath);
			KeyStore ks = KeyStore.getInstance(algName);
			ks.load(in, srcPwd);
			Enumeration<String> e = ks.aliases();
			while (e.hasMoreElements()) {
				String alias = e.nextElement();
				java.security.cert.Certificate cert = ks.getCertificate(alias);
				if (cert instanceof X509Certificate) {
					X509Certificate X509Cert = (X509Certificate) cert;
//					System.out.println("**************************************");
//					System.out.println("版本号:" + X509Cert.getVersion());
//					System.out.println("序列号:" + X509Cert.getSerialNumber().toString(16));
//					System.out.println("主体名：" + X509Cert.getSubjectDN());
//					System.out.println("签发者：" + X509Cert.getIssuerDN());
//					System.out.println("有效期：" + X509Cert.getNotBefore());
//					System.out.println("签名算法：" + X509Cert.getSigAlgName());
//					System.out.println("输出证书信息:\n" + X509Cert.toString());
//					System.out.println("**************************************");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 列出BKS库内所有X509证书的属性\
	 * 
	 * @param jksFilePath String 证书库路径
	 * @param jksPasswd String 证书库密码
	 * @param algName String 库类型
	 */
	public static void listAllCertsBks(String jksFilePath, String jksPasswd, String algName) {
		try {
			char[] srcPwd = jksPasswd == null ? null : jksPasswd.toCharArray();
			FileInputStream in = new FileInputStream(jksFilePath);
			KeyStore ks = KeyStore.getInstance(algName, new org.bouncycastle.jce.provider.BouncyCastleProvider());
			Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
			ks.load(in, srcPwd);
			Enumeration<String> e = ks.aliases();
			while (e.hasMoreElements()) {
				String alias = e.nextElement();
				java.security.cert.Certificate cert = ks.getCertificate(alias);
				if (cert instanceof X509Certificate) {
					X509Certificate X509Cert = (X509Certificate) cert;
//					System.out.println("**************************************");
//					System.out.println("版本号:" + X509Cert.getVersion());
//					System.out.println("序列号:" + X509Cert.getSerialNumber().toString(16));
//					System.out.println("主体名：" + X509Cert.getSubjectDN());
//					System.out.println("签发者：" + X509Cert.getIssuerDN());
//					System.out.println("有效期：" + X509Cert.getNotBefore());
//					System.out.println("签名算法：" + X509Cert.getSigAlgName());
//					System.out.println("输出证书信息:\n" + X509Cert.toString());
//					System.out.println("**************************************");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
