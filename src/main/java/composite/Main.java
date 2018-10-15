package composite;

import builder.A1.Director;

/**
 * Client(의뢰자) 역할
 */
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
			root.printList();

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
			root.printList();

			// A1
			System.out.println("");
			Directory youngjin = new Directory("youngjin");
			usr.add(youngjin);

			File file = new File("Composite.java", 10);
			youngjin.add(file);

			System.out.println("file = " + file.getFullName());
			System.out.println("youngjin = " + youngjin.getFullName());
		} catch (FileTreatmentException e) {
			e.printStackTrace();
		}
	}
}
