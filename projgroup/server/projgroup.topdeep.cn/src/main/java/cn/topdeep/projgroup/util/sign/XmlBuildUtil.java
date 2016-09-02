package cn.topdeep.projgroup.util.sign;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * 
 * @author shidewen
 * 
 */
public class XmlBuildUtil {
	public static DocumentBuilder builder;

	static {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			System.out.println(e.getMessage());
		}
	}

	public static Document buildTopdeepConfigXmlDoc() throws ParserConfigurationException {
		Document document = DocumentUtil.getDocBuilder().newDocument();
		Element root = document.createElement("Topdeep"); // 创建根节点
		document.appendChild(root);
		Element message = document.createElement("Message");
		root.appendChild(message);
		Element configs = document.createElement("Configs");
		configs.setAttribute("id", "Configs");
		message.appendChild(configs);
		return document;
	}

	public static ByteArrayOutputStream createXml(Document doc) throws Exception {

		// 将DOM对象document写入到xml文件中
		TransformerFactory tf = TransformerFactory.newInstance();
		try {
			Transformer transformer = tf.newTransformer();
			DOMSource source = new DOMSource(doc);
			transformer.setOutputProperty(OutputKeys.ENCODING, "utf-8");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			// PrintWriter pw = new PrintWriter(new FileOutputStream(fileName));
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			PrintWriter pw = new PrintWriter(baos);
			StreamResult result = new StreamResult(pw);
			transformer.transform(source, result); // 关键转换
			return baos;
		} catch (TransformerConfigurationException e) {
			throw e;
		} catch (IllegalArgumentException e) {
			throw e;
		} catch (TransformerException e) {
			throw e;
		}
	}

	public void parserXml(String fileName) {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document document = db.parse(fileName);

			NodeList employees = document.getChildNodes();
			for (int i = 0; i < employees.getLength(); i++) {
				Node employee = employees.item(i);
				NodeList employeeInfo = employee.getChildNodes();
				for (int j = 0; j < employeeInfo.getLength(); j++) {
					Node node = employeeInfo.item(j);
					NodeList employeeMeta = node.getChildNodes();
					for (int k = 0; k < employeeMeta.getLength(); k++) {
						System.out.println(employeeMeta.item(k).getNodeName() + ":" + employeeMeta.item(k).getTextContent());
					}
				}
			}
			System.out.println("解析完毕");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (ParserConfigurationException e) {
			System.out.println(e.getMessage());
		} catch (SAXException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
