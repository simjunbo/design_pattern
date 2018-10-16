package facade.pagemaker;

import java.io.IOException;
import java.io.Writer;

/**
 * 시스템을 구성하고 있는 그 밖에 많은 역할
 */
public class HtmlWriter {
	private Writer writer;

	public HtmlWriter(Writer writer) {
		this.writer = writer;
	}

	// 가장 먼저 호출 되어야 하는 제약이 있다.
	public void title(String title) throws IOException {
		writer.write("<html>");
		writer.write("<head>");
		writer.write("<title>" + title + "</title>");
		writer.write("</head>");
		writer.write("<body>\n");
		writer.write("<h1>" + title + "</h1>\n");
	}

	public void paragraph(String msg) throws IOException {
		writer.write("<p>" + msg + "</p>");
	}

	public void link(String href, String caption) throws IOException {
		paragraph("<a href=\"" + href + "\">" + caption + "</a>");
	}

	public void mailto(String mailaddr, String username) throws IOException {
		link("mailto:" + mailaddr, username);
	}

	// 가장 마지막에 호출 되어야 하는 제약이 있다.
	public void close() throws IOException {
		writer.write("</body>");
		writer.write("</html>\n");
		writer.close();
	}
}
