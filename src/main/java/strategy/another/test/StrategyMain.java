package strategy.another.test;

import strategy.another.concretestrategy.AdvancedWebServerSide;
import strategy.another.concretestrategy.WebClientSide;
import strategy.another.context.AdvancedWebProgrammer;
import strategy.another.context.Programmer;
import strategy.another.context.WebProgrammer;

public class StrategyMain {
	public static void main(String[] args) {
		Programmer wp = new WebProgrammer();
		Programmer awp = new AdvancedWebProgrammer();

		Programmer p = new Programmer() {
			@Override
			public String getAllSkill() {
				String display = getClientProgramming() + ", " + getServerProgramming();
				return display;
			}
		};

		// 다이나믹하게 전략을 수립해보자.
		p.setClientSide(new WebClientSide());
		p.setServerSide(new AdvancedWebServerSide());

		System.out.println("[WebProgrammer]\n" + wp.getAllSkill());
		System.out.println("[AdvancedWebProgrammer]\n" + awp.getAllSkill());
		System.out.println("[DynamicProgrammer]\n" + p.getAllSkill());
	}
}
