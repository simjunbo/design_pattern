package adapter.A2;

import java.io.IOException;

/**
 * Client
 */
public class Main {
	public static void main(String[] args) {
		FileIo f = new FileProperties();
		try {
			f.readFromFile("file.text");
			f.setValue("year", "2004");
			f.setValue("month", "4");
			f.setValue("day", "21");
			f.writeToFile("newfile.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
