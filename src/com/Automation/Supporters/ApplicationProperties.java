package com.Automation.Supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ApplicationProperties {

	private String filepath;
	private FileInputStream fileinputstream;
	private Properties properties;

	public ApplicationProperties(String filepath) throws IOException {

		this.filepath = filepath;
		fileinputstream = new FileInputStream(filepath);
		properties = new Properties();
		properties.load(fileinputstream);

	}

	public String getPropertyValue(String key) {
		String value = "";
		if (properties != null) {
			value = properties.getProperty(key);
		} else {
			System.out.println("Properties object is pointing is null");
		}
		return value;
	}

	public String getPropertyValue(String key, String defaultValue) {
		String value = "";
		if (properties != null) {
			value = properties.getProperty(key);
			if (value == null) {
				value = defaultValue;
			} else {
				System.out.println("Properties object is pointing is null");
			}
		}
		return value;
		
	}

	public String getPropertyValue(Object key) {
		String value = "";
		if (properties != null) {
			value = (String) properties.get(key);

		} else {
			System.out.println("properties object is pointing null");
		}

		return value;
	}

	public String getPropertyValue(Object key, Object defaultValue) {
		String Value = "";
		if (properties != null) {
			Value = (String) properties.getOrDefault(key, defaultValue);
			if (Value != null) {
				Value = (String) defaultValue;
			}
		} else {
			System.out.println("properties object iss pointing null");
		}

		return Value;
	}

	public void setPropertykeyValue(String key, String value) throws IOException {
		properties.setProperty(key, value);
		FileOutputStream fop = new FileOutputStream(filepath);
		properties.store(fop, "file is saved Successfully");
	}

	public void setPropertykeyValue(Object key, Object value) throws IOException {
		properties.put(key, value);
		FileOutputStream fop = new FileOutputStream(filepath);
		properties.store(fop, "file is saved successfully");
	}

	public void removeKeyValue(String key) throws IOException {
		if (properties != null) {
			properties.remove(key);
			FileOutputStream fop = new FileOutputStream(filepath);
			properties.store(fop, "after removing key file is saved");
		}
	}

	public void removeKeyValue(String key, String value) throws IOException {
		if (properties != null) {
			properties.remove(key, value);
			FileOutputStream fop = new FileOutputStream(filepath);
			properties.store(fop, "after removing key and value file is saved");
		}
	}

	public Map<String, String> getTotalData() {
		Map<String, String> data = new HashMap<>();
		Set keys = properties.keySet();
		for (Object obj : keys) {
			String key = (String) obj;
			String value = (String) properties.get(key);
			data.put(key, value);

		}
		return data;

	}

}

