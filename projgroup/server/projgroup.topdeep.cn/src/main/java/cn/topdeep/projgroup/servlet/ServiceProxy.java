/**
 * 
 */
package cn.topdeep.projgroup.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.LogFactory;
import org.springframework.web.HttpRequestHandler;

/**
 * @author niexin
 *
 */
public class ServiceProxy implements HttpRequestHandler{

	private org.apache.commons.logging.Log logger = LogFactory.getLog(ServiceProxy.class);
	
	private String proxyTargetUrl = "";
	
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.debug("receive request from "+request.getRemoteAddr());
		byte[] buf = new byte[4096];
		int readLen;
		URLConnection conn = openConnection();
		readLen = request.getInputStream().read(buf);
//		String value = request.getParameter("a");
//		logger.debug(value);
		while(readLen >= 0){
			logger.debug("read source size: "+readLen);
			if(readLen > 0){
				conn.getOutputStream().write(buf,0,readLen);
			}
			readLen = request.getInputStream().read(buf);
		}
		InputStream is = conn.getInputStream();
		OutputStream os = response.getOutputStream();
		readLen = is.read(buf);
		while(readLen >= 0){
			os.write(buf, 0, readLen);
			readLen = is.read(buf);
		}
		os.flush();
		os.close();
		is.close();
		logger.debug("proxy finished!");
	}
	
	private URLConnection openConnection() throws IOException{
		URL url = new URL(proxyTargetUrl);
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		//conn.setRequestMethod("post");
		conn.setDoOutput(true);
		conn.setDoInput(true);
		return conn;
	}

	/**
	 * @return the proxyTargetUrl
	 */
	public String getProxyTargetUrl() {
		return proxyTargetUrl;
	}

	/**
	 * @param proxyTargetUrl the proxyTargetUrl to set
	 */
	public void setProxyTargetUrl(String proxyTargetUrl) {
		this.proxyTargetUrl = proxyTargetUrl;
	}

}
