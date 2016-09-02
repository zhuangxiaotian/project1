package cn.topdeep.projgroup.util.sign;

import java.io.File;
import java.io.InputStream;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Document;

public class DocumentUtil {

	private static Log logger = LogFactory.getLog(DocumentUtil.class);

	public static Document getDocFromInputStream(InputStream is) throws Exception {
		return getDocBuilder().parse(is);
	}

	public static Document getDocFromFile(File f) throws Exception {
		return getDocBuilder().parse(f);
	}

	public static DocumentBuilder getDocBuilder() throws ParserConfigurationException {
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		docBuilderFactory.setNamespaceAware(true);
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		return docBuilder;
	}

	public static Document getDocFromString(String xml) throws Exception {
		InputStream is = IOUtils.toInputStream(xml, "UTF-8");
		return getDocFromInputStream(is);
	}

	public static String docToString(Document doc) {
		StringWriter writer = new StringWriter();
		try {
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			// Properties properties = transformer.getOutputProperties();
			// properties.setProperty(OutputKeys.ENCODING, "UTF-8");
			// properties.setProperty(OutputKeys.METHOD, "xml");
			// properties.setProperty(OutputKeys.VERSION, "1.0");
			// properties.setProperty(OutputKeys.STANDALONE, "yes");
			// transformer.setOutputProperties(properties);
			transformer.transform(new DOMSource(doc), new StreamResult(writer));
			writer.flush();
			return writer.toString();
		} catch (TransformerException e) {
			logger.error(e.getMessage(), e);
		}
		return "";
	}

	public static void printDoc(Document doc) {
		StringWriter writer = new StringWriter();
		try {
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			// Properties properties = transformer.getOutputProperties();
			// properties.setProperty(OutputKeys.ENCODING, "UTF-8");
			// properties.setProperty(OutputKeys.METHOD, "xml");
			// properties.setProperty(OutputKeys.VERSION, "1.0");
			// properties.setProperty(OutputKeys.STANDALONE, "yes");
			// transformer.setOutputProperties(properties);
			transformer.transform(new DOMSource(doc), new StreamResult(writer));
			writer.flush();
			logger.debug("printDoc:\n" + writer.toString());
		} catch (TransformerException e) {
			logger.error(e.getMessage(), e);
		}
	}

}
