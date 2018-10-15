package strategy.another.context;

import strategy.another.concretestrategy.WebClientSide;
import strategy.another.concretestrategy.WebServerSide;
import strategy.another.strategy.ClientSide;
import strategy.another.strategy.ServerSide;

public class WebProgrammer extends Programmer {
	public WebProgrammer() {
		ClientSide cs = new WebClientSide();
		ServerSide ss = new WebServerSide();
		setClientSide(cs);
		setServerSide(ss);
	}

	public String getAllSkill() {
		return getClientProgramming() + ", " + getServerProgramming();
	}
}
