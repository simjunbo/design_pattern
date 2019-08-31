package decorator2;

public class MilkCookie extends Decorator {

    public MilkCookie(Cookie cookie) {
        super(cookie);
    }

    public String getName() {
        return "Milk " + cookie.getName();
    }
}
