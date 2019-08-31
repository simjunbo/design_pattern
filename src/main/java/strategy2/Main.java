package strategy2;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        Weapon bow = new Bow();
        context.run(bow);

        Weapon knife = new Knife();
        context.run(knife);
    }
}
