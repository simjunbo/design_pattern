package visitor;

import visitor.A1.FileFindVisitor;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		try {
			System.out.println("Making root entries");
			Entry root = new Directory("root");
			Entry bin = new Directory("bin");
			Entry tmp = new Directory("tmp");
			Entry usr = new Directory("usr");
			root.add(bin);
			root.add(tmp);
			root.add(usr);
			bin.add(new File("vi", 100));
			bin.add(new File("latex", 200));
			root.accept(new ListVisitor());

			System.out.println("");
			System.out.println("Making user entries");

			Entry kim = new Directory("Kim");
			Entry lee = new Directory("Lee");
			Entry park = new Directory("Park");
			usr.add(kim);
			usr.add(lee);
			usr.add(park);

			kim.add(new File("diary.html", 300));
			kim.add(new File("Composite.java", 400));
			lee.add(new File("memo.txt", 500));
			park.add(new File("game.doc", 600));
			park.add(new File("junk.mail", 700));
			root.accept(new ListVisitor());

			// A1
			FileFindVisitor ffv = new FileFindVisitor(".html");
			root.accept(ffv);
			System.out.println("HTML files are:");
			Iterator it = ffv.getFoundFiles();
			while (it.hasNext()) {
				File file = (File) it.next();
				System.out.println(file.toString());
			}

		} catch (FileTreatmentException e) {
			e.printStackTrace();
		}
	}
}
