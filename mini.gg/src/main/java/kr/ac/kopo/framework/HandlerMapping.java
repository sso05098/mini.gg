package kr.ac.kopo.framework;
	
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import kr.ac.kopo.controller.BoardListController;
import kr.ac.kopo.controller.BoardWriteFormController;
import kr.ac.kopo.controller.Controller;
	
public class HandlerMapping {
	
	private Map<String, Controller> mappings;
	
	public HandlerMapping() {
		this("bean.properties");
	}
	
	public HandlerMapping(String propName) {
		mappings = new HashMap<>();
		Properties prop = new Properties();
		String propLoc = this.getClass().getResource(propName).getPath();
		System.out.println(propLoc);
		
		try(
			InputStream is = new FileInputStream(propLoc);
		) {
			prop.load(is);
			Set<Object> keys = prop.keySet();
			for(Object key : keys) {
//				System.out.println(key.toString() + " : " + prop.getProperty(key.toString()));
				String className = prop.getProperty(key.toString());
				
				Class<?> clz = Class.forName(className);
				Constructor<?> contstructor = clz.getConstructor();
				Controller instance = (Controller)contstructor.newInstance();
				mappings.put(key.toString(), instance);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Controller getController(String uri) {
		return mappings.get(uri);
	}
	

}	