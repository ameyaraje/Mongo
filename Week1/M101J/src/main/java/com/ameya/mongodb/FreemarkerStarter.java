package com.ameya.mongodb;

import java.io.File;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import freemarker.cache.FileTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;

public class FreemarkerStarter {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.setClassForTemplateLoading(FreemarkerStarter.class, "/");
		
		try {
//			FileTemplateLoader templateLoader = new FileTemplateLoader(new File("resources"));
//			config.setTemplateLoader(templateLoader);
			Template template = config.getTemplate("index.ftl");
			StringWriter writer = new StringWriter();
			Map<String, Object> map = new HashMap<>();
			map.put("name", "Ameya");
			
			template.process(map, writer);
			System.out.println(writer);
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
