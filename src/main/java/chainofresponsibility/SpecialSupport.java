package chainofresponsibility;

/**
 * ConcreteHandler(구체적인 처리자)의 역할
 * 지정한 번호의 트러블에 한하여 처리하는 클래스
 */
public class SpecialSupport extends Support {
	private int number;

	public SpecialSupport(String name, int number) {
		super(name);
		this.number = number;
	}

	protected boolean resolve(Trouble trouble) {
		if (trouble.getNumber() == number) {
			return true;
		} else {
			return false;
		}
	}
}
