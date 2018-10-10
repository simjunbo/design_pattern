package adapter.A2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Adapter
 */
public class FileProperties implements FileIo {
	/**
	 * Adaptee
	 */
	Properties properties = new Properties();

	public void readFromFile(String filename) throws IOException {
		properties.load(new FileInputStream(filename));
	}

	public void writeToFile(String filename) throws IOException {
		properties.store(new FileOutputStream(filename), "written by FileProperties");
	}

	public void setValue(String key, String value) {
		properties.setProperty(key, value);
	}

	public String getValue(String key) {
		return properties.getProperty(key);
	}
}
