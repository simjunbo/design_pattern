package strategy.another.context;

import strategy.another.concretestrategy.AdvancedWebClientSide;
import strategy.another.concretestrategy.AdvancedWebServerSide;
import strategy.another.strategy.ClientSide;
import strategy.another.strategy.ServerSide;

public class AdvancedWebProgrammer extends Programmer {

	public AdvancedWebProgrammer() {
		ClientSide cs = new AdvancedWebClientSide();
		ServerSide ss = new AdvancedWebServerSide();
		setClientSide(cs);
		setServerSide(ss);
	}

	// 모든 스킬을 나열하는 문자열을 만듭니다.
	@Override
	public String getAllSkill() {
		String display = getClientProgramming() + ", " + getServerProgramming();
		return display;
	}
}