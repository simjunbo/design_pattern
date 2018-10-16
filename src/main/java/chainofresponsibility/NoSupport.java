package chainofresponsibility;

/**
 * ConcreteHandler(구체적인 처리자)의 역할
 * 아무것도 처리하지 않는 클래스
 */
public class NoSupport extends Support {
	public NoSupport(String name) {
		super(name);
	}

	protected boolean resolve(Trouble trouble) {
		return false;
	}
}
