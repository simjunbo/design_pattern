package strategy.another.strategy;

public abstract class Programmer {
	private ClientSide clientSide;
	private ServerSide serverSide;

	public ClientSide getClient() {
		return clientSide;
	}

	public void setClientSide(ClientSide clientSide) {
		this.clientSide = clientSide;
	}

	public ServerSide getServer() {
		return serverSide;
	}

	public void setServerSide(ServerSide serverSide) {
		this.serverSide = serverSide;
	}

	public String getClientProgramming() {
		return clientSide.getClientProgramming();
	}

	public String getServerProgramming() {
		return serverSide.getServerProgramming();
	}

	public abstract String getAllSkill();
}
