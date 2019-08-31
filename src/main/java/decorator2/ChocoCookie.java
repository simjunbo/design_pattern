package decorator2;

public class ChocoCookie extends Decorator {

    public ChocoCookie(Cookie cookie) {
        super(cookie);
    }

    public String getName() {
        return "Choco " + cookie.getName();
    }
}
