package decorator2;

public class Main {
    public static void main(String[] args) {
        Cookie cookie = new BaseCookie();

        Cookie milk = new MilkCookie(cookie);
        System.out.println(milk.getName());

        Cookie choco = new ChocoCookie(milk);
        System.out.println(choco.getName());
    }
}
