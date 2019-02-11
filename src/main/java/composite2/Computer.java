package composite2;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite
 */
public class Computer extends ComputerDevice {
	// 복수 개의 ComputerDevice 객체를 가리킴
	private List<ComputerDevice> components = new ArrayList<ComputerDevice>();

	// ComputerDevice 객체를 Computer 클래스에 추가
	public void addComponent(ComputerDevice component) {
		components.add(component);
	}

	// ComputerDevice 객체를 Computer 클래스에서 제거
	public void removeComponent(ComputerDevice component) {
		components.remove(component);
	}

	// 전체 가격을 포함하는 각 부품의 가격을 합산
	public int getPrice() {
		int price = 0;
		for (ComputerDevice component : components) {
			price += component.getPrice();
		}
		return price;
	}

	// 전체 소비 전력량을 포함하는 각 부품의 소비 전력량을 합산
	public int getPower() {
		int power = 0;
		for (ComputerDevice component : components) {
			power += component.getPower();
		}
		return power;
	}
}
