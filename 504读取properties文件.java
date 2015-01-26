package org.weatherdetector.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ConfKit {

	private static Properties props = new Properties();

	static {
		try {
			props.load(ConfKit.class.getClassLoader().getResourceAsStream(
				    "weatherdetector.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String get(String key) {
		return props.getProperty(key);
	}

    public static void setProps(Properties p){
        props = p;
    }
    
    public static void main(String[] args) {
		String string = ConfKit.get("A_URL");
		System.out.println(string);
	}
}