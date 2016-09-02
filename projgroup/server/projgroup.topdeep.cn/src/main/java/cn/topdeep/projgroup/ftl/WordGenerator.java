package cn.topdeep.projgroup.ftl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class WordGenerator {
	private static Configuration configuration = null;
	private static Map<String, Template> allTemplates = null;
	protected static Log log = LogFactory.getLog(WordGenerator.class);
	static {
		configuration = new Configuration();
		configuration.setDefaultEncoding("utf-8");
		configuration.setClassForTemplateLoading(WordGenerator.class, "/cn/topdeep/projgroup/ftl");
		allTemplates = new HashMap<String, Template>(); //
		try {
			allTemplates.put("resume", configuration.getTemplate("createExportDoc.ftl"));
		} catch (IOException e) {
			log.error("WordGenerator error=", e);
		}
	}

	private WordGenerator() {
		throw new AssertionError();
	}

	public static File createDoc(List<FuncProcedureExport> exportList, String type, String exportName) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", exportList);
		map.put("exportName", exportName);
		String name = "temp" + (int) (Math.random() * 100000) + ".doc";
		File f = new File(name);
		Template t = allTemplates.get(type);
		try {
			// 这个地方不能使用FileWriter因为需要指定编码类型否则生成的Word文档会因为有无法识别的编码而无法打开
			Writer w = new OutputStreamWriter(new FileOutputStream(f), "utf-8");
			t.process(map, w);
			w.close();
		} catch (Exception ex) {
			log.error("WordGenerator ex=", ex);
		}
		return f;
	}
}
