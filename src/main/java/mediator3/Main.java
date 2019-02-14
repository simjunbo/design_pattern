package mediator3;

public class Main {
	public static void main(String[] args) {
		ChatMediator chatMediator = new ChatMediator();

		User user1 = new User(chatMediator, "홍길동");
		User user2 = new User(chatMediator, "나이스");
		User user3 = new User(chatMediator, "디자인");

		chatMediator.appendUser(user1);
		chatMediator.appendUser(user2);
		chatMediator.appendUser(user3);

		user1.sendMessages("안녕하세요");
		chatMediator.notice("공지사항");
	}
}
