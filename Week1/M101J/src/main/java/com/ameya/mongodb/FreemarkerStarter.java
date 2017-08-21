package com.ameya.mongodb;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class FreemarkerStarter {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.setClassForTemplateLoading(FreemarkerStarter.class, "/");
		
		try {
			Template temp1 = config.getTemplate("index.ftl");
			StringWriter writer = new StringWriter();
			Map<String, Object> map = new HashMap<>();
			map.put("name", "Ameya");
			temp1.process(map, writer);
			System.out.println(writer);
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
