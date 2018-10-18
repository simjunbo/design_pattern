package command.another;

/**
 * receiver(수신자)
 */
public class Light {
	private boolean isLightOn = false;

	// action
	public void on() {
		isLightOn = true;
		System.out.println("불 켜짐");
	}

	// action
	public void off() {
		isLightOn = false;
		System.out.println("불 꺼짐");
	}

	public boolean getLighOn() {
		return isLightOn;
	}
}
