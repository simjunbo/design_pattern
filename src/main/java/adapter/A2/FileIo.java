package adapter.A2;

import java.io.IOException;

/**
 * Target
 */
public interface FileIo {
	void readFromFile(String filename) throws IOException;

	void writeToFile(String filename) throws IOException;

	void setValue(String key, String value);

	String getValue(String key);
}
