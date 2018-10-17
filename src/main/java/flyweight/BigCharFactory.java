package flyweight;

import java.util.HashMap;

/**
 * FlyweightFactory(플라이급의 공장)의 역할
 */
public class BigCharFactory {
	private HashMap pool = new HashMap();

	private static BigCharFactory singleton = new BigCharFactory();

	public static BigCharFactory getInstance() {
		return singleton;
	}

	private BigCharFactory() {

	}

	public synchronized BigChar getBigChar(char charname) {
		BigChar bc = (BigChar) pool.get("" + charname);
		if (bc == null) {
			bc = new BigChar(charname);
			pool.put("" + charname, bc);
		}
		return bc;
	}

}
