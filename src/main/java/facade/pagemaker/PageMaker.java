package facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Facade(정면)의 역할
 * 높은 레벨에서 단순한 인터페이스를 시스템 외부에 제공한다.
 */
public class PageMaker {
	private PageMaker() {

	}

	public static void makeWelcomePage(String mailaddr, String filename) {
		try {
			Properties mailprop = Database.getProperties("maildata");
			String username = mailprop.getProperty(mailaddr);
			HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
			writer.title("Welcome to " + username + " 's page!");
			writer.paragraph(username + "의 페이지에 오신 걸 환영합니다.");
			writer.paragraph("메일을 기다리고 있습니다.");
			writer.mailto(mailaddr, username);
			writer.close();
			System.out.println(filename + "is created for " + mailaddr + " (" + username + ")");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
