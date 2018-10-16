package chainofresponsibility;

/**
 * ConcreteHandler(구체적인 처리자)의 역할
 * limit에서 지정한 번호 미만의 트러블을 해결하는 클래스
 */
public class LimitSupport extends Support {
	private int limit;

	public LimitSupport(String name, int limit) {
		super(name);
		this.limit = limit;
	}

	protected boolean resolve(Trouble trouble) {
		if (trouble.getNumber() < limit) {
			return true;
		} else {
			return false;
		}
	}
}
