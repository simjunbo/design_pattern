package visitor.A1;

import visitor.Directory;
import visitor.Entry;
import visitor.File;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileFindVisitor extends Visitor {

	private String ext;
	private List temp = new ArrayList();

	public FileFindVisitor(String ext) {
		this.ext = ext;
	}

	public Iterator getFoundFiles() {
		return temp.iterator();
	}

	@Override
	public void visit(File file) {
		if (file.getName().endsWith(ext)) {
			temp.add(file);
		}
	}

	public void visit(Directory directory) {
		Iterator it = directory.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			entry.accept(this);
		}
	}

}
