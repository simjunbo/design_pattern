package facade;

import facade.pagemaker.PageMaker;

/**
 * Client(의뢰인) 역할
 */
public class Main {
	public static void main(String[] args) {
		PageMaker.makeWelcomePage("kim@youngjin.com", "welcome.html");
	}
}
