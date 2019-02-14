package mediator2;

/**
 * 참고) https://minwook-shin.github.io/mediator-pattern/
 */
public class Main {
	public static void main(String[] args) {
		Com_1 com1 = new Com_1();
		Com_2 com2 = new Com_2();

		// register
		Imediator im1 = new Mediator(com1);
		Imediator im2 = new Mediator(com2);

		// send
		im1.send("COM 1", "hello world!");
		im2.send("COM 2", "hello world!");


		com1.send("hello world!");
		com2.send("hello world!");
	}
}
